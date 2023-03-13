package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter some input");
        int rollNumb = scanner.nextInt();
        System.out.println("this is my roll no" + rollNumb);
        int id = scanner.nextInt();
        System.out.println("this is my id"+ id);
        
    }
}
