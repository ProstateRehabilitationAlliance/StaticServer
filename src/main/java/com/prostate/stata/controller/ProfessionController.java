package com.prostate.stata.controller;

import com.prostate.stata.entity.Education;
import com.prostate.stata.entity.Profession;
import com.prostate.stata.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "profession")
public class ProfessionController extends BaseController {

    @Autowired
    private ProfessionService professionService;
    /**
     * 查询职业列表
     * @return
     */
    @PostMapping(value = "getAll")
    public Map getAll(){
        resultMap = new LinkedHashMap<>();
        //查询参数
        Profession profession = new Profession();
        //查询参数赋值

        //调用service 查询数据
        List<Profession> professionList = professionService.selectByParams(profession);
        //查询结果校验 组装 响应
        if(professionList.size()>0){
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result",professionList);
            return resultMap;
        }
        resultMap.put("code","20001");
        resultMap.put("msg","查询结果为空");

        return resultMap;

    }

}
