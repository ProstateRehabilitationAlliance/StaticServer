package com.prostate.stata.service.impl;

import com.prostate.stata.entity.AnamnesisIllness;
import com.prostate.stata.mapper.AnamnesisIllnessMapper;
import com.prostate.stata.service.AnamnesisIllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnamnesisIllnessServiceImpl implements AnamnesisIllnessService {

    @Autowired
    private AnamnesisIllnessMapper anamnesisIllnessMapper;


    @Override
    public int insertSelective(AnamnesisIllness anamnesisIllness) {
        return anamnesisIllnessMapper.insertSelective(anamnesisIllness);
    }

    @Override
    public int updateSelective(AnamnesisIllness anamnesisIllness) {
        return 0;
    }

    @Override
    public AnamnesisIllness selectById(String id) {
        return null;
    }

    @Override
    public List<AnamnesisIllness> selectByParams(AnamnesisIllness anamnesisIllness) {
        return anamnesisIllnessMapper.selectByParams(anamnesisIllness);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
