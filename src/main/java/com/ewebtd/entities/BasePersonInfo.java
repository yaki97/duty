/**
 * BasePersonInfo.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-13 14:23
 */
package com.ewebtd.entities;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 文件的说明
 * @author 杨凯
 * @version 1.0.0,  2018-08-13 14:25
 **/
public class BasePersonInfo extends BaseEntity  implements Serializable,Cloneable{
    /** 人员ID */
    private Integer personId ;
    /** 姓名 */
    private String personName ;
    /** 性别;1:女；2:男 */
    private Integer sex ;
    /** 手机号 */
    private String mobilePhone ;
    /** 办公电话 */
    private String officePhone ;
    /** 处室ID */
    private Integer officeId ;
    /** 职务;1.领导，2.处长，3.副处长 */
    private Integer post ;
    /** 状态;1:可排班；2：不可排班 */
    private Integer status ;
    //一对多，1个员工可能有多条值班记录。
    private List<DutyRecord> dutyRecord;
    /** 空构造方法 */
    public BasePersonInfo() {
    }
    public BasePersonInfo(String personName, Integer sex, String mobilePhone, String officePhone, Integer officeId, Integer post, Integer status, List<DutyRecord> dutyRecord) {
        this.personName = personName;
        this.sex = sex;
        this.mobilePhone = mobilePhone;
        this.officePhone = officePhone;
        this.officeId = officeId;
        this.post = post;
        this.status = status;
        this.dutyRecord = dutyRecord;
    }
    public BasePersonInfo(Integer personId, String personName, Integer sex, String mobilePhone, String officePhone, Integer officeId, Integer post, Integer status, List<DutyRecord> dutyRecord) {
        this.personId = personId;
        this.personName = personName;
        this.sex = sex;
        this.mobilePhone = mobilePhone;
        this.officePhone = officePhone;
        this.officeId = officeId;
        this.post = post;
        this.status = status;
        this.dutyRecord = dutyRecord;
    }
    /** 人员ID */
    public Integer getPersonId(){
        return this.personId;
    }
    /** 人员ID */
    public void setPersonId(Integer personId){
        this.personId = personId;
    }
    /** 姓名 */
    public String getPersonName(){
        return this.personName;
    }
    /** 姓名 */
    public void setPersonName(String personName){
        this.personName = personName;
    }
    /** 性别;1:女；2:男 */
    public Integer getSex(){
        return this.sex;
    }
    /** 性别;1:女；2:男 */
    public void setSex(Integer sex){
        this.sex = sex;
    }
    /** 手机号 */
    public String getMobilePhone(){
        return this.mobilePhone;
    }
    /** 手机号 */
    public void setMobilePhone(String mobilePhone){
        this.mobilePhone = mobilePhone;
    }
    /** 办公电话 */
    public String getOfficePhone(){
        return this.officePhone;
    }
    /** 办公电话 */
    public void setOfficePhone(String officePhone){
        this.officePhone = officePhone;
    }
    /** 处室ID */
    public Integer getOfficeId(){
        return this.officeId;
    }
    /** 处室ID */
    public void setOfficeId(Integer officeId){
        this.officeId = officeId;
    }
    /** 职务;1.领导，2.处长，3.副处长 */
    public Integer getPost(){
        return this.post;
    }
    /** 职务;1.领导，2.处长，3.副处长 */
    public void setPost(Integer post){
        this.post = post;
    }
    /** 状态;1:可排班；2：不可排班 */
    public Integer getStatus(){
        return this.status;
    }
    /** 状态;1:可排班；2：不可排班 */
    public void setStatus(Integer status){
        this.status = status;
    }

    public List<DutyRecord> getDutyRecord() {
        return dutyRecord;
    }

    public void setDutyRecord(List<DutyRecord> dutyRecord) {
        this.dutyRecord = dutyRecord;
    }

    @Override
    public String toString() {
        return "BasePersonInfo{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", sex=" + sex +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", officeId=" + officeId +
                ", post=" + post +
                ", status=" + status +
                ", dutyRecord=" + dutyRecord +
                '}';
    }
}