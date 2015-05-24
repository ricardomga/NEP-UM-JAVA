/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Patient;
import backend.ws.PatientWS;
import frontend.admin.JTableRenderer;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class PatientsList extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(PatientsList.class);
    private DefaultTableModel tableModel;
    private PatientWS pWS;
    private List<Patient> pList;

    /**
     * Creates new form PatientesList
     */
    public PatientsList() {
        try {
            initComponents();
            setIcon();
            pWS = new PatientWS();
            //Pôr id HealthProfessional!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
            pList = pWS.getPatientsByHealthProfessional(1);
            drawTable();
        } catch (Exception e) {
            log.error(e.getMessage());
            JOptionPane.showMessageDialog(PatientsList.this, e.getMessage(),
                    "Lista de Pacientes", JOptionPane.ERROR_MESSAGE);
        }

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
        jComboBoxPesquisa = new javax.swing.JComboBox();
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
        jLabelPatientslList.setText("Lista de pacientes");
        jPanelInformation.add(jLabelPatientslList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonRegist.setText("Registar");
        jButtonRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Apelido", "Patologia", "Notificações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jPanelInformation.add(jScrollPaneList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 630, 190));

        jButtonSearch.setText("Pesquisar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
        });
        jPanelInformation.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 210, -1));

        jComboBoxPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nome", "nºtel" }));
        jPanelInformation.add(jComboBoxPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

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
        new PatientRegist().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new HealthProfessionalMenu().setVisible(true);;
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListMouseClicked
        if (evt.getClickCount() == 2) {
            new PatientProfile(getPatientAtTable()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableListMouseClicked

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String name = jTextFieldSearch.getText();
            //Por id Health Professional!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            pList = pWS.getPatientByName(name, 1);
            drawTable();
        }
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String name = jTextFieldSearch.getText();
        //Por id Health Professional!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        pList = pWS.getPatientByName(name, 1);
        drawTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void drawTable() {
        try {
            initializeTable();
            int width = jTableList.getColumnModel().getColumn(2).getWidth();
            int height = 60;

            for (Patient p : pList) {
                if (p.getPicture().equals("profile")) {
                    ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
                    tableModel.addRow(new Object[]{p.getName(), p.getLastName(),
                        new ImageIcon(pic.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT))});
                } else {

                    tableModel.addRow(new Object[]{p.getName(), p.getLastName(),
                        new ImageIcon(getImageFromServer(p.getPicture(), width, height))});
                }

            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
            JOptionPane.showMessageDialog(PatientsList.this, "Erro ao carregar a tabela dos \npacientes!",
                    "Erro  Lista de Pacientes", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Patient getPatientAtTable() {
        return pList.get(jTableList.getSelectedRow());
    }

    private void initializeTable() {
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        jTableList.setModel(tableModel);
        tableModel.addColumn("Nome");
        tableModel.addColumn("Apelido");
        tableModel.addColumn("Foto");
        JTableRenderer renderer = new JTableRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        jTableList.getColumnModel().getColumn(2).setCellRenderer(renderer);
        jTableList.setRowHeight(60);
    }

    /**
     * This method gets the image of the Patient from the server and resize it
     * to the chosen dimensions
     *
     * @param picture
     * @param width
     * @param heigth
     * @return Image
     */
    private Image getImageFromServer(String picture, int width, int heigth) {
        try {
            URL url = new URL(picture.trim());
            log.debug(url.toString());
            BufferedImage image = ImageIO.read(url);
            ImageIcon pic = new ImageIcon(image);
            return pic.getImage().getScaledInstance(width, heigth, Image.SCALE_DEFAULT);
        } catch (MalformedURLException ex) {
            log.error("\n" + ex.getMessage());
        } catch (IOException ex) {
            log.error("\n" + ex.getMessage());
        }
        return null;
    }
 private void setIcon(){
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo.png")).getImage());
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo-icon.png")).getImage());
        setIconImages(icons);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRegist;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox jComboBoxPesquisa;
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
