package com.wms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.EacNodeQua;
import com.wms.service.EacNodeQuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/eacNodeQua")
public class EacNodeQuaController {
    @Autowired
    private EacNodeQuaService eacNodeQuaService;
    //新增
    @PostMapping("/save")
    public Result save(@RequestBody EacNodeQua eacNodeQua){
        return eacNodeQuaService.save(eacNodeQua)?Result.suc():Result.fail();
    }
    //更新
    @PostMapping("/update")
    public Result update(@RequestBody EacNodeQua eacNodeQua){
        return eacNodeQuaService.updateById(eacNodeQua)?Result.suc():Result.fail();
    }
    //删除
    @GetMapping("/del")
    public Result del(@RequestParam String eac){
        return eacNodeQuaService.removeById(eac)?Result.suc():Result.fail();
    }

    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam query){
        HashMap param = query.getParam();
        String eac = (String)param.get("eac");
        String dynamicKey = (String) param.get("dynamicKey");

        Page<EacNodeQua> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<EacNodeQua> lambdaQueryWrapper = new LambdaQueryWrapper();
        if(StringUtils.isNotBlank(eac) && !"null".equals(eac)){
            lambdaQueryWrapper.like(EacNodeQua::getEac,eac);
        }

        IPage result = eacNodeQuaService.pageCC(page,dynamicKey,lambdaQueryWrapper);
        return Result.suc(result.getRecords(),result.getTotal());
    }

    @GetMapping("/list")
    public Result list(){
        List list = eacNodeQuaService.list();
        return Result.suc(list);
    }
}
