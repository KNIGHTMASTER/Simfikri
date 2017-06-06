package id.co.telkomsigma.etc.ui.operator.component.button.panel;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.button.ButtonTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
@Qualifier("btTestPanelTabSettingQFree")
public class ButtonTestPanelTabSettingQFree extends ButtonTest implements IComponentInitializer{
    private static final long serialVersionUID = -6382210647668538553L;

    @PostConstruct
    @Override
    public void initComponents() {
        super.initComponents();
    }
}
