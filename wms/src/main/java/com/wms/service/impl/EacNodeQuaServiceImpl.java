package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.EacNodeQua;
import com.wms.mapper.EacNodeQuaMapper;
import com.wms.service.EacNodeQuaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
@Service
public class EacNodeQuaServiceImpl extends ServiceImpl<EacNodeQuaMapper, EacNodeQua> implements EacNodeQuaService {

    @Resource
    private EacNodeQuaMapper eacNodeQuaMapper;
    @Override
    public IPage pageCC(IPage<EacNodeQua> page,String dynamicKey, Wrapper wrapper) {
        return eacNodeQuaMapper.pageCC(page,dynamicKey,wrapper);
    }

}
