
package com.mycompany.interfaces_slot13_14;


interface MyInterfaces {
    final int MaxN = 100;
    //static method
    static public int sqr(int x){
        return x*x;
    }
    abstract void m2();
    // default method
    default void m3() {
        System.out.println("Hello");
    }
}
