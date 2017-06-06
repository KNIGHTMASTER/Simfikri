package id.co.telkomsigma.etc.ui.operator.component.button.master;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.button.ButtonNice;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created on 6/1/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonMasterBlackList extends ButtonNice implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = -6131931836664356618L;

    @PostConstruct
    @Override
    public void initComponents() {
        super.initComponents();
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/button-black-master.png")));
    }
}
