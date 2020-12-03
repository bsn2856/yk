package com.bsn.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bsn.service.DoctorGradeService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
@RestController
@RequestMapping("/doctor-grade")
public class DoctorGradeController {
	@Autowired
	private DoctorGradeService doctorGradeService;
}
