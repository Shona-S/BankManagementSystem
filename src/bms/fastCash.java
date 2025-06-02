package bms;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class fastCash extends javax.swing.JFrame {
    String card_number;
    public fastCash(String card_number) {
        this.card_number = card_number;
        initComponents();
    }
    private void withdraw(double amount) {
    try {
        DBconnection c = new DBconnection();
        String checkBalanceQuery = "SELECT balance FROM signup2 WHERE card_number = '" + card_number + "'";
        ResultSet rs = c.s.executeQuery(checkBalanceQuery);

        if (rs.next()) {
            double currentBalance = rs.getDouble("balance");

            if (currentBalance < amount) {
                JOptionPane.showMessageDialog(null, "Insufficient funds 😓");
                return;
            }

            // Deduct balance
            String updateQuery = "UPDATE signup2 SET balance = balance - " + amount + " WHERE card_number = '" + card_number + "'";
            c.s.executeUpdate(updateQuery);

            // Insert transaction
            String insertQuery = "INSERT INTO transactions (card_number, type, amount) VALUES ('" + card_number + "', 'withdraw', " + amount + ")";
            c.s.executeUpdate(insertQuery);

            JOptionPane.showMessageDialog(null, "₹" + amount + " withdrawn successfully! 💰");

        } else {
            JOptionPane.showMessageDialog(null, "Card not found!");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Something went wrong during withdrawal!");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hundred = new javax.swing.JButton();
        thousand = new javax.swing.JButton();
        fivehundred = new javax.swing.JButton();
        twothousand = new javax.swing.JButton();
        fivethousand = new javax.swing.JButton();
        tenthousand = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(400, 150));
        setPreferredSize(new java.awt.Dimension(714, 435));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select amount to withdraw");

        hundred.setText("Rs.100");
        hundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredActionPerformed(evt);
            }
        });

        thousand.setText("Rs.1000");
        thousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thousandActionPerformed(evt);
            }
        });

        fivehundred.setText("Rs.500");
        fivehundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivehundredActionPerformed(evt);
            }
        });

        twothousand.setText("Rs.2000");
        twothousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twothousandActionPerformed(evt);
            }
        });

        fivethousand.setText("Rs.5000");
        fivethousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivethousandActionPerformed(evt);
            }
        });

        tenthousand.setText("Rs.10000");
        tenthousand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenthousandActionPerformed(evt);
            }
        });

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fivethousand, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(hundred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fivehundred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twothousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenthousand, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hundred, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(fivehundred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twothousand, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thousand, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenthousand, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(fivethousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hundredActionPerformed
        // TODO add your handling code here:
        withdraw(100);
    }//GEN-LAST:event_hundredActionPerformed

    private void fivehundredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivehundredActionPerformed
        // TODO add your handling code here:
        withdraw(500);
    }//GEN-LAST:event_fivehundredActionPerformed

    private void thousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thousandActionPerformed
        // TODO add your handling code here:
         withdraw(1000);
    }//GEN-LAST:event_thousandActionPerformed

    private void twothousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twothousandActionPerformed
        // TODO add your handling code here:
        withdraw(2000);
    }//GEN-LAST:event_twothousandActionPerformed

    private void fivethousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivethousandActionPerformed
        // TODO add your handling code here:
        withdraw(5000);
    }//GEN-LAST:event_fivethousandActionPerformed

    private void tenthousandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenthousandActionPerformed
        // TODO add your handling code here:
        withdraw(10000);
        
    }//GEN-LAST:event_tenthousandActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new transaction(card_number).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastCash("12345689").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton fivehundred;
    private javax.swing.JButton fivethousand;
    private javax.swing.JButton hundred;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tenthousand;
    private javax.swing.JButton thousand;
    private javax.swing.JButton twothousand;
    // End of variables declaration//GEN-END:variables
}
