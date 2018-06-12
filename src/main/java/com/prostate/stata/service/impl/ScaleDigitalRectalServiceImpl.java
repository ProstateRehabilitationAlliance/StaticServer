package com.prostate.stata.service.impl;

import com.prostate.stata.beans.ScaleDigitalRectalBean;
import com.prostate.stata.entity.ScaleDigitalRectal;
import com.prostate.stata.mapper.ScaleDigitalRectalMapper;
import com.prostate.stata.service.ScaleDigitalRectalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScaleDigitalRectalServiceImpl implements ScaleDigitalRectalService {

    @Autowired
    private ScaleDigitalRectalMapper scaleDigitalRectalMapper;

    @Override
    public int insertSelective(ScaleDigitalRectal scaleDigitalRectal) {
        return 0;
    }

    @Override
    public int updateSelective(ScaleDigitalRectal scaleDigitalRectal) {
        return 0;
    }

    @Override
    public ScaleDigitalRectal selectById(String id) {
        return null;
    }

    @Override
    public List<ScaleDigitalRectal> selectByParams(ScaleDigitalRectal scaleDigitalRectal) {
        return null;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @CachePut(value = "scale", key = "'scale_'+'digitalRectal'")
    @Override
    public List<ScaleDigitalRectalBean> selectByParamss(ScaleDigitalRectal scaleDigitalRectal) {
        return scaleDigitalRectalMapper.selectByParamss(scaleDigitalRectal);
    }
}
