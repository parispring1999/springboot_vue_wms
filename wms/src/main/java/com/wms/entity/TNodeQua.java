package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TNodeQua对象", description="")
public class TNodeQua {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "攻击技术主键")
    @TableId(value = "t", type = IdType.ASSIGN_ID)
    private String t;

    @ApiModelProperty(value = "攻击需要的技术")
    private String rs;

    @ApiModelProperty(value = "攻击的严重性")
    private String sa;

    @ApiModelProperty(value = "攻击的发生率")
    private String lia;

    @ApiModelProperty(value = "攻击行为本身造成的机密性破坏")
    private String pc;

    @ApiModelProperty(value = "攻击行为本身造成的完整性破坏")
    private String pi;

    @ApiModelProperty(value = "攻击行为本身造成的可用性破坏")
    private String pa;

    @ApiModelProperty(value = "攻击所需媒介")
    private String av;

    @ApiModelProperty(value = "攻击所需特权")
    private String pr;

    @ApiModelProperty(value = "攻击所需交互")
    private String ui;
}
