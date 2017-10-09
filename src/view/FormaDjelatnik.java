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
import javax.swing.DefaultComboBoxModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import model.BenzinskaCrpka;
import model.Djelatnik;
import org.hibernate.Session;

/**
 *
 * @author Avalg
 */
public class FormaDjelatnik extends Forma<Djelatnik> {

    public List<Djelatnik> rezultati;

    public List<Djelatnik> getRezultati() {
        return rezultati;
    }

    /**
     * Creates new form FormaDjelatnik
     */
    public FormaDjelatnik() {
        initComponents();
        obrada = new Obrada();
        ucitajBenzinskaCrpka();
        ucitaj();

    }

    @Override
    protected void ucitaj() {

        Session session = HibernateUtil.getSession();
        session.clear();
        rezultati = HibernateUtil.getSession().createQuery("from Djelatnik a where a.obrisan=false and nadredjeni is null").list();
        ucitavanje();
        repaint();

    }
    private DefaultTreeModel modelStabla;
    private boolean ucitavam;

    private void ucitavanje() {
        ucitavam = true;
        modelStabla = (DefaultTreeModel) stablo.getModel();

        modelStabla.setRoot(null);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode();

        root.setUserObject("Djelatnici");

        DefaultMutableTreeNode node;
        for (Djelatnik djelatnik : rezultati) {
            node = new DefaultMutableTreeNode(djelatnik);
            root.add(node);
            ucitajStablo(node, djelatnik);
            //System.out.println("root: " + predavac.getPrezime());
        }
        modelStabla.setRoot(root);

        stablo.expandPath(new TreePath(root.getPath()));
        ucitavam = false;

    }

    private void ucitajStablo(DefaultMutableTreeNode node, Djelatnik djelatnik) {
        if (djelatnik.getPodredjeni() == null) {
            return;
        }
        DefaultMutableTreeNode podredjeniNode;

        for (Djelatnik podredjeniDjelatnik : djelatnik.getPodredjeni()) {
            podredjeniNode = new DefaultMutableTreeNode(podredjeniDjelatnik);
            node.add(podredjeniNode);
            ucitajStablo(podredjeniNode, podredjeniDjelatnik);
        }
    }

    @Override
    protected void spremi() {
        entitet.setIme(txtIme.getText());
        entitet.setPrezime(txtPrezime.getText());
        entitet.setOib(txtOib.getText());
        entitet.setIban(txtIban.getText());
        entitet.setEmail(txtEmail.getText());
        entitet.setPlaca(new BigDecimal(txtPlaca.getText()));
        Djelatnik d = (Djelatnik) cmbNadredjeni.getSelectedItem();
        entitet.setBenzinskaCrpka(cmbBenzinskaCrpka.getItemAt(cmbBenzinskaCrpka.getSelectedIndex()));
        entitet.setNadredjeni(d.getSifra().equals(new Long(0)) ? null : d);
        repaint();
        super.spremi();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtIban = new javax.swing.JTextField();
        txtOib = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        stablo = new javax.swing.JTree();
        cmbNadredjeni = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbBenzinskaCrpka = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Popis djelatnika");

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

        jLabel2.setText("Ime");

        jLabel3.setText("Prezime");

        jLabel4.setText("OIB");

        jLabel5.setText("IBAN");

        jLabel6.setText("Email");

        jLabel7.setText("Plaća");

        stablo.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                stabloValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(stablo);

        cmbNadredjeni.setToolTipText("");

        jLabel8.setText("Nadredjeni");

        cmbBenzinskaCrpka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBenzinskaCrpkaActionPerformed(evt);
            }
        });

        jLabel9.setText("Benzinska crpka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnDodaj)
                .addGap(39, 39, 39)
                .addComponent(btnPromjeni)
                .addGap(37, 37, 37)
                .addComponent(btnObrisi)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(cmbBenzinskaCrpka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNadredjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(64, 64, 64))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel1)
                    .addGap(105, 105, 105)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIme)
                        .addComponent(txtPrezime)
                        .addComponent(txtOib)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail)
                        .addComponent(txtIban))
                    .addGap(72, 72, 72)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbNadredjeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBenzinskaCrpka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObrisi))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(txtIban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new Djelatnik();
        spremi();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed

        spremi();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        obrisi();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void stabloValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_stabloValueChanged
        if (ucitavam) {
            return;
        }

        DefaultMutableTreeNode node
                = (DefaultMutableTreeNode) stablo.getLastSelectedPathComponent();

        if (node.getUserObject().getClass() != new Djelatnik().getClass()) {
            return;
        }

        this.entitet = (Djelatnik) node.getUserObject();
        this.txtIme.setText(entitet.getIme());
        this.txtPrezime.setText(entitet.getPrezime());
        this.txtOib.setText(entitet.getOib());
        this.txtIban.setText(entitet.getIban());
        this.txtEmail.setText(entitet.getEmail());
        this.txtPlaca.setText(entitet.getPlaca().toString());

        DefaultComboBoxModel<Djelatnik> d = new DefaultComboBoxModel<>();
        cmbNadredjeni.setModel(d);
        // if (entitet.getNadredeni() != null) {
        Djelatnik root = new Djelatnik();
        root.setIme("Root");
        root.setPrezime("");
        root.setSifra(new Long(0));
        d.addElement(root);

        // }
        List<Djelatnik> nadredjeni = HibernateUtil.getSession().
                createQuery("from Djelatnik a where "
                        + "a.obrisan=false and a.sifra!=:sifra ")
                .setLong("sifra", entitet.getSifra()).list();

        nadredjeni.stream().map((dj) -> {
            d.addElement(dj);
            return dj;
        }).filter((dj) -> (entitet.getNadredjeni() != null && entitet.getNadredjeni().getSifra().equals(dj.getSifra()))).forEachOrdered((_item) -> {
            cmbNadredjeni.setSelectedItem(d);
        });
        repaint();
    }//GEN-LAST:event_stabloValueChanged

    private void cmbBenzinskaCrpkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBenzinskaCrpkaActionPerformed

    }//GEN-LAST:event_cmbBenzinskaCrpkaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<BenzinskaCrpka> cmbBenzinskaCrpka;
    private javax.swing.JComboBox<Djelatnik> cmbNadredjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree stablo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIban;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void ucitajBenzinskaCrpka() {
        DefaultComboBoxModel<BenzinskaCrpka> bc = new DefaultComboBoxModel<>();
        cmbBenzinskaCrpka.setModel(bc);
        List<BenzinskaCrpka> crpka = HibernateUtil.getSession().
                createQuery("from BenzinskaCrpka a where "
                        + "a.obrisan=false  ").list();

        for (BenzinskaCrpka b : crpka) {

            bc.addElement(b);
            cmbBenzinskaCrpka.setSelectedItem(b);

        }
    }

}
