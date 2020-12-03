package com.bsn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsn.entity.DoctorScheduling;
import com.bsn.entity.OrderAppointment;
import com.bsn.struct.PageResult;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
public interface OrderAppointmentService extends IService<OrderAppointment> {
    public PageResult<DoctorScheduling> page(Integer cpage, Integer psize);

    public boolean findById(Integer id);

    Boolean saveOrder(OrderAppointment order);
}
