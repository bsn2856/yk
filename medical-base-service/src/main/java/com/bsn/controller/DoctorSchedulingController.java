package com.bsn.controller;


import com.bsn.entity.DoctorScheduling;
import com.bsn.service.DoctorSchedulingService;
import com.bsn.struct.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
@RestController
@RequestMapping("/doctor-scheduling")
public class DoctorSchedulingController {
	@Autowired
	private DoctorSchedulingService doctorSchedulingService;

	@PostMapping("/page/{cpage}/{psize}")
	public PageResult<DoctorScheduling> page(@PathVariable("cpage") Integer cpage, @PathVariable("psize")Integer psize){

		return doctorSchedulingService.page(cpage,psize);
	}

	@GetMapping("/findOne/{id}")
	public Boolean findOne(@PathVariable("id") Integer id){
		return doctorSchedulingService.findById(id);

	}
	@GetMapping("/upOne/{id}")
	public Boolean upOne(@PathVariable("id") Integer id){
		return doctorSchedulingService.upOne(id);

	}
	@GetMapping("/getId/{id}")
	public DoctorScheduling getId(@PathVariable("id") Integer id){
		return doctorSchedulingService.getById(id);

	}

}
