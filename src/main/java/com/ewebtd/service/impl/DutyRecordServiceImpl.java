/**
 * DutyRecordServiceImpl.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-15 14:31
 */
package com.ewebtd.service.impl;

import com.ewebtd.entities.BasePersonInfo;
import com.ewebtd.entities.DutyRecord;
import com.ewebtd.mapper.DutyRecordMapper;
import com.ewebtd.service.IDutyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-15 14:31
 **/
@Service
public class DutyRecordServiceImpl implements IDutyRecordService {
    @Autowired
    private DutyRecordMapper dutyRecordMapper;
    /**
     * selectDutyRecordByPersonId方法的说明
     * 创建人： 杨凯 2018-08-15 14:53
     * 修改人：
     * 修改说明：
     * @param [person] 员工信息类
     * @return List<DutyRecord> 值班记录list集合
     */
    @Override
    public List<DutyRecord> selectDutyRecordByPersonId(BasePersonInfo person) {
        return dutyRecordMapper.selectDutyRecordByPersonId(person);
    }
}
