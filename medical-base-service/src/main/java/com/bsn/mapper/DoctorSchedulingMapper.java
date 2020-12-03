package com.bsn.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bsn.entity.DoctorScheduling;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
@Mapper
public interface DoctorSchedulingMapper extends BaseMapper<DoctorScheduling> {

    public Page<DoctorScheduling> getPage(Page<DoctorScheduling> page, QueryWrapper<DoctorScheduling> wrapper);

}
