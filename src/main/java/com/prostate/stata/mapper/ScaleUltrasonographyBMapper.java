package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleUltrasonographyBBean;
import com.prostate.stata.entity.ScaleUltrasonographyB;

import java.util.List;

public interface ScaleUltrasonographyBMapper extends BaseMapper<ScaleUltrasonographyB>{

    List<ScaleUltrasonographyBBean> selectByParamss(ScaleUltrasonographyB scaleUltrasonographyB);
}