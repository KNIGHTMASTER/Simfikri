package id.co.telkomsigma.etc.ui.operator.component.button.panel;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.button.ButtonSave;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
@Qualifier("btSavePanelTabSettingQFree")
public class ButtonSavePanelTabSettingQFree extends ButtonSave implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = -4290614741947271092L;

    @PostConstruct
    @Override
    public void initComponents() {
        super.initComponents();
    }
}
