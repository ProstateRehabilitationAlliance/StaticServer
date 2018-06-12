package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleDigitalRectalBean;
import com.prostate.stata.entity.ScaleDigitalRectal;

import java.util.List;

public interface ScaleDigitalRectalMapper extends BaseMapper<ScaleDigitalRectal>{

    List<ScaleDigitalRectalBean> selectByParamss(ScaleDigitalRectal scaleDigitalRectal);
}