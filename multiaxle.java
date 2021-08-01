package com.packclass;

import java.io.Serializable;

public class multiaxle extends vehicle implements Serializable {
    public multiaxle(String Registration_num, String model_name, int wheel_num) {
        super(Registration_num, model_name, wheel_num);
    }

    String type;

    public multiaxle() {
    }

    public void settype(String str) {
        type = str;
    }
    public String getmnum(){
        return model_name;
    }

    public String getreg(){
        return Registration_num;
    }

    public String gettype(){
        return type;
    }
}
