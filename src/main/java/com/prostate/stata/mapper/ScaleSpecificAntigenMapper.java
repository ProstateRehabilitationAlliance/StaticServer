package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleSpecificAntigenBean;
import com.prostate.stata.entity.ScaleSpecificAntigen;

import java.util.List;

public interface ScaleSpecificAntigenMapper extends BaseMapper<ScaleSpecificAntigen>{

    List<ScaleSpecificAntigenBean> selectByParamss(ScaleSpecificAntigen scaleSpecificAntigen);
}