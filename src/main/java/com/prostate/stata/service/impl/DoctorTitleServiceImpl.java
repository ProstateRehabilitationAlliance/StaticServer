package com.prostate.stata.service.impl;

import com.prostate.stata.entity.DoctorTitle;
import com.prostate.stata.mapper.master.DoctorTitleWriteMapper;
import com.prostate.stata.mapper.slaver.DoctorTitleReadMapper;
import com.prostate.stata.service.DoctorTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service
public class DoctorTitleServiceImpl implements DoctorTitleService {

    @Autowired
    private DoctorTitleWriteMapper doctorTitleWriteMapper;

    @Autowired
    private DoctorTitleReadMapper doctorTitleReadMapper;

    @Override
    public int insertSelective(DoctorTitle doctorTitle) {
        return 0;
    }

    @Override
    public int updateSelective(DoctorTitle doctorTitle) {
        return 0;
    }

    @Override
    public DoctorTitle selectById(String id) {
        return doctorTitleReadMapper.selectById(id);
    }

    @Override
    public List<DoctorTitle> selectByParams(DoctorTitle doctorTitle) {
        return null;
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
