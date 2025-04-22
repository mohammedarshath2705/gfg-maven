package com.gfg32;

public class MyCalc {

    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public void greet()
    {
        System.out.println("Hello Main Branch ");
    }



    public static void main(String[] args) {
        MyCalc calc = new MyCalc();
        System.out.println("sum is : " + calc.sum(10, 7));
        System.out.println("diff is : " + calc.diff(10, 7));
        System.out.println("mul is : " + calc.mul(10, 7));
        System.out.println("div is : " + calc.div(10, 5));
        System.out.println("mod is : " + calc.mod(10, 5));
        calc.greet();

    }

}
