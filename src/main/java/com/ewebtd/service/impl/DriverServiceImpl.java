/**
 * DriverServiceImpl.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 21:35
 */
package com.ewebtd.service.impl;

import com.ewebtd.entities.DutyDriverInfo;
import com.ewebtd.mapper.DriverMapper;
import com.ewebtd.service.IDriverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 21:35
 * @Description
 **/
@Service
public class DriverServiceImpl implements IDriverService {

    @Resource
    private DriverMapper driverMapper;
    /**
     * addDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:56
     * 修改人：
     * 修改说明：
     * @param driver 司机信息类
     * @return Integer 增加后更新条数
     */
    @Override
    public Integer addDriver(DutyDriverInfo driver) {
        return driverMapper.addDriver(driver);
    }
    /**
     * updateDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:57
     * 修改人：
     * 修改说明：
     * @param driver 司机信息类
     * @return Integer 更新记录条数
     */
    @Override
    public Integer updateDriver(DutyDriverInfo driver) {
        return driverMapper.updateDriver(driver);
    }
    /**
     * selectDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:57
     * 修改人：
     * 修改说明：
     * @param driver 司机信息类
     * @return List<DutyDriverInfo> 司机信息类list数组
     */
    @Override
    public List<DutyDriverInfo> selectDriver(DutyDriverInfo driver) {
        return driverMapper.selectDriver(driver);
    }
    /**
     * deleteDriver方法的说明
     * 创建人： 杨凯 2018-08-20 16:58
     * 修改人：
     * 修改说明：
     * @param driverId 司机id
     * @return Integer 删除记录条数
     */
    @Override
    public Integer deleteDriver(Integer driverId) {
        return driverMapper.deleteDriver(driverId);
    }
    /**
     * selectDriverOrderByDriverOrder方法的说明
     * 创建人： 杨凯 2018-08-20 16:58
     * 修改人：
     * 修改说明：
     * @return Integer[] 查询的司机id数组
     */
    @Override
    public Integer[] selectDriverOrderByDriverOrder() {
        return driverMapper.selectDriverOrderByDriverOrder();
    }
}
