/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * main.java
 *
 * Created on 23/09/2009, 09:07:14 AM
 */

package com.sabre.hd.gui;

import com.sabre.hd.easysr.Facade;
import com.sabre.hd.easysr.forms.EcpmNewChange;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SG0894180
 */
public class Main extends javax.swing.JFrame {

    /** Creates new form main */
    public Main() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnCreateMySR = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Welcome to the Easy SR Tool");

    btnCreateMySR.setText("Create My SR!");
    btnCreateMySR.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCreateMySRActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addContainerGap(250, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(285, Short.MAX_VALUE)
        .addComponent(btnCreateMySR)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
        .addComponent(btnCreateMySR)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnCreateMySRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMySRActionPerformed
      Facade.createMySR();
    }//GEN-LAST:event_btnCreateMySRActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCreateMySR;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables

}
