package com.briup.day2;

public class T1 {
    public static void main(String[] args) {
        double value1 =5699.0;
        double value2 =8499.0;
        double value3 =7199.0;
        int count1 = 5;
        int count2 = 10;
        int count3 = 18;
        int count =count1+count2+count3;
        double value = (value1*count1)+(value2*count2)+(value3*count3);
        System.out.println("-----------------商品清单------------------");
        System.out.println("品牌型号      尺寸   价格      库存");
        System.out.println("MacBookAir  13.3  "+value1+"    "+count1);
        System.out.println("ThinkPadT490 14.0  "+value2+"    "+count2);
        System.out.println("MateBook 14  14.0  "+value3+"    "+count3);
        System.out.println("-------------------------------------------");
        System.out.println("总库存:"+count+"总金额:"+value);

    }
}
