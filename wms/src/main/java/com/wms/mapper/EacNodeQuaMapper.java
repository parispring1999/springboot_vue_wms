package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.EacNodeQua;
import com.wms.entity.TNodeQua;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wms
 * @since 2022-10-15
 */
@Mapper
public interface EacNodeQuaMapper extends BaseMapper<EacNodeQua> {

    IPage pageCC(IPage<EacNodeQua> page, @Param("dynamicKey") String dynamicKey, @Param(Constants.WRAPPER) Wrapper wrapper);

}
