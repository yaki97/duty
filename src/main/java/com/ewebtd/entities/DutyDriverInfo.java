/**
 * DutyDriverInfo.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-17 13:10
 */
package com.ewebtd.entities;

import java.io.Serializable;

/**
 * @author 杨凯
 * @version 1.0.0, 2018-08-17 13:10
 * @Description
 **/
public class DutyDriverInfo extends BaseEntity implements Serializable,Cloneable{
    /** 司机ID */

    private Integer driverId ;
    /** 司机姓名 */
    private String driverName ;
    /** 手机号 */
    private String driverMobilePhone ;
    /** 值班顺序 */
    private Integer driverOrder ;

    /** 司机ID */
    public Integer getDriverId(){
        return this.driverId;
    }
    /** 司机ID */
    public void setDriverId(Integer driverId){
        this.driverId = driverId;
    }
    /** 司机姓名 */
    public String getDriverName(){
        return this.driverName;
    }
    /** 司机姓名 */
    public void setDriverName(String driverName){
        this.driverName = driverName;
    }
    /** 手机号 */
    public String getDriverMobilePhone(){
        return this.driverMobilePhone;
    }
    /** 手机号 */
    public void setDriverMobilePhone(String driverMobilePhone){
        this.driverMobilePhone = driverMobilePhone;
    }
    /** 值班顺序 */
    public Integer getDriverOrder(){
        return this.driverOrder;
    }
    /** 值班顺序 */
    public void setDriverOrder(Integer driverOrder){
        this.driverOrder = driverOrder;
    }
}
