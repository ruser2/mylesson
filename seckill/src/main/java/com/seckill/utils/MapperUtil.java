package com.seckill.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

/**
 * Created by Administrator on 2016/1/22.
 */
public class MapperUtil {

    /*
    提供给mybatis的xml 里面的 test 判断条件使用
     */
    public static MapperUtil instance = new MapperUtil();

    private MapperUtil() {
    }

    /*
    判断是否为空
     */
    @SuppressWarnings("rawtypes")
	public static boolean isNotEmpty(Object o){
        if(o instanceof String){
            return StringUtils.isNotBlank((String)o);
        }
        
        if(o instanceof Collection){
        	if(o == null || ((Collection) o).isEmpty())
        		return false;
        }
        return  o!=null;
    }
}
