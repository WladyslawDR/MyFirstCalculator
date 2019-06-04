package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int first = 0,second = 0;
        char operation;
        System.out.print("Танечка,введи первое число: " );
        first = num.nextInt();

        System.out.print("Танюська, введи второе число: " );
        second = num.nextInt();

        System.out.print("Введи операцию: " );
        operation = num.next().charAt(0);
        int result = 0;
        switch (operation) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
        }
        System.out.print("Урааааа! У тебя получилось: " + result);
}


}
