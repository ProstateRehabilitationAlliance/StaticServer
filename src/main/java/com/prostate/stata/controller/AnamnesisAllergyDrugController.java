package com.prostate.stata.controller;

import com.prostate.stata.entity.AnamnesisAllergyDrug;
import com.prostate.stata.service.AnamnesisAllergyDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
        AnamnesisAllergyDrug anamnesisAllergyDrug = new AnamnesisAllergyDrug();

        anamnesisAllergyDrug.setSpellName(spellName);
        List<AnamnesisAllergyDrug> anamnesisAllergyDrugList = anamnesisAllergyDrugService.selectByParams(anamnesisAllergyDrug);
    }

}
