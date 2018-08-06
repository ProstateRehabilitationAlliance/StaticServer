package com.prostate.stata.service;

import com.prostate.stata.entity.LablePrice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LablePriceService extends BaseService<LablePrice> {
    List<LablePrice> selectByToken(LablePrice lablePrice);
}
