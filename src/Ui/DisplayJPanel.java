/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;



import model.Product;



/**
 *
 * @author Parth Gurjar
 */
public final class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    Product product;
    private String filename;
    public DisplayJPanel(Product product) {
        this.product = product;
        initComponents();
        
        displayProduct();
    }

//    public DisplayJPanel(Product Product) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
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
        jTextd2s = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jTextd2e = new javax.swing.JTextField();
        jTextd2 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(661, 496));
        setPreferredSize(new java.awt.Dimension(811, 528));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Display a user profile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 54, 268, -1));

        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 127, -1, -1));

        jTextfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfnActionPerformed(evt);
            }
        });
        add(jTextfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 124, 118, -1));

        jLabel40.setText("Last Name");
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 127, -1, -1));
        add(jTextln, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 124, 118, -1));
        add(jTextdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 158, 118, -1));

        jLabel41.setText("DOB");
        add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 161, -1, -1));

        jLabel42.setText("Age");
        add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 161, -1, -1));

        jTextage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextageActionPerformed(evt);
            }
        });
        add(jTextage, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 158, 118, -1));

        jLabel43.setText("Telephone Number");
        add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 195, -1, -1));

        jTexttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttnActionPerformed(evt);
            }
        });
        add(jTexttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 192, 118, -1));

        jLabel44.setText("Email");
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 195, -1, -1));

        jTextem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextemActionPerformed(evt);
            }
        });
        add(jTextem, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 192, 118, -1));

        jLabel45.setText("Street Line 1");
        add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 229, -1, -1));

        jTexts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexts1ActionPerformed(evt);
            }
        });
        add(jTexts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 226, 118, -1));

        jTexts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexts2ActionPerformed(evt);
            }
        });
        add(jTexts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 226, 118, -1));

        jLabel46.setText("Street Line 2");
        add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 229, -1, -1));

        jLabel47.setText("City");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 263, -1, -1));
        add(jTextci, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 260, 118, -1));

        jLabel48.setText("Country");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 263, -1, -1));
        add(jTextco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 118, -1));

        jTextaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextafActionPerformed(evt);
            }
        });
        add(jTextaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 294, 118, -1));

        jLabel49.setText("Affiliation");
        add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 297, -1, -1));

        jLabel50.setText("Major");
        add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 297, -1, -1));
        add(jTextma, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 294, 118, -1));

        jLabel51.setText("Career");
        add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 331, -1, -1));
        add(jTextca, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 328, 118, -1));

        jTextd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextd1ActionPerformed(evt);
            }
        });
        add(jTextd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 328, 118, -1));

        jLabel52.setText("Degree 1");
        add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 331, -1, -1));

        jLabel55.setText("Degree 1 Start");
        add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 365, -1, -1));
        add(jTextd1s, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 362, 118, -1));
        add(jTextd1e, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 362, 118, -1));

        jLabel56.setText("Degree 1 End");
        add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 365, -1, -1));

        jLabel57.setText("Degree 2");
        add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 399, -1, -1));
        add(jTextd2s, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 396, 118, -1));

        jLabel58.setText("Degree 2 Start");
        add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 399, -1, -1));

        jLabel59.setText("Degree 2 End");
        add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 433, -1, -1));
        add(jTextd2e, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 430, 118, -1));
        add(jTextd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 396, 118, -1));

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(208, 212));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(208, 212));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 230, 200));

        jButton2.setText("Saved");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));

        jLabel60.setText("Photo");
        add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 40, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextemActionPerformed

    private void jTexttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttnActionPerformed

    private void jTextfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextfnActionPerformed

    private void jTexts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexts1ActionPerformed

    private void jTextd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextd1ActionPerformed

    private void jTexts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexts2ActionPerformed

    private void jTextageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextageActionPerformed

    private void jTextafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextafActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton2ActionPerformed

    public void displayProduct(){
        
        jTextfn.setText(product.getFirstname());
        jTextln.setText(product.getLastname());
        jTextdob.setText(product.getDOB());
        jTextage.setText(product.getAge());
        jTexttn.setText(product.getTelephonenumber());
        jTextem.setText(product.getEmail());
        jTexts1.setText(product.getStreetLine1());
        jTexts2.setText(product.getStreetLine2());
        jTextci.setText(product.getCity());
        jTextco.setText(product.getCountry());
        jTextaf.setText(product.getAffiliation());
        jTextma.setText(product.getMajor());
        jTextca.setText(product.getCareer());
        jTextd1.setText(product.getDegree1());
        jTextd1s.setText(product.getDegree1Start());
        jTextd1e.setText(product.getDegree1End());
        jTextd2s.setText(product.getDegree2());
        jTextd2s.setText(product.getDegree2Start());
        jTextd2e.setText(product.getDegree1End());
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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

  
}
  class jTextph {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public jTextph() {
        }
    }
