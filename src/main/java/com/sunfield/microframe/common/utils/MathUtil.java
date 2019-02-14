package com.sunfield.microframe.common.utils;

import java.util.Random;

/**
 * describe:
 *
 * @author zhaoyizhe
 * @date 2019/02/11
 */
public class MathUtil {

    /**
     * 生成随机数
     * @return
     */
    public static String getMathRandom(){
        Random random=new Random();
        int number=random.nextInt(99999);
        String str = String.format("%05d", number);
        return str;
    }
}
