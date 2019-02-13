package com.sunfield.microframe.common.utils;


import org.apache.commons.lang3.StringUtils;

public class ParamValidateUtils {

    public static boolean isAnyBlank(Object... objects){
        for(Object obj : objects){
            if(obj instanceof String){
                if(StringUtils.isBlank((String)obj))
                    return true;
                else
                    continue;
            }else{
                if(obj == null)
                    return true;
                else
                    continue;
            }

        }
        return false;
    }

}
