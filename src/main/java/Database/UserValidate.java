/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import GUI.Login;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author R.Kavishka
 */
public class UserValidate {
    
    public boolean UserValidate(String email, String password) {

        try {

            MySQL Conne = new MySQL();
            Statement insertData = Conne.getDBConnection().createStatement();

            ResultSet getData = insertData.executeQuery("select * from user where UserEmail = '" + email + "' and UserPassword = '" + password + "'");
            
            //<User.User>
            
            if (getData.next()) {

                return true;
            } else {

                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
