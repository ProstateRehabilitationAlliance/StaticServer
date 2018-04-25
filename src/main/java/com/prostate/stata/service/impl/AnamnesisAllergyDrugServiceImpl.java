package com.prostate.stata.service.impl;

import com.prostate.stata.entity.AnamnesisAllergyDrug;
import com.prostate.stata.mapper.AnamnesisAllergyDrugMapper;
import com.prostate.stata.service.AnamnesisAllergyDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnamnesisAllergyDrugServiceImpl implements AnamnesisAllergyDrugService {

    @Autowired
    private AnamnesisAllergyDrugMapper anamnesisAllergyDrugMapper;
    @Override
    public int insertSelective(AnamnesisAllergyDrug anamnesisAllergyDrug) {
        return 0;
    }

    @Override
    public int updateSelective(AnamnesisAllergyDrug anamnesisAllergyDrug) {
        return 0;
    }

    @Override
    public AnamnesisAllergyDrug selectById(String id) {
        return null;
    }

    @Override
    public List<AnamnesisAllergyDrug> selectByParams(AnamnesisAllergyDrug anamnesisAllergyDrug) {
        return anamnesisAllergyDrugMapper.selectByParams(anamnesisAllergyDrug);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
