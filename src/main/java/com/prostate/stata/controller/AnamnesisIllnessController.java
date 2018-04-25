package com.prostate.stata.controller;


import com.prostate.stata.service.AnamnesisIllnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "anamnesisIllness")
public class AnamnesisIllnessController extends BaseController{

    @Autowired
    private AnamnesisIllnessService anamnesisIllnessService;
}
