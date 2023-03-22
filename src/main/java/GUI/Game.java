/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Database.GameScore;
import Engine.GameEngine;
import static GUI.Login.gamePlayer;
import java.awt.image.BufferedImage;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author R.Kavishka
 */
public class Game extends javax.swing.JFrame {
    
    public static int Score=0;
    
    GameScore AddScore;

    /**
     * Creates new form Game
     */
    GameEngine mathGame = null;
    BufferedImage gameOverview = null;
    static int milliseconds = 0;
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;

    static boolean state = true;

    public Game() {
        initComponents();
        showgame(null);
        state = true;

        Thread clock = new Thread() {
            public void run() {
                for (;;) {
                    if (state == true) {
                        try {
                            sleep(1);

                            if (milliseconds > 1000) {
                                milliseconds = 0;
                                seconds++;
                            }
                            if (seconds > 60) {
                                milliseconds = 0;
                                seconds = 0;
                                minutes++;
                            }
                            millisecond.setText(milliseconds +"");
                            milliseconds++;
                            second.setText(seconds +" : ");
                            minute.setText(+ minutes +" : ");
                        } catch (Exception e) {

                        }
                    } else {
                        break;
                    }
                }
            }
        };
        clock.start();

     }

    private void showgame(String gamer) {

        mathGame = new GameEngine(gamer);
        gameOverview = mathGame.nextGame();

        ImageIcon NextImage = new ImageIcon(gameOverview);
        textLabel.setIcon(NextImage);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TimeOver = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNO = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        minute = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        millisecond = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton2");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        javax.swing.GroupLayout TimeOverLayout = new javax.swing.GroupLayout(TimeOver.getContentPane());
        TimeOver.getContentPane().setLayout(TimeOverLayout);
        TimeOverLayout.setHorizontalGroup(
            TimeOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TimeOverLayout.setVerticalGroup(
            TimeOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(textLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 680, 328));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel6.setText("Enter the value :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 150, -1));

        textNO.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        textNO.setForeground(new java.awt.Color(102, 0, 0));
        textNO.setAlignmentX(0.0F);
        textNO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true));
        textNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNOActionPerformed(evt);
            }
        });
        jPanel1.add(textNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 55, 40));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 525, -1, 30));

        minute.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        minute.setText("00 :");
        jPanel1.add(minute, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 40, 20));

        second.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        second.setText("00 :");
        jPanel1.add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 80, 40, 20));

        millisecond.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        millisecond.setText("00 :");
        jPanel1.add(millisecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 20, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\3rd Year 1st semester\\CIS\\Background.jpg")); // NOI18N
        jLabel7.setAlignmentX(0.5F);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 765, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int answer = Integer.parseInt(textNO.getText());
        boolean correct = mathGame.checkSolution(answer);
        int solution = mathGame.checkSolutionReturn();
        textNO.setText("");
        if (correct) {
            Score = Score + 5;
            this.dispose();
            Score push = new Score();
            push.setVisible(true);
            ImageIcon NextImage = new ImageIcon(gameOverview);
            textLabel.setIcon(NextImage);

        } else {
            JOptionPane.showMessageDialog(this, "Incorrect Value");
            state = false;
            AddScore = new GameScore();
            AddScore.addScore(gamePlayer, Score);
            this.dispose();
            GameOver push = new GameOver();

            push.setVisible(true);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame TimeOver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel millisecond;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel second;
    private javax.swing.JLabel textLabel;
    private javax.swing.JTextField textNO;
    // End of variables declaration//GEN-END:variables
}

