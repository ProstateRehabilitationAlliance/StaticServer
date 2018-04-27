package com.prostate.stata.mapper;

import com.prostate.stata.beans.IpssBean;
import com.prostate.stata.entity.Ipss;

import java.util.List;

public interface IpssMapper extends BaseMapper<Ipss>{

    List<IpssBean> selectByParamss(Ipss ipss);
}