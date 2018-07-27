package com.prostate.stata.service.impl;

import com.prostate.stata.entity.LableInquiry;
import com.prostate.stata.mapper.master.LableInquiryWriteMapper;
import com.prostate.stata.mapper.slaver.LableInquiryReadMapper;
import com.prostate.stata.service.LableInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LableInquiryServiceImpl implements LableInquiryService {

    @Autowired
    private LableInquiryWriteMapper lableInquiryWriteMapper;

    @Autowired
    private LableInquiryReadMapper lableInquiryReadMapper;

    @Override
    public int insertSelective(LableInquiry lableInquiry) {
        return 0;
    }

    @Override
    public int updateSelective(LableInquiry lableInquiry) {
        return 0;
    }

    @Override
    public LableInquiry selectById(String id) {
        return null;
    }

    @Override
    public List<LableInquiry> selectByParams(LableInquiry lableInquiry) {
        return lableInquiryReadMapper.selectByParams(lableInquiry);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
