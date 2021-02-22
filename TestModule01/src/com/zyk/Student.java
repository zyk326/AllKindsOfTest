package com.zyk;

import java.util.HashMap;

public class Student {
    public static void main(String[] args) {
        int age;
        String name;
        HashMap <String, String> Arr = new HashMap<String, String>();
        Arr.put("nian", "12");
        Arr.put("zyk","15");
        System.out.println(Arr.get("nian"));
        System.out.println(Arr.get("zyk"));
    }

}
