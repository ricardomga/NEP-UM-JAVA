/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Appointment;
import backend.pojos.Patient;
import backend.ws.AppointmentWS;
import backend.ws.PatientWS;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class FEAppointment extends javax.swing.JFrame {

    private PatientWS patWS;
    private AppointmentWS apptmWS;
    private List<Appointment> apL;
    private List<Patient> patients;
    private Color newGreen;
    private Color newRed;

    /**
     * Creates new form Event
     */
    public FEAppointment(int idHP, String date) {
        try {
            newRed = new Color(173, 0, 2);
            newGreen = new Color(0, 204, 51);
            patWS = new PatientWS();
            apptmWS = new AppointmentWS();
            apL = apptmWS.getAppointmentByIdHPDate(idHP, date);
            patients = patWS.getPatientsByHPDate(idHP, date);
            initComponents();
            setIcon();
            seeAppointment();
            jTextFieldDate.setText(date);
            jTextAreaDescription.setEditable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(FEAppointment.this,
                    e.getMessage(), "Erro ao carregar consulta", JOptionPane.ERROR_MESSAGE);
        }

    }

    private Appointment aproveAppointment() {
        int idAppointment = getSelectAppointment().getIdAppointment();
        int idPatient = getSelectPat().getIdPatient();
        int idHealthProfessional = 1;
        String date = jTextFieldDate.getText();
        String hour = jTextFieldHours.getText();
        String local = jTextFieldLocal.getText();
        byte healthProAprov = 1;
        String description = jTextAreaDescription.getText();

        return new Appointment(idAppointment, idPatient, idHealthProfessional, date, hour, local,
                (byte) 1, healthProAprov, description);
    }

    private void seeAppointment() {
        if (!apL.isEmpty()) {
            for (Patient pt : patients) {
                jComboBoxPatient.addItem(pt.getName() + " " + pt.getLastName());
            }
            comboChange();
        }
    }

    private void comboChange() {

        jTextFieldPathology.setText(getSelectPat().getPathology());
        Appointment a = getSelectAppointment();
        jTextAreaDescription.setText(a.getDescription());
        jTextFieldDate.setText(a.getDate());
        jTextFieldHours.setText(a.getHour());
        jTextFieldLocal.setText(a.getLocal());
        changeMessage(a);

    }

    private void changeMessage(Appointment a) {
        if (a.getHealthProfessionalApproval() == 1 && a.getPatientApproval() == 1) {
            jLabelStatus.setText("Esta consulta foi aprovada por ambos");
            jLabelStatus.setForeground(newGreen);
        } else if (a.getHealthProfessionalApproval() == 1 && a.getPatientApproval() == 0) {
            jLabelStatus.setText("Esta consulta necessita de ser aprovada pelo paciente");
            jLabelStatus.setForeground(newRed);
        } else if (a.getHealthProfessionalApproval() == 0 && a.getPatientApproval() == 1) {
            jLabelStatus.setText("Esta consulta necessita de ser aprovada por si");
            jLabelStatus.setForeground(newRed);
        }
    }

    private Patient getSelectPat() {
        return patients.get(jComboBoxPatient.getSelectedIndex());
    }

    private Appointment getSelectAppointment() {
        for (Appointment a : apL) {
            if (a.getIdPatient() == getSelectPat().getIdPatient()) {
                return a;
            }
        }
        return null;
    }

     private void setIcon(){
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo.png")).getImage());
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo-icon.png")).getImage());
        setIconImages(icons);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelHealthPatientProfile = new javax.swing.JLabel();
        jButtonAprove = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelDate = new javax.swing.JLabel();
        jLabelPatient = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelHours = new javax.swing.JLabel();
        jLabelPathology = new javax.swing.JLabel();
        jTextFieldPathology = new javax.swing.JTextField();
        jTextFieldHours = new javax.swing.JTextField();
        jTextFieldLocal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonCancelEvent = new javax.swing.JButton();
        jComboBoxPatient = new javax.swing.JComboBox();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper1 = new javax.swing.JLabel();

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

        jButtonAprove.setText("Aprovar");
        jButtonAprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAproveActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonAprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

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

        jLabelLocal.setText("Local:");
        jPanelInformation.add(jLabelLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 155, -1, -1));

        jLabelDescription.setText("Descrição:");
        jPanelInformation.add(jLabelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabelHours.setText("Hora:");
        jPanelInformation.add(jLabelHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabelPathology.setText("Patologia:");
        jPanelInformation.add(jLabelPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jTextFieldPathology.setEditable(false);
        jPanelInformation.add(jTextFieldPathology, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 180, -1));

        jTextFieldHours.setEditable(false);
        jPanelInformation.add(jTextFieldHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 180, -1));

        jTextFieldLocal.setEditable(false);
        jPanelInformation.add(jTextFieldLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 180, -1));

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jPanelInformation.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 460, -1));

        jButtonCancelEvent.setText("Cancelar consulta");
        jButtonCancelEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelEventActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonCancelEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jComboBoxPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPatientActionPerformed(evt);
            }
        });
        jPanelInformation.add(jComboBoxPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 460, -1));

        jTextFieldDate.setEditable(false);
        jPanelInformation.add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, -1));

        jLabelStatus.setBackground(new java.awt.Color(204, 204, 204));
        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStatus.setText("Não existe Consulta");
        jPanelInformation.add(jLabelStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, -1));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        new Schedule().setVisible(true);
        dispose();
    }

    private void jButtonCancelEventActionPerformed(java.awt.event.ActionEvent evt) {
        new AppointmentCreateEdit(getSelectAppointment()).setVisible(true);
        dispose();
    }

    private void jButtonAproveActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            if (getSelectAppointment().getHealthProfessionalApproval() == 1) {
                JOptionPane.showMessageDialog(FEAppointment.this,
                        "Esta consulta já foi aprovada por si.", "Aprovar consulta", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            apptmWS.saveEditAppointment(aproveAppointment());
            new Schedule().setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(FEAppointment.this,
                    e.getMessage(), "Erro aprovar consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jComboBoxPatientActionPerformed(java.awt.event.ActionEvent evt) {
        comboChange();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonAprove;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancelEvent;
    private javax.swing.JComboBox jComboBoxPatient;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelHealthPatientProfile;
    private javax.swing.JLabel jLabelHours;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelPathology;
    private javax.swing.JLabel jLabelPatient;
    private javax.swing.JLabel jLabelwallpaper1;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldHours;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldPathology;
    // End of variables declaration
}
