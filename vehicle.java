package com.packclass;

import java.util.Scanner;

//abstract parent class
abstract class vehicle {
    String Registration_num;
    String model_name;
    int wheel_num;

    vehicle(String Registration_num,String model_name,int wheel_num ){
        this.Registration_num= Registration_num;
        this.model_name= model_name;
        this.wheel_num= wheel_num;
    }

    public vehicle() {

    }

    public void getvehicledetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VEHICLE REGISTRATION NUMBER");
        Registration_num= sc.nextLine();
        System.out.println("ENTER THE MODEL NAME");
        model_name= sc.nextLine();
    }

    public void showvehicledetails(){
        System.out.println("THE VEHICLE DETAILS ARE ");
        System.out.println("REGISTRATION NO : "+Registration_num);
        System.out.println("MODEL NAME : "+model_name);
    }

}


