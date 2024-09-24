package com.briup.day2;

import java.math.BigDecimal;

public class test02 {
    public static void main(String[] args) {
       double a = 2.0;
       double b = 1.1;
        BigDecimal a1 =new BigDecimal(a);
        BigDecimal b1 =new BigDecimal(b);
         double c = a1.add(b1).doubleValue();
        System.out.println(c);
    }
    public void test3 (){
        System.out.println("What' s wrong with this program?");
    }
}
