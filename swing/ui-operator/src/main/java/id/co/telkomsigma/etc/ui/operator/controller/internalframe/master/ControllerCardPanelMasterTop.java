package id.co.telkomsigma.etc.ui.operator.controller.internalframe.master;

import id.co.telkomsigma.etc.service.parameter.IParamComponent;
import id.co.telkomsigma.etc.ui.operator.component.view.internalframe.master.InternalFrameMasterBlackList;
import id.co.telkomsigma.etc.ui.operator.component.view.panel.card.master.ParamCardPanelMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 6/2/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerCardPanelMasterTop implements IParamComponent<ParamCardPanelMaster> {

    @Autowired
    InternalFrameMasterBlackList internalFrameMasterBlackList;

    private ParamCardPanelMaster paramCardPanelMaster;

    public void buttonMasterBlackListActionPerformed(java.awt.event.ActionEvent p_ActionEvent){
        paramCardPanelMaster.getDesktopPaneMain().add(internalFrameMasterBlackList);
        internalFrameMasterBlackList.setVisible(true);
    }

    @Override
    public void setComponent(ParamCardPanelMaster p_Component) {
        this.paramCardPanelMaster = p_Component;
    }

    @Override
    public ParamCardPanelMaster getComponent() {
        return paramCardPanelMaster;
    }
}
