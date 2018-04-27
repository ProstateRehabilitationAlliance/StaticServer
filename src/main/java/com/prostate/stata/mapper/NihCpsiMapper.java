package com.prostate.stata.mapper;

import com.prostate.stata.beans.NihCpsiBean;
import com.prostate.stata.entity.NihCpsi;

import java.util.List;

public interface NihCpsiMapper extends BaseMapper<NihCpsi>{

    List<NihCpsiBean> selectByParamss(NihCpsi nihCpsi);
}