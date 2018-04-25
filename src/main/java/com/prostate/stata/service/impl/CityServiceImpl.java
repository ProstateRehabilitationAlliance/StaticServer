package com.prostate.stata.service.impl;

import com.prostate.stata.beans.CityBean;
import com.prostate.stata.entity.City;
import com.prostate.stata.mapper.CityMapper;
import com.prostate.stata.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public int insertSelective(City city) {
        return 0;
    }

    @Override
    public int updateSelective(City city) {
        return 0;
    }

    @Override
    public City selectById(String id) {
        return null;
    }

    @Override
    public List<City> selectByParams(City city) {
        return cityMapper.selectByParams(city);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }


    @Override
    public CityBean getCounty(City city) {
        return cityMapper.getCounty(city);
    }
}
