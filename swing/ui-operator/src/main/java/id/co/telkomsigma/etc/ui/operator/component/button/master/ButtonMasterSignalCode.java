package id.co.telkomsigma.etc.ui.operator.component.button.master;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.button.ButtonNice;
import org.springframework.stereotype.Component;

/**
 * Created on 6/1/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonMasterSignalCode extends ButtonNice implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -8397975914228828879L;

    @Override
    public void initComponents() {
        super.initComponents();
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/button-black-maintenance.png")));
    }
}
