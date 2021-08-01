package com.packclass;

import java.io.Serializable;

public class bike extends vehicle implements Serializable {

    String type;

    public bike(String Registration_num, String model_name, int wheel_num) {
        super(Registration_num, model_name, wheel_num);
    }

    public bike() {
        super();
    }

    public void settype(String str) {
        type = str;

    }

    public String getreg(){
        return Registration_num;
    }
    public String getmnum(){
        return model_name;
    }

    public String gettype(){
        return type;
    }

    public void go() {
        System.out.println("-----NO TOLL REQUIRED-----");
    }

}
