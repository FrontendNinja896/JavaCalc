package com.company;
import java.lang.classfile.instruction.SwitchCase;
import java.sql.Array;
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
    public static void EnterNumbers(int[] arr, String d){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x:");
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        Actions(arr,d);
    };
    public  static void Actions(int[] arr, String d){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие");
        d = scan.next();
        switch (d){
            case "+":
                Summ(arr);
                break;
            case "-":
                Razn(arr);
                break;
            case "*":
                Umn(arr);
                break;
            case "/":
                Chast(arr);
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }
    };
    public  static  void Summ(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            res = arr[i] + arr[i];
        }
        System.out.println(res);
    };
    public  static  void Razn(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            res = arr[i] - i;
        }
        System.out.println(res);
    };
    public  static  void Umn(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            res = arr[i] * arr[i];
        }
        System.out.println(res);
    };
    public  static  void Chast(int[] arr){
        int res = 0;
        for(int i = 0; i < arr.length;i++){
            res = arr[i] / i;
        }
        System.out.println(res);
    };
    public static void main(String[] args){
       String names = "", d = "";
       int x = 0, y = 0;
       int [] arr = new int[3];
       NameEnter(names);
       EnterNumbers(arr,d);
    }
}
