package com.javarush.task.pro.task03.tsk031a4;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FBI = scanner.nextLine();
        if (secret.equalsIgnoreCase(FBI)){
        System.out.println("доступ разрешен");}
        else

        System.out.println("доступ запрещен");
    }
}
