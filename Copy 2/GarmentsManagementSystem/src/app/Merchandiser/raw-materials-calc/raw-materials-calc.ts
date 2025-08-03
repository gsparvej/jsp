import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Uom } from '../../../model/Merchandiser/uom.model';
import { Order } from '../../../model/Merchandiser/order.model';
import { Bomview } from '../../../model/Merchandiser/bomview.model';
import { FormArray, FormBuilder, FormGroup } from '@angular/forms';
import { MerchandiserService } from '../../service/Merchandiser/merchandiser-service';
import { Router } from '@angular/router';
import { RawMaterialsModel } from '../../../model/Merchandiser/raw.model';

@Component({
  selector: 'app-raw-materials-calc',
  standalone: false,
  templateUrl: './raw-materials-calc.html',
  styleUrl: './raw-materials-calc.css'
})
export class RawMaterialsCalc implements OnInit {

  order: Order[] = [];
  uom: Uom[] = [];
  bomView: Bomview[] = [];

  formRawMaterials!: FormGroup;

  constructor(
    private merchandiserService: MerchandiserService,
    private router: Router,
    private fb: FormBuilder,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit(): void {
    this.formRawMaterials = this.fb.group({
      order: this.fb.group({
        id: [''],
        smallSize: [''],
        mediumSize: [''],
        largeSize: ['']
      }),
      uom: this.fb.array([])  // FormArray for multiple UOM selections
    });

    this.loadOrder();

    // Add one initial UOM selection field by default
    this.addUom();

    // Subscribe to changes on order id to update sizes
    this.formRawMaterials.get('order.id')?.valueChanges.subscribe(orderId => {
      this.onOrderSelected(orderId);
    });
  }

  // Getter for convenience to access the UOM FormArray
  get uomArray(): FormArray {
    return this.formRawMaterials.get('uom') as FormArray;
  }

  // Add a new UOM FormGroup to the FormArray
  addUom(): void {
    const group = this.fb.group({
      id: [''],
      size: [''],
      result: ['0']
    });

    this.uomArray.push(group);
  }

  // When order is selected, patch size fields
  onOrderSelected(orderId: string): void {
    if (!orderId) {
      this.formRawMaterials.get('order')?.patchValue({
        smallSize: '',
        mediumSize: '',
        largeSize: ''
      });
      return;
    }

    const selectedOrder = this.order.find(o => o.id === orderId);
    if (selectedOrder) {
      this.formRawMaterials.get('order')?.patchValue({
        smallSize: selectedOrder.smallSize || '',
        mediumSize: selectedOrder.mediumSize || '',
        largeSize: selectedOrder.largeSize || ''
      });
    }
  }

  // Save the raw materials data
  addRawMaterials(): void {
    const formValue = this.formRawMaterials.value;

    const rawMaterials: RawMaterialsModel = {
      id: undefined,
      totalQuantity: 0,  // Adjust as per your logic
      order: formValue.order,
      uom: formValue.uom,
      bomView: this.bomView[0] || {} as Bomview
    };

    this.merchandiserService.saveRawMaterials(rawMaterials).subscribe({
      next: (bomview) => {
        console.log(bomview, 'Raw Materials Saved Successfully!');
        this.loadOrder();
        this.formRawMaterials.reset();
        this.uomArray.clear();
        this.addUom();
        this.router.navigate(['']);
      },
      error: (err) => {
        console.error('Save failed:', err);
      }
    });
  }

  loadOrder(): void {
    this.merchandiserService.getAllOrder().subscribe({
      next: (res: Order[]) => {
        this.order = res;
        this.cdr.markForCheck();
      },
      error: (err) => {
        console.error(err);
      }
    });
  }




}
