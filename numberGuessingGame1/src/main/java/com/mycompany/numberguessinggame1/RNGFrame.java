/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.numberguessinggame1;

import javax.swing.JOptionPane;

/**
 *
 * @author Sepiroth X
 * Description: Guessing Game for Java Beginners. A number will be generated randomly from 1~100
 * and the user has to guess which number it is.
 */
public class RNGFrame extends javax.swing.JFrame {

    /**
     * Creates new form RNGFrame
     */
    public RNGFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(350,450);
        setResizable(false);
        restartButton.setEnabled(false);
    }
    
    //declare variables to be used
    int RNG, attempts = 0;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        guessButton = new javax.swing.JButton();
        inputTF = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        rngDisplayLabel = new javax.swing.JLabel();
        indicatorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        attemptCounter = new javax.swing.JLabel();
        restartButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guessButton.setText("GUESS");
        guessButton.setEnabled(false);
        guessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButtonActionPerformed(evt);
            }
        });

        inputTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTF.setEnabled(false);

        generateButton.setText("GENERATE");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        rngDisplayLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rngDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rngDisplayLabel.setText("-----------------");
        rngDisplayLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        indicatorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indicatorLabel.setText("-----------------");

        jLabel1.setText("Attempt:");

        attemptCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attemptCounter.setText("-----");

        restartButton.setText("RESTART");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Randomly Generated Number: 1 ~ 100");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(indicatorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rngDisplayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(attemptCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(generateButton)
                .addGap(18, 18, 18)
                .addComponent(rngDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(attemptCounter))
                .addGap(18, 18, 18)
                .addComponent(indicatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guessButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restartButton)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        
        indicatorLabel.setText("NUMBER GENERATED! GUESS between 1~100!");
        rngDisplayLabel.setText("?");
        
         RNG = (int) (Math.random() * 100 + 1);
         
         
         //set attempts to zero
         attemptCounter.setText(Integer.toString(attempts));
        
         //set GENERATE button disabled
         generateButton.setEnabled(false);
         
         //enable guess button and input text field
         
         inputTF.setEnabled(true);
         guessButton.setEnabled(true);
        
        
        
        
    }//GEN-LAST:event_generateButtonActionPerformed

    private void guessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButtonActionPerformed
        // TODO add your handling code here:
        
        String enteredData = inputTF.getText();
        
        if(enteredData.matches("[0-9]+")) {
            //increase attempts
            attempts++;
            attemptCounter.setText(Integer.toString(attempts));
            int convertedInput = Integer.parseInt(enteredData);
            
             if (convertedInput > RNG) {
                 
                 indicatorLabel.setText("Entered number is HIGHER than RNG!");
                 
             } else if (convertedInput < RNG) {
                 
                 indicatorLabel.setText("Entered number is LOWER than RNG!");
                 
             } else {
                 
                 indicatorLabel.setText("You guessed it RIGHT! CONGRATULATIONS");
                 rngDisplayLabel.setText(Integer.toString(RNG));
                 JOptionPane.showMessageDialog(null, "YOU WON! CONGRATS!");
                 inputTF.setEnabled(false);
                 guessButton.setEnabled(false);
                 restartButton.setEnabled(true);
                 
             }
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Enter NUMBERS ONLY!");
        }
        
        
        
    }//GEN-LAST:event_guessButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Game Restarted!");
        generateButton.setEnabled(true);
        restartButton.setEnabled(false);
        rngDisplayLabel.setText("-----------------");
        attemptCounter.setText("0");
        RNG = 0;
        attempts = 0;
         
        
    }//GEN-LAST:event_restartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RNGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RNGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RNGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RNGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RNGFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attemptCounter;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton guessButton;
    private javax.swing.JLabel indicatorLabel;
    private javax.swing.JTextField inputTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel rngDisplayLabel;
    // End of variables declaration//GEN-END:variables
}