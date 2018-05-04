package com.prostate.stata.service.impl;

import com.prostate.stata.entity.AnamnesisEatingDrug;
import com.prostate.stata.mapper.AnamnesisEatingDrugMapper;
import com.prostate.stata.service.AnamnesisEatingDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnamnesisEatingDrugServiceImpl implements AnamnesisEatingDrugService {

    @Autowired
    private AnamnesisEatingDrugMapper anamnesisEatingDrugMapper;

    @Override
    public int insertSelective(AnamnesisEatingDrug anamnesisEatingDrug) {
        return anamnesisEatingDrugMapper.insertSelective(anamnesisEatingDrug);
    }

    @Override
    public int updateSelective(AnamnesisEatingDrug anamnesisEatingDrug) {
        return 0;
    }

    @Override
    public AnamnesisEatingDrug selectById(String id) {
        return null;
    }

    @Override
    public List<AnamnesisEatingDrug> selectByParams(AnamnesisEatingDrug anamnesisEatingDrug) {
        return anamnesisEatingDrugMapper.selectByParams(anamnesisEatingDrug);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
