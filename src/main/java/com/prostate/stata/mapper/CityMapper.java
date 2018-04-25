package com.prostate.stata.mapper;

import com.prostate.stata.beans.CityBean;
import com.prostate.stata.entity.City;

public interface CityMapper extends BaseMapper<City>{

    CityBean getCounty(City city);
}