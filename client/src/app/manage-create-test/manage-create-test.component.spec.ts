import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManageCreateTestComponent } from './manage-create-test.component';

describe('ManageCreateTestComponent', () => {
  let component: ManageCreateTestComponent;
  let fixture: ComponentFixture<ManageCreateTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManageCreateTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManageCreateTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
