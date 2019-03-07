/**
 * DutyRecord.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-15 14:23
 */
package com.ewebtd.entities;
import java.io.Serializable;
import java.util.Date;
/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-15 14:23
 **/
public class DutyRecord extends BaseEntity  implements Serializable,Cloneable{
    /** 值班记录ID */
    private Integer recordId ;
    /** 值班组ID */
    private Integer groupId ;
    /** 值班日期 */
    private Date recordDate ;
    /** 值班时段 */
    private Integer period ;
    /** 人员ID */
    private Integer personId ;
    //多对一
    private BasePersonInfo basePersonInfo;

    public DutyRecord() {
    }

    public DutyRecord(Integer groupId, Date recordDate, Integer period, Integer personId, BasePersonInfo basePersonInfo) {
        this.groupId = groupId;
        this.recordDate = recordDate;
        this.period = period;
        this.personId = personId;
        this.basePersonInfo = basePersonInfo;
    }

    public DutyRecord(Integer recordId, Integer groupId, Date recordDate, Integer period, Integer personId, BasePersonInfo basePersonInfo) {
        this.recordId = recordId;
        this.groupId = groupId;
        this.recordDate = recordDate;
        this.period = period;
        this.personId = personId;
        this.basePersonInfo = basePersonInfo;
    }

    /** 值班记录ID */
    public Integer getRecordId(){
        return this.recordId;
    }
    /** 值班记录ID */
    public void setRecordId(Integer recordId){
        this.recordId = recordId;
    }
    /** 值班组ID */
    public Integer getGroupId(){
        return this.groupId;
    }
    /** 值班组ID */
    public void setGroupId(Integer groupId){
        this.groupId = groupId;
    }
    /** 值班日期 */
    public Date getRecordDate(){
        return this.recordDate;
    }
    /** 值班日期 */
    public void setRecordDate(Date recordDate){
        this.recordDate = recordDate;
    }
    /** 值班时段 */
    public Integer getPeriod(){
        return this.period;
    }
    /** 值班时段 */
    public void setPeriod(Integer period){
        this.period = period;
    }
    /** 人员ID */
    public Integer getPersonId(){
        return this.personId;
    }
    /** 人员ID */
    public void setPersonId(Integer personId){
        this.personId = personId;
    }

    public BasePersonInfo getBasePersonInfo() {
        return basePersonInfo;
    }

    public void setBasePersonInfo(BasePersonInfo basePersonInfo) {
        this.basePersonInfo = basePersonInfo;
    }

    @Override
    public String toString() {
        return "DutyRecord{" +
                "recordId=" + recordId +
                ", groupId=" + groupId +
                ", recordDate=" + recordDate +
                ", period=" + period +
                ", personId=" + personId +
                ", basePersonInfo=" + basePersonInfo +
                '}';
    }
}