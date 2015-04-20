/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

/**
 *
 * @author jorge
 */
public class PatientesList extends javax.swing.JFrame {

    /**
     * Creates new form PatientesList
     */
    public PatientesList() {
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
        jLabelPatientslList = new javax.swing.JLabel();
        jButtonRegist = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jScrollPaneList = new javax.swing.JScrollPane();
        jTableList = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
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
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Apelido", "Patologia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneList.setViewportView(jTableList);

        jPanelInformation.add(jScrollPaneList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 630, 190));

        jButtonSearch.setText("Pesquisar");
        jPanelInformation.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));
        jPanelInformation.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 210, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientesList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientesList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRegist;
    private javax.swing.JButton jButtonSearch;
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
