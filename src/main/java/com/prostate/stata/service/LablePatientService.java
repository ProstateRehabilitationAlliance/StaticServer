package com.prostate.stata.service;

import com.prostate.stata.entity.LablePatient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LablePatientService extends BaseService<LablePatient> {
    List<LablePatient> selectByToken(LablePatient lablePatient);
}
