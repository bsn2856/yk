package com.bsn.client;

import com.bsn.entity.DoctorScheduling;
import com.bsn.struct.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "medical-base-service",path = "/doctor-scheduling")
public interface FeignClients {
    @PostMapping("page/{cpage}/{psize}")
    public PageResult<DoctorScheduling> page(@PathVariable("cpage") Integer cpage, @PathVariable("psize")Integer psize);
    @GetMapping("/findOne/{id}")
    public Boolean findOne(@PathVariable("id") Integer id);
    @GetMapping("/upOne/{id}")
    public Boolean upOne(@PathVariable("id") Integer id);
    @GetMapping("/getId/{id}")
    public DoctorScheduling getId(@PathVariable("id") Integer id);
}
