package id.co.telkomsigma.etc.ui.operator.component.view.splash;

import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class SplashScreen {
    
    @Autowired
    MainFrame frame;
    
    private JDialog dialog; 
    
    private JProgressBar progress;

    protected void initUI() throws MalformedURLException {
        showSplashScreen();
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {

            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(30);// Simulate loading
                    publish(i);// Notify progress
                }
                return null;
            }

            @Override
            protected void process(List<Integer> chunks) {
                progress.setValue(chunks.get(chunks.size() - 1));
            }

            @Override
            protected void done() {
                showFrame();
                hideSplashScreen();
            }

        };
        worker.execute();
    }

    protected void hideSplashScreen() {
        dialog.setVisible(false);
        dialog.dispose();
    }

    protected void showSplashScreen() throws MalformedURLException {
        dialog = new JDialog((Frame) null);
        dialog.setModal(false);
        dialog.setUndecorated(true);        
        JLabel background = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("assets/etcsplash.png")));
        background.setLayout(new BorderLayout());
        dialog.add(background);
        JLabel lblLoading = new JLabel("Loading, please wait...");
        lblLoading.setForeground(Color.WHITE);
        lblLoading.setBorder(BorderFactory.createEmptyBorder(100, 50, 100, 50));
        background.add(lblLoading);
        progress = new JProgressBar();
        background.add(progress, BorderLayout.SOUTH);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    private void showFrame() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            frame.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void startSplash() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    initUI();
                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}
