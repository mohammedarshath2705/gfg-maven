package com.gfg32;

public class MyCalc {

    public int sum(int a,int b){
        return a+b;
    }

    public int diff(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        MyCalc calc = new MyCalc();
        System.out.println("sum is : " +calc.sum(10,7) );
        System.out.println("diff is : " +calc.diff(10,7) );
        System.out.println("mul is : " +calc.mul(10,7) );

    }

}
