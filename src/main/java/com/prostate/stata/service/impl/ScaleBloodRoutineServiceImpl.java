package com.prostate.stata.service.impl;

import com.prostate.stata.beans.ScaleBloodRoutineBean;
import com.prostate.stata.entity.ScaleBloodRoutine;
import com.prostate.stata.mapper.ScaleBloodRoutineMapper;
import com.prostate.stata.service.ScaleBloodRoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScaleBloodRoutineServiceImpl implements ScaleBloodRoutineService{

    @Autowired
    private ScaleBloodRoutineMapper scaleBloodRoutineMapper;

    @Override
    public int insertSelective(ScaleBloodRoutine scaleBloodRoutine) {
        return 0;
    }

    @Override
    public int updateSelective(ScaleBloodRoutine scaleBloodRoutine) {
        return 0;
    }

    @Override
    public ScaleBloodRoutine selectById(String id) {
        return scaleBloodRoutineMapper.selectById(id);
    }

    @Override
    public List<ScaleBloodRoutine> selectByParams(ScaleBloodRoutine scaleBloodRoutine) {
        return scaleBloodRoutineMapper.selectByParams(scaleBloodRoutine);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }

    @CachePut(value = "scale", key = "'scale_'+'bloodRoutine'")
    @Override
    public List<ScaleBloodRoutineBean> selectByParamss() {
        return scaleBloodRoutineMapper.selectByParamss();
    }
}
