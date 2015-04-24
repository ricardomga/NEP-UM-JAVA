/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Patient;
import backend.ws.HealthProfessionalWS;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jorge
 */
public class AppointmentCreateEdit extends javax.swing.JFrame {

    /**
     * Creates new form EventRegist
     */
    public AppointmentCreateEdit(Date data) {
        HealthProfessionalWS hp= new HealthProfessionalWS();
        ArrayList<Patient> pList = hp.getPatientsByHealthProfessional(1);
        for(int i=0; i< pList.size(); i++){
            jComboBoxPatientList.addItem(pList.get(i).getName());
            }
        jDateChooserDate.setDate(data);
        int indice=jComboBoxPatientList.getSelectedIndex();
        jTextFieldPathology.setText(pList.get(indice).getPathology());
        jTextFieldAge.setText(String.valueOf(pList.get(indice).getBirthDate()));
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

        jLabelInformation = new javax.swing.JLabel();
        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelHealthPatientProfile = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelDate = new javax.swing.JLabel();
        jLabelPatient = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelHours = new javax.swing.JLabel();
        jLabelPathology = new javax.swing.JLabel();
        jComboBoxPatientList = new javax.swing.JComboBox();
        jTextFieldPatient = new javax.swing.JTextField();
        jTextFieldPathology = new javax.swing.JTextField();
        jTextFieldHours = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonMakeAppointment = new javax.swing.JButton();
        jDateChooserDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jLabelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setPreferredSize(new java.awt.Dimension(680, 380));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHealthPatientProfile.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelHealthPatientProfile.setText("Consulta");
        jPanelInformation.add(jLabelHealthPatientProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jLabelDate.setText("Data:");
        jPanelInformation.add(jLabelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabelPatient.setText("Paciente:");
        jPanelInformation.add(jLabelPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabelAge.setText("Data nascimento");
        jPanelInformation.add(jLabelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabelDescription.setText("Descrição:");
        jPanelInformation.add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabelHours.setText("Hora:");
        jPanelInformation.add(jLabelHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabelPathology.setText("Patologia:");
        jPanelInformation.add(jLabelPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jComboBoxPatientList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPatientListActionPerformed(evt);
            }
        });
        jPanelInformation.add(jComboBoxPatientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 460, -1));

        jTextFieldPatient.setEditable(false);
        jTextFieldPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientActionPerformed(evt);
            }
        });
        jPanelInformation.add(jTextFieldPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 460, -1));

        jTextFieldPathology.setEditable(false);
        jPanelInformation.add(jTextFieldPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, -1));
        jPanelInformation.add(jTextFieldHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 180, -1));

        jTextFieldAge.setEditable(false);
        jPanelInformation.add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 180, -1));

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jPanelInformation.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 460, -1));

        jButtonMakeAppointment.setText("Marcar consulta");
        jButtonMakeAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeAppointmentActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonMakeAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));
        jPanelInformation.add(jDateChooserDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanelInformation.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        Schedule sh = new Schedule();
        sh.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonMakeAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeAppointmentActionPerformed
             
    }//GEN-LAST:event_jButtonMakeAppointmentActionPerformed

    private void jComboBoxPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPatientListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPatientListActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AppointmentCreateEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AppointmentCreateEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AppointmentCreateEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AppointmentCreateEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AppointmentCreateEdit(data).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonMakeAppointment;
    private javax.swing.JComboBox jComboBoxPatientList;
    private com.toedter.calendar.JDateChooser jDateChooserDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelHealthPatientProfile;
    private javax.swing.JLabel jLabelHours;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelPathology;
    private javax.swing.JLabel jLabelPatient;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldHours;
    private javax.swing.JTextField jTextFieldPathology;
    private javax.swing.JTextField jTextFieldPatient;
    // End of variables declaration//GEN-END:variables
}
