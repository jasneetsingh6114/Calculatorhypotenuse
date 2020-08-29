package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the base  of a right triangle =  ");
        int  BaseOfTriangle= Integer.parseInt(scanner.nextLine());

        System.out.print("What is the second side of an triangle = ");
        int PerpendicularOfTriangle = Integer.parseInt(scanner.nextLine());

        int HypotenuseOfTriangle  = (BaseOfTriangle*BaseOfTriangle + PerpendicularOfTriangle*PerpendicularOfTriangle);
        System.out.println("The Hypotenuse is  " + HypotenuseOfTriangle);

        //PBP
        //HHB

        int sinO =(HypotenuseOfTriangle/PerpendicularOfTriangle);
        System.out.println("sinO is " +sinO);

        int cosO =(HypotenuseOfTriangle/BaseOfTriangle);
        System.out.println("cosO is " +cosO);

        int tanO =(BaseOfTriangle/PerpendicularOfTriangle);
        System.out.println("tanO is " +tanO);

        int cotO =(PerpendicularOfTriangle/BaseOfTriangle);
        System.out.println("cotO is " +cotO);

        int secO =(BaseOfTriangle/HypotenuseOfTriangle);
        System.out.println("secO is " +secO);

        int cosecO =(PerpendicularOfTriangle/HypotenuseOfTriangle);
        System.out.println("cosecO is" +cosecO);

    }

}
