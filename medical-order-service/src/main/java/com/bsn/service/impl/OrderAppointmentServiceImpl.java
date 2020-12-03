package com.bsn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bsn.client.FeignClients;
import com.bsn.entity.DoctorScheduling;
import com.bsn.entity.OrderAppointment;
import com.bsn.mapper.OrderAppointmentMapper;
import com.bsn.service.OrderAppointmentService;
import com.bsn.struct.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
@Service
public class OrderAppointmentServiceImpl extends ServiceImpl<OrderAppointmentMapper, OrderAppointment> implements OrderAppointmentService {
    @Autowired
    FeignClients feignClients;
    @Override
    public PageResult<DoctorScheduling> page(Integer cpage, Integer psize){
        return feignClients.page(cpage,psize);
    }

    @Override
    public boolean findById(Integer id) {
        return feignClients.findOne(id);
    }

    public boolean upOne(Integer id) {
        return feignClients.upOne(id);
    }

    @Override
    public Boolean saveOrder(OrderAppointment order) {
        int id=order.getDid();
        if (id>0){
            this.upOne(id);
            DoctorScheduling d=feignClients.getId(id);
            order.setAppointmentDate(d.getAppointmentDatatime());
            order.setDoctorName(d.getDoctorName());
            order.setDoctorSchedulingId(id);
            Date date=new Date();
            order.setCreateDatetime(date);
            return save(order);
        }
        return false;
    }


}
