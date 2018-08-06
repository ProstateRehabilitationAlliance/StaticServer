package com.prostate.stata.controller;


import com.prostate.stata.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "cache/static")
public class CachDataController extends BaseController {

    @Autowired
    private LableInquiryService lableInquiryService;     //问诊类型标签缓查询能

    @Autowired
    private HospitalService hospitalService; //医院列表查询功能

    @Autowired
    private BranchService branchService; //科室列表查询功能

    @Autowired
    private DoctorTitleService doctorTitleService; //职称列表查询功能

    @Autowired
    private LablePatientService lablePatientService; //患者标签查询功能

    @Autowired
    private LablePriceService lablePriceService; //问诊价格标签查询功能

    @Autowired
    private CityService cityService; //查询城市

    //IPSS量表查询功能

    //NIHCPSI 量表查询功能

    //化验单解读量表查询功能


    /**
     * 查询问诊类型标签
     * @return
     */
    @GetMapping(value = "getlableInquiryJson")
    public Map<String,Object> lableInquiryJson(){

        Map<String,String> lableInquiryMap = lableInquiryService.getLableInquiryJson();
        if (lableInquiryMap.isEmpty()){
            return queryEmptyResponse();
        }
        return querySuccessResponse(lableInquiryMap);
    }


    /**
     *@Author:      ykbian
     *@date_time:   2018/8/6 10:27
     *@Description:  查询医院信息
     *@param:
    */
    @GetMapping(value = "getHospitalJson")
    public Map<String,Object> HospitalJson(){

        Map<String,String> lableInquiryMap = hospitalService.getHospitalJson();
        if (lableInquiryMap.isEmpty()){
            return queryEmptyResponse();
        }
        return querySuccessResponse(lableInquiryMap);
    }


    /**
     *@Author:      ykbian
     *@date_time:   2018/8/6 10:27
     *@Description:  查询职称信息
     *@param:
     */
    @GetMapping(value = "getDoctorTitleJson")
    public Map<String,Object> DoctorTitleJson(){

        Map<String,String> map = doctorTitleService.getDoctorTitleJson();
        if (map.isEmpty()){
            return queryEmptyResponse();
        }
        return querySuccessResponse(map);
    }
}
