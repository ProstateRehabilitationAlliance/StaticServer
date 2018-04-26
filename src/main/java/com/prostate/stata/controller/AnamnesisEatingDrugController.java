package com.prostate.stata.controller;


import com.prostate.stata.entity.AnamnesisEatingDrug;
import com.prostate.stata.service.AnamnesisEatingDrugService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(value = "anamnesisEatingDrug")
public class AnamnesisEatingDrugController extends BaseController{

    @Autowired
    private AnamnesisEatingDrugService anamnesisEatingDrugService;


    /**
     * 模糊查询正在服用的药物
     * @return
     */
    @PostMapping(value = "search")
    public Map search(String spellName){
        log.info("#########模糊查询正在服用的药物########");
        resultMap = new LinkedHashMap<>();
        //参数校验
        if (spellName==null||"".equals(spellName)){
            resultMap.put("code","20001");
            resultMap.put("msg","PARAM_EMPTY");
            resultMap.put("result",null);
            return resultMap;
        }
        //创建查询条件
        AnamnesisEatingDrug anamnesisEatingDrug = new AnamnesisEatingDrug();
        anamnesisEatingDrug.setSpellName(spellName);

        //查询数据
        List<AnamnesisEatingDrug> anamnesisEatingDrugList = anamnesisEatingDrugService.selectByParams(anamnesisEatingDrug);

        //查询结果不为空时请求响应
        if (anamnesisEatingDrugList!=null&&anamnesisEatingDrugList.size()>0){
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result",anamnesisEatingDrugList);
            return resultMap;
        }
        //查询结果为空时请求响应
        resultMap.put("code","20002");
        resultMap.put("msg","RESULT_EMPTY");
        resultMap.put("result",null);
        return resultMap;

    }
}
