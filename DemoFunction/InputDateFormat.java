/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Sword Lake
 */
public class InputDateFormat {
    static Date inputDate(){
        int day, month, year;
        String dateFormat = "\\d{2}-\\d{2}-\\d{4}";
        Scanner sc = new Scanner(System.in);
        Date date = null;
        String data = sc.nextLine();
        if(data.matches(dateFormat)){
            try{
                 //cắt chuỗi 06-10-2021 theo dấu - , có thể thay đổi bằng dấu / (tùy theo format)
                 StringTokenizer st = new StringTokenizer(data, "-");
                 day = Integer.parseInt(st.nextToken());
                 month = Integer.parseInt(st.nextToken());
                 year = Integer.parseInt(st.nextToken());
                 //phương thức checkDayValid có trong tập tin Validation.java
                 if(checkDayValid(year,month,day) == true){
                    date = getDate(data);        
                 }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("DateFormat invalid.");
        }
        return date;
    }
    
    static Date getDate(String s) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = formatter.parse(s);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return date;
    }
    
    static long getDifferenceDays(Date d1, Date d2){
        long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return diff;
    }
    
    public static void main(String[] args) {
        Date firstDate, secondDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Enter the firstDate:");
        firstDate = inputDate();
        System.out.println("Enter the secondDate:");
        secondDate = inputDate();
        //Date d1 = getDate("26-02-2021");     
        //Date d2 = getDate("28-02-2021");        
        System.out.println("FirstDate: "+ formatter.format(firstDate));
        System.out.println("SecondDate: "+ formatter.format(secondDate));
        long diff = getDifferenceDays(firstDate, secondDate);
        //Lay khoang cach giua 2 date
        System.out.println("Difference Days : "+ diff);
        //So sanh 02 date
        //return 1 : neu d1 sau d2
        //return 0 : neu d1 = d2
        //return -1 : neu d1 truoc d2
        System.out.println("Compare firstDate and secondDate:"+ 
                firstDate.compareTo(secondDate));  
    }
}

