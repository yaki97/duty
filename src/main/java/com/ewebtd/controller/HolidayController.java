/**
 * HolidayController.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-14 15:15
 */
package com.ewebtd.controller;

import com.ewebtd.common.AjaxResult;
import com.ewebtd.entities.BaseHolidayInfo;
import com.ewebtd.service.IHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-14 15:15
 **/
@RestController
@RequestMapping("/system/holiday")
public class HolidayController extends BaseController{
    @Autowired
    private IHolidayService holidayService;
    /**
     * addHoliday方法的说明
     * 创建人： 杨凯 2018-08-15 14:13
     * 修改人：
     * 修改说明：
     * @param holiday 年度节假日信息类
     * @return AjaxResult 返回json信息提示
     */
    @PostMapping("/addHoliday")
    public AjaxResult addHoliday(BaseHolidayInfo holiday){
        int i=holidayService.selectHolidayByHolidayDate(holiday);
        if(i>0){
            return AjaxResult.error("年度节假日已存在");
        }else{
            int j=holidayService.addHoliday(holiday);
            if(j>0){
                return AjaxResult.success("添加年度节假日成功");
            }
            else {
                return AjaxResult.error("添加年度节假日失败");
            }
        }

    }
    /**
     * updateHoliday方法的说明
     * 创建人： 杨凯 2018-08-15 14:15
     * 修改人：
     * 修改说明：
     * @param holiday 年度节假日信息类
     * @return AjaxResult 返回json信息提示
     */
    @PutMapping("/updateHoliday")
    public AjaxResult updateHoliday(BaseHolidayInfo holiday){
        int i=holidayService.updateHoliday(holiday);
        if(i>0){
            return AjaxResult.success("修改年度节假日成功");
        }
        else {
            return AjaxResult.error("修改年度节假日失败");
        }
    }
    /**
     * insertHolidaysByBatch方法的说明
     * 创建人： 杨凯 2018-08-15 14:15
     * 修改人：
     * 修改说明：
     * @param holidays 年度节假日信息类list数组
     * @return AjaxResult 返回json信息提示
     */
    @PostMapping("/insertHolidaysByBatch")
    public AjaxResult insertHolidaysByBatch(@RequestBody List<BaseHolidayInfo> holidays){
        int i=holidayService.insertHolidaysByBatch(holidays);
        if(i>0){
            return AjaxResult.success("批量添加年度节假日成功");
        }
        else {
            return AjaxResult.error("批量添加年度节假日失败");
        }
    }

}
