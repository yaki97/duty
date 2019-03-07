/**
 * DutyDriverRecord.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-19 21:53
 */
package com.ewebtd.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-19 21:53
 * @Description
 **/

public class DutyDriverRecord extends BaseEntity implements Serializable,Cloneable{
    /** 记录ID */
    private Integer recordId ;
    /** 值班司机ID */
    private Integer driverId ;
    /** 值班日期 */
    private Date dutyDate ;
    /** 值班时段 */
    private String dutyPeriod ;

    /** 记录ID */
    public Integer getRecordId(){
        return this.recordId;
    }
    /** 记录ID */
    public void setRecordId(Integer recordId){
        this.recordId = recordId;
    }
    /** 值班司机ID */
    public Integer getDriverId(){
        return this.driverId;
    }
    /** 值班司机ID */
    public void setDriverId(Integer driverId){
        this.driverId = driverId;
    }
    /** 值班日期 */
    public Date getDutyDate(){
        return this.dutyDate;
    }
    /** 值班日期 */
    public void setDutyDate(Date dutyDate){
        this.dutyDate = dutyDate;
    }
    /** 值班时段 */
    public String getDutyPeriod(){
        return this.dutyPeriod;
    }
    /** 值班时段 */
    public void setDutyPeriod(String dutyPeriod){
        this.dutyPeriod = dutyPeriod;
    }
}
