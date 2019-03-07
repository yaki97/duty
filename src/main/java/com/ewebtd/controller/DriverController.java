/**
 * DriverController.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 21:38
 */
package com.ewebtd.controller;

import com.ewebtd.common.AjaxResult;
import com.ewebtd.entities.DutyDriverInfo;
import com.ewebtd.page.TableDataInfo;
import com.ewebtd.service.IDriverService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 21:38
 * @Description
 **/
@RestController
@RequestMapping("/system/driver")
public class DriverController extends BaseController {
    @Resource
    private IDriverService driverService;
    /**
     * addDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:20
     * 修改人：
     * 修改说明：
     * @param driver 司机类
     * @return AjaxResult 返回操作信息
     */
    @PostMapping(value = "/addDriver")
    public AjaxResult addDriver(DutyDriverInfo driver){
        driverService.addDriver(driver);
        return AjaxResult.success("添加最后值班组成功");
    }
    /**
     * selectDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:31
     * 修改人：
     * 修改说明：
     * @param driver 司机信息类多条件
     * @return TableDataInfo 返回分页数据
     */
    @GetMapping(value ="/selectDriver")
    public TableDataInfo selectDriver(DutyDriverInfo driver){
        super.getPageParams();
        List<DutyDriverInfo> list = this.driverService.selectDriver(driver);
        return getDataTable(list) ;
    }
    /**
     * updateDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:32
     * 修改人：
     * 修改说明：
     * @param driver 司机信息类的id
     * @return AjaxResult 返回操作信息
     */
    @PutMapping(value = "/updateDriver")
    public AjaxResult updateDriver(DutyDriverInfo driver){
        Integer retrunValue = driverService.updateDriver(driver);
        if(retrunValue>0){
            return AjaxResult.success("修改最后值班组成功！");
        }else{
            return AjaxResult.error("修改最后值班组失败！");
        }
    }
    /**
     * deleteDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:33
     * 修改人：
     * 修改说明：
     * @param driverId 司机id
     * @return AjaxResult 返回操作信息
     */
    @DeleteMapping(value ="/deleteDriver")
    public AjaxResult deleteDriver(Integer driverId){
        Integer retrunValue =  driverService.deleteDriver(driverId);
        if(retrunValue>0){
            return AjaxResult.success("删除成功！");
        }else{
            return AjaxResult.error("删除失败！");
        }
    }
}
