package com.prostate.stata.mapper.master;

import com.prostate.stata.entity.Branch;

public interface BranchWriteMapper {
    int deleteByPrimaryKey(String id);

    int insert(Branch record);

    int insertSelective(Branch record);

    Branch selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);
}