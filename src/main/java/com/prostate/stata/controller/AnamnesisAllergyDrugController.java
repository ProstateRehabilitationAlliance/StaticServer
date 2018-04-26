package com.prostate.stata.controller;

import com.prostate.stata.entity.AnamnesisAllergyDrug;
import com.prostate.stata.service.AnamnesisAllergyDrugService;
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
@RequestMapping(value = "anamnesisAllergyDrug")
public class AnamnesisAllergyDrugController extends BaseController{


    @Autowired
    private AnamnesisAllergyDrugService anamnesisAllergyDrugService;

    /**
     * 模糊查询过敏药物
     * @return
     */
    @PostMapping(value = "search")
    public Map search(String spellName){
        log.info("#########m模糊查询过敏药物########");
        resultMap = new LinkedHashMap<>();
        //参数校验
        if (spellName==null||"".equals(spellName)){
            resultMap.put("code","20001");
            resultMap.put("msg","PARAM_EMPTY");
            resultMap.put("result",null);
            return resultMap;
        }
        //创建查询条件
        AnamnesisAllergyDrug anamnesisAllergyDrug = new AnamnesisAllergyDrug();
        anamnesisAllergyDrug.setSpellName(spellName);

        //查询数据
        List<AnamnesisAllergyDrug> anamnesisAllergyDrugList = anamnesisAllergyDrugService.selectByParams(anamnesisAllergyDrug);

        //查询结果不为空时请求响应
        if (anamnesisAllergyDrugList!=null&&anamnesisAllergyDrugList.size()>0){
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result",anamnesisAllergyDrugList);
            return resultMap;
        }
        //查询结果为空时请求响应
        resultMap.put("code","20002");
        resultMap.put("msg","RESULT_EMPTY");
        resultMap.put("result",null);
        return resultMap;

    }

}
