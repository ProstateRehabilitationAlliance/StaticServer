package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleUrineFlowRateBean;
import com.prostate.stata.entity.ScaleUrineFlowRate;

import java.util.List;

public interface ScaleUrineFlowRateMapper extends BaseMapper<ScaleUrineFlowRate>{

    List<ScaleUrineFlowRateBean> selectByParamss(ScaleUrineFlowRate scaleUrineFlowRate);
}