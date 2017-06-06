package id.co.telkomsigma.etc.ui.operator.component.button.dashboard;

import id.co.telkomsigma.etc.swing.component.button.ButtonNice;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonMaster extends ButtonNice implements IComponentInitializer {
    
    private static final long serialVersionUID = -866323786947626236L;

    @PostConstruct
    @Override
    public void initComponents() {
        super.initComponents();
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/button-black-master.png")));
    }

}
