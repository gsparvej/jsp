import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { VendorModel } from '../../../model/Purchase/vendor.model';
import { Item } from '../../../model/Purchase/item.model';
import { PoService } from '../../service/Purchase/po-service';
import { ItemService } from '../../service/Purchase/item-service';
import { VendorService } from '../../service/Purchase/vendor-service';
import { Router } from '@angular/router';
import { PurchaseOrder } from '../../../model/Purchase/po.model';

@Component({
  selector: 'app-create-po',
  standalone: false,
  templateUrl: './create-po.html',
  styleUrl: './create-po.css'
})
export class CreatePO implements OnInit{

  formPO!: FormGroup;

    poNumber!: string;
    poDate!: Date;
    quantity!: number;
    rate!: number;
    subTotal!: number;
    totalAmount!: number;
    discount!: number;
    tax!: number;
    deliveryDate!: Date;
    termsAndCondition!: string;
    vendor: VendorModel[] = [];
    item: Item[] = [];


    constructor(
      private poService: PoService,
      private itemService: ItemService,
      private vendorService: VendorService,
      private router: Router,
      private formBuilder: FormBuilder,
      private cdr: ChangeDetectorRef
    ){}







  ngOnInit(): void {
     this.formPO = this.formBuilder.group({
      poNumber: ['', Validators.required],
      poDate: ['', Validators.required],
      quantity: [ , [Validators.required, Validators.min(1)]],
      rate: [ , [Validators.required, Validators.min(1)]],
      tax: [ , [Validators.required, Validators.min(1)]],
      deliveryDate: ['', Validators.required],
      termsAndCondition: [''],
      subTotal: [{  disabled: true }],
      totalAmount: [{  disabled: true }],

      vendor: this.formBuilder.group({
        id: ['', Validators.required],
        companyName: ['', Validators.required],
        contactPerson: ['', Validators.required],
        phone: ['', Validators.required],
        address: ['', Validators.required],
      }),
      item: this.formBuilder.group({
        id: ['', Validators.required],
        categoryName: ['', Validators.required],
        unit: ['', Validators.required]
      })
    });

    this.loadCategoryName();
    this.loadVendor();

    this.formPO.get('vendor.id')?.valueChanges.subscribe(id => {
      const selected = this.vendor.find(ven => ven.id === id);
      if (selected) {
        this.formPO.patchValue({ vendor: selected });
      }
    });

    this.formPO.get('item.id')?.valueChanges.subscribe(id => {
      const selected = this.item.find(i => i.id === id);
      if (selected) {
        this.formPO.patchValue({ item: selected });
      }
    });
  }





  addPO(): void {
      if (this.formPO.invalid) {
        console.log('Form Invalid');
        return;
      }
      const po: PurchaseOrder = this.formPO.getRawValue();
      console.log('Submitting PO:', po);
  
      this.poService.savePO(po).subscribe({
        next: savedPO => {
          console.log('PO saved:', savedPO);
          this.formPO.reset();
          this.router.navigate(['']);
        },
        error: err => console.error(err)
      });
    }


   calculateTotalPrice(): void {
    const qty = this.formPO.get('quantity')?.value || 0;
    const rate = this.formPO.get('rate')?.value || 0;
    const subtotal = qty * rate;
    this.formPO.get('subTotal')?.setValue(subtotal);
    const tax = this.formPO.get('tax')?.value || 0;
    const total = subtotal + (subtotal*(tax/100))
    this.formPO.get('totalAmount')?.setValue(total);
  }








  private loadVendor(): void {
    this.vendorService.getAllVendor().subscribe({
      next: vendor => {
        this.vendor = vendor;
        this.cdr.detectChanges();
      },
      error: err => console.error(err)
     
    });
  }


   private loadCategoryName(): void {
    this.itemService.getAllItem().subscribe({
      next: data => {
        this.item = data;
        this.cdr.detectChanges();
      
      },
      
      error: err => console.error(err)
    });
  }

}
