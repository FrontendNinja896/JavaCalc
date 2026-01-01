package com.company;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void NameEnter(String name){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя:");
        name = scan.next();
        System.out.println("Привет" + name);
    };
    public static void EnterNumbers(int x, int y, String d){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x:");
        x = scan.nextInt();
        System.out.println("Введите y:");
        y = scan.nextInt();
        Actions(x,y,d);
    };
    public  static void Actions(int x, int y, String d){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие");
        d = scan.next();
        switch (d){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }
    };
    public static void main(String[] args){
       String names = "";
       String d = "";
       int x = 0, y = 0;
       NameEnter(names);
       EnterNumbers(x,y,d);
       Actions(x,y,d);
    }
}
