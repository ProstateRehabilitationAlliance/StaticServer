package com.prostate.stata.controller;

import com.prostate.stata.beans.ScaleBean;
import com.prostate.stata.entity.Scale;
import com.prostate.stata.service.ScaleService;
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
@RequestMapping(value = "scale")
public class ScaleController extends BaseController{

    @Autowired
    private ScaleService scaleService;

    @PostMapping(value = "getAll")
    public Map getAll(){
        log.info("##########SCALE###########");
        resultMap = new LinkedHashMap<>();
        Scale scale = new Scale();
        List<ScaleBean> scaleBeanList =  scaleService.selectByParamss(scale);

        //查询结果校验 组装 响应
        if (scaleBeanList != null&&scaleBeanList.size()>0) {
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result", scaleBeanList);
            return resultMap;
        }
        resultMap.put("code", "20001");
        resultMap.put("msg", "查询结果为空");
        resultMap.put("result", null);

        return resultMap;
    }

}
