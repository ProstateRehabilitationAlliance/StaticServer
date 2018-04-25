package com.prostate.stata.controller;


import com.prostate.stata.service.AnamnesisEatingDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "anamnesisEatingDrug")
public class AnamnesisEatingDrugController extends BaseController{

    @Autowired
    private AnamnesisEatingDrugService anamnesisEatingDrugService;
}
