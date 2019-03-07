/**
 * DutyRule.java
 * Copyright 2018 天津亿网通达网络技术有限公司.
 * All rights reserved.
 * Created on 2018-08-20 10:34
 */
package com.ewebtd.util;

import java.util.*;

/**
 * 文件的说明
 *
 * @author 杨凯
 * @version 1.0.0, 2018-08-20 10:34
 **/
public class DutyRule {
    /**
     * dateToDateStr方法的说明 将一个月日期每天格式转换成"yyyy-MM-dd-x"    "2018-08-20-1"
     * 创建人： 杨凯 2018-08-20 16:15
     * 修改人：
     * 修改说明：
     * @param y, m   年，月
     * @return java.util.List<java.lang.String>
     */
    public static List<String> dateToDateStr(Integer y,Integer m) {
        List<String> dateStr=new ArrayList<String>();
        Calendar calendar=Calendar.getInstance();
        calendar.set(y,m-1,1);
        int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("输入的月份总天数："+maxDate);
        for (int i = 1; i <= maxDate; i++) {
            calendar.set(y,m-1,i);
            String year=String.valueOf(calendar.get(Calendar.YEAR));
            String month=String.valueOf(calendar.get(Calendar.MONTH)+1);
            if(month.length()<2){month="0"+month;}
            String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
            if(day.length()<2){day="0"+day;}
            Integer week=calendar.get(Calendar.DAY_OF_WEEK)-1;
            //System.out.println(year+"-"+month+"-"+day+"-"+week);
            if((week==1)||(week==2)||(week==3)||(week==4)||(week==5)){
                //全天
                dateStr.add(year+"-"+month+"-"+day+"-"+1);
            }
            else if((week==6)||(week==0)){
                //上午
                dateStr.add(year+"-"+month+"-"+day+"-"+2);
                //下午
                dateStr.add(year+"-"+month+"-"+day+"-"+3);
            }
            else{dateStr.add("空");};
        }
        return dateStr;
    }
    /**
     * returnDriverRecords方法的说明
     * 创建人： 杨凯 2018-08-20 16:16
     * 修改人：
     * 修改说明：
     * @param ids, dateStr 司机数组，dateStr:"xxxx-xx-xx-x"
     * @return List<String> "xxxx-xx-xx-x-id"  "2018-08-01-1-1" "1:全天 2：上午 3：下午"
     */
    public static List<String> returnDriverRecords(Integer[] ids,List<String> dateStr){
        List<String> list=new ArrayList<String>();
        int j=0;
        for(int i=0;i<dateStr.size();i++){
            list.add(dateStr.get(i)+"-"+ids[j]);
            j++;
            if(j==(ids.length)){j=0;ids=movebit(ids);};
        }
        return list;
    }
    /**
     * movebit方法的说明
     * 创建人： 杨凯 2018-08-20 16:17
     * 修改人：
     * 修改说明：
     * @param array 输入数组，左移一位
     * @return Integer[] 返回左移一位后的数组
     */
    private static Integer[] movebit(Integer[] array){ // 左移一位
        Integer temp=array[0];
        for(int i=0;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        array[array.length-1]=temp;
        return array;
    }
}
