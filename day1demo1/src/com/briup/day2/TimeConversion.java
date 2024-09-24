package com.briup.day2;

import java.math.BigInteger;

public class TimeConversion {
    public static void main(String[] args) {
        // 定义变量存储一天中的毫秒数
        long millisecondsPerDay = 24 * 60 * 60 * 1000;
        // 定义变量存储一天中的微秒数，使用BigInteger避免溢出
        BigInteger microsecondsPerDay = BigInteger.valueOf(24 * 60 * 60 * 1000).multiply(BigInteger.valueOf(1000));

        // 输出变量值
        System.out.println("Milliseconds per day: " + millisecondsPerDay);
        System.out.println("Microseconds per day: " + microsecondsPerDay);
    }
}
