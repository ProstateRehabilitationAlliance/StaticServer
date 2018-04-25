package com.prostate.stata.service.impl;

import com.prostate.stata.entity.Education;
import com.prostate.stata.mapper.EducationMapper;
import com.prostate.stata.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationMapper educationMapper;
    @Override
    public int insertSelective(Education education) {
        return 0;
    }

    @Override
    public int updateSelective(Education education) {
        return 0;
    }

    @Override
    public Education selectById(String id) {
        return null;
    }

    @Override
    public List<Education> selectByParams(Education education) {
        return educationMapper.selectByParams(education);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
