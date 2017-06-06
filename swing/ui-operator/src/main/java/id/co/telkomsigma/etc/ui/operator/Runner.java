package id.co.telkomsigma.etc.ui.operator;

import id.co.telkomsigma.etc.ui.operator.component.view.splash.SplashScreen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
