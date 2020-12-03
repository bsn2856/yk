package com.bsn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bsn.entity.DoctorScheduling;
import com.bsn.mapper.DoctorSchedulingMapper;
import com.bsn.service.DoctorGradeService;
import com.bsn.service.DoctorSchedulingService;
import com.bsn.struct.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bianshengnan
 * @since 2020-12-03
 */
@Service
public class DoctorSchedulingServiceImpl extends ServiceImpl<DoctorSchedulingMapper, DoctorScheduling> implements DoctorSchedulingService {
    @Autowired
    private DoctorGradeService doctorGradeService;

    @Override
    public PageResult<DoctorScheduling> page(Integer cpage, Integer psize) {
            Page<DoctorScheduling> goodsPage = new Page<>(cpage, psize);
            QueryWrapper<DoctorScheduling> wrapper = new QueryWrapper<>();
            goodsPage = baseMapper.getPage(goodsPage, wrapper);
            return PageResult.of(goodsPage.getRecords(), goodsPage.getTotal());
    }

    @Override
    public boolean findById(Integer id) {
        DoctorScheduling d=this.getById(id);
        int i=d.getNum();
        if (i>0){
            return true;
        }
        return false;
    }
    @Override
    public boolean upOne(Integer id) {
        DoctorScheduling d=this.getById(id);
        d.setNum(d.getNum()-1);
        d.setTotal(d.getTotal()+1);

        return this.updateById(d);
    }
}
