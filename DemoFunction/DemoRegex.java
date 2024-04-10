/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author Sword Lake
 */
public class DemoRegex {
    public static void main(String[] args) {
        String s ;
        String pattern = "SE\\d{3}";
        //String pattern = "SE[0-9]{3}";
        System.out.print("Enter StudentID[SExxx]:");
        Scanner sc = new Scanner(System.in);        
        s = sc.nextLine();
        if(s.toUpperCase().matches(pattern) == true){
            System.out.println("StudentID is valid.");
        }
        else{
             System.out.println("StudentID is wrong.");
        }

    }
}
