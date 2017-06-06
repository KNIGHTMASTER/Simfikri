package id.co.telkomsigma.etc.ui.operator.controller.frame;

import id.co.telkomsigma.etc.service.parameter.IParamComponent;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ControllerFrameMain implements IParamComponent<ParamControllerFrameMain> {

    private ParamControllerFrameMain paramControllerFrameMain;

    public void subMenuDashboardActionPerformed(){
        if (getComponent().getInternalFrameDashboard() != null) {
            getComponent().getInternalFrameDashboard().dispose();
        }        
        getComponent().getDesktopPaneMain().add(getComponent().getInternalFrameDashboard());
        int x = (getComponent().getScreenSizeWidth() - getComponent().getInternalFrameDashboard().getWidth()) / 8;
        int y = (getComponent().getScreenSizeHeight() - getComponent().getInternalFrameDashboard().getHeight()) / 8;
        getComponent().getInternalFrameDashboard().setSize(1500, 750);
        getComponent().getInternalFrameDashboard().setLocation(x, y);
        getComponent().getInternalFrameDashboard().setVisible(true);
    }
    
    public void subMenuLoginActionPerformed(){
        if (!getComponent().getDialogLogin().isInitiated()) {
            getComponent().getDialogLogin().setMainFrame(paramControllerFrameMain.getMainFrame());
            getComponent().getDialogLogin().initComponents();
        }
        getComponent().getDialogLogin().setVisible(true);
    }
    
    public void subMenuThemeActionPerformed(){
        if (!getComponent().getDialogTheme().isIsInitiated()){
            getComponent().getDialogTheme().setComponent(paramControllerFrameMain.getMainFrame());
            getComponent().getDialogTheme().initComponents();
        }
        getComponent().getDialogTheme().setVisible(true);
    }
    
    public void subMenuServerActionPerformed(){
        if (!getComponent().getDialogServer().isInitialized()){
            getComponent().getDialogServer().setMainFrame(paramControllerFrameMain.getMainFrame());
            getComponent().getDialogServer().initComponents();
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
