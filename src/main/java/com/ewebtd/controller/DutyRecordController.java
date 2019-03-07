/**
 * DutyRecordController.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-15 14:39
 */
package com.ewebtd.controller;

import com.ewebtd.entities.BasePersonInfo;
import com.ewebtd.entities.DutyRecord;
import com.ewebtd.page.TableDataInfo;
import com.ewebtd.service.IDutyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-15 14:39
 **/
@RestController
@RequestMapping("/system/dutyRecord")
public class DutyRecordController extends BaseController{
    @Autowired
    private IDutyRecordService dutyRecordService;
    /**
     * selectDutyRecordByPersonId方法的说明
     * 创建人： 杨凯 2018-08-15 14:50
     * 修改人：
     * 修改说明：
     * @param personInfo 员工信息类（传personId参）
     * @return TableDataInfo 返回分页封装数据
     */
    @GetMapping("/selectDutyRecordByPersonId")
    public TableDataInfo selectDutyRecordByPersonId(BasePersonInfo personInfo){
        super.getPageParams();
        List<DutyRecord> list=dutyRecordService.selectDutyRecordByPersonId(personInfo);
        return getDataTable(list);
    }
}
