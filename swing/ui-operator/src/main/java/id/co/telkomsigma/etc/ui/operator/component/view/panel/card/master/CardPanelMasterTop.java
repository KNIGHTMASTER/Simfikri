package id.co.telkomsigma.etc.ui.operator.component.view.panel.card.master;

import id.co.telkomsigma.etc.swing.component.base.IComponentAction;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.button.master.ButtonMasterBlackList;
import id.co.telkomsigma.etc.ui.operator.component.button.master.ButtonMasterPrice;
import id.co.telkomsigma.etc.ui.operator.component.button.master.ButtonMasterSignalCode;
import id.co.telkomsigma.etc.ui.operator.controller.internalframe.master.ControllerCardPanelMasterTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created on 6/1/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelMasterTop extends JPanel implements IComponentInitializer, IComponentAction {
    /**
     *
     *
     */
    private static final long serialVersionUID = 6326182454677711036L;

    @Autowired
    ButtonMasterBlackList buttonMasterBlackList;

    @Autowired
    ButtonMasterPrice buttonMasterPrice;

    @Autowired
    ButtonMasterSignalCode buttonMasterSignalCode;

    @Autowired
    ControllerCardPanelMasterTop controllerCardPanelMasterTop;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setLayout(new GridLayout(1, 3, 70, 0));
        this.setOpaque(true);
        this.add(buttonMasterBlackList);
        this.add(buttonMasterPrice);
        this.add(buttonMasterSignalCode);
        initAction();
    }

    @Override
    public void initAction() {
        buttonMasterBlackList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerCardPanelMasterTop.buttonMasterBlackListActionPerformed(e);
            }
        });
    }

    public ControllerCardPanelMasterTop getControllerCardPanelMasterTop() {
        return controllerCardPanelMasterTop;
    }
}
