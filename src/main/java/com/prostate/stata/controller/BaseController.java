package com.prostate.stata.controller;


import java.util.LinkedHashMap;
import java.util.Map;

public class BaseController{

    public  Map<String,Object> resultMap ;


    /**
     * 参数为空返回值
     * @return
     */
    public Map emptyParamResponse(){
        resultMap = new LinkedHashMap<>();
        resultMap.put("code","20001");
        resultMap.put("msg","EMPTY_PARAM");
        resultMap.put("result",null);
        return resultMap;
    }

    /**
     * 请求成功返回值
     * @param result
     * @return
     */
    public Map querySuccessResponse(Object result){
        resultMap = new LinkedHashMap<>();
        resultMap.put("code","20000");
        resultMap.put("msg","SUCCESS");
        resultMap.put("result",result);
        return resultMap;
    }

    /**
     * 查询请求结果为空返回值
     * @return
     */
    public Map queryEmptyResponse(){
        resultMap = new LinkedHashMap<>();

        resultMap.put("code","40004");
        resultMap.put("msg","RESULT_EMPTY");
        resultMap.put("result",null);
        return resultMap;
    }
    /**
     * 请求失败返回值
     * @return
     */
    public Map failedResponse(){
        resultMap = new LinkedHashMap<>();
        resultMap.put("code","50002");
        resultMap.put("msg","FAILED_EMPTY");
        resultMap.put("result",null);
        return resultMap;
    }

    /**
     * 请求失败返回值
     * @return
     */
    public Map insertFailedResponse(){
        resultMap = new LinkedHashMap<>();
        resultMap.put("code","50003");
        resultMap.put("msg","INSERT_FAILED");
        resultMap.put("result",null);
        return resultMap;
    }

    /**
     * 请求失败返回值
     * @return
     */
    public Map insertSuccseeResponse(){
        resultMap = new LinkedHashMap<>();
        resultMap.put("code","20000");
        resultMap.put("msg","INSERT_SUCCESS");
        resultMap.put("result",null);
        return resultMap;
    }

}
