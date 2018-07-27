package com.prostate.stata.service.impl;

import com.prostate.stata.entity.Hospital;
import com.prostate.stata.mapper.master.HospitalWriteMapper;
import com.prostate.stata.mapper.slaver.HospitalReadMapper;
import com.prostate.stata.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalWriteMapper hospitalWriteMapper;

    @Autowired
    private HospitalReadMapper hospitalReadMapper;

    @Override
    public int insertSelective(Hospital hospital) {
        return 0;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @Override
    public int updateSelective(Hospital hospital) {
        return 0;
    }

    @Override
    public Hospital selectById(String id) {
        return hospitalReadMapper.selectById(id);
    }

    @Override
    public List<Hospital> selectByParams(Hospital hospital) {
        return null;
    }
}
