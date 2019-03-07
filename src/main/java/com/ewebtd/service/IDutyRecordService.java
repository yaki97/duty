/**
 * IDutyRecordService.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-15 14:32
 */
package com.ewebtd.service;

import com.ewebtd.entities.BasePersonInfo;
import com.ewebtd.entities.DutyRecord;

import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-15 14:32
 **/
public interface IDutyRecordService {
    //通过人员id查询人员信息
    public List<DutyRecord> selectDutyRecordByPersonId(BasePersonInfo person);
}
