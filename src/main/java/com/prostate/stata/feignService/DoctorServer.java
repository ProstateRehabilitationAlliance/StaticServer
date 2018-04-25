package com.prostate.stata.feignService;

import com.prostate.stata.feignService.impl.DoctorServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * 调用 DoctorServer 中的 API
 */
@FeignClient(value = "doctor-server",fallback = DoctorServerHystrix.class)
public interface DoctorServer {

    @GetMapping(value = "getone")
    Map<String,Object> getone();

}
