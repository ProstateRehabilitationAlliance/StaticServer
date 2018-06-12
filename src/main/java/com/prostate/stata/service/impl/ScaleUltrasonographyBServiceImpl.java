package com.prostate.stata.service.impl;

import com.prostate.stata.beans.ScaleUltrasonographyBBean;
import com.prostate.stata.entity.ScaleUltrasonographyB;
import com.prostate.stata.mapper.ScaleUltrasonographyBMapper;
import com.prostate.stata.service.ScaleUltrasonographyBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScaleUltrasonographyBServiceImpl implements ScaleUltrasonographyBService {

    @Autowired
    private ScaleUltrasonographyBMapper scaleUltrasonographyBMapper;

    @Override
    public int insertSelective(ScaleUltrasonographyB scaleUltrasonographyB) {
        return 0;
    }

    @Override
    public int updateSelective(ScaleUltrasonographyB scaleUltrasonographyB) {
        return 0;
    }

    @Override
    public ScaleUltrasonographyB selectById(String id) {
        return null;
    }

    @Override
    public List<ScaleUltrasonographyB> selectByParams(ScaleUltrasonographyB scaleUltrasonographyB) {
        return null;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @CachePut(value = "scale", key = "'scale_'+'ultrasonographyB'")
    @Override
    public List<ScaleUltrasonographyBBean> selectByParamss(ScaleUltrasonographyB scaleUltrasonographyB) {
        return scaleUltrasonographyBMapper.selectByParamss(scaleUltrasonographyB);
    }
}
