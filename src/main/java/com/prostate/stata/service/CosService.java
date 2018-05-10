package com.prostate.stata.service;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.model.GetObjectRequest;
import com.qcloud.cos.model.ObjectMetadata;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class CosService {


    String appid = "1256660245";
    String secretId = "AKIDud8OQEt7D5i6F9ALiiXUCgvvgFfrdnSs";
    String secretKey = "KPFtIRKxNZWEhvvhEWbXFhtpVvDG4cz7";
    String region_name = "ap-beijing";
    // 1 初始化用户身份信息(secretId, secretKey)
    COSCredentials cred = new BasicCOSCredentials(secretId, secretKey);
    // 2 设置bucket的区域, COS地域的简称请参照 https://cloud.tencent.com/document/product/436/6224
    ClientConfig clientConfig = new ClientConfig(new Region(region_name));
    // 3 生成cos客户端
    COSClient cosclient = new COSClient(cred, clientConfig);
    // bucket的命名规则为{name}-{appid} ，此处填写的存储桶名称必须为此格式
    String bucketName = "pra-20180001-1256660245";

    String key = "/22.png";

    public void uoload() {
        // 简单文件上传, 最大支持 5 GB, 适用于小文件上传, 建议 20 M 以下的文件使用该接口
        // 大文件上传请参照 API 文档高级 API 上传
        File localFile = new File("src/main/resources/22.png");
        // 指定要上传到 COS 上的路径
        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, key, localFile);
        PutObjectResult putObjectResult = cosclient.putObject(putObjectRequest);
        System.out.println("=================================");

        System.out.println(putObjectResult.getContentMd5());
        System.out.println(putObjectResult.getDateStr());
        System.out.println(putObjectResult.getETag());
        System.out.println(putObjectResult.getExpirationTime());
        System.out.println(putObjectResult.getExpirationTimeRuleId());
        System.out.println(putObjectResult.getMetadata());
        System.out.println(putObjectResult.getRequestId());
        System.out.println(putObjectResult.getVersionId());

        System.out.println("=================================");

    }
    public void download(){
        // 指定要下载到的本地路径
        File downFile = new File("src/main/resources/mydown.png");
        // 指定要下载的文件所在的 bucket 和路径
        GetObjectRequest getObjectRequest = new GetObjectRequest(bucketName, key);
        ObjectMetadata downObjectMeta = cosclient.getObject(getObjectRequest, downFile);

    }
}
