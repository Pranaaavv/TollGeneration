package com.packclass;
import java.util.Scanner;

public class personaldetails {
    Scanner sc=new Scanner(System.in);
    public String name;
    public int age;
    String mobile;
    public String Profession;
    public void getpersonaldetails(){
        System.out.println("PLEASE ENTER YOUR PERSONAL DETAILS");
        System.out.println("ENTER YOUR NAME");
        name=sc.next();
//        if(age<18) {
//
//            System.out.println("PLEASE ENTER YOUR VALID AGE (DRIVING UNDERAGE IS A CRIME");
//        }

        System.out.println("ENTER YOUR PHONE NUMBER");
        mobile=sc.next();
        System.out.println("ENTER YOUR PROFESSION");
        Profession=sc.next();
        System.out.println("ENTER YOUR AGE");
        age=sc.nextInt();

    }

    public void showpersonaldetails(){
        System.out.println("PERSONAL DETAILS OF "+name+ " Are :");
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("MOBILE NO : "+mobile);
        System.out.println("PROFESSION : "+Profession);
    }
}
