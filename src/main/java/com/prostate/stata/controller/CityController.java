package com.prostate.stata.controller;

import com.prostate.stata.beans.CityBean;
import com.prostate.stata.entity.City;
import com.prostate.stata.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "city")
public class CityController extends BaseController {

    @Autowired
    private CityService cityService;


    /**
     * 获取省份列表
     *
     * @return
     */
    @PostMapping(value = "getCounty")
    public Map getCounty() {
        resultMap = new LinkedHashMap<>();
        //查询参数
        City city = new City();
        //查询参数赋值

        //调用service 查询数据
        CityBean cityBean = cityService.getCounty(city);
        //查询结果校验 组装 响应
        if (cityBean != null) {
            resultMap.put("code","20000");
            resultMap.put("msg","SUCCESS");
            resultMap.put("result", cityBean.getCityList());
            return resultMap;
        }
        resultMap.put("code", "20001");
        resultMap.put("msg", "查询结果为空");

        return resultMap;
    }

    /**
     * 根据上级城市ID查询城市列表
     *
     * @return
     */
    @GetMapping(value = "getCityByParentId")
    public Map getCityByParentId(String parentId) {
        //查询参数
        City city = new City();
        city.setParentCityId(parentId);
        //查询参数赋值

        //调用service 查询数据
        List<City> cityList = cityService.selectByParams(city);
        //查询结果校验 组装 响应
        if (cityList.size() > 0) {
            resultMap.put("result", cityList);
            return resultMap;
        }
        resultMap.put("code", "20001");
        resultMap.put("msg", "查询结果为空");

        return resultMap;
    }

}
