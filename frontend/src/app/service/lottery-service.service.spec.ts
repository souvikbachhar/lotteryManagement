import { TestBed } from '@angular/core/testing';

import { LotteryServiceService } from './lottery-service.service';

describe('LotteryServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LotteryServiceService = TestBed.get(LotteryServiceService);
    expect(service).toBeTruthy();
  });
});
