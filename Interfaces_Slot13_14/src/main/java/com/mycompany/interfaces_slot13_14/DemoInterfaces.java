
package com.mycompany.interfaces_slot13_14;


public class DemoInterfaces {
    public static void main(String[] args) {
        firstClass obj= new firstClass();
        obj.m2();
        //call default method
        obj.m3();
        //call static method
        System.out.println(MyInterfaces.sqr(10));
        MyInterfaces mi = new firstClass();
        mi.m2();
        mi.m3();
    }
}

