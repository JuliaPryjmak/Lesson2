package com.epam.hometask2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hometask2 {

    public static void main(String[] args) {


       // Task 1
        int i=10;
        int x=50;
        System.out.println("i = " + i);
        System.out.println("x = " + x);

        i=i+x;
        x=i-x;
        i=i-x;
        System.out.println("i = " + i);
        System.out.println("x = " + x);


/*   Task 2

       Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 3-значне число");
        int a = sc.nextInt();
        System.out.println("Отримане число = " + a );

       String b = a%10 + "" + a/10%10 + "" + a/100%10;

        int num = Integer.parseInt(b);
        System.out.println("Обернене число = " + num);
        int c = num - a;

       System.out.println("Різниця між числами = " + c);

*/

/*
        //Task 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число");
        double number = sc.nextDouble();
        System.out.println("Отримане число = " + number);
        double y = number * 453.6;

        System.out.println("В " + number + " фунтах "  + y + " грам");

*/
       /*Task 4


       int deposit = 10000;
       int month = 6;
        double percent = 12;

        double profit =  (percent *0.01) * deposit * month;
        System.out.println("Сума прибутку " + profit);
        */
    }
}
