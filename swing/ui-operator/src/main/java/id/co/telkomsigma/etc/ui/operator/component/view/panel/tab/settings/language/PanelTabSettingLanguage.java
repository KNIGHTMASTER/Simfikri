package id.co.telkomsigma.etc.ui.operator.component.view.panel.tab.settings.language;

import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.button.panel.ButtonSavePanelTabSettingLanguage;
import id.co.telkomsigma.etc.ui.operator.component.combobox.ComboBoxLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class PanelTabSettingLanguage extends JPanel implements IComponentInitializer, IComponentAction{
    /**
     *
     *
     */
    private static final long serialVersionUID = -4738722781399575192L;

    @Autowired
    ComboBoxLanguage comboBoxLanguage;

    @Autowired
    @Qualifier("btSavePanelTabSettingLanguage")
    ButtonSavePanelTabSettingLanguage btSave;

    @PostConstruct
    @Override
    public void initComponents() {
        JLabel lblChooseLanguage = new JLabel("Choose Language ");

        this.setLayout(new GridBagLayout());

        this.add(lblChooseLanguage, new java.awt.GridBagConstraints());
        this.add(comboBoxLanguage, new java.awt.GridBagConstraints());
        this.add(btSave, new java.awt.GridBagConstraints());
    }

    @Override
    public void initAction() {

    }
}
