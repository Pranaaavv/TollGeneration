package com.packclass;

import java.io.Serializable;
//to write or read objects of classes in java

public class car extends vehicle implements Serializable {
    //String type;
    public car(String Registration_num, String model_name, int wheel_num) {
        super(Registration_num, model_name, wheel_num);

    }
    String type;

    public car() {
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
