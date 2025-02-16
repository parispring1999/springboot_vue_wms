package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.EacNodeQua;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
public interface EacNodeQuaService extends IService<EacNodeQua> {

    IPage pageCC(IPage<EacNodeQua> page, String dynamicKey, Wrapper wrapper);

}
