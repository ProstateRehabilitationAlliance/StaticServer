package com.prostate.stata.controller;

import com.prostate.stata.beans.NihCpsiBean;
import com.prostate.stata.entity.NihCpsi;
import com.prostate.stata.service.NihCpsiService;
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
@RequestMapping(value = "nihCpsi")
public class NihCpsiController extends BaseController{

    @Autowired
    private NihCpsiService nihCpsiService;

    @PostMapping(value = "getAll")
    public Map getAll(){
        log.info("##########查询NIH-CPSI评估项列表###########");
        resultMap = new LinkedHashMap<>();
        NihCpsi nihCpsi = new NihCpsi();
        List<NihCpsiBean> nihCpsiBeanList =  nihCpsiService.selectByParamss(nihCpsi);
        //查询结果校验 组装 响应
        if (nihCpsiBeanList != null) {
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result", nihCpsiBeanList);
            return resultMap;
        }
        resultMap.put("code", "20001");
        resultMap.put("msg", "查询结果为空");

        return resultMap;
    }

}
