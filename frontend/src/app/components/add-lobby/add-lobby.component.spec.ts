import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddLobbyComponent } from './add-lobby.component';

describe('AddLobbyComponent', () => {
  let component: AddLobbyComponent;
  let fixture: ComponentFixture<AddLobbyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddLobbyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddLobbyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
