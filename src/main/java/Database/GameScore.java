/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import GUI.Game;
import static GUI.Login.gamePlayer;
import GUI.Score;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author R.Kavishka
 */
public class GameScore {
    
    public void addScore(String email, int score) {

        try {

            MySQL Conne = new MySQL();

            PreparedStatement insertScore = Conne.getDBConnection().prepareStatement("insert into gamescore(UserEmail,Score)values(?,?)");
            insertScore.setString(1, gamePlayer);
            insertScore.setInt(2, score);
            insertScore.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
