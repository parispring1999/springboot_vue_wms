package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import springfox.documentation.spring.web.json.Json;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="EacNodeQua对象", description="")
public class EacNodeQua {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "防御反制活动主键")
    @TableId(value = "eac", type = IdType.ASSIGN_ID)
    private String eac;

    @ApiModelProperty(value = "操作消耗的cpu算力资源")
    private String cp;

    @ApiModelProperty(value = "操作消耗的内存和存储资源")
    private String st;

    @ApiModelProperty(value = "操作消耗的网络带宽")
    private String nb;

    @ApiModelProperty(value = "操作需要的时间")
    private String ot;

    @ApiModelProperty(value = "操作造成的负面业务影响")
    private String bi;

    @ApiModelProperty(value = "防御策略避免和修复的机密性损失")
    private String rc;

    @ApiModelProperty(value = "防御策略避免和修复的完整性损失")
    private String ri;

    @ApiModelProperty(value = "防御策略避免和修复的可用性损失")
    private String ra;

    @ApiModelProperty(value = "反制策略使攻击者信息暴露情况")
    private String ia;

    @ApiModelProperty(value = "反制攻击者弱点综合评分")
    private String vu;
}
