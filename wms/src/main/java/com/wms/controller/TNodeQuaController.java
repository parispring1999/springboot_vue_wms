package com.wms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.TNodeQua;
import com.wms.service.TNodeQuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/tNodeQua")
public class TNodeQuaController {
    @Autowired
    private TNodeQuaService tNodeQuaService;
    //新增
    @PostMapping("/save")
    public Result save(@RequestBody TNodeQua tNodeQua){
        return tNodeQuaService.save(tNodeQua)?Result.suc():Result.fail();
    }
    //更新
    @PostMapping("/update")
    public Result update(@RequestBody TNodeQua tNodeQua){
        return tNodeQuaService.updateById(tNodeQua)?Result.suc():Result.fail();
    }
    //删除
    @GetMapping("/del")
    public Result del(@RequestParam String t){
        return tNodeQuaService.removeById(t)?Result.suc():Result.fail();
    }

    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam query){
        HashMap param = query.getParam();
        String t = (String)param.get("t");

        Page<TNodeQua> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<TNodeQua> lambdaQueryWrapper = new LambdaQueryWrapper();
        if(StringUtils.isNotBlank(t) && !"null".equals(t)){
            lambdaQueryWrapper.like(TNodeQua::getT,t);
        }

        IPage result = tNodeQuaService.pageCC(page,lambdaQueryWrapper);
        return Result.suc(result.getRecords(),result.getTotal());
    }

    @GetMapping("/list")
    public Result list(){
        List list = tNodeQuaService.list();
        return Result.suc(list);
    }
}
