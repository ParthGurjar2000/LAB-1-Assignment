/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;


import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;  
import model.Product;

/**
 *
 * @author Parth Gurjar
 */
    public class CreateJPanel extends javax.swing.JPanel {
        
    /**
     * Creates new form CreateJPanel
     */
    
    Product product;

    /**
     *
     * @param product
     */
    public CreateJPanel(Product product) {
        this.product = product;
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
        jLabel2 = new javax.swing.JLabel();
        jTextfn = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextln = new javax.swing.JTextField();
        jTextdob = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextage = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTexttn = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextem = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTexts1 = new javax.swing.JTextField();
        jTexts2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextci = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextco = new javax.swing.JTextField();
        jTextaf = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextma = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextca = new javax.swing.JTextField();
        jTextd1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextd1s = new javax.swing.JTextField();
        jTextd1e = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jTextd2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextd2e = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextd2s = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create a user profile");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 290, 50));

        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 107, -1, -1));

        jTextfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfnActionPerformed(evt);
            }
        });
        jPanel1.add(jTextfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 104, 118, -1));

        jLabel40.setText("Last Name");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 107, -1, -1));
        jPanel1.add(jTextln, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 104, 118, -1));
        jPanel1.add(jTextdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 138, 118, -1));

        jLabel41.setText("DOB");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 141, -1, -1));

        jLabel42.setText("Age");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));
        jPanel1.add(jTextage, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 118, -1));

        jLabel43.setText("Telephone Number");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 175, -1, -1));

        jTexttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttnActionPerformed(evt);
            }
        });
        jPanel1.add(jTexttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 172, 118, -1));

        jLabel44.setText("Email");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 181, -1, -1));

        jTextem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextemActionPerformed(evt);
            }
        });
        jPanel1.add(jTextem, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 178, 118, -1));

        jLabel45.setText("Street Line 1");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 209, -1, -1));

        jTexts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexts1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTexts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 206, 118, -1));

        jTexts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexts2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTexts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 209, 118, -1));

        jLabel46.setText("Street Line 2");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 212, -1, -1));

        jLabel47.setText("City");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 246, -1, -1));
        jPanel1.add(jTextci, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 243, 118, -1));

        jLabel48.setText("Country");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 246, -1, -1));
        jPanel1.add(jTextco, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 243, 118, -1));
        jPanel1.add(jTextaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 277, 118, -1));

        jLabel49.setText("Affiliation");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 280, -1, -1));

        jLabel50.setText("Major");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 280, -1, -1));
        jPanel1.add(jTextma, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 277, 118, -1));

        jLabel51.setText("Career");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 314, -1, -1));
        jPanel1.add(jTextca, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 311, 118, -1));

        jTextd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextd1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 311, 118, -1));

        jLabel52.setText("Degree 1");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 314, -1, -1));

        jLabel55.setText("Degree 1 Start");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 348, -1, -1));
        jPanel1.add(jTextd1s, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 345, 118, -1));
        jPanel1.add(jTextd1e, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 345, 118, -1));

        jLabel56.setText("Degree 1 End");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 348, -1, -1));

        jLabel57.setText("Degree 2");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 382, -1, -1));
        jPanel1.add(jTextd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 379, 118, -1));

        jLabel58.setText("Degree 2 Start");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 382, -1, -1));

        jTextd2e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextd2eActionPerformed(evt);
            }
        });
        jPanel1.add(jTextd2e, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 413, 118, -1));

        jLabel59.setText("Degree 2 End");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 416, -1, -1));

        jLabel60.setText("Photo");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 40, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 97, -1));
        jPanel1.add(jTextd2s, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 379, 118, -1));

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(208, 212));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(208, 212));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, 200));

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        product.setFirstname(jTextfn.getText());
        product.setLastname(jTextln.getText());
        product.setDOB(jTextdob.getText());
        product.setAge(jTextage.getText());
        product.setTelephonenumber(jTexttn.getText());
        product.setEmail(jTextem.getText());
        product.setStreetLine1(jTexts1.getText());
        product.setStreetLine2(jTexts2.getText());
        product.setCity(jTextci.getText());
        product.setCountry(jTextco.getText());
        product.setAffiliation(jTextaf.getText());
        product.setMajor(jTextma.getText());
        product.setCareer(jTextca.getText());
        product.setDegree1(jTextd1.getText());
        product.setDegree1Start(jTextd1s.getText());
        product.setDegree1End(jTextd1e.getText());
        product.setDegree2(jTextd2.getText());
        product.setDegree2Start(jTextd2s.getText());
        product.setDegree2End(jTextd2e.getText());
        

        JOptionPane.showMessageDialog(this,"Information is saved");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextd1ActionPerformed

    private void jTexts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexts2ActionPerformed

    private void jTexts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexts1ActionPerformed

    private void jTextemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextemActionPerformed

    private void jTexttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttnActionPerformed

    private void jTextfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextfnActionPerformed

    private void jTextd2eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextd2eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextd2eActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // TODO add your handling code here:
      JFileChooser chooser=new JFileChooser();
      chooser.showOpenDialog(null);
      File f=chooser.getSelectedFile();
      jLabel3.setIcon(new ImageIcon(f.toString()));
      filename=f.getAbsolutePath();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextaf;
    private javax.swing.JTextField jTextage;
    private javax.swing.JTextField jTextca;
    private javax.swing.JTextField jTextci;
    private javax.swing.JTextField jTextco;
    private javax.swing.JTextField jTextd1;
    private javax.swing.JTextField jTextd1e;
    private javax.swing.JTextField jTextd1s;
    private javax.swing.JTextField jTextd2;
    private javax.swing.JTextField jTextd2e;
    private javax.swing.JTextField jTextd2s;
    private javax.swing.JTextField jTextdob;
    private javax.swing.JTextField jTextem;
    private javax.swing.JTextField jTextfn;
    private javax.swing.JTextField jTextln;
    private javax.swing.JTextField jTextma;
    private javax.swing.JTextField jTexts1;
    private javax.swing.JTextField jTexts2;
    private javax.swing.JTextField jTexttn;
    // End of variables declaration//GEN-END:variables

    private static class jTextph {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jTextph() {
        }
    }
byte [] photo=null;
String filename=null;    
}
