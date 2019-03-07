/**
 * DriverMapper.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 21:31
 */
package com.ewebtd.mapper;

import com.ewebtd.entities.DutyDriverInfo;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 21:31
 * @Description
 **/
@Component
public interface DriverMapper {
    //添加司机
    Integer addDriver(DutyDriverInfo driver);
    //修改司机
    Integer updateDriver(DutyDriverInfo driver);
    //查询司机
    List<DutyDriverInfo> selectDriver(DutyDriverInfo driver);
    //查询司机id并排序
    Integer[] selectDriverOrderByDriverOrder();
    //删除司机
    Integer deleteDriver(Integer driverId);

}
