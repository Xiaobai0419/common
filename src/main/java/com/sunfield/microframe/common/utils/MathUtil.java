package com.sunfield.microframe.common.utils;

import java.text.NumberFormat;
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

    /**
     * 计算百分比
     * @param num
     * @param total
     * @return
     */
    public static int getPercentage(int num,int total){
        NumberFormat numberFormat = NumberFormat.getInstance();

        numberFormat.setMaximumFractionDigits(0);

        String result = numberFormat.format((float) num / (float) total* 100);
        return Integer.parseInt(result);
    }

}
