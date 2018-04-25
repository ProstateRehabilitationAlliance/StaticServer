package com.prostate.stata.service.impl;

import com.prostate.stata.entity.Profession;
import com.prostate.stata.mapper.ProfessionMapper;
import com.prostate.stata.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    private ProfessionMapper professionMapper;
    @Override
    public int insertSelective(Profession profession) {
        return 0;
    }

    @Override
    public int updateSelective(Profession profession) {
        return 0;
    }

    @Override
    public Profession selectById(String id) {
        return null;
    }

    @Override
    public List<Profession> selectByParams(Profession profession) {
        return professionMapper.selectByParams(profession);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
