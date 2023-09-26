package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int A = 10;
        while (A > 0) {
            System.out.println(s + text);
            A--;
        }
    }
}
