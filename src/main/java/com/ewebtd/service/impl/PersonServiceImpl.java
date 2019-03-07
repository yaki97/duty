/**
 * PersonServiceImpl.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-13 14:03
 */
package com.ewebtd.service.impl;

import com.ewebtd.entities.BasePersonInfo;
import com.ewebtd.mapper.PersonMapper;
import com.ewebtd.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * 文件的说明
 * @author 杨凯
 * @version 1.0.0,  2018-08-13 14:30
 **/
@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    private PersonMapper personMapper;
    /**
     * addPerson方法的说明
     * 创建人： 杨凯 2018-08-14 13:54
     * 修改人：
     * 修改说明：
     * @param [person] 员工信息类
     * @return int 增加员工信息后返数据库回更新的条数
     */
    @Override
    public Integer addPerson(BasePersonInfo person) {
        return personMapper.addPerson(person);
    }
    /**
     * updatePerson方法的说明
     * 创建人： 杨凯 2018-08-14 13:54
     * 修改人：
     * 修改说明：
     * @param [person] 员工信息类
     * @return int 更新员工信息后返数据库回更新的条数
     */
    @Override
    public Integer updatePerson(BasePersonInfo person) {
        return personMapper.updatePerson(person);
    }
    /**
     * updatePersonById方法的说明
     * 创建人： 杨凯 2018-08-14 13:54
     * 修改人：
     * 修改说明：
     * @param [personId, status] personId=员工id,status=员工状态
     * @return int 更新员工信息后返数据库回更新的条数
     */
    @Override
    public Integer updatePersonById(Integer personId, Integer status) {
        return personMapper.updatePersonById(personId,status);
    }
    /**
     * selectPersonById方法的说明
     * 创建人： 杨凯 2018-08-14 13:55
     * 修改人：
     * 修改说明：
     * @param [personId] 员工id
     * @return BasePersonInfo 员工信息类
     */
    @Override
    public BasePersonInfo selectPersonById(Integer personId) {
        return personMapper.selectPersonById(personId);
    }
    /**
     * selectPersons方法的说明
     * 创建人： 杨凯 2018-08-14 13:55
     * 修改人：
     * 修改说明：
     * @return List<BasePersonInfo> 员工信息类的list集合
     */
    @Override
    public List<BasePersonInfo> selectPersons() {
        return personMapper.selectPersons();
    }
    /**
     * selectPersonByAllParams方法的说明
     * 创建人： 杨凯 2018-08-14 13:55
     * 修改人：
     * 修改说明：
     * @param [person] 员工信息类
     * @return List<BasePersonInfo> 员工信息类的list集合
     */
    @Override
    public List<BasePersonInfo> selectPersonByAllParams(BasePersonInfo person) {
        return personMapper.selectPersonByAllParams(person);
    }
    /**
     * deletePersonById方法的说明
     * 创建人： 杨凯 2018-08-14 13:55
     * 修改人：
     * 修改说明：
     * @param [personId] 员工id
     * @return int 删除后返回数据库更新的条数
     */
    @Override
    public Integer deletePersonById(Integer personId) {
        return personMapper.deletePersonById(personId);
    }
    /**
     * deleteByBatch方法的说明
     * 创建人： 杨凯 2018-08-14 13:56
     * 修改人：
     * 修改说明：
     * @param [personIds] 员工id的list集合
     * @return int 批量删除后返回数据库更新的条数
     */
    @Override
    public Integer deleteByBatch(List<Integer> personIds) {
        return personMapper.deleteByBatch(personIds);
    }
    /**
     * selectPersonsByStr方法的说明
     * 创建人： 杨凯 2018-08-14 13:56
     * 修改人：
     * 修改说明：
     * @param [str] 字符串类型
     * @return List<BasePersonInfo> 员工信息类的list集合
     */
    @Override
    public List<BasePersonInfo> selectPersonsByStr(String str) {
        return personMapper.selectPersonsByStr(str);
    }
    /**
     * selectPersonDutyRecordsById方法的说明
     * 创建人： 杨凯 2018-08-15 16:19
     * 修改人：
     * 修改说明：
     * @param [personId]
     * @return List<BasePersonInfo> 人员信息类list数组
     */
    @Override
    public List<BasePersonInfo> selectPersonDutyRecordsById(Integer personId) {
        return personMapper.selectPersonDutyRecordsById(personId);
    }
}
