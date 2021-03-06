/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import frontend.healthProfessional.HealthProfessionalMenu;
import frontend.admin.AdminMenu;
import org.apache.log4j.Logger;

/**
 *
 * @author Ricardo
 */
public class Main {
    private static Logger log = Logger.getLogger(Main.class);
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       // com.sun.java.swing.plaf.windows.WindowsLookAndFeel
       // UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
       // new SyntheticaAluOxideLookAndFeel()
        try {
            javax.swing.UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
        } catch (Exception e) {
            log.error(e.getMessage());
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthProfessionalMenu().setVisible(true);
                new AdminMenu().setVisible(true);
            }
        });
    }

}
