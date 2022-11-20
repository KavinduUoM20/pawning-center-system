/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sehan Iroshana
 */
public class Login {

    //contructoe    

    //varialbe
    
    private static  String username ;
    static String  password ;

    String adminename = "maneesha nirman";

    //methode
    public static boolean checkuser(String username1, String password1, JFrame frame,JTextField usernamefield,JPasswordField passwordfield) {

        try {
            ResultSet r1=DATABASE.DB.SEARCH("select * from user where username='"+username1+"'");
            if(r1.next()){
              username=r1.getString("username");
              password =r1.getString("password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (username.equals(username1)) {
            if (password.equals(password1)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid password. please check again");
                passwordfield.grabFocus();
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid user name. please check again");
            usernamefield.grabFocus();
            return  false;
        }
    }
}
