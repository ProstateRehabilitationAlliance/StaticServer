package com.prostate.stata.mapper.slaver;

import com.prostate.stata.entity.LablePrice;

import java.util.List;

public interface LablePriceReadMapper extends BaseReadMapper<LablePrice>{

    List<LablePrice> selectByToken(LablePrice lablePrice);
}