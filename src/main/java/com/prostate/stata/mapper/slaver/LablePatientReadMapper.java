package com.prostate.stata.mapper.slaver;

import com.prostate.stata.entity.LablePatient;

import java.util.List;

public interface LablePatientReadMapper extends BaseReadMapper<LablePatient>{

    List<LablePatient> selectByToken(LablePatient lablePatient);
}