/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Sehan Iroshana
 */
public class Validate {

    public static boolean validateNic(String nic) {
        return true;
    }

    public static boolean validateMobile(String mobile) {
        boolean b=true;
          if(mobile.length()!=10){
              b=false;
          }
          return b;
    }
    public static boolean validateInt(String i){
        boolean b=true;
        try {
            Double.valueOf(i);
        } catch (Exception e) {
            b= false;
        }
        return b;
    }
}
