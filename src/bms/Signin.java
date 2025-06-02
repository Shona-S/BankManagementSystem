
package bms;

import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Signin extends javax.swing.JFrame {
    public Signin() {
        initComponents();
        jLabel1.setFont(new Font("Osward", Font.BOLD, 36));      
        jLabel2.setFont(new Font("Railway", Font.PLAIN, 25));     
        jLabel3.setFont(new Font("Railway", Font.PLAIN, 25)); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cardTextField = new javax.swing.JTextField();
        pinTextField = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setLocation(new java.awt.Point(400, 150));

        jLabel1.setText("WELCOME TO ATM");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("CARD NUMBER");

        jLabel3.setText("PIN");

        cardTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardTextFieldActionPerformed(evt);
            }
        });

        pinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinTextFieldActionPerformed(evt);
            }
        });

        signin.setBackground(new java.awt.Color(51, 153, 255));
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Sign in");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(51, 153, 255));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        signup.setBackground(new java.awt.Color(51, 153, 255));
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void cardTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardTextFieldActionPerformed

    private void pinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinTextFieldActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        cardTextField.setText("");
        pinTextField.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new signup1().setVisible(true);
    }//GEN-LAST:event_signupActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        // TODO add your handling code here:
        System.out.println("Sign In button clicked!");

    // DB Connection
    DBconnection c = new DBconnection();

    // Get user input
    String card_number = cardTextField.getText();
    String pin_number = pinTextField.getText();

    // Debug print
    System.out.println("Card Number: [" + card_number + "]");
    System.out.println("PIN Number: [" + pin_number + "]");

    // Query to check login
    String query = "SELECT * FROM signup2 WHERE card_number = '" + card_number + "' AND pin_number = '" + pin_number + "'";

    try {
        ResultSet rs = c.s.executeQuery(query);

        if (rs.next()) {
            int formno = rs.getInt("formno");
            String insertSignin = "INSERT INTO signin (formno, card_number) VALUES (" + formno + ", '" + card_number + "')";
            int rowsInserted = c.s.executeUpdate(insertSignin);
            ResultSet check = c.s.executeQuery("SELECT * FROM signin ORDER BY login_time DESC");
            while (check.next()) {
                System.out.println(check.getString("card_number") + " logged in at " + check.getTimestamp("login_time"));
            }
            setVisible(false);
            new transaction(card_number).setVisible(true);

        } else {
            System.out.println("Login failed: Incorrect card or pin");
            JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
        }
    } catch (Exception ex) {
        System.out.println("ERROR CAUGHT:");
        ex.printStackTrace();
    }
    }//GEN-LAST:event_signinActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cardTextField;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pinTextField;
    private javax.swing.JButton signin;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
