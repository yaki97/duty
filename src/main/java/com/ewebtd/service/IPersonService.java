/**
 * IPersonService.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-13 14:30
 */
package com.ewebtd.service;
import com.ewebtd.entities.BasePersonInfo;
import java.util.List;
/**
 * 文件的说明
 * @author 杨凯
 * @version 1.0.0, 2018-08-13 14:30
 **/
public interface IPersonService {
    //添加员工
    public Integer addPerson(BasePersonInfo person);
    //修改员工
    public Integer updatePerson(BasePersonInfo person);
    //通过员工id修改员工状态
    public Integer updatePersonById(Integer personId,Integer status);
    //通过员工id查询一个员工
    public BasePersonInfo selectPersonById(Integer personId);
    //查询所有
    public List<BasePersonInfo> selectPersons();
    //条件精确查询and
    public List<BasePersonInfo> selectPersonByAllParams(BasePersonInfo person);
    //通过员工id删除一个员工
    public Integer deletePersonById(Integer personId);
    //通过id集合批量删除多个员工
    public Integer deleteByBatch(List<Integer> personIds);
    //通过字符串模糊查询
    public List<BasePersonInfo> selectPersonsByStr(String str);
    //通过id查询员工信息和值班记录
    public List<BasePersonInfo> selectPersonDutyRecordsById(Integer personId);
}
