package com.sunfield.microframe.common.utils;

import java.util.Random;

public class SmsUtils {

    private final static int DEFAULT_RANDOM_CODE_LENGTH = 6;

    public static String getRandomCode(int length){
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<length;i++){
            code.append(random.nextInt(10));
        }
        return code.toString();
    }

    public static String getRandomCode(){
        return getRandomCode(DEFAULT_RANDOM_CODE_LENGTH);
    }

    public static void sendSms(){

    }
}
