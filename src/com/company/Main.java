package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int first = 0,second = 0, result = 0;
        char operation;

        System.out.print("Введите первое число: " );
        if(num.hasNextInt()){
            first = num.nextInt();
        } else {
            System.out.println ("Неправильный ввод, повторите еще раз: ");
        }

        System.out.println("Введите операцию: " );
        operation = num.next().charAt(0);

        System.out.print("Введите второе число: ");
        if(num.hasNextInt()){
            second = num.nextInt();
        } else {
            System.out.println ("Неправильный ввод, повторите еще раз: ");
        }


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
        System.out.print("Результат: " + result);
}


}
