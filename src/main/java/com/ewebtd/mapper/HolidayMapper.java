/**
 * HolidayMapper.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-14 15:12
 */
package com.ewebtd.mapper;

import com.ewebtd.entities.BaseHolidayInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-14 15:12
 **/
public interface HolidayMapper {
    //增加年度节假日
    public Integer addHoliday(BaseHolidayInfo holiday);
    //修改年度节假日
    public Integer updateHoliday(BaseHolidayInfo holiday);
    //批量增加节假日
    public Integer insertHolidaysByBatch(@Param("holidays") List<BaseHolidayInfo> holidays);
    //通过日期查询一个节假日
    public Integer selectHolidayByHolidayDate(BaseHolidayInfo holiday);
}
