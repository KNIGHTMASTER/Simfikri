package com.tamam.simfikri.ui;

import com.tamam.simfikri.ui.component.view.frame.FrameMain;
import com.tamam.simfikri.ui.component.view.splash.SplashScreen;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/**
 * Launches the application GUI.
 *
 */
@Component
public class Runner implements CommandLineRunner {

    /**
     * Pull in the JFrame to be displayed.
     */
//    @Autowired
//    private MainFrame frame;
    @Autowired
    private SplashScreen splashScreen;
    

    @Override
    public void run(String... args) throws Exception {
        /* display the form using the AWT EventQueue */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    //frame.setVisible(true);
                    splashScreen.startSplash();
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
