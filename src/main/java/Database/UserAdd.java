/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import GUI.Register;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author R.Kavishka
 */
public class UserAdd {
    
    public boolean newUserAdd(String name, String email, String password, String confirmPassword) {

        try {

            MySQL Conne = new MySQL();

            PreparedStatement insertData = Conne.getDBConnection().prepareStatement("insert into user(UserName,UserEmail,UserPassword)values(?,?,?)");
            insertData.setString(1, name);
            insertData.setString(2, email);
            insertData.setString(3, password);
            if (password.equals(confirmPassword)) {
                insertData.executeUpdate();
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
