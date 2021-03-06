/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.View;
import com.Model.*;
/**
 *
 * @author User
 */
public class Member_Menu extends javax.swing.JFrame {

    private Member user;
    private Cinema cine;
    /**
     * Creates new form Member_Menu
     */
    public Member_Menu(Member user, Cinema cine) {
        this.user = user;
        this.cine = cine;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        show_movie_button = new javax.swing.JButton();
        show_historic_button = new javax.swing.JButton();
        return_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu");

        show_movie_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_movie_button.setText("Show movie");
        show_movie_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_movie_buttonActionPerformed(evt);
            }
        });

        show_historic_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show_historic_button.setText("Show historic");
        show_historic_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_historic_buttonActionPerformed(evt);
            }
        });

        return_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        return_button.setText("Return");
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(show_historic_button)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(jLabel1))
                        .addComponent(return_button)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addComponent(show_movie_button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(return_button)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(show_movie_button)
                .addGap(42, 42, 42)
                .addComponent(show_historic_button)
                .addContainerGap(68, Short.MAX_VALUE))
        );

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

    private void show_historic_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_historic_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MemberHistoric histo = new MemberHistoric(user,cine);
        histo.setVisible(true);
    }//GEN-LAST:event_show_historic_buttonActionPerformed

    private void show_movie_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_movie_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         ChoiceMovie choix= new ChoiceMovie(user,cine);
         choix.setVisible(true);
    }//GEN-LAST:event_show_movie_buttonActionPerformed

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         Login log = new Login();
         log.setVisible(true);
    }//GEN-LAST:event_return_buttonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton return_button;
    private javax.swing.JButton show_historic_button;
    private javax.swing.JButton show_movie_button;
    // End of variables declaration//GEN-END:variables
}
