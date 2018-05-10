package com.prostate.stata.service.impl;

import com.prostate.stata.entity.AnamnesisSurgicalHistory;
import com.prostate.stata.mapper.AnamnesisSurgicalHistoryMapper;
import com.prostate.stata.service.AnamnesisSurgicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnamnesisSurgicalHistoryServiceImpl implements AnamnesisSurgicalHistoryService {
    @Autowired
    private AnamnesisSurgicalHistoryMapper anamnesisSurgicalHistoryMapper;

    @Override
    public int insertSelective(AnamnesisSurgicalHistory anamnesisSurgicalHistory) {
        return anamnesisSurgicalHistoryMapper.insertSelective(anamnesisSurgicalHistory);
    }

    @Override
    public int updateSelective(AnamnesisSurgicalHistory anamnesisSurgicalHistory) {
        return anamnesisSurgicalHistoryMapper.updateSelective(anamnesisSurgicalHistory);
    }

    @Override
    public AnamnesisSurgicalHistory selectById(String id) {
        return anamnesisSurgicalHistoryMapper.selectById(id);
    }

    @Override
    public List<AnamnesisSurgicalHistory> selectByParams(AnamnesisSurgicalHistory anamnesisSurgicalHistory) {
        return anamnesisSurgicalHistoryMapper.selectByParams(anamnesisSurgicalHistory);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
