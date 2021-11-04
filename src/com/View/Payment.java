/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.View;
import com.Model.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Payment extends javax.swing.JFrame {
  
    private Cinema cine;
    private Customer user;
    private Movie movie;
    private int nb;
    /**
     * Creates new form Payment
     */
    public Payment( Customer user , Cinema cine,Movie movie,int nb) {
        this.user=user;
        this.cine=cine;
        this.movie=movie;
        this.nb=nb;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pay_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Return_Button = new javax.swing.JButton();
        Carte_number = new javax.swing.JTextField();
        Date_expiration = new javax.swing.JTextField();
        CVV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pay_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pay_Button.setText("Pay");
        Pay_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pay_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Carte number :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Date of expiration : ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Payment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CVV :");

        Return_Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Return_Button.setText("Return");
        Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ButtonActionPerformed(evt);
            }
        });

        Carte_number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Carte_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carte_numberActionPerformed(evt);
            }
        });

        Date_expiration.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Date_expiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_expirationActionPerformed(evt);
            }
        });

        CVV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Return_Button)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Pay_Button))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Carte_number, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date_expiration, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return_Button)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Carte_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Date_expiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(Pay_Button)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ButtonActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
         ChoiceMovie choix= new ChoiceMovie(user,cine);
         choix.setVisible(true);
    }//GEN-LAST:event_Return_ButtonActionPerformed

    private void Pay_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pay_ButtonActionPerformed
        // TODO add your handling code here:
        if(Carte_number.getText().length()!=0 &&
           Date_expiration.getText().length()!=0 && CVV.getText().length()!=0){
        user.acheterTicket(cine,movie,nb);
        cine.saveCurrentMovie();
        this.setVisible(false);
        if(user.isMember()!=0){
            double discount;
            if(user.isMember() == -1)
                discount = 0;
            else
                discount = user.isMember();
            Member mb = new Member(user.getMail(),user.getMail(),discount);
            Member_Menu member = new Member_Menu(mb,cine);
            member.setVisible(true);
        }
        else{
            Login login = new Login();
            login.setVisible(true);
        }
        }
        else
            JOptionPane.showMessageDialog(null,"Donée bancaire rentrée incorectement");
    }//GEN-LAST:event_Pay_ButtonActionPerformed

    private void Carte_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carte_numberActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_Carte_numberActionPerformed

    private void Date_expirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_expirationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_expirationActionPerformed

    private void CVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CVV;
    private javax.swing.JTextField Carte_number;
    private javax.swing.JTextField Date_expiration;
    private javax.swing.JButton Pay_Button;
    private javax.swing.JButton Return_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}