package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        Calculate c1=new Calculate();
        System.out.println("Enter a: ");
        int a = enter.nextInt();
        c1.setA(a);
        System.out.println("Enter b: ");
        int b=enter.nextInt();
        c1.setB(b);
        System.out.println("Enter c: ");
        int c= enter.nextInt();
        c1.setC(c);
        c1.XCalc();

    }
}
