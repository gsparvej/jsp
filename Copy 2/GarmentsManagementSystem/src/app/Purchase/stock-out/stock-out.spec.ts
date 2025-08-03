import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StockOut } from './stock-out';

describe('StockOut', () => {
  let component: StockOut;
  let fixture: ComponentFixture<StockOut>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [StockOut]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StockOut);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
