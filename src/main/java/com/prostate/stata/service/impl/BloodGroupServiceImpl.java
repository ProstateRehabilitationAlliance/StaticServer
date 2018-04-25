package com.prostate.stata.service.impl;

import com.prostate.stata.entity.BloodGroup;
import com.prostate.stata.mapper.BloodGroupMapper;
import com.prostate.stata.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {
    @Autowired
    private BloodGroupMapper bloodGroupMapper;

    @Override
    public int insertSelective(BloodGroup bloodGroup) {
        return 0;
    }

    @Override
    public int updateSelective(BloodGroup bloodGroup) {
        return 0;
    }

    @Override
    public BloodGroup selectById(String id) {
        return null;
    }

    @Override
    public List<BloodGroup> selectByParams(BloodGroup bloodGroup) {
        return bloodGroupMapper.selectByParams(bloodGroup);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
