import { TestBed } from '@angular/core/testing';

import { HttpPhotoService } from './http-photo.service';

describe('HttpPhotoService', () => {
  let service: HttpPhotoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HttpPhotoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
