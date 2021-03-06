/*
 * Copyright (C) 2014 Weilon
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Creative Commons Attribution-ShareAlike 4.0
 * International as published by the Creative Commons Organisation.
 *
 * You are free to copy, redistribute and create derivative works
 * from the material under the condition appropriate credit is
 * given to the creator. In addition, if you remix, transform or
 * build upon the material, you must distribute your contributions under
 * the same license as the original.
 *
 * You may get a copy of the license here: https://creativecommons.org/licenses/by-sa/4.0/
 */

package io.github.whalesaredelicious.conquest;

import javax.swing.JLabel;

/**
 *
 * @author Weilon
 */
public class ConquestScoresheet extends javax.swing.JFrame {

    /**
     * Creates new form ConquestScoresheet
     */
    public ConquestScoresheet() {
        initComponents();
        initScoresheet();
        //setAlwaysOnTop(true);
        setLocationRelativeTo(null);
    }
    private void initScoresheet() {
        lblWinner.setHorizontalAlignment(JLabel.CENTER);
        lblPlayer1Name.setHorizontalAlignment(JLabel.CENTER);
        lblPlayer2Name.setHorizontalAlignment(JLabel.CENTER);
        lblPlayer1Tickets.setHorizontalAlignment(JLabel.CENTER);
        lblPlayer2Tickets.setHorizontalAlignment(JLabel.CENTER);
        
        lblAllUnitsKilled1.setVisible(false);
        lblAllUnitsKilled2.setVisible(false);
    }
    public void setWinner(int winner, String player1Name, String player2Name, int player1Tickets, int player2Tickets,
            boolean allUnitsKilledPlayer1, boolean allUnitsKilledPlayer2) {
        switch (winner) {
            case 0: //0 = draw;
                lblWinner.setText("It's a draw!");
                break;
            case 1:
                lblWinner.setText(player1Name + " wins!");
                break;
            case 2:
                lblWinner.setText(player2Name + " wins!");
                break;
        }
        lblPlayer1Name.setText(player1Name);
        lblPlayer2Name.setText(player2Name);
        
        lblPlayer1Tickets.setText(Integer.toString(player1Tickets));
        lblPlayer2Tickets.setText(Integer.toString(player2Tickets));
        
        lblAllUnitsKilled1.setVisible(allUnitsKilledPlayer1);
        lblAllUnitsKilled2.setVisible(allUnitsKilledPlayer2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblGameOverTitle = new javax.swing.JLabel();
        lblPlayer1Name = new javax.swing.JLabel();
        lblPlayer2Name = new javax.swing.JLabel();
        lblWinner = new javax.swing.JLabel();
        lblPlayer1Tickets = new javax.swing.JLabel();
        lblPlayer2Tickets = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        lblAllUnitsKilled1 = new javax.swing.JLabel();
        lblAllUnitsKilled2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        lblTitle.setText("Conquest");

        lblGameOverTitle.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        lblGameOverTitle.setText("Game Over!");

        lblPlayer1Name.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        lblPlayer1Name.setText("player1name");

        lblPlayer2Name.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        lblPlayer2Name.setText("player2name");

        lblWinner.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        lblWinner.setText("<insert name here> wins!");

        lblPlayer1Tickets.setFont(new java.awt.Font("Garamond", 1, 50)); // NOI18N
        lblPlayer1Tickets.setText("50");

        lblPlayer2Tickets.setFont(new java.awt.Font("Garamond", 1, 50)); // NOI18N
        lblPlayer2Tickets.setText("50");

        btnQuit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnRestart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        lblAllUnitsKilled1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lblAllUnitsKilled1.setText("All units killed!");

        lblAllUnitsKilled2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        lblAllUnitsKilled2.setText("All units killed!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPlayer1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPlayer2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblGameOverTitle)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblPlayer1Tickets, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblAllUnitsKilled1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAllUnitsKilled2)
                    .addComponent(lblPlayer2Tickets, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGameOverTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWinner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer1Name)
                    .addComponent(lblPlayer2Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllUnitsKilled2)
                    .addComponent(lblAllUnitsKilled1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayer1Tickets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer2Tickets, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        Conquest.conquestmap.dispose();
        ConquestMap newConquestMap = new ConquestMap();
        Conquest newConquest = new Conquest();
        ConquestStart start = new ConquestStart(null, true);
        
        this.dispose();
        start.setVisible(true);
        newConquest.setVisible(true);
        newConquestMap.setVisible(true);
        newConquestMap.initLocations();
    }//GEN-LAST:event_btnRestartActionPerformed

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
            java.util.logging.Logger.getLogger(ConquestScoresheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConquestScoresheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConquestScoresheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConquestScoresheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConquestScoresheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JLabel lblAllUnitsKilled1;
    private javax.swing.JLabel lblAllUnitsKilled2;
    private javax.swing.JLabel lblGameOverTitle;
    private javax.swing.JLabel lblPlayer1Name;
    private javax.swing.JLabel lblPlayer1Tickets;
    private javax.swing.JLabel lblPlayer2Name;
    private javax.swing.JLabel lblPlayer2Tickets;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWinner;
    // End of variables declaration//GEN-END:variables
}
