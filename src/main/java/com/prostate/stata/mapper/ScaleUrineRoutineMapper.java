package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleUrineRoutineBean;
import com.prostate.stata.entity.ScaleUrineRoutine;

import java.util.List;

public interface ScaleUrineRoutineMapper extends BaseMapper<ScaleUrineRoutine>{

    List<ScaleUrineRoutineBean> selectByParamss(ScaleUrineRoutine scaleUrineRoutine);
}