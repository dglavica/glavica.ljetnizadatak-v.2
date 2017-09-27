/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Avalg
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
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

        btnBenzinskeCrpke = new javax.swing.JButton();
        btnTvrtke = new javax.swing.JButton();
        btnGoriva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblGitHub = new javax.swing.JLabel();
        btnDjelatnici = new javax.swing.JButton();
        btnNarudzbaCisterne = new javax.swing.JButton();
        btnTocenje = new javax.swing.JButton();
        btnRacuni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBenzinskeCrpke.setText("Benzinske crpke");
        btnBenzinskeCrpke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBenzinskeCrpkeActionPerformed(evt);
            }
        });

        btnTvrtke.setText("Tvrtke");
        btnTvrtke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTvrtkeActionPerformed(evt);
            }
        });

        btnGoriva.setText("Goriva");
        btnGoriva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGorivaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/benzinska_crpka novi era dijagram.png"))); // NOI18N

        lblGitHub.setText("Github");
        lblGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitHubMouseClicked(evt);
            }
        });

        btnDjelatnici.setText("Djelatnici");
        btnDjelatnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDjelatniciActionPerformed(evt);
            }
        });

        btnNarudzbaCisterne.setText("Narudžba Cisterne");
        btnNarudzbaCisterne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNarudzbaCisterneActionPerformed(evt);
            }
        });

        btnTocenje.setText("Tocenje");
        btnTocenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTocenjeActionPerformed(evt);
            }
        });

        btnRacuni.setText("Računi");
        btnRacuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRacuniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGoriva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBenzinskeCrpke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTvrtke, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDjelatnici, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTocenje, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNarudzbaCisterne, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnRacuni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBenzinskeCrpke)
                    .addComponent(btnTvrtke)
                    .addComponent(btnNarudzbaCisterne)
                    .addComponent(btnRacuni))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDjelatnici)
                    .addComponent(btnGoriva)
                    .addComponent(btnTocenje))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(lblGitHub)
                        .addGap(285, 285, 285))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBenzinskeCrpkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBenzinskeCrpkeActionPerformed
        new FormaBenzinskaCrpka().setVisible(true);
       

    }//GEN-LAST:event_btnBenzinskeCrpkeActionPerformed

    private void btnTvrtkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTvrtkeActionPerformed
        new FormaTvrtka().setVisible(true);
    }//GEN-LAST:event_btnTvrtkeActionPerformed

    private void btnGorivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGorivaActionPerformed
        new FormaGorivo().setVisible(true);
    }//GEN-LAST:event_btnGorivaActionPerformed

    private void lblGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseClicked
        try {
            Runtime.getRuntime().exec("cmd /c start https://github.com/dglavica ");
        } catch (IOException ex) {
            Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_lblGitHubMouseClicked

    private void btnDjelatniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDjelatniciActionPerformed
        new FormaDjelatnik().setVisible(true);
    }//GEN-LAST:event_btnDjelatniciActionPerformed

    private void btnNarudzbaCisterneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNarudzbaCisterneActionPerformed
       new FormaNarudzbaCisterne().setVisible(true);
    }//GEN-LAST:event_btnNarudzbaCisterneActionPerformed

    private void btnTocenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTocenjeActionPerformed
        new FormaTocenje().setVisible(true);
    }//GEN-LAST:event_btnTocenjeActionPerformed

    private void btnRacuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRacuniActionPerformed
        new FormaRacun().setVisible(true);
    }//GEN-LAST:event_btnRacuniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBenzinskeCrpke;
    private javax.swing.JButton btnDjelatnici;
    private javax.swing.JButton btnGoriva;
    private javax.swing.JButton btnNarudzbaCisterne;
    private javax.swing.JButton btnRacuni;
    private javax.swing.JButton btnTocenje;
    private javax.swing.JButton btnTvrtke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblGitHub;
    // End of variables declaration//GEN-END:variables
}
