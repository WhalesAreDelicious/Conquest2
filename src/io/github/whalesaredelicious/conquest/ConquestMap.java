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

    /**
     * TO DO:
     * Capture system.
     */

package io.github.whalesaredelicious.conquest;

import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class ConquestMap extends JFrame {
    private static final int intMoveAmount = 50;
    private static final Point[][] pointLocation = new Point[18][11]; //Point data type defines screen location.
    
    public static int[] intUnit1_1Coords = new int[2];
    public static int[] intUnit1_2Coords = new int[2];
    public static int[] intUnit1_3Coords = new int[2];
    public static int[] intUnit2_1Coords = new int[2];
    public static int[] intUnit2_2Coords = new int[2];
    public static int[] intUnit2_3Coords = new int[2];
    
    public static int[] intCapturePointA = new int[2], intCapturePointB = new int[2],
            intCapturePointC = new int[2], intCapturePointD = new int[2];
    public static int[][] intCapturePointLocations = new int[4][2];
    public static int[] intCapturePointStatus = new int[4];
    
    public static boolean[][] booleanGridOccupied = new boolean[18][11];
    public static boolean[][] booleanGridCapturePoints = new boolean[18][11];
    
    //Constructor method
    public ConquestMap() {
        super("Conquest (Map)");
        initComponents();
        initLocations();
        setSize(905, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        panelUnits.setOpaque(false);
    }

    //Auto-generated code below
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUnits = new javax.swing.JPanel();
        lblUnit1_1 = new javax.swing.JLabel();
        lblUnit1_2 = new javax.swing.JLabel();
        lblUnit1_3 = new javax.swing.JLabel();
        lblUnit2_1 = new javax.swing.JLabel();
        lblUnit2_2 = new javax.swing.JLabel();
        lblUnit2_3 = new javax.swing.JLabel();
        panelMap = new javax.swing.JPanel();
        lblMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelUnits.setLayout(null);

        lblUnit1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/soldier1_1.png"))); // NOI18N
        panelUnits.add(lblUnit1_1);
        lblUnit1_1.setBounds(10, 10, 60, 60);

        lblUnit1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/soldier1_2.png"))); // NOI18N
        panelUnits.add(lblUnit1_2);
        lblUnit1_2.setBounds(76, 11, 60, 60);

        lblUnit1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/soldier1_3.png"))); // NOI18N
        panelUnits.add(lblUnit1_3);
        lblUnit1_3.setBounds(10, 77, 60, 60);

        lblUnit2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/soldier2_1.png"))); // NOI18N
        panelUnits.add(lblUnit2_1);
        lblUnit2_1.setBounds(835, 529, 60, 60);

        lblUnit2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/soldier2_2.png"))); // NOI18N
        panelUnits.add(lblUnit2_2);
        lblUnit2_2.setBounds(769, 529, 60, 60);

        lblUnit2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/soldier2_3.png"))); // NOI18N
        panelUnits.add(lblUnit2_3);
        lblUnit2_3.setBounds(835, 470, 60, 60);

        getContentPane().add(panelUnits);
        panelUnits.setBounds(0, 0, 900, 600);

        panelMap.setLayout(null);

        lblMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/io/github/whalesaredelicious/conquest/assets/map.png"))); // NOI18N
        panelMap.add(lblMap);
        lblMap.setBounds(0, 0, 910, 610);

        getContentPane().add(panelMap);
        panelMap.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //The main method - used if this class is not called from Conquest.java for any reason
    public static void main(String args[]) {
        msgBox("The Map can only be opened from the main program. Please run "
                + "Conquest by double clicking Conquest.jar instead", "Error", "error");
        System.exit(0);
        
        //Backup code if the user bypasses System.exit(0) somehow.
        msgBox("Conquest is running incorrectly. Please close this program "
                + "and notify the developer", "Warning", "warning");
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
            java.util.logging.Logger.getLogger(ConquestMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConquestMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConquestMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConquestMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConquestMap().setVisible(true);
            }
        });
    }
    
    //Initialisation methods - Called on start.
    public void initLocations() {
        //Higher level method to set up lcoation related processes
        initPointLocation();
        resetGridOccupied();
        initUnitCoordinates();
        initUnitLocations();
        initCapturePoints();
        setCloseOperations();
    }
    private void setCloseOperations() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Window will do nothing when close button is preseed.
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                closeButtonPressed();
            }
        });
    }
    private void initPointLocation() {
        //Set up possible locations a unit can be located in as a coordinate system.
        //Grid is 18 gridX 11.
        for (int gridX = 0; gridX < pointLocation.length; gridX++) {
            for (int gridY = 0; gridY < pointLocation[gridY].length; gridY++) {
                pointLocation[gridX][gridY] = new Point();
                pointLocation[gridX][gridY].x = gridX * intMoveAmount;
                pointLocation[gridX][gridY].y = gridY * intMoveAmount;
            }
        }

    }
    private void initCapturePoints() {
        //Sets the capture points on the map.
        int x = 0, y = 1; //Coordinate axes
        
        //Initialise grid capture points.
        for (int gridX = 0; gridX < booleanGridCapturePoints.length; gridX++) {
            for (int gridY = 0; gridY < booleanGridCapturePoints[gridX].length; gridY++) {
                booleanGridCapturePoints[gridX][gridY] = false;
            }
        }
        
        //Initialise capture point statuses
        for (int i = 0; i < intCapturePointStatus.length; i++) {
            intCapturePointStatus[i] = 0;
        }
        //Set capture point locations
        intCapturePointA[x] = 7; intCapturePointA[y] = 2;
        intCapturePointB[x] = 13; intCapturePointB[y] = 3;
        intCapturePointC[x] = 4; intCapturePointC[y] = 7;
        intCapturePointD[x] = 10; intCapturePointD[y] = 8;
        
        //Bind these locations to the capture points array.
        intCapturePointLocations[0][0] = intCapturePointA[x];
        intCapturePointLocations[0][1] = intCapturePointA[y];
        intCapturePointLocations[1][0] = intCapturePointB[x];
        intCapturePointLocations[1][1] = intCapturePointB[y];
        intCapturePointLocations[2][0] = intCapturePointC[x];
        intCapturePointLocations[2][1] = intCapturePointC[y];
        intCapturePointLocations[3][0] = intCapturePointD[x];
        intCapturePointLocations[3][1] = intCapturePointD[y];
    }
    private void initUnitCoordinates() {
        int x = 0, y = 1; //Coordinate axes
        intUnit1_1Coords[x] = 1;
        intUnit1_1Coords[y] = 1;
        
        intUnit1_2Coords[x] = 2;
        intUnit1_2Coords[y] = 1;
        
        intUnit1_3Coords[x] = 1;
        intUnit1_3Coords[y] = 2;
        
        intUnit2_1Coords[x] = 16;
        intUnit2_1Coords[y] = 9;
        
        intUnit2_2Coords[x] = 15;
        intUnit2_2Coords[y] = 9;
        
        intUnit2_3Coords[x] = 16;
        intUnit2_3Coords[y] = 8;        
    }
    public static void initUnitLocations() {
        //Defines the unit location coordinates, then sets their locations to said location coordinates.
        int x = 0, y = 1; //These represent the coordinate axes

        lblUnit1_1.setLocation(pointLocation[intUnit1_1Coords[x]][intUnit1_1Coords[y]]);
        lblUnit1_2.setLocation(pointLocation[intUnit1_2Coords[x]][intUnit1_2Coords[y]]);
        lblUnit1_3.setLocation(pointLocation[intUnit1_3Coords[x]][intUnit1_3Coords[y]]);
        lblUnit2_1.setLocation(pointLocation[intUnit2_1Coords[x]][intUnit2_1Coords[y]]);
        lblUnit2_2.setLocation(pointLocation[intUnit2_2Coords[x]][intUnit2_2Coords[y]]);
        lblUnit2_3.setLocation(pointLocation[intUnit2_3Coords[x]][intUnit2_3Coords[y]]);
        
        int intNumOfTotalUnits = 6; //Change this if total starting unit count is changed.
        for (int i = 0; i < (intNumOfTotalUnits); i++) {
            //This ensures that the starting locations are flagged as occupied at the start of the game.
            setGridOccupied(i, 1, 0);
        }
    }
    
    //Grid management methods
    private static void resetGridOccupied() {
        //Sets all grid locations to be unoccupied.
        for (int gridX = 0; gridX < booleanGridOccupied.length; gridX++) {
            for (int gridY = 0; gridY < booleanGridOccupied[gridX].length; gridY++) {
                booleanGridOccupied[gridX][gridY] = false;
            }
        }
        
        //Obstructed areas
        booleanGridOccupied[10][1] = true;
        booleanGridOccupied[10][2] = true;
        booleanGridOccupied[11][1] = true;
        booleanGridOccupied[11][2] = true;
        
        booleanGridOccupied[8][4] = true;
        booleanGridOccupied[8][5] = true;
        booleanGridOccupied[8][6] = true;
        booleanGridOccupied[9][4] = true;
        booleanGridOccupied[9][5] = true;
        booleanGridOccupied[9][6] = true;
        
        booleanGridOccupied[6][8] = true;
        booleanGridOccupied[7][8] = true;
        booleanGridOccupied[6][9] = true;
        booleanGridOccupied[7][9] = true;
    }
    private static void setGridOccupied(int unitSelected, int moveDirection, int moveAmount) {
        /**
         * This method sets the new coordinates of the units, then sets the relevant
         * coordinates as occupied through the array booleanGridOccupied.
         */
        //1 = up, 2 = right, 3 = down, 4 = left
        int x = 0, y = 1; //Coordinate axes
        resetGridOccupied();
        try {
            switch (unitSelected) {
                case 0:
                    switch (moveDirection) {
                        case 1:
                            intUnit1_1Coords[y] -= moveAmount;
                            break;
                        case 2:
                            intUnit1_1Coords[x] += moveAmount;
                            break;
                        case 3:
                            intUnit1_1Coords[y] += moveAmount;
                            break;
                        case 4:
                            intUnit1_1Coords[x] -= moveAmount;
                            break;
                    }

                    log("successful setting at " + intUnit1_1Coords[x] + ", " + intUnit1_1Coords[y]);
                    break;
                case 1:
                    switch (moveDirection) {
                        case 1:
                            intUnit1_2Coords[y] -= moveAmount;
                            break;
                        case 2:
                            intUnit1_2Coords[x] += moveAmount;
                            break;
                        case 3:
                            intUnit1_2Coords[y] += moveAmount;
                            break;
                        case 4:
                            intUnit1_2Coords[x] -= moveAmount;
                            break;
                    }

                    log("successful setting at " + intUnit1_2Coords[x] + ", " + intUnit1_2Coords[y]);
                    break;
                case 2:
                    switch (moveDirection) {
                        case 1:
                            intUnit1_3Coords[y] -= moveAmount;
                            break;
                        case 2:
                            intUnit1_3Coords[x] += moveAmount;
                            break;
                        case 3:
                            intUnit1_3Coords[y] += moveAmount;
                            break;
                        case 4:
                            intUnit1_3Coords[x] -= moveAmount;
                            break;
                    }

                    log("successful setting at " + intUnit1_3Coords[x] + ", " + intUnit1_3Coords[y]);
                    break;
                case 3:
                    switch (moveDirection) {
                        case 1:
                            intUnit2_1Coords[y] -= moveAmount;
                            break;
                        case 2:
                            intUnit2_1Coords[x] += moveAmount;
                            break;
                        case 3:
                            intUnit2_1Coords[y] += moveAmount;
                            break;
                        case 4:
                            intUnit2_1Coords[x] -= moveAmount;
                            break;
                    }

                    log("successful setting at " + intUnit2_1Coords[x] + ", " + intUnit2_1Coords[y]);
                    break;
                case 4:
                    switch (moveDirection) {
                        case 1:
                            intUnit2_2Coords[y] -= moveAmount;
                            break;
                        case 2:
                            intUnit2_2Coords[x] += moveAmount;
                            break;
                        case 3:
                            intUnit2_2Coords[y] += moveAmount;
                            break;
                        case 4:
                            intUnit2_2Coords[x] -= moveAmount;
                            break;
                    }

                    log("successful setting at " + intUnit2_2Coords[x] + ", " + intUnit2_2Coords[y]);
                    break;
                case 5:
                    switch (moveDirection) {
                        case 1:
                            intUnit2_3Coords[y] -= moveAmount;
                            break;
                        case 2:
                            intUnit2_3Coords[x] += moveAmount;
                            break;
                        case 3:
                            intUnit2_3Coords[y] += moveAmount;
                            break;
                        case 4:
                            intUnit2_3Coords[x] -= moveAmount;
                            break;
                    }

                    log("successful setting at " + intUnit2_3Coords[x] + ", " + intUnit2_3Coords[y]);
                    break;
                default:
                    log("Invalid unit selection");
                    break;
            }
        }
        catch (IndexOutOfBoundsException ex) {
            msgBox("Conquest has suffered a critical error and needs to close. Please notify the developer. "
                    + "Error: IndexOutOfBoundsException in ConquestMap.setGridOccupied", "Critical Error", "error");
            System.exit(0);
        }
        
        //Check if unit is still alive before setting their grid occupied status.
        if (!Conquest.booleanUnitKilled[0]) {booleanGridOccupied[intUnit1_1Coords[x]][intUnit1_1Coords[y]] = true; }
        if (!Conquest.booleanUnitKilled[1]) {booleanGridOccupied[intUnit1_2Coords[x]][intUnit1_2Coords[y]] = true; }
        if (!Conquest.booleanUnitKilled[2]) {booleanGridOccupied[intUnit1_3Coords[x]][intUnit1_3Coords[y]] = true; }
        if (!Conquest.booleanUnitKilled[3]) {booleanGridOccupied[intUnit2_1Coords[x]][intUnit2_1Coords[y]] = true; }
        if (!Conquest.booleanUnitKilled[4]) {booleanGridOccupied[intUnit2_2Coords[x]][intUnit2_2Coords[y]] = true; }
        if (!Conquest.booleanUnitKilled[5]) {booleanGridOccupied[intUnit2_3Coords[x]][intUnit2_3Coords[y]] = true; }
    }
    public static boolean[] checkGridOccupied(int unitSelected) {
        //checks if a grid location is occupied next to a unit and disables the appropriate buttons
        int x = 0, y = 1; //Coordinate axes
        boolean[] booleanButtonGreyOut = new boolean[4]; //0 = up, 1 = right, 2 = down, 3 = left.
        for (int i = 0; i < booleanButtonGreyOut.length; i++) {
            booleanButtonGreyOut[i] = false;
        }
        
        System.out.println(intUnit1_1Coords[x] + ", " + intUnit1_1Coords[y]);
        switch (unitSelected) {
            case 0:
                if (!Conquest.booleanUnitKilled[0]) { //if unit is not killed.
                    if (intUnit1_1Coords[y] > 0) {
                        if (booleanGridOccupied[intUnit1_1Coords[x]][intUnit1_1Coords[y] - 1]) { //up
                            booleanButtonGreyOut[0] = true;
                        }
                    }
                    if (intUnit1_1Coords[x] < 17) {
                        if (booleanGridOccupied[intUnit1_1Coords[x] + 1][intUnit1_1Coords[y]]) { //right
                            booleanButtonGreyOut[1] = true;
                        }
                    }
                    if (intUnit1_1Coords[y] < 10) {
                        if (booleanGridOccupied[intUnit1_1Coords[x]][intUnit1_1Coords[y] + 1]) { //down
                            booleanButtonGreyOut[2] = true;
                        }
                    }
                    if (intUnit1_1Coords[x] > 0) {
                        if (booleanGridOccupied[intUnit1_1Coords[x] - 1][intUnit1_1Coords[y]]) { //left
                            booleanButtonGreyOut[3] = true;
                        }
                    }
                }
                break;
            case 1:
                if (!Conquest.booleanUnitKilled[1]) {
                    if (intUnit1_2Coords[y] > 0) {
                        if (booleanGridOccupied[intUnit1_2Coords[x]][intUnit1_2Coords[y] - 1]) {
                            booleanButtonGreyOut[0] = true;
                        }
                    }
                    if (intUnit1_2Coords[x] < 17) {
                        if (booleanGridOccupied[intUnit1_2Coords[x] + 1][intUnit1_2Coords[y]]) {
                            booleanButtonGreyOut[1] = true;
                        }
                    }
                    if (intUnit1_2Coords[y] < 10) {
                        if (booleanGridOccupied[intUnit1_2Coords[x]][intUnit1_2Coords[y] + 1]) {
                            booleanButtonGreyOut[2] = true;
                        }
                    }
                    if (intUnit1_2Coords[x] > 0) {
                        if (booleanGridOccupied[intUnit1_2Coords[x] - 1][intUnit1_2Coords[y]]) {
                            booleanButtonGreyOut[3] = true;
                        }
                    }
                }
                break;
            case 2:
                if (!Conquest.booleanUnitKilled[2]) {
                    if (intUnit1_3Coords[y] > 0) {
                        if (booleanGridOccupied[intUnit1_3Coords[x]][intUnit1_3Coords[y] - 1]) {
                            booleanButtonGreyOut[0] = true;
                        }
                    }
                    if (intUnit1_3Coords[x] < 17) {
                        if (booleanGridOccupied[intUnit1_3Coords[x] + 1][intUnit1_3Coords[y]]) {
                            booleanButtonGreyOut[1] = true;
                        }
                    }
                    if (intUnit1_3Coords[y] < 10) {
                        if (booleanGridOccupied[intUnit1_3Coords[x]][intUnit1_3Coords[y] + 1]) {
                            booleanButtonGreyOut[2] = true;
                        }
                    }
                    if (intUnit1_3Coords[x] > 0) {
                        if (booleanGridOccupied[intUnit1_3Coords[x] - 1][intUnit1_3Coords[y]]) {
                            booleanButtonGreyOut[3] = true;
                        }
                    }
                }
                break;
            case 3:
                if (!Conquest.booleanUnitKilled[3]) {
                    if (intUnit2_1Coords[y] > 0) {
                        if (booleanGridOccupied[intUnit2_1Coords[x]][intUnit2_1Coords[y] - 1]) {
                            booleanButtonGreyOut[0] = true;
                        }
                    }
                    if (intUnit2_1Coords[x] < 17) {
                        if (booleanGridOccupied[intUnit2_1Coords[x] + 1][intUnit2_1Coords[y]]) {
                            booleanButtonGreyOut[1] = true;
                        }
                    }
                    if (intUnit2_1Coords[y] < 10) {
                        if (booleanGridOccupied[intUnit2_1Coords[x]][intUnit2_1Coords[y] + 1]) {
                            booleanButtonGreyOut[2] = true;
                        }
                    }
                    if (intUnit2_1Coords[x] > 0) {
                        if (booleanGridOccupied[intUnit2_1Coords[x] - 1][intUnit2_1Coords[y]]) {
                            booleanButtonGreyOut[3] = true;
                        }
                    }
                }
                break;
            case 4:
                if (!Conquest.booleanUnitKilled[4]) {
                    if (intUnit2_2Coords[y] > 0) {
                        if (booleanGridOccupied[intUnit2_2Coords[x]][intUnit2_2Coords[y] - 1]) {
                            booleanButtonGreyOut[0] = true;
                        }
                    }
                    if (intUnit2_2Coords[x] < 17) {
                        if (booleanGridOccupied[intUnit2_2Coords[x] + 1][intUnit2_2Coords[y]]) {
                            booleanButtonGreyOut[1] = true;
                        }
                    }
                    if (intUnit2_2Coords[y] < 10) {
                        if (booleanGridOccupied[intUnit2_2Coords[x]][intUnit2_2Coords[y] + 1]) {
                            booleanButtonGreyOut[2] = true;
                        }
                    }
                    if (intUnit2_2Coords[x] > 0) {
                        if (booleanGridOccupied[intUnit2_2Coords[x] - 1][intUnit2_2Coords[y]]) {
                            booleanButtonGreyOut[3] = true;
                        }
                    }
                }
                break;
            case 5:
                if (!Conquest.booleanUnitKilled[5]) {
                    if (intUnit2_3Coords[y] > 0) {
                        if (booleanGridOccupied[intUnit2_3Coords[x]][intUnit2_3Coords[y] - 1]) {
                            booleanButtonGreyOut[0] = true;
                        }
                    }
                    if (intUnit2_3Coords[x] < 17) {
                        if (booleanGridOccupied[intUnit2_3Coords[x] + 1][intUnit2_3Coords[y]]) {
                            booleanButtonGreyOut[1] = true;
                        }
                    }
                    if (intUnit2_3Coords[y] < 10) {
                        if (booleanGridOccupied[intUnit2_3Coords[x]][intUnit2_3Coords[y] + 1]) {
                            booleanButtonGreyOut[2] = true;
                        }
                    }
                    if (intUnit2_3Coords[x] > 0) {
                        if (booleanGridOccupied[intUnit2_3Coords[x] - 1][intUnit2_3Coords[y]]) {
                            booleanButtonGreyOut[3] = true;
                        }
                    }
                }
                break;
            default:
                log("Invalid unit selected for checkGridOccupied");
                break;
        }
        
        return booleanButtonGreyOut;
    }
    public static boolean findCapturePoint(int unitSelected) {
        int x = 0, y = 1; //Coordinate axes
        int[] intUnitLocation = new int[2];
        switch (unitSelected) {
            case 0:
                for (int i = 0; i < intUnit1_1Coords.length; i++) {
                    intUnitLocation[i] = intUnit1_1Coords[i];
                }
                break;
            case 1:
                for (int i = 0; i < intUnit1_2Coords.length; i++) {
                    intUnitLocation[i] = intUnit1_2Coords[i];
                }
                break;
            case 2:
                for (int i = 0; i < intUnit1_3Coords.length; i++) {
                    intUnitLocation[i] = intUnit1_3Coords[i];
                }
                break;
            case 3:
                for (int i = 0; i < intUnit2_1Coords.length; i++) {
                    intUnitLocation[i] = intUnit2_1Coords[i];
                }
                break;
            case 4:
                for (int i = 0; i < intUnit2_2Coords.length; i++) {
                    intUnitLocation[i] = intUnit2_2Coords[i];
                }
                break;
            case 5:
                for (int i = 0; i < intUnit2_3Coords.length; i++) {
                    intUnitLocation[i] = intUnit2_3Coords[i];
                }
                break;
            default:
                log("Invalid unit number (findCapturePoint)");
                break;
        }
        boolean booleanCapturePointFound = false;
        for (int i = 0; i < intCapturePointLocations.length; i++) {
            if (intUnitLocation[x] == intCapturePointLocations[i][x]
                    && intUnitLocation[y] == intCapturePointLocations[i][y]) {
                booleanCapturePointFound = true;
                break;
            }
        }
        return booleanCapturePointFound;
    }
    //Unit management methods
    public static void move(int moveDirection) {
        //Calls moveUnit after finding whose turn it is.
        //1 = up, 2 = right, 3 = down, 4 = left
        if (Conquest.booleanIsPlayer1Turn) {
            for (int i = 0; i < Conquest.booleanPlayer1UnitSelected.length; i++) {
                if (Conquest.booleanPlayer1UnitSelected[i]) {
                    moveUnit(i, moveDirection);
                    break;
                }
            }
        }
        else {
            for (int i = 0; i < Conquest.booleanPlayer2UnitSelected.length; i++) {
                if (Conquest.booleanPlayer2UnitSelected[i]) {
                    moveUnit(i + 3, moveDirection);
                    break;
                }
            }
        }
    }
    private static void moveUnit(int unitSelected, int moveDirection) {
        //Sets the new location of the selected unit.
        setGridOccupied(unitSelected, moveDirection, 1);
        switch (unitSelected) {
            case 0:
                lblUnit1_1.setLocation(newLocation(unitSelected));
                break;
            case 1:
                lblUnit1_2.setLocation(newLocation(unitSelected));
                break;
            case 2:
                lblUnit1_3.setLocation(newLocation(unitSelected));
                break;
            case 3:
                lblUnit2_1.setLocation(newLocation(unitSelected));
                break;
            case 4:
                lblUnit2_2.setLocation(newLocation(unitSelected));
                break;
            case 5:
                lblUnit2_3.setLocation(newLocation(unitSelected));
                break;
            default:
                log("Invalid unit selection");
                break;
        }
        
    }
    private static Point newLocation(int unitSelected) {
        /**
         * This method sets the new screen location of the units depending on its set coordinates.
         * Note: This method does not manage the coordinates. It simply reads off of it.
         * The coordinates must be changed prior to calling this method or the unit will 
         * not appear to have moved.
         */
        //1 = up, 2 = right, 3 = down, 4 = left

        int x = 0, y = 1; //Coordinate axes
        Point pointNewLocation = new Point();
        switch (unitSelected) {
            case 0:
                pointNewLocation = pointLocation[intUnit1_1Coords[x]][intUnit1_1Coords[y]];
                break;
            case 1:
                pointNewLocation = pointLocation[intUnit1_2Coords[x]][intUnit1_2Coords[y]];
                break;
            case 2:
                pointNewLocation = pointLocation[intUnit1_3Coords[x]][intUnit1_3Coords[y]];
                break;
            case 3:
                pointNewLocation = pointLocation[intUnit2_1Coords[x]][intUnit2_1Coords[y]];
                break;
            case 4:
                pointNewLocation = pointLocation[intUnit2_2Coords[x]][intUnit2_2Coords[y]];
                break;
            case 5:
                pointNewLocation = pointLocation[intUnit2_3Coords[x]][intUnit2_3Coords[y]];
                break;
                
        }
        return pointNewLocation;
    }
    public static void disableUnitGridOccupied(int unitNumber) {
        /**
         * Set a killed unit's previously occupied space to false. 
         * This must be called once only when the unit has been killed to prevent
         * setting a grid occupied status to false when a later unit occupies it.
         */ 
        int x = 0, y = 1; //Coordinate axes
        switch (unitNumber) {
            case 0:
                booleanGridOccupied[intUnit1_1Coords[x]][intUnit1_1Coords[y]] = false;
                break;
            case 1:
                booleanGridOccupied[intUnit1_2Coords[x]][intUnit1_2Coords[y]] = false;
                break;
            case 2:
                booleanGridOccupied[intUnit1_3Coords[x]][intUnit1_3Coords[y]] = false;                
                break;
            case 3:
                booleanGridOccupied[intUnit2_1Coords[x]][intUnit2_1Coords[y]] = false;                
                break;
            case 4:
                booleanGridOccupied[intUnit2_2Coords[x]][intUnit2_2Coords[y]] = false;
                break;
            case 5:
                booleanGridOccupied[intUnit2_3Coords[x]][intUnit2_3Coords[y]] = false;                
                break;
        }
    }
    public static void disableUnit(int unitNumber) { //Remove a unit from the battlefield, then set its proviously occupied space to false;
        switch (unitNumber) {
            case 0:
                lblUnit1_1.setVisible(false);
                break;
            case 1:           
                lblUnit1_2.setVisible(false);
                break;
            case 2:
                lblUnit1_3.setVisible(false);
                break;
            case 3:
                lblUnit2_1.setVisible(false);
                break;
            case 4:
                lblUnit2_2.setVisible(false);
                break;
            case 5:
                lblUnit2_3.setVisible(false);
                break;
            default:
                log("Invalid unit number (disableUnit)");
                break;
        }
    }
    
    //General purpose methods
    private static void log(String message) {
        System.out.println(message);
    }
    private static void msgBox(String message, String title, String messageType) { //Method to make sending of message dialog boxes to the user easier to do.
        if (messageType == null) { //If programmer is uninterested in looking up dialog box types, just use null.
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
        }
        else {
            messageType = messageType.toLowerCase(); //Ensures strings with capitalised letters do not get misinterpreted.
            switch (messageType) { //Use of simple keywords in order to make dialog box creation easier and less tedious.
                case "info": //Information message dialog box
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "warning": //Warning message dialog box
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
                    break;
                case "error": //Error message dialog box
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
                    break;
                case "plain": //Plain message dialog box
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
                    break;
                default: //If messageType is not any of the above, default to plain message.
                    log("messageType string value: " + messageType + " could not be recognised. Defaulting to plain message."); //Inform programmer of this.
                    JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        }
    }
    boolean dialogBoxOpened = false;
    private void closeButtonPressed() {
        if (!dialogBoxOpened) { //Due to limitations in Java, dialog boxes in daughter windows will duplicate. This is used to prevent that from happening.
            dialogBoxOpened = true;
            JOptionPane.showMessageDialog(this, "If you would like to exit the game, "
                    + "please use the close button (X button) on the control window instead.", "Cannot Exit", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            dialogBoxOpened = false;
        }
    }
    //Auto-generated code below.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMap;
    private static javax.swing.JLabel lblUnit1_1;
    private static javax.swing.JLabel lblUnit1_2;
    private static javax.swing.JLabel lblUnit1_3;
    private static javax.swing.JLabel lblUnit2_1;
    private static javax.swing.JLabel lblUnit2_2;
    private static javax.swing.JLabel lblUnit2_3;
    private javax.swing.JPanel panelMap;
    private javax.swing.JPanel panelUnits;
    // End of variables declaration//GEN-END:variables
}
