/**
 * DriverRecordController.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 22:39
 */
package com.ewebtd.controller;
import com.ewebtd.common.AjaxResult;
import com.ewebtd.entities.DutyDriverRecord;
import com.ewebtd.page.TableDataInfo;
import com.ewebtd.service.IDriverRecordService;
import com.ewebtd.service.IDriverService;
import com.ewebtd.util.DutyRule;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 22:39
 * @Description
 **/
@RestController
@RequestMapping("/system/driverRecord")
public class DriverRecordController extends BaseController{
    @Resource
    private IDriverRecordService driverRecordService;
    @Resource
    private IDriverService driverService;
    /**
     * addDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:33
     * 修改人：
     * 修改说明：
     * @param driverRecord 司机记录
     * @return AjaxResult 返回操作信息
     */
    @PostMapping(value = "/addDriverRecord")
    public AjaxResult addDriverRecord(DutyDriverRecord driverRecord){
        driverRecordService.addDriverRecord(driverRecord);
        return AjaxResult.success("添加司机值班记录成功");
    }
    /**
     * selectDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:34
     * 修改人：
     * 修改说明：
     * @param driverRecord 司机记录
     * @return TableDataInfo 返回分页数据
     */
    @GetMapping(value ="/selectDriverRecord")
    public TableDataInfo selectDriverRecord(DutyDriverRecord driverRecord){
        super.getPageParams();
        List<DutyDriverRecord> list = this.driverRecordService.selectDriverRecord(driverRecord);
        return getDataTable(list) ;
    }
    /**
     * updateDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:36
     * 修改人：
     * 修改说明：
     * @param driverRecord 排班记录类
     * @return AjaxResult 返回操作信息
     */
    @PutMapping(value = "/updateDriverRecord")
    public AjaxResult updateDriverRecord(DutyDriverRecord driverRecord){
        Integer retrunValue = driverRecordService.updateDriverRecord(driverRecord);
        if(retrunValue>0){
            return AjaxResult.success("修改成功！");
        }else{
            return AjaxResult.error("修改失败！");
        }
    }
    /**
     * deleteDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:44
     * 修改人：
     * 修改说明：
     * @param driverRecordId 排班记录id
     * @return AjaxResult 返回操作信息
     */
    @DeleteMapping(value ="/deleteDriverRecord")
    public AjaxResult deleteDriverRecord(Integer driverRecordId){

        Integer retrunValue =  driverRecordService.deleteDriverRecord(driverRecordId);
        if(retrunValue>0){
            return AjaxResult.success("删除成功！");
        }else{
            return AjaxResult.error("删除失败！");
        }
    }
    /**
     * addDriverRecordMonth方法的说明
     * 创建人： 杨凯 2018-08-20 16:45
     * 修改人：
     * 修改说明：
     * @param date 日期
     * @return AjaxResult 返回操作信息
     */
    @PostMapping(value = "/addDriverRecordMonth")
    public AjaxResult addDriverRecordMonth(Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
        String dateString = formatter.format(date);
        //添加数据前查询
        Integer ii=driverRecordService.selectDriverRecordByDate(dateString);
        if(ii>0){return AjaxResult.success("当月排班已存在");}
        else {
            List<String> dateStr=DutyRule.dateToDateStr(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1);
            Integer[] ids=driverService.selectDriverOrderByDriverOrder();
            List<String> str=DutyRule.returnDriverRecords(ids,dateStr);
            for(int i=0;i<str.size();i++){
                DutyDriverRecord dutyDriverRecord=new DutyDriverRecord();
                dutyDriverRecord.setDutyDate(java.sql.Date.valueOf(str.get(i).substring(0,10)));
                dutyDriverRecord.setDutyPeriod(str.get(i).substring(11,12));
                dutyDriverRecord.setDriverId(Integer.parseInt(str.get(i).substring(13,14)));
                driverRecordService.addDriverRecord(dutyDriverRecord);
            }
            return AjaxResult.success("当月排班安排成功");
        }

    }
}
