package cn.jethro.pmsmanage.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static String FORMAT = "yyyy-MM-dd HH:mm:ss";
	/**
	* 日期转换成字符串
	* @param date
	* @return str
	*/
	public static String DateToStr(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat(FORMAT);
	   String str = format.format(date);
	   return str;
	} 
	/**
	 * 计算两个日期之间的秒数
	 * @param startTime
	 * @param endTime
	 * @param str
	 * @return
	 */
    public static Long dateDiff(String startTime, String endTime) {   
        // 按照传入的格式生成一个simpledateformate对象    
        SimpleDateFormat sd = new SimpleDateFormat(FORMAT);    
        long ns = 1000;// 一秒钟的毫秒数    
        long diff;    
        long sec = 0;    
        // 获得两个时间的毫秒时间差异    
        try {    
            diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();    
            sec = diff / ns;// 计算差多少秒    
        } catch (ParseException e) {    
            e.printStackTrace();    
        }    
        return sec;
    }  
    
    public static String TimeStamp2Date(String timestampString){    
    	  Long timestamp = Long.parseLong(timestampString)*1000;    
    	  String date = new SimpleDateFormat(FORMAT).format(new Date(timestamp));
    	  return date;    
    	} 
}
