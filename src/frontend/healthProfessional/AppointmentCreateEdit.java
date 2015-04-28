/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Appointment;
import backend.pojos.Patient;
import backend.ws.AppointmentWS;
import backend.ws.HealthProfessionalWS;
import backend.ws.PatientWS;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class AppointmentCreateEdit extends javax.swing.JFrame {

    /**
     * Creates new form EventRegist
     *
     */
    private Logger log = Logger.getLogger(AppointmentCreateEdit.class);
    private AppointmentWS appWS;
    private PatientWS patWS;
    private List<Patient> patList;

    public AppointmentCreateEdit(Appointment appoint) {
        try {
            appWS = new AppointmentWS();
            patWS = new PatientWS();
            initComponents();
            jTextFieldDate.setVisible(false);
            loadAppointToEdit(appoint);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(AppointmentCreateEdit.this,
                    e.getMessage(), "Erro ao carregar paciente", JOptionPane.ERROR_MESSAGE);
        }
    }

    public AppointmentCreateEdit(String date) {
        try {
            appWS = new AppointmentWS();
            patWS = new PatientWS();
            initComponents();
            jTextFieldDate.setText(date);
            //colocar id do terapeuta
            patList = patWS.getPatientsByHealthProfessional(1);
            jDateChooser1.setVisible(false);
            if (!patList.isEmpty()) {
                for (Patient p : patList) {
                    jComboBoxPatientList.addItem(p.getName() + " " + p.getLastName());
                }
                comboChange();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            JOptionPane.showMessageDialog(AppointmentCreateEdit.this,
                    e.getMessage(), "Erro ao carregar paciente", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void comboChange() {
        try {
            int index = jComboBoxPatientList.getSelectedIndex();
            Patient pat = patWS.getPatientById(patList.get(index).getIdPatient());
            jTextFieldPathology.setText(pat.getPathology());
            jTextFieldLocal.setText(String.valueOf(pat.getBirthDate()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(AppointmentCreateEdit.this,
                    e.getMessage(), "Erro ao carregar paciente", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadAppointToEdit(Appointment appoint) {
        try {
            Patient pat = patWS.getPatientById(appoint.getIdPatient());
            jTextAreaDescription.setText(appoint.getDescription());
            jTextFieldLocal.setText(pat.getBirthDate());
            jComboBoxPatientList.addItem(pat.getName() + " " + pat.getLastName());
            jTextFieldPathology.setText(pat.getPathology());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(AppointmentCreateEdit.this,
                    e.getMessage(), "Erro ao carregar consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Appointment loadAppointmentFromPanel() {
        String warn = validator();
        if (!warn.isEmpty()) {
            throw new RuntimeException("Preencha o(s) seguintes dado(s): " + warn);
        }
        int index = jComboBoxPatientList.getSelectedIndex();
        int idPatient = patList.get(index).getIdPatient();
        int idHealthProfessional = 1;
        String date = parseDate(jDateChooser1.getDate());
        String hour = jTextFieldHours.getText();
        String local = jTextFieldLocal.getText();
        byte healthProAprov = 1;
        String description = jTextAreaDescription.getText();

        return new Appointment(idPatient, idHealthProfessional, date, hour, local, (byte) 0,
                healthProAprov, description);
    }

    private String validator() {
        StringBuilder warns = new StringBuilder();
        warns.append(jDateChooser1.getDate().toString().isEmpty() ? "Data, " : "");
        warns.append(jTextFieldHours.getText().isEmpty() ? "Horas, " : "");
        warns.append(jTextFieldPathology.getText().isEmpty() ? "Patologia, " : "");
        warns.append(jTextFieldLocal.getText().isEmpty() ? "Data de Nascimento, " : "");

        if (!warns.toString().isEmpty()) {
            warns.delete(warns.toString().length() - 2, warns.toString().length());
            warns.append("!");
        }

        return warns.toString();
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
        jLabelLocal = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelHours = new javax.swing.JLabel();
        jLabelPathology = new javax.swing.JLabel();
        jComboBoxPatientList = new javax.swing.JComboBox();
        jTextFieldPathology = new javax.swing.JTextField();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldLocal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonMakeAppointment = new javax.swing.JButton();
        jTextFieldHours = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();
        jLabelwallpaper1 = new javax.swing.JLabel();

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

        jLabelLocal.setText("Local: ");
        jPanelInformation.add(jLabelLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 155, -1, -1));

        jLabelDescription.setText("Descrição:");
        jPanelInformation.add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabelHours.setText("Hora:");
        jPanelInformation.add(jLabelHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabelPathology.setText("Patologia:");
        jPanelInformation.add(jLabelPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jComboBoxPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPatientListActionPerformed(evt);
            }
        });
        jPanelInformation.add(jComboBoxPatientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 460, -1));

        jTextFieldPathology.setEditable(false);
        jPanelInformation.add(jTextFieldPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, -1));

        jTextFieldDate.setEditable(false);
        jPanelInformation.add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, -1));

        jTextFieldLocal.setEditable(false);
        jPanelInformation.add(jTextFieldLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 180, -1));

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
        jPanelInformation.add(jTextFieldHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 180, -1));
        jPanelInformation.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanelInformation.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelwallpaper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new Schedule().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonMakeAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeAppointmentActionPerformed
        try {
            appWS.saveEditAppointment(loadAppointmentFromPanel());
            new Schedule().setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(AppointmentCreateEdit.this, e.getMessage(),
                    "Erro ao guardar Consulta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMakeAppointmentActionPerformed

    private void jComboBoxPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPatientListActionPerformed
        comboChange();
    }//GEN-LAST:event_jComboBoxPatientListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonMakeAppointment;
    private javax.swing.JComboBox jComboBoxPatientList;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelHealthPatientProfile;
    private javax.swing.JLabel jLabelHours;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelPathology;
    private javax.swing.JLabel jLabelPatient;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JLabel jLabelwallpaper1;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldHours;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldPathology;
    // End of variables declaration//GEN-END:variables

    /**
     * This method receive a Date object and passes it to a String in the format
     * yyyy-MM-dd
     *
     * @param d
     * @return String date
     */
    private String parseDate(Date d) {
        SimpleDateFormat dateFromat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFromat.format(d);
        return date;
    }
}
