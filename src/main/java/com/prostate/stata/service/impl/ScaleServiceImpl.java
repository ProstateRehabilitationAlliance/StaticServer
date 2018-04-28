package com.prostate.stata.service.impl;

import com.prostate.stata.beans.ScaleBean;
import com.prostate.stata.entity.Scale;
import com.prostate.stata.mapper.ScaleMapper;
import com.prostate.stata.service.ScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScaleServiceImpl implements ScaleService {
    @Autowired
    private ScaleMapper scaleMapper;
    @Override
    public List<ScaleBean> selectByParamss(Scale scale) {
        return scaleMapper.selectByParamss(scale);
    }

    @Override
    public int insertSelective(Scale scale) {
        return 0;
    }

    @Override
    public int updateSelective(Scale scale) {
        return 0;
    }

    @Override
    public Scale selectById(String id) {
        return null;
    }

    @Override
    public List<Scale> selectByParams(Scale scale) {
        return null;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
