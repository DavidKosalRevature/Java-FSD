import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostPhotoGridComponent } from './post-photo-grid.component';

describe('PostPhotoGridComponent', () => {
  let component: PostPhotoGridComponent;
  let fixture: ComponentFixture<PostPhotoGridComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostPhotoGridComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PostPhotoGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
