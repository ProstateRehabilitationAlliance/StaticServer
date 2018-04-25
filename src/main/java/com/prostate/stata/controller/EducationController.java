package com.prostate.stata.controller;

import com.prostate.stata.entity.Education;
import com.prostate.stata.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "education")
public class EducationController extends BaseController {

    @Autowired
    private EducationService educationService;


    /**
     * 查询学历列表
     * @return
     */
    @PostMapping(value = "getAll")
    public Map getAll(){
        resultMap = new LinkedHashMap<>();
        //查询参数
        Education education = new Education();
        //查询参数赋值

        //调用service 查询数据
        List<Education> educationList = educationService.selectByParams(education);
        //查询结果校验 组装 响应
        if(educationList.size()>0){
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result",educationList);
            return resultMap;
        }
        resultMap.put("code","20001");
        resultMap.put("msg","查询结果为空");

        return resultMap;

    }


}
