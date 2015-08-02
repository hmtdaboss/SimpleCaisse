/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import factory.Factory;
import Utile.MethodeUtile;
import java.awt.Color;
import javax.swing.JOptionPane;
import transferObject.Vente;

/**
 *
 * @author Himmat
 */
public class JDialogRemise extends javax.swing.JDialog {

    /**
     * Creates new form JDialogRemise
     */
    private double remisePourc = 0;
    private double remiseEuro = 0;
    private double remiseArticle = 0;
    private double newPrix = 0;
    private Vente vente = null;

    private final MethodeUtile methodeUtil = Factory.getMethodeUtile();

    public JDialogRemise(java.awt.Frame parent, String titre) {
        super(parent, titre, true);
        initComponents();
        KeyPad pad = new KeyPad();
        
        methodeUtil.updatePanel(jPanelNumPad, pad);
        methodeUtil.getFormatField(jFormattedTextFieldRemise, "##");
        

        setLocation(parent.getX() + parent.getWidth() / 3, parent.getY() + parent.getHeight() / 3);
        setVisible(true);
    }

    public JDialogRemise(java.awt.Frame parent, String titre, Vente vente) {
        super(parent, titre, true);
        initComponents();
        KeyPad pad = new KeyPad();
        methodeUtil.updatePanel(jPanelNumPad, pad);
        methodeUtil.getFormatField(jFormattedTextFieldRemise, "##");
       
        this.vente = vente;
        setLocation(parent.getX() + parent.getWidth() / 3, parent.getY() + parent.getHeight() / 3);
        setVisible(true);
    }

    public double getRemiseArticle() {
        return remiseArticle;
    }

    public void setRemiseArticle(double remiseArticle) {
        this.remiseArticle = remiseArticle;
    }

    public double getRemisePourc() {
        return remisePourc;
    }

    public Vente getVente() {
        return vente;
    }

    public double getNewPrix() {
        return newPrix;
    }

    public void setNewPrix(double newPrix) {
        this.newPrix = newPrix;
    }

    public void setRemisePourc(double remisePourc) {
        this.remisePourc = remisePourc;
    }

    public double getRemiseEuro() {
        return remiseEuro;
    }

    public void setRemiseEuro(double remiseEuro) {
        this.remiseEuro = remiseEuro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanelNumPad = new javax.swing.JPanel();
        jFormattedTextFieldRemise = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(175, 210, 245));

        jPanelNumPad.setBackground(new java.awt.Color(175, 210, 245));
        jPanelNumPad.setPreferredSize(new java.awt.Dimension(255, 220));
        jPanelNumPad.setLayout(new java.awt.CardLayout());

        jFormattedTextFieldRemise.setBackground(new java.awt.Color(102, 153, 204));
        jFormattedTextFieldRemise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 153, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.png"))); // NOI18N
        jButton1.setText("OK");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Pourcentage :");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remiseGen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(2, 2, 2)
                            .addComponent(jFormattedTextFieldRemise, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNumPad, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldRemise, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanelNumPad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            double valEuro = 0.0;
            double valPourcentage = Double.valueOf(jFormattedTextFieldRemise.getText()) / 100;
            if (this.vente == null) {
                setRemisePourc(valPourcentage);
                setRemiseEuro(valEuro);
                this.dispose();
            } else {
                double totalPourc = ((valEuro / this.vente.getPrixTotal()) + valPourcentage) * 100;
                double prixAvecRem = this.vente.getPrixTotal() - (this.vente.getPrixTotal()
                        * ((valEuro / this.vente.getPrixTotal()) + valPourcentage));
                setRemiseArticle(totalPourc);
                this.setNewPrix(prixAvecRem);

                this.dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valeur de remise invalide !");
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextFieldRemise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelNumPad;
    // End of variables declaration//GEN-END:variables
}