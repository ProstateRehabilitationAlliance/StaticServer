package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleExpressedProstaticSecretionBean;
import com.prostate.stata.entity.ScaleExpressedProstaticSecretion;

import java.util.List;

public interface ScaleExpressedProstaticSecretionMapper extends BaseMapper<ScaleExpressedProstaticSecretion>{

    List<ScaleExpressedProstaticSecretionBean> selectByParamss(ScaleExpressedProstaticSecretion scaleExpressedProstaticSecretion);
}