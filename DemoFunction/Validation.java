/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static java.lang.System.in;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Hang Heo
 */
public class Validation {
  public static boolean isNumber(String num) {
    int n = 0;
    for(int i = 0; i < num.length(); i++) {
        if(num.charAt(i) > 57 || num.charAt(i) < 48) {
            return false;
        }
    }
    return true;
} 
 static  boolean checkYearValid(int year) {
    //get current year, month, day
   int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    if (year > currentYear || year < 1900) {
        return false;
    }
    return true;
}
   
 static  boolean checkMonthValid(int month) {
    if (month > 12 || month < 1) {
        return false;
    }
    return true;
}
 
  static boolean IsNamNhuan(int year) {
    if (year % 400 == 0)
        return true;
    else if (year % 4 == 0 && year % 100 != 0)
        return true;
    else
        return false;
}
  static boolean checkDayValid(int year, int month, int day) {

    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        // day 31
        if (day > 31 || day <= 0) {
            return false;
        }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        //day 30
        if (day > 30 || day <= 0) {
            return false;
        }
    } else if (month == 2) {

        if (IsNamNhuan(year)) {
            if (day > 29 || day <= 0) {
                return false;
            }
        } else {
            if (day > 28 | day <= 0) {
                return false;
            }
        }
    }
    return true;
}

   //check phone
static boolean checkPhoneValid(String phone) {
    if ((phone.length() == 10 || phone.length() == 11) && phone.charAt(0) == 48 && (phone.charAt(1) == 57 || phone.charAt(1) == 49 || phone.charAt(1) == 56)) {
        for (int i = 2; i < phone.length(); i++) {
            if (phone.charAt(i) < 48 || phone.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }
    return false;
}

static boolean checkStudentIDValid(String id) {
    if (id.length() == 7 && id.charAt(0) == 71 && (id.charAt(1) == 67 || id.charAt(1) == 84)) {
        for (int i = 2; i < id.length(); i++) {
            if (id.charAt(i) < 48 || id.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }
    return false;
}

}
