package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  amount of your loan :  ");
        String p = scanner.nextLine();
        Integer pInt = Integer.parseInt(p);

        System.out.print("Rate of Interest :");
        String r = scanner.nextLine();
        float rInt = Float.parseFloat(r);


        System.out.print("Time in  Years :");
        String t = scanner.nextLine();
        Integer tInt = Integer.parseInt(t);


        double simpleInterest = (pInt * rInt * tInt / 100);
        System.out.println(simpleInterest);


    }

}
