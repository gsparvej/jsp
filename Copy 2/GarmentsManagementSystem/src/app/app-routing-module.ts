import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ViewAllEmployee } from './HR/view-all-employee/view-all-employee';
import { ViewAllDepartment } from './HR/view-all-department/view-all-department';
import { AddDepartment } from './HR/add-department/add-department';
import { AddEmployee } from './HR/add-employee/add-employee';
import { ViewAllAttendance } from './HR/view-all-attendance/view-all-attendance';
import { AddAttendance } from './HR/add-attendance/add-attendance';
import { ViewAllLeave } from './HR/view-all-leave/view-all-leave';
import { AddLeave } from './HR/add-leave/add-leave';
import { Registration } from './Auth/registration/registration';
import { Login } from './Auth/login/login';
import { Home } from './home/home';
import { ViewAllBuyer } from './Merchandiser/view-all-buyer/view-all-buyer';
import { AddBuyer } from './Merchandiser/add-buyer/add-buyer';
import { UserProfile } from './Auth/user-profile/user-profile';
import { Designation } from '../model/HR/designation.model';
import { AddDesignation } from './HR/add-designation/add-designation';
import { AddUom } from './Merchandiser/add-uom/add-uom';
import { ViewAllUom } from './Merchandiser/view-all-uom/view-all-uom';
import { AddBom } from './Merchandiser/add-bom/add-bom';
import { ViewAllBom } from './Merchandiser/view-all-bom/view-all-bom';
import { AddBomView } from './Merchandiser/add-bom-view/add-bom-view';
import { ViewFullBomView } from './Merchandiser/view-full-bom-view/view-full-bom-view';
import { CreateOrder } from './Merchandiser/create-order/create-order';
import { HalfViewOrder } from './Merchandiser/half-view-order/half-view-order';
import { UpdateEmployee } from './HR/update-employee/update-employee';
import { FullOrderView } from './Merchandiser/full-order-view/full-order-view';
import { AddVendor } from './Purchase/add-vendor/add-vendor';
import { ViewAllVendor } from './Purchase/view-all-vendor/view-all-vendor';
import { ViewVendorPro } from './Purchase/view-vendor-pro/view-vendor-pro';
import { ViewEmpProfile } from './HR/view-emp-profile/view-emp-profile';
import { AddItemList } from './Purchase/add-item-list/add-item-list';
import { ViewAllItem } from './Purchase/view-all-item/view-all-item';
import { Inventory } from './Purchase/inventory/inventory';
import { StockIn } from './Purchase/stock-in/stock-in';
import { StockOut } from './Purchase/stock-out/stock-out';
import { CreateRequisition } from './Purchase/create-requisition/create-requisition';
import { CreatePO } from './Purchase/create-po/create-po';
import { ViewAllPO } from './Purchase/view-all-po/view-all-po';
import { ViewPODetails } from './Purchase/view-podetails/view-podetails';
import { ViewAllRequ } from './Purchase/view-all-requ/view-all-requ';
import { ViewRequDetails } from './Purchase/view-requ-details/view-requ-details';
import { UpdateBuyer } from './Merchandiser/update-buyer/update-buyer';
import { UpdateLeave } from './HR/update-leave/update-leave';
import { UserGuard } from './Guards/user-guard';
import { AdminGuard } from './Guards/admin-guard';
import { Logout } from './Auth/logout/logout';
import { AdminProfile } from './Auth/admin-profile/admin-profile';
import { ViewUsers } from './User/view-users/view-users';
import { UpdateUsers } from './User/update-users/update-users';
import { ChatComponent } from './Chat/chat-component/chat-component';
import { SuperAdmin } from './Auth/super-admin/super-admin';
import { HrExecutive } from './Auth/hr-executive/hr-executive';
import { HrAdmin } from './Auth/hr-admin/hr-admin';
import { MerchandiserJunior } from './Auth/merchandiser-junior/merchandiser-junior';
import { MerchandiserManager } from './Auth/merchandiser-manager/merchandiser-manager';
import { PurchaseExecutive } from './Auth/purchase-executive/purchase-executive';
import { PurchaseManager } from './Auth/purchase-manager/purchase-manager';
import { RawMaterialsCalc } from './Merchandiser/raw-materials-calc/raw-materials-calc';

const routes: Routes = [
  { path: '', component: Home },
  { path: 'reg', component: Registration },
  { path: 'login', component: Login },


  { path: 'viewAllEmp', component: ViewAllEmployee },
  { path: 'addEmp', component: AddEmployee },
  { path: 'viewAllDepart', component: ViewAllDepartment },
  { path: 'addDesig', component: AddDesignation },
  { path: 'addDepart', component: AddDepartment },
  { path: 'viewAllAtten', component: ViewAllAttendance },
  { path: 'addAtten', component: AddAttendance },
  { path: 'viewAllLeave', component: ViewAllLeave },
  { path: 'addLeave', component: AddLeave },
  {path: 'updateLeave/:id', component: UpdateLeave},



  { path: 'viewAllBuyer', component: ViewAllBuyer },
  {path: 'updateBuy/:id', component: UpdateBuyer},
  { path: 'addBuyer', component: AddBuyer },


  {path: 'viewAllUser', component: ViewUsers},
  {path: 'updateUser/:id', component: UpdateUsers},

  //role Profile
  {path: 'userprofile', component: UserProfile },
  {path: 'adminprofile', component: AdminProfile},
  {path: 'superadmin', component: SuperAdmin},
  {path: 'hrexecutive', component: HrExecutive},
  {path: 'hradmin', component: HrAdmin},
  {path: 'merchandiserjunior', component: MerchandiserJunior},
  {path: 'merchandisermanager', component: MerchandiserManager},
  {path: 'purchaseexecutive', component: PurchaseExecutive},
  {path: 'purchasemanager', component: PurchaseManager},



  { path: 'addUom', component: AddUom },
  { path: 'viewAllUom', component: ViewAllUom },
  { path: 'addBom', component: AddBom },
  { path: 'viewBom', component: ViewAllBom },
  { path: 'addBomBomView', component: AddBomView },
  { path: 'viewBomBomView/:id', component: ViewFullBomView },
  { path: 'viewBomBomView', component: ViewFullBomView },
  { path: 'createOrder', component: CreateOrder },
  { path: 'viewHalfOrder', component: HalfViewOrder },
  { path: 'updateEmp/:id', component: UpdateEmployee },
  { path: 'fullOrderView/:id', component: FullOrderView },
  { path: 'addVendor', component: AddVendor },
  { path: 'viewAllVendor', component: ViewAllVendor },
  { path: 'viewVendorPro/:id', component: ViewVendorPro },
  { path: 'viewProfile/:id', component: ViewEmpProfile },
  { path: 'addItem', component: AddItemList },
  { path: 'viewAllItem', component: ViewAllItem },
  { path: 'inventory', component: Inventory },
  {path: 'stockIn' ,component: StockIn},
  {path: 'stockOut', component: StockOut},
  {path: 'createRequisition', component: CreateRequisition},
  {path: 'createPO', component: CreatePO},
  {path: 'viewPO' , component: ViewAllPO},
  {path: 'viewPODetails/:id', component: ViewPODetails},
  {path: 'viewAllRequ' , component: ViewAllRequ},
  {path: 'viewRequDetails/:id' ,component: ViewRequDetails},
  {path: 'chatBox', component: ChatComponent},




  {path: 'rawMateSave', component: RawMaterialsCalc}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
