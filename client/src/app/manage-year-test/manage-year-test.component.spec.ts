import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageYearTestComponent } from './manage-year-test.component';

describe('ManageYearTestComponent', () => {
  let component: ManageYearTestComponent;
  let fixture: ComponentFixture<ManageYearTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManageYearTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManageYearTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
