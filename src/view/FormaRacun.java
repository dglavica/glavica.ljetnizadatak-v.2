/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Pomocno.HibernateUtil;
import controller.Obrada;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Racun;

/**
 *
 * @author Avalg
 */
public class FormaRacun extends Forma<Racun> {

    private List<Racun> rezultati;

    /**
     * Creates new form FormaTvrtka
     */
    public FormaRacun() {
        initComponents();
        obrada = new Obrada();

        ucitaj();
    }

    @Override
    protected void ucitaj() {

        rezultati = HibernateUtil.getSession().createQuery("from Racun a where a.obrisan=false").list();
        ucitavanje();
    }

    private void ucitavanje() {
        DefaultListModel<Racun> r = new DefaultListModel<>();
        lstRacuni.setModel(r);
        rezultati.forEach((s) -> {
            r.addElement(s);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstRacuni = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNacinPlacanja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPdv = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstRacuni.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRacuniValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRacuni);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Racuni");

        jLabel2.setText("Način plaćanja");

        jLabel3.setText("PDV");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(39, 39, 39)
                        .addComponent(btnPromjeni)
                        .addGap(37, 37, 37)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtNacinPlacanja, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtPdv))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNacinPlacanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObrisi))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstRacuniValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRacuniValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        try {
            this.entitet = lstRacuni.getSelectedValue();
            txtNacinPlacanja.setText(lstRacuni.getSelectedValue().getNacinPlacanja());
            txtPdv.setText(lstRacuni.getSelectedValue().getPdv().toString());

        } catch (Exception e) {

        }
    }//GEN-LAST:event_lstRacuniValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new Racun();
        spremi();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (lstRacuni.getSelectedValue() == null) {
        }
        JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        spremi();
    }//GEN-LAST:event_btnPromjeniActionPerformed
    @Override
    protected void spremi() {
        entitet.setNacinPlacanja(txtNacinPlacanja.getText());
        entitet.setPdv(new BigDecimal(txtPdv.getText()));
      
        super.spremi();
    }
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (lstRacuni.getSelectedValue() == null) {
        }
        JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        obrisi();
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Racun> lstRacuni;
    private javax.swing.JTextField txtNacinPlacanja;
    private javax.swing.JTextField txtPdv;
    // End of variables declaration//GEN-END:variables
}
