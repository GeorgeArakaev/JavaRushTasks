package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if (num1 + num2 <= num3 || num2 + num3 <= num1 || num1 + num3 <= num2){
            System.out.println(TRIANGLE_NOT_EXISTS);
        }else
            System.out.println(TRIANGLE_EXISTS);
    }
}
