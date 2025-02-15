package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Storage;
import com.wms.entity.TNodeQua;
import com.wms.mapper.StorageMapper;
import com.wms.mapper.TNodeQuaMapper;
import com.wms.service.StorageService;
import com.wms.service.TNodeQuaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
@Service
public class TNodeQuaServiceImpl extends ServiceImpl<TNodeQuaMapper, TNodeQua> implements TNodeQuaService {

    @Resource
    private TNodeQuaMapper tNodeQuaMapper;
    @Override
    public IPage pageCC(IPage<TNodeQua> page, Wrapper wrapper) {
        return tNodeQuaMapper.pageCC(page,wrapper);
    }
}
