/**
 * DriverRecordMapper.interface
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 22:15
 */
package com.ewebtd.mapper;

import com.ewebtd.entities.DutyDriverRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 22:15
 * @Description
 **/
@Component
public interface DriverRecordMapper {

    //添加司机值班记录
    Integer addDriverRecord(DutyDriverRecord driverRecord) ;
    //修改司机值班记录
    Integer updateDriverRecord(DutyDriverRecord driverRecord);
    //查询司机值班记录
    List<DutyDriverRecord> selectDriverRecord(DutyDriverRecord driverRecord);
    //通过日期模糊查询司机值班记录条数
    Integer selectDriverRecordByDate(@Param("dutyDate") String dutyDate);
    //删除司机值班记录
    Integer deleteDriverRecord(Integer driverRecordId);

}
