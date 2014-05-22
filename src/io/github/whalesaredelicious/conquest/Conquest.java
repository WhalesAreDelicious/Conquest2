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

import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Weilon
 */
public class Conquest extends JFrame {
    
    //Initialise control buttons
    private JButton btnMoveUp = new JButton("Up");
    private JButton btnMoveDown = new JButton("Down");
    private JButton btnMoveLeft = new JButton("Left");
    private JButton btnMoveRight = new JButton("Right");
    
    /**
     * Creates new form Conquest
     */
    public Conquest() {
        super("Conquest");
        
        initComponents();
        initControls();
        
        setLayout(null);
        setResizable(false);
        setSize(600, 400);
        
        
    }
    public void initControls() {
        //Create ActionListeners
        btnMoveUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMoveUpPressed(evt);
            }
        });
        
        btnMoveDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMoveDownPressed(evt);
            }
        });
        
        btnMoveLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMoveLeftPressed(evt);
            }
        });
        
        btnMoveRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMoveRightPressed(evt);
            }
        });
        //Set locations of buttons
        Insets inset = getInsets(); //Get window borders
        
        //button.setBounds(LocationX, LocationY, SizeX, SizeY
        int boundaryX = getSize().width, boundaryY = getSize().height;
        //btnMoveUp.setBounds((boundaryX - 200), (boundaryY - 300), 60, 60);
        //btnMoveDown.setBounds((boundaryX - 200), (boundaryY - 300), 60, 60);
        //btnMoveLeft.setBounds((boundaryX - 200), (boundaryY - 300), 60, 60);
        btnMoveRight.setBounds((boundaryX - 200), (boundaryY - 300), 60, 60);
        
        //Add the buttons to the screen
        add(btnMoveUp);
        add(btnMoveDown);
        add(btnMoveLeft);
        add(btnMoveRight);
    }
    
    //ActionEvent Responders
    private void btnMoveUpPressed(ActionEvent evt) {
        //Do stuff here
    }
    private void btnMoveDownPressed(ActionEvent evt) {
        //Do stuff here
    }
    private void btnMoveLeftPressed(ActionEvent evt) {
        //Do stuff here
    }
    private void btnMoveRightPressed(ActionEvent evt) {
        //Do stuff here
        ConquestMap.moveRight();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Conquest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conquest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conquest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conquest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conquest().setVisible(true);
                new ConquestMap().setVisible(true);
            }
        });
    }
    
    public static void log(String message) {
        System.out.println(message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
