/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author R.Kavishka
 */
public class User {
    
    private String UserName;
    private String UserEmail;
    private String UserPassword;

    public User(String UserName, String UserEmail, String UserPassword) {
        
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.UserPassword = UserPassword;
    }

   
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }
    
}
