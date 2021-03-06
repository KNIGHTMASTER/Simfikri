package id.co.telkomsigma.etc.swing.component.button;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonStop extends JButton implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 630627459161827476L;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setText("Stop");
    }
}
