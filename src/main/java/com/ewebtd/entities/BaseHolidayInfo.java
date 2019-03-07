/**
 * BaseHolidayInfo.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-14 15:04
 */
package com.ewebtd.entities;
import java.io.Serializable;
import java.util.Date;
/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-14 15:04
 **/
public class BaseHolidayInfo extends BaseEntity implements Serializable,Cloneable{
    /** 节假日ID */
    private Integer holidayId ;
    /** 日期 */
    private Date holidayDate ;
    /** 类型;1：法定节假日；2：其他休息日 */
    private Integer holidayType ;
    /** 节假日名称 */
    private String holidayName ;

    public BaseHolidayInfo() {
    }

    public BaseHolidayInfo(Date holidayDate, Integer holidayType, String holidayName) {
        this.holidayDate = holidayDate;
        this.holidayType = holidayType;
        this.holidayName = holidayName;
    }

    public BaseHolidayInfo(Integer holidayId, Date holidayDate, Integer holidayType, String holidayName) {
        this.holidayId = holidayId;
        this.holidayDate = holidayDate;
        this.holidayType = holidayType;
        this.holidayName = holidayName;
    }

    /** 节假日ID */
    public Integer getHolidayId(){
        return this.holidayId;
    }
    /** 节假日ID */
    public void setHolidayId(Integer holidayId){
        this.holidayId = holidayId;
    }
    /** 日期 */
    public Date getHolidayDate(){
        return this.holidayDate;
    }
    /** 日期 */
    public void setHolidayDate(Date holidayDate){
        this.holidayDate = holidayDate;
    }
    /** 类型;1：法定节假日；2：其他休息日 */
    public Integer getHolidayType(){
        return this.holidayType;
    }
    /** 类型;1：法定节假日；2：其他休息日 */
    public void setHolidayType(Integer holidayType){
        this.holidayType = holidayType;
    }
    /** 节假日名称 */
    public String getHolidayName(){
        return this.holidayName;
    }
    /** 节假日名称 */
    public void setHolidayName(String holidayName){
        this.holidayName = holidayName;
    }
}