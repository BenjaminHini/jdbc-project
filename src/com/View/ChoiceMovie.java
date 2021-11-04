/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.View;
import com.Model.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author User
 */
public class ChoiceMovie extends javax.swing.JFrame  
{
    
    private Customer user;
    private Cinema cine;
    /**
     * Creates new form ChoiceMovie
     */
    public ChoiceMovie(Customer user, Cinema cine)
    {

        this.user = user;
        this.cine = cine;
        initComponents();
        nomFilm1.setText(cine.getFilms().get(0).getName());
        nomFilm2.setText(cine.getFilms().get(1).getName());
        nomFilm3.setText(cine.getFilms().get(2).getName());
        genreFilm1.setText(cine.getFilms().get(0).getGenre());
        genreFilm2.setText(cine.getFilms().get(1).getGenre());
        genreFilm3.setText(cine.getFilms().get(2).getGenre());
        realeaseDateFilm1.setText(cine.getFilms().get(0).getReleaseDate());
        realeaseDateFilm2.setText(cine.getFilms().get(1).getReleaseDate());
        realeaseDateFilm3.setText(cine.getFilms().get(2).getReleaseDate());
        dureeFilm1.setText(cine.getFilms().get(0).getRunningTime()+"mn");
        dureeFilm2.setText(cine.getFilms().get(1).getRunningTime()+"mn");
        dureeFilm3.setText(cine.getFilms().get(2).getRunningTime()+"mn");
        selection1.setText(cine.getFilms().get(0).getName());
        selection2.setText(cine.getFilms().get(1).getName());
        selection3.setText(cine.getFilms().get(2).getName());
        imageFilm1.setIcon(cine.getFilms().get(0).getImage());
        imageFilm2.setIcon(cine.getFilms().get(1).getImage());
        imageFilm3.setIcon(cine.getFilms().get(2).getImage());
        if(cine.getPromo()!= 0)
            promoLabel.setText(cine.getPromo()*100+" %DE REDUCTION");

        Date[] horaire = {cine.getFilms().get(0).getSession().get(0).getFullDate(), cine.getFilms().get(0).getSession().get(1).getFullDate(), cine.getFilms().get(0).getSession().get(2).getFullDate()};
        jComboBox1.setModel(new DefaultComboBoxModel<>(horaire));
        jComboBox2.setModel(new DefaultComboBoxModel<>(horaire));
        jComboBox3.setModel(new DefaultComboBoxModel<>(horaire));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        nomFilm1 = new javax.swing.JLabel();
        genreFilm1 = new javax.swing.JLabel();
        realeaseDateFilm1 = new javax.swing.JLabel();
        dureeFilm1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        imageFilm1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        imageFilm2 = new javax.swing.JLabel();
        nomFilm2 = new javax.swing.JLabel();
        genreFilm2 = new javax.swing.JLabel();
        realeaseDateFilm2 = new javax.swing.JLabel();
        dureeFilm2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        imageFilm3 = new javax.swing.JLabel();
        nomFilm3 = new javax.swing.JLabel();
        genreFilm3 = new javax.swing.JLabel();
        realeaseDateFilm3 = new javax.swing.JLabel();
        dureeFilm3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        selection1 = new javax.swing.JRadioButton();
        selection2 = new javax.swing.JRadioButton();
        selection3 = new javax.swing.JRadioButton();
        retrun_btn = new javax.swing.JToggleButton();
        promoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nbtickets_tf = new javax.swing.JTextField();
        buy_btn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomFilm1.setText("nomFilm1");

        genreFilm1.setText("jLabel1");

        realeaseDateFilm1.setText("jLabel1");

        dureeFilm1.setText("jLabel1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nomFilm2.setText("nomFilm1");

        genreFilm2.setText("jLabel1");

        realeaseDateFilm2.setText("jLabel1");

        dureeFilm2.setText("jLabel1");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nomFilm3.setText("nomFilm1");

        genreFilm3.setText("jLabel1");

        realeaseDateFilm3.setText("jLabel1");

        dureeFilm3.setText("jLabel1");

        jLabel1.setText("Your Choice");

        buttonGroup1.add(selection1);
        selection1.setText("jRadioButton1");

        buttonGroup1.add(selection2);
        selection2.setText("jRadioButton1");

        buttonGroup1.add(selection3);
        selection3.setText("jRadioButton1");
        selection3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection3ActionPerformed(evt);
            }
        });

        retrun_btn.setText("return");
        retrun_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrun_btnActionPerformed(evt);
            }
        });

        jLabel2.setText("number of tickets : ");

        nbtickets_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbtickets_tfActionPerformed(evt);
            }
        });

        buy_btn.setText("Buy");
        buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageFilm1)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dureeFilm1)
                                    .addComponent(realeaseDateFilm1)
                                    .addComponent(genreFilm1)
                                    .addComponent(nomFilm1))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageFilm2)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dureeFilm2)
                                    .addComponent(realeaseDateFilm2)
                                    .addComponent(genreFilm2)
                                    .addComponent(nomFilm2))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageFilm3)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dureeFilm3)
                                    .addComponent(genreFilm3)
                                    .addComponent(nomFilm3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(realeaseDateFilm3)
                                        .addGap(148, 148, 148)
                                        .addComponent(promoLabel))))
                            .addComponent(selection1)
                            .addComponent(selection3)
                            .addComponent(selection2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(retrun_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nbtickets_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(buy_btn)))))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(retrun_btn)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageFilm2)
                        .addGap(18, 18, 18)
                        .addComponent(nomFilm2)
                        .addGap(18, 18, 18)
                        .addComponent(genreFilm2)
                        .addGap(18, 18, 18)
                        .addComponent(realeaseDateFilm2)
                        .addGap(18, 18, 18)
                        .addComponent(dureeFilm2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageFilm1)
                        .addGap(18, 18, 18)
                        .addComponent(nomFilm1)
                        .addGap(18, 18, 18)
                        .addComponent(genreFilm1)
                        .addGap(18, 18, 18)
                        .addComponent(realeaseDateFilm1)
                        .addGap(18, 18, 18)
                        .addComponent(dureeFilm1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageFilm3)
                        .addGap(25, 25, 25)
                        .addComponent(nomFilm3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genreFilm3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(realeaseDateFilm3)
                            .addComponent(promoLabel))
                        .addGap(26, 26, 26)
                        .addComponent(dureeFilm3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selection1)
                            .addComponent(nbtickets_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selection2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buy_btn)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selection3)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nbtickets_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbtickets_tfActionPerformed
        int nb = Integer.parseInt(nbtickets_tf.getText());
    }//GEN-LAST:event_nbtickets_tfActionPerformed

    private void retrun_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrun_btnActionPerformed
        if (user.isMember()!=0){
            double discount;
            if(user.isMember()==-1)
                discount = 0;
            else
                discount = user.isMember();
            Member use = new Member(user.getMail(),user.getPassword(),discount);
            this.setVisible(false);
            Member_Menu member = new Member_Menu(use, cine);
            member.setVisible(true);
        }
        else{
            this.setVisible(false);
            Login log = new Login();
            log.setVisible(true);
        }
    }//GEN-LAST:event_retrun_btnActionPerformed

    private void buy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btnActionPerformed
         // TODO add your handling code here:
        String nom;
        String dateVisio;
         int nb;
          if(nbtickets_tf.getText().length()!=0)
          {
          nb = Integer.parseInt(nbtickets_tf.getText());
         
        if(selection1.isSelected())
        {
            nom = nomFilm1.getText();
            dateVisio= (jComboBox1.getItemAt(jComboBox1.getSelectedIndex())+"");
            this.setVisible(false);
            Recap rec = new Recap(user,cine,nom,dateVisio,nb,cine.getFilms().get(0));
            rec.setVisible(true);
        }
        else if(selection2.isSelected())
        {
            nom = nomFilm2.getText();
            this.setVisible(false);
          dateVisio= (jComboBox2.getItemAt(jComboBox2.getSelectedIndex())+"");
         Recap rec = new Recap(user,cine,nom,dateVisio,nb,cine.getFilms().get(1));
         rec.setVisible(true);
        }
        else if(selection3.isSelected())
        {
         nom = nomFilm3.getText();
         this.setVisible(false);
         dateVisio=(jComboBox3.getItemAt(jComboBox3.getSelectedIndex())+"");
         Recap rec = new Recap(user,cine,nom,dateVisio,nb,cine.getFilms().get(2));
         rec.setVisible(true);
        }
        }
        else 
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un film et un nombre de ticket , svp");
        
    }//GEN-LAST:event_buy_btnActionPerformed

    private void selection3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selection3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JToggleButton buy_btn;
    private javax.swing.JLabel dureeFilm1;
    private javax.swing.JLabel dureeFilm2;
    private javax.swing.JLabel dureeFilm3;
    private javax.swing.JLabel genreFilm1;
    private javax.swing.JLabel genreFilm2;
    private javax.swing.JLabel genreFilm3;
    private javax.swing.JLabel imageFilm1;
    private javax.swing.JLabel imageFilm2;
    private javax.swing.JLabel imageFilm3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nbtickets_tf;
    private javax.swing.JLabel nomFilm1;
    private javax.swing.JLabel nomFilm2;
    private javax.swing.JLabel nomFilm3;
    private javax.swing.JLabel promoLabel;
    private javax.swing.JLabel realeaseDateFilm1;
    private javax.swing.JLabel realeaseDateFilm2;
    private javax.swing.JLabel realeaseDateFilm3;
    private javax.swing.JToggleButton retrun_btn;
    private javax.swing.JRadioButton selection1;
    private javax.swing.JRadioButton selection2;
    private javax.swing.JRadioButton selection3;
    // End of variables declaration//GEN-END:variables

   
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
