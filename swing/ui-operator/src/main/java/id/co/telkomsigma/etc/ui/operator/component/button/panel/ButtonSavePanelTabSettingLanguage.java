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
@Qualifier("btSavePanelTabSettingLanguage")
public class ButtonSavePanelTabSettingLanguage extends ButtonSave implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 7799159681109708644L;

    @PostConstruct
    @Override
    public void initComponents() {
        super.initComponents();
    }
}
