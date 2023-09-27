package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        String enter = "Не важно что писать тут!!!";      // создаем строковую переменную
        Scanner in = new Scanner(System.in);
        int sum = 0 ;         //  создаем переменную sum -  сумма чисел
        int a = 0  ;             //  создаем переменную a  - для того чтобы считать данные с клавиатуры
        while (!enter.equals("ENTER")) { // пока строковая переменная enter не равна ENTER  выполнять:
            if (in.hasNextInt()) {                          // если ( ввод с клавиатуры является целым числом )
                a = in.nextInt();                        // присваиваем "a" целое число с клавиатуры
                sum = sum + a;                       // суммируем наше число к общей сумме.
            }
            else {
                enter=in.nextLine();        // если ввод с клавиатуры не целое число - присваиваем строковой
                // переменной новую строку с клавиатуры
            }
        }
        System.out.println(sum);           // выводим на экран сумму чисел.
    }
}

