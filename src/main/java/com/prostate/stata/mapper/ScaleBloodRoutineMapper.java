package com.prostate.stata.mapper;

import com.prostate.stata.beans.ScaleBloodRoutineBean;
import com.prostate.stata.entity.ScaleBloodRoutine;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ScaleBloodRoutineMapper extends BaseMapper<ScaleBloodRoutine>{

    List<ScaleBloodRoutineBean> selectByParamss();
}