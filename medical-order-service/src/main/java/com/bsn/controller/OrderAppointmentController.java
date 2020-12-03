package com.bsn.controller;


import com.bsn.entity.DoctorScheduling;
import com.bsn.entity.OrderAppointment;
import com.bsn.service.OrderAppointmentService;
import com.bsn.struct.PageResult;
import com.bsn.struct.Result;
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
@RequestMapping("/order-appointment")
public class OrderAppointmentController {
	@Autowired
	private OrderAppointmentService orderAppointmentService;

	@PostMapping("page/{cpage}/{psize}")
	public PageResult<DoctorScheduling> page(@PathVariable("cpage") Integer cpage, @PathVariable("psize")Integer psize){

		return orderAppointmentService.page(cpage,psize);
	}
	@GetMapping("/findOne/{id}")
	public Result findOne(@PathVariable("id") Integer id){
		boolean b=orderAppointmentService.findById(id);
		if (b){
			return Result.ok();
		}
		return Result.error();

	}
	@PostMapping("save")
	public Result save(@RequestBody OrderAppointment order){
		boolean b= orderAppointmentService.saveOrder(order);
		if (b){
			return Result.ok();
		}
		return Result.error();
	}


}
