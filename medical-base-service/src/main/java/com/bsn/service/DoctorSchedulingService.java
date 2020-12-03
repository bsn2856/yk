package com.bsn.service;

import com.bsn.entity.DoctorScheduling;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bsn.struct.PageResult;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
public interface DoctorSchedulingService extends IService<DoctorScheduling> {

    public PageResult<DoctorScheduling> page(Integer cpage,Integer psize);

    public boolean findById(Integer id);

    public boolean upOne(Integer id);

}
