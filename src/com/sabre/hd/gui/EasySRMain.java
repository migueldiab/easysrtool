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
import com.sabre.hd.easysr.forms.EdssrtServiceRequest;


/**
 *
 * @author SG0894180
 */
public class EasySRMain extends javax.swing.JFrame {

    /** Creates new form main */
    public EasySRMain() {
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
    btnNewSRTemplate = new javax.swing.JButton();
    btnNewCRTemplate = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    btnNewCRTemplate1 = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();
    jMenu3 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenuItem2 = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Paperwork Writer");

    jLabel1.setFont(new java.awt.Font("Verdana", 2, 18));
    jLabel1.setText("Welcome to the Paperwork Writer");

    btnNewSRTemplate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    btnNewSRTemplate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sabre/hd/resources/images/2.png"))); // NOI18N
    btnNewSRTemplate.setText("New SR Template");
    btnNewSRTemplate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewSRTemplateActionPerformed(evt);
      }
    });

    btnNewCRTemplate.setFont(new java.awt.Font("Verdana", 0, 14));
    btnNewCRTemplate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sabre/hd/resources/images/22.png"))); // NOI18N
    btnNewCRTemplate.setText("New CR Template");
    btnNewCRTemplate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewCRTemplateActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sabre/hd/resources/images/49.png"))); // NOI18N
    jLabel3.setText("Secure");

    jLabel4.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sabre/hd/resources/images/12.png"))); // NOI18N
    jLabel4.setText("Fast");

    jLabel5.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sabre/hd/resources/images/13.png"))); // NOI18N
    jLabel5.setText("Reliable");

    btnNewCRTemplate1.setFont(new java.awt.Font("Verdana", 0, 14));
    btnNewCRTemplate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sabre/hd/resources/images/87.png"))); // NOI18N
    btnNewCRTemplate1.setText("Your Automation Could Be Here!");
    btnNewCRTemplate1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNewCRTemplate1ActionPerformed(evt);
      }
    });

    jMenu1.setText("File");
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    jMenu3.setText("Templates");

    jMenuItem1.setText("Service Request");
    jMenu3.add(jMenuItem1);

    jMenuItem2.setText("Change Request");
    jMenu3.add(jMenuItem2);

    jMenuBar1.add(jMenu3);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(btnNewCRTemplate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNewCRTemplate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNewSRTemplate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jLabel1))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGap(70, 70, 70)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(30, 30, 30)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(111, 111, 111))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnNewSRTemplate)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnNewCRTemplate))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel3)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnNewCRTemplate1)
          .addComponent(jLabel5))
        .addContainerGap(20, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btnNewSRTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSRTemplateActionPerformed
      Facade.newSRTemplate();
    }//GEN-LAST:event_btnNewSRTemplateActionPerformed

    private void btnNewCRTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCRTemplateActionPerformed
      Facade.newCRTemplate();
    }//GEN-LAST:event_btnNewCRTemplateActionPerformed

    private void btnNewCRTemplate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCRTemplate1ActionPerformed
      Facade.newWorkflow();
    }//GEN-LAST:event_btnNewCRTemplate1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasySRMain().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnNewCRTemplate;
  private javax.swing.JButton btnNewCRTemplate1;
  private javax.swing.JButton btnNewSRTemplate;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JMenuItem jMenuItem2;
  // End of variables declaration//GEN-END:variables

}
