/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Block;
import backend.pojos.HealthProfessional;
import backend.pojos.Patient;
import backend.pojos.Session;
import backend.ws.BlockWS;
import backend.ws.SessionWS;
import frontend.admin.HealthProfessionalList;
import frontend.admin.JTableRenderer;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class PrescribeSession extends javax.swing.JFrame {

    /**
     * Creates new form PrescribeSession
     */
    private Logger log = Logger.getLogger(PrescribeSession.class);
    private DefaultTableModel tableModel;
    private BlockWS bWS;
    private List<Block> bList;
    private Patient p;
    private int idHP;
    private SessionWS sWS;

    public PrescribeSession(Patient p, int idHP) {
        initComponents();
        setIcon();
        this.p = p;
        this.idHP = idHP;
        sWS = new SessionWS();
        bWS = new BlockWS();
        bList = bWS.getAllBlocksByHealthProfessional(idHP);
        drawTable();
    }

    private void drawTable() {
        try {
            initializeTable();
            for (Block b : bList) {
                tableModel.addRow(new Object[]{b.getName()});

            }

        } catch (Exception ex) {
            log.error(ex.getMessage());
            JOptionPane.showMessageDialog(PrescribeSession.this, "Erro ao carregar a tabela dos \nblocos",
                    "Erro  Blocos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initializeTable() {
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        jTableList.setModel(tableModel);
        tableModel.addColumn("Blocos Existentes");
    }

    private Block getBlockAtTable() {
        return bList.get(jTableList.getSelectedRow());
    }

    private Date getDeadLine(){
        Date date = jDateChooserDeadline.getDate();
        return date;
    }

    private Session loadSession(){
        if (jDateChooserDeadline.getDate().toString().isEmpty()) {
            throw new RuntimeException("Preencha a data limite");
        }
        int idPatient = p.getIdPatient();
        int idHealthProfessional = idHP;
        int idBlock = getBlockAtTable().getIdBlock();
        Date deadline = getDeadLine();

        return new Session(0, idPatient, idHealthProfessional, idBlock, deadline);
    }
 private void setIcon(){
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo.png")).getImage());
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo-icon.png")).getImage());
        setIconImages(icons);
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
        jLabelPatientslList = new javax.swing.JLabel();
        jButtonRegist = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jScrollPaneList = new javax.swing.JScrollPane();
        jTableList = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonPrescribe = new javax.swing.JButton();
        jLabelDeadline = new javax.swing.JLabel();
        jDateChooserDeadline = new com.toedter.calendar.JDateChooser();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPatientslList.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelPatientslList.setText("Prescrever  sessão");
        jPanelInformation.add(jLabelPatientslList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonRegist.setText("Criar Bloco");
        jButtonRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 160, 40));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 160, 40));

        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Blocos Existentes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListMouseClicked(evt);
            }
        });
        jScrollPaneList.setViewportView(jTableList);

        jPanelInformation.add(jScrollPaneList, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 300, 230));

        jButtonSearch.setText("Pesquisar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
        });
        jPanelInformation.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 210, -1));

        jButtonDelete.setText("Eliminar Bloco");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 160, 40));

        jButtonPrescribe.setText("Prescrever");
        jButtonPrescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrescribeActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonPrescribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 160, 40));

        jLabelDeadline.setText("Data limite:");
        jPanelInformation.add(jLabelDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 20));
        jPanelInformation.add(jDateChooserDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 180, -1));

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

    private void jButtonRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistActionPerformed
        new CreateBlock(p, idHP).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new PatientProfile(p).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            bWS.deleteBlock(getBlockAtTable().getIdBlock());
            bList.remove(getBlockAtTable());
            drawTable();
        } catch (Exception e) {
            log.error(e.getMessage());
            JOptionPane.showMessageDialog(PrescribeSession.this, e.getMessage(),
                    "Erro  Blocos", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonPrescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrescribeActionPerformed
        // TODO add your handling code here:
        sWS.saveSession(loadSession());
    }//GEN-LAST:event_jButtonPrescribeActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            new BlockInterface(getBlockAtTable(), p, idHP).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableListMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        String name = jTextFieldSearch.getText();
        bList = bWS.getBlockByName(name);
        drawTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextFieldSearch.getText();
            bList = bWS.getBlockByName(name);
            drawTable();
        }
    }//GEN-LAST:event_jTextFieldSearchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPrescribe;
    private javax.swing.JButton jButtonRegist;
    private javax.swing.JButton jButtonSearch;
    private com.toedter.calendar.JDateChooser jDateChooserDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelPatientslList;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JScrollPane jScrollPaneList;
    private javax.swing.JTable jTableList;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
