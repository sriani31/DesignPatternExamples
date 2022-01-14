package com.phone;

public class OperatingSystemFactory {
    public OS getInstance(String os)
    {
        if (os.equalsIgnoreCase("Apple")){
            return new Apple();
        }else if (os.equalsIgnoreCase("Android")){
            return new Android();
        } else return new Windows();
    }
}
