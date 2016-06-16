package com.tamam.simfikri.ui.controller.frame;

import com.tamam.simfikri.core.parameter.IParamComponent;
import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerFrameMain implements IParamComponent<ParamControllerFrameMain>{

    private ParamControllerFrameMain paramControllerFrameMain;

    public void subMenuDashboardActionPerformed(){
        if (getComponent().getInternalFrameDashboard() != null) {
            getComponent().getInternalFrameDashboard().dispose();
        }        
        getComponent().getDesktopPaneMain().add(getComponent().getInternalFrameDashboard());
        int x = (getComponent().getScreenSizeWidth() - getComponent().getObserverWidth()) / 6;
        int y = (getComponent().getScreenSizeHeight() - getComponent().getObserverHeight()) / 10;
        getComponent().getInternalFrameDashboard().setSize(900, 550);
        getComponent().getInternalFrameDashboard().setLocation(x, y);
        getComponent().getInternalFrameDashboard().setVisible(true);
    }
    
    public void subMenuLoginActionPerformed(){
        if (!getComponent().getDialogLogin().isInitiated()) {
            getComponent().getDialogLogin().setFrameMain(paramControllerFrameMain.getFrameMain());
            getComponent().getDialogLogin().init();
        }
        getComponent().getDialogLogin().setVisible(true);
    }
    
    public void subMenuThemeActionPerformed(){
        if (!getComponent().getDialogTheme().isIsInitiated()){
            getComponent().getDialogTheme().setComponent(paramControllerFrameMain.getFrameMain());
            getComponent().getDialogTheme().init();
        }
        getComponent().getDialogTheme().setVisible(true);
    }
    
    public void subMenuServerActionPerformed(){
        if (!getComponent().getDialogServer().isInitialized()){
            getComponent().getDialogServer().setFrameMain(paramControllerFrameMain.getFrameMain());
            getComponent().getDialogServer().init();
        }
        getComponent().getDialogServer().setVisible(true);
    }
    
    @Override
    public void setComponent(ParamControllerFrameMain p_Component) {
        this.paramControllerFrameMain = p_Component;
    }

    @Override
    public ParamControllerFrameMain getComponent() {
        return paramControllerFrameMain;
    }
    
}
