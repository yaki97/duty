/**
 * HolidayServiceImpl.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-14 15:12
 */
package com.ewebtd.service.impl;

import com.ewebtd.entities.BaseHolidayInfo;
import com.ewebtd.mapper.HolidayMapper;
import com.ewebtd.service.IHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-14 15:12
 **/
@Service
public class HolidayServiceImpl implements IHolidayService {
    @Autowired
    private HolidayMapper holidayMapper;
    /**
     * addHoliday方法的说明
     * 创建人： 杨凯 2018-08-15 14:16
     * 修改人：
     * 修改说明：
     * @param [holiday] 年度节假日信息类
     * @return Integer 返回插入信息条数
     */
    @Override
    public Integer addHoliday(BaseHolidayInfo holiday) {
        return holidayMapper.addHoliday(holiday);
    }
    /**
     * updateHoliday方法的说明
     * 创建人： 杨凯 2018-08-15 14:17
     * 修改人：
     * 修改说明：
     * @param [holiday] 年度节假日信息类
     * @return Integer 返回更新信息条数
     */
    @Override
    public Integer updateHoliday(BaseHolidayInfo holiday) {
        return holidayMapper.updateHoliday(holiday);
    }
    /**
     * insertHolidaysByBatch方法的说明
     * 创建人： 杨凯 2018-08-15 14:17
     * 修改人：
     * 修改说明：
     * @param [holiday] 年度节假日信息类
     * @return Integer 返回插入信息条数
     */
    @Override
    public Integer insertHolidaysByBatch(List<BaseHolidayInfo> holidays) {
        return holidayMapper.insertHolidaysByBatch(holidays);
    }
    /**
     * selectHolidayByHolidayDate方法的说明
     * 创建人： 杨凯 2018-08-15 14:17
     * 修改人：
     * 修改说明：
     * @param [holiday] 年度节假日信息类
     * @return Integer 返回查询信息条数
     */
    @Override
    public Integer selectHolidayByHolidayDate(BaseHolidayInfo holiday) {
        return holidayMapper.selectHolidayByHolidayDate(holiday);
    }
}
