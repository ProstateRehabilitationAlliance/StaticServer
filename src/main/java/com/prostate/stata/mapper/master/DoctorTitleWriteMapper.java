package com.prostate.stata.mapper.master;

import com.prostate.stata.entity.DoctorTitle;

public interface DoctorTitleWriteMapper {
    int deleteByPrimaryKey(String id);

    int insert(DoctorTitle record);

    int insertSelective(DoctorTitle record);

    DoctorTitle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DoctorTitle record);

    int updateByPrimaryKey(DoctorTitle record);
}