package com.prostate.stata.mapper;

import com.prostate.stata.beans.CityBean;
import com.prostate.stata.entity.City;
import org.springframework.cache.annotation.CachePut;

public interface CityMapper extends BaseMapper<City>{

    CityBean getCounty(City city);

    City getById(String id);
}