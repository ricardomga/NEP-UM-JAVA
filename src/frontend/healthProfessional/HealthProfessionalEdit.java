/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.HealthProfessional;

/**
 *
 * @author jorge
 */
public class HealthProfessionalEdit extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public HealthProfessionalEdit(HealthProfessional hp) {
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

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelHealthProfessionalEdit = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelNationality = new javax.swing.JLabel();
        jLabelAdress = new javax.swing.JLabel();
        jLabelNUtente = new javax.swing.JLabel();
        jLabelNIF = new javax.swing.JLabel();
        jLabelMaritalStatus = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jLabelBloodType = new javax.swing.JLabel();
        jLabelInstitution = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jComboBoxGender = new javax.swing.JComboBox();
        jComboBoxBloodType = new javax.swing.JComboBox();
        jComboBoxMaritalStatus = new javax.swing.JComboBox();
        jCheckBoxDevelopmentProfessional = new javax.swing.JCheckBox();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldBirthDate = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldCC = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldNationality = new javax.swing.JTextField();
        jTextFieldAdress = new javax.swing.JTextField();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldUtente = new javax.swing.JTextField();
        jTextFieldType = new javax.swing.JTextField();
        jTextFieldInstitution = new javax.swing.JTextField();
        jButtonEditPhoto = new javax.swing.JButton();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHealthProfessionalEdit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelHealthProfessionalEdit.setText("Editar Profissional de Saúde");
        jPanelInformation.add(jLabelHealthProfessionalEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"))); // NOI18N
        jPanelInformation.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, -1, -1));

        jLabelBirthDate.setText("Data de nascimento:");
        jPanelInformation.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 85, -1, -1));

        jLabelTel.setText("Nº Tel.:");
        jPanelInformation.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 115, -1, -1));

        jLabelCC.setText(" Nº CC:");
        jPanelInformation.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 145, -1, -1));

        jLabelEmail.setText("Email:");
        jPanelInformation.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 175, -1, -1));

        jLabelLastName.setText("Apelido:");
        jPanelInformation.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 55, -1, -1));

        jLabelGender.setText("Sexo:");
        jPanelInformation.add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        jLabelNationality.setText("Nacionalidade:");
        jPanelInformation.add(jLabelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, -1, -1));

        jLabelAdress.setText("Morada:");
        jPanelInformation.add(jLabelAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 145, -1, -1));

        jLabelNUtente.setText("Nº Utente:");
        jPanelInformation.add(jLabelNUtente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 175, -1, -1));

        jLabelNIF.setText("  NIF:");
        jPanelInformation.add(jLabelNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 205, 30, -1));

        jLabelMaritalStatus.setText(" Estado Civil:");
        jPanelInformation.add(jLabelMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 205, -1, -1));

        jLabelType.setText("   Tipo:");
        jPanelInformation.add(jLabelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 235, -1, -1));

        jLabelBloodType.setText("  Grupo sanguíneo:");
        jPanelInformation.add(jLabelBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 265, -1, -1));

        jLabelInstitution.setText(" Instituição:");
        jPanelInformation.add(jLabelInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 235, -1, -1));

        jButtonEdit.setText("Editar");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jButtonBack.setText("Voltar");
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", " " }));
        jPanelInformation.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 170, -1));

        jComboBoxBloodType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanelInformation.add(jComboBoxBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 170, -1));

        jComboBoxMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo" }));
        jPanelInformation.add(jComboBoxMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 170, -1));

        jCheckBoxDevelopmentProfessional.setText("Profissional de desenvolvimento");
        jCheckBoxDevelopmentProfessional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDevelopmentProfessionalActionPerformed(evt);
            }
        });
        jPanelInformation.add(jCheckBoxDevelopmentProfessional, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 180, -1));
        jPanelInformation.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 170, -1));
        jPanelInformation.add(jTextFieldBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));
        jPanelInformation.add(jTextFieldTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, -1));
        jPanelInformation.add(jTextFieldCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, -1));
        jPanelInformation.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 170, -1));
        jPanelInformation.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 170, -1));
        jPanelInformation.add(jTextFieldNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 170, -1));

        jTextFieldAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdressActionPerformed(evt);
            }
        });
        jPanelInformation.add(jTextFieldAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, -1));

        jTextFieldNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIFActionPerformed(evt);
            }
        });
        jPanelInformation.add(jTextFieldNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 170, -1));
        jPanelInformation.add(jTextFieldUtente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 170, -1));
        jPanelInformation.add(jTextFieldType, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 170, -1));
        jPanelInformation.add(jTextFieldInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 170, -1));

        jButtonEditPhoto.setText("Editar foto");
        jPanelInformation.add(jButtonEditPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jLabelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setPreferredSize(new java.awt.Dimension(680, 380));
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jCheckBoxDevelopmentProfessionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDevelopmentProfessionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDevelopmentProfessionalActionPerformed

    private void jTextFieldAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdressActionPerformed

    private void jTextFieldNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonEditPhoto;
    private javax.swing.JCheckBox jCheckBoxDevelopmentProfessional;
    private javax.swing.JComboBox jComboBoxBloodType;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JComboBox jComboBoxMaritalStatus;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelBloodType;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHealthProfessionalEdit;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelInstitution;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMaritalStatus;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelNUtente;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldBirthDate;
    private javax.swing.JTextField jTextFieldCC;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldInstitution;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNationality;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldType;
    private javax.swing.JTextField jTextFieldUtente;
    // End of variables declaration//GEN-END:variables
}
