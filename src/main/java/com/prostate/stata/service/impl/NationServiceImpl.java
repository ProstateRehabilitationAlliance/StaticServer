package com.prostate.stata.service.impl;

import com.prostate.stata.entity.Nation;
import com.prostate.stata.mapper.NationMapper;
import com.prostate.stata.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationServiceImpl implements NationService {

    @Autowired
    private NationMapper nationMapper;

    @Override
    public int insertSelective(Nation nation) {
        return 0;
    }

    @Override
    public int updateSelective(Nation nation) {
        return 0;
    }

    @Override
    public Nation selectById(String id) {
        return null;
    }

    @Override
    public List<Nation> selectByParams(Nation nation) {
        return nationMapper.selectByParams(nation);
    }

    @Override
    public int deleteById(String id) {
        return 0;
    }
}
