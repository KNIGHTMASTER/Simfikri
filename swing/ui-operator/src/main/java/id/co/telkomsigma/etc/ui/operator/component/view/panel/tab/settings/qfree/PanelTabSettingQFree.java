package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.qfree;

import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTabSettingQFree extends JPanel implements IComponentInitializer, IComponentAction{
    /**
     *
     *
     */
    private static final long serialVersionUID = 8446156059832110845L;

    @Autowired
    PanelTabSettingQFreeTop panelTabSettingQFreeTop;

    @Autowired
    PanelTabSettingQFreeBottom panelTabSettingQFreeBottom;

    private boolean isInitialized = false;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new BorderLayout());
        this.add(panelTabSettingQFreeTop, java.awt.BorderLayout.CENTER);
        this.add(panelTabSettingQFreeBottom, java.awt.BorderLayout.PAGE_END);
        initAction();
        isInitialized = true;
    }

    @Override
    public void initAction() {

    }

    public boolean isInitialized() {
        return isInitialized;
    }
}
