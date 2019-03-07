/**
 * PersonController.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-13 14:35
 */
package com.ewebtd.controller;

import com.ewebtd.common.AjaxResult;
import com.ewebtd.entities.BasePersonInfo;
import com.ewebtd.page.TableDataInfo;
import com.ewebtd.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件的说明
 * @author 杨凯
 * @version 1.0.0, 2018-08-13 14:30
 **/
@RestController
@RequestMapping("/system/person")
public class PersonController extends BaseController{
    @Autowired
    private IPersonService iPersonService;
    /**
     * addPerson方法的说明
     * 创建人： 杨凯 2018-08-14 13:36
     * 修改人：
     * 修改说明：
     * @param basePersonInfo 员工信息类
     * @return AjaxResult 返回json信息提示
     */
    @PostMapping("/addPerson")
    public AjaxResult addPerson(BasePersonInfo basePersonInfo) {
        Integer i=this.iPersonService.addPerson(basePersonInfo);
        if(i>0){
            return AjaxResult.success("添加员工成功");
        }
        else{
            return AjaxResult.error("添加员工失败");
        }
    }
    /**
     * selectPersons方法的说明
     * 创建人： 杨凯 2018-08-14 11:51
     * 修改人：
     * 修改说明：
     * @return TableDataInfo 分页表格数据
     */
    @GetMapping("/selectPersons")
    public TableDataInfo selectPersons() {
        super.getPageParams();
        List<BasePersonInfo> list=this.iPersonService.selectPersons();
        return getDataTable(list);
    }
    /**
     * selectPersonById1方法的说明
     * 创建人： 杨凯  2018-08-13 17:17
     * 修改人：
     * 修改说明：
     * @param personId 员工id
     * @return BasePersonInfo 员工信息类
     */
    @GetMapping("/selectPersonById1")
    public BasePersonInfo selectPersonById1(Integer personId) {
        BasePersonInfo basePersonInfo=this.iPersonService.selectPersonById(personId);
        return basePersonInfo;
    }
    /**
     * selectPersonById2方法的说明
     * 创建人： 杨凯  2018-08-13 17:17
     * 修改人：
     * 修改说明：
     * @param personId 员工id
     * @return TableDataInfo 分页表格数据
     */
    @GetMapping("/selectPersonById2")
    public TableDataInfo selectPersonById2(Integer personId) {
        super.getPageParams();
        List<BasePersonInfo> list=new ArrayList<BasePersonInfo>();
        BasePersonInfo basePersonInfo=this.iPersonService.selectPersonById(personId);
        list.add(basePersonInfo);
        return getDataTable(list);
    }
    /**
     * selectPersonByAllParams方法的说明
     * 创建人： 杨凯 2018-08-14 11:27
     * 修改人：
     * 修改说明：
     * @param personInfo 员工信息类
     * @return TableDataInfo 分页表格数据
     */
    @GetMapping("/selectPersonByAllParams")
    public TableDataInfo selectPersonByAllParams(BasePersonInfo personInfo){
        super.getPageParams();
        List<BasePersonInfo> list=this.iPersonService.selectPersonByAllParams(personInfo);
        return getDataTable(list);
    }
    /**
     * selectPersonsByStr方法的说明
     * 创建人： 杨凯  2018-08-13 17:17
     * 修改人：
     * 修改说明：
     * 说明：员工姓名，职位，性别，状态在一个文本框查询
     * @param str 模糊查询输入的字符串
     * @return TableDataInfo 分页表格数据
     */
    @GetMapping("/selectPersonsByStr")
    public TableDataInfo selectPersonsByStr(String str) {
        super.getPageParams();
        List<BasePersonInfo> list=this.iPersonService.selectPersonsByStr(str);
        return getDataTable(list);
    }
    /**
     * updatePerson方法的说明
     * 创建人： 杨凯  2018-08-13 17:18
     * 修改人：
     * 修改说明：
     * @param basePersonInfo 员工信息类
     * @return AjaxResult 返回json信息提示
     */
    @PutMapping("/updatePerson")
    public AjaxResult updatePerson(BasePersonInfo basePersonInfo) {
        Integer i=this.iPersonService.updatePerson(basePersonInfo);
        if(i>0){
            return AjaxResult.success("修改员工成功");
        }
        else{
            return AjaxResult.error("修改员工失败");
        }
    }
    /**
     * updatePersonById方法的说明
     * 创建人： 杨凯  2018-08-13 17:18
     * 修改人：
     * 修改说明：
     * @param personId, status 员工id,员工排班状态
     * @return AjaxResult 返回json信息提示
     */
    @PutMapping("/updatePersonById")
    public AjaxResult updatePersonById(Integer personId,Integer status) {
        Integer i=this.iPersonService.updatePersonById(personId,status);
        if(i>0){
            return AjaxResult.success("修改员工成功");
        }
        else{
            return AjaxResult.error("修改员工失败");
        }
    }
    /**
     * deletePersonById方法的说明
     * 创建人： 杨凯  2018-08-13 17:18
     * 修改人：
     * 修改说明：
     * @param personId 员工id
     * @return AjaxResult 返回json信息提示
     */
    @DeleteMapping("/deletePersonById")
    public AjaxResult deletePersonById(Integer personId) {
        Integer i=this.iPersonService.deletePersonById(personId);
        if(i>0){
            return AjaxResult.success("删除员工成功");
        }
        else{
            return AjaxResult.error("员工不存在");
        }
    }
    /**
     * deleteByBatch方法的说明
     * 创建人： 杨凯 2018-08-14 10:25
     * 修改人：
     * 修改说明：
     * @param personIds 员工id的list集合
     * @return AjaxResult 返回json信息提示
     */
    @DeleteMapping("/deleteByBatch")
    public AjaxResult deleteByBatch(List<Integer> personIds) {
        Integer i=this.iPersonService.deleteByBatch(personIds);
        if(i>0){
            return AjaxResult.success("批量删除员工成功");
        }
        else{
            return AjaxResult.error("员工不存在");
        }

    }
    /**
     * selectPersonDutyRecordsById方法的说明
     * 创建人： 杨凯 2018-08-15 16:18
     * 修改人：
     * 修改说明：
     * @param personId 员工id
     * @return TableDataInfo 分页数据封装
     */
    @GetMapping("/selectPersonDutyRecordsById")
    public TableDataInfo selectPersonDutyRecordsById(Integer personId){
        super.getPageParams();
        List<BasePersonInfo> list=this.iPersonService.selectPersonDutyRecordsById(personId);
        return getDataTable(list);
    }
}
