package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleBean;
import com.prostate.stata.entity.Scale;

import java.util.List;

public interface ScaleMapper extends BaseMapper<Scale>{

    List<ScaleBean> selectByParamss(Scale scale);
}