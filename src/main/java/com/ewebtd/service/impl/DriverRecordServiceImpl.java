/**
 * DriverRecordServiceImpl.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 22:38
 */
package com.ewebtd.service.impl;

import com.ewebtd.entities.DutyDriverRecord;
import com.ewebtd.mapper.DriverRecordMapper;
import com.ewebtd.service.IDriverRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 22:38
 * @Description
 **/
@Service
public class DriverRecordServiceImpl implements IDriverRecordService {
    @Autowired
    private DriverRecordMapper driverRecordMapper;
    /**
     * addDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:47
     * 修改人：
     * 修改说明：
     * @param driverRecord  司机排班信息类
     * @return Integer 返回更新记录条数
     */
    @Override
    public Integer addDriverRecord(DutyDriverRecord driverRecord) {
        return driverRecordMapper.addDriverRecord(driverRecord);
    }
    /**
     * updateDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:51
     * 修改人：
     * 修改说明：
     * @param driverRecord 司机排班类
     * @return Integer 返回更新条数
     */
    @Override
    public Integer updateDriverRecord(DutyDriverRecord driverRecord) {
        return driverRecordMapper.updateDriverRecord(driverRecord);
    }
    /**
     * selectDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:52
     * 修改人：
     * 修改说明：
     * @param driverRecord 司机排班类
     * @return List<DutyDriverRecord> 返回查询记录
     */
    @Override
    public List<DutyDriverRecord> selectDriverRecord(DutyDriverRecord driverRecord) {
        return driverRecordMapper.selectDriverRecord(driverRecord);
    }
    /**
     * deleteDriverRecord方法的说明
     * 创建人： 杨凯 2018-08-20 16:53
     * 修改人：
     * 修改说明：
     * @param driverRecordId 司机排班记录id
     * @return Integer 删除后更新条数
     */
    @Override
    public Integer deleteDriverRecord(Integer driverRecordId) {
        return driverRecordMapper.deleteDriverRecord(driverRecordId);
    }
    /**
     * selectDriverRecordByDate方法的说明
     * 创建人： 杨凯 2018-08-20 16:54
     * 修改人：
     * 修改说明：
     * @param dutyDate 日期
     * @return Integer 查询条数
     */
    @Override
    public Integer selectDriverRecordByDate(String dutyDate) {
        return driverRecordMapper.selectDriverRecordByDate(dutyDate);
    }
}
