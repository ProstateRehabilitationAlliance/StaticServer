package com.prostate.stata.mapper.master;

import com.prostate.stata.entity.Hospital;

public interface HospitalWriteMapper {
    int deleteByPrimaryKey(String id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}