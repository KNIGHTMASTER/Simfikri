package id.co.telkomsigma.etc.ui.operator.controller.frame;

import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogAbout;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogLogin;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogServer;
import id.co.telkomsigma.etc.ui.operator.component.dialog.DialogTheme;
import id.co.telkomsigma.etc.ui.operator.component.view.desktoppane.DesktopPaneMain;
import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import id.co.telkomsigma.etc.ui.operator.component.view.internalframe.dashboard.InternalFrameDashboard;

import java.io.Serializable;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ParamControllerFrameMain implements Serializable{
    
    private static final long serialVersionUID = -1350775716739919532L;

    private int screenSizeWidth;
    private int screenSizeHeight;
    private int observerWidth;
    private int observerHeight;

    private MainFrame mainFrame;
    private DesktopPaneMain desktopPaneMain;
    private InternalFrameDashboard internalFrameDashboard;
    private DialogLogin dialogLogin;
    private DialogAbout dialogAbout;
    private DialogServer dialogServer;
    private DialogTheme dialogTheme;

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }
    
    public int getScreenSizeWidth() {
        return screenSizeWidth;
    }

    public void setScreenSizeWidth(int screenSizeWidth) {
        this.screenSizeWidth = screenSizeWidth;
    }

    public int getScreenSizeHeight() {
        return screenSizeHeight;
    }

    public void setScreenSizeHeight(int screenSizeHeight) {
        this.screenSizeHeight = screenSizeHeight;
    }

    public int getObserverWidth() {
        return observerWidth;
    }

    public void setObserverWidth(int observerWidth) {
        this.observerWidth = observerWidth;
    }

    public int getObserverHeight() {
        return observerHeight;
    }

    public void setObserverHeight(int observerHeight) {
        this.observerHeight = observerHeight;
    }
    
    public DesktopPaneMain getDesktopPaneMain() {
        return desktopPaneMain;
    }

    public void setDesktopPaneMain(DesktopPaneMain desktopPaneMain) {
        this.desktopPaneMain = desktopPaneMain;
    }

    public InternalFrameDashboard getInternalFrameDashboard() {
        return internalFrameDashboard;
    }

    public void setInternalFrameDashboard(InternalFrameDashboard internalFrameDashboard) {
        this.internalFrameDashboard = internalFrameDashboard;
    }

    public DialogLogin getDialogLogin() {
        return dialogLogin;
    }

    public void setDialogLogin(DialogLogin dialogLogin) {
        this.dialogLogin = dialogLogin;
    }

    public DialogAbout getDialogAbout() {
        return dialogAbout;
    }

    public void setDialogAbout(DialogAbout dialogAbout) {
        this.dialogAbout = dialogAbout;
    }

    public DialogServer getDialogServer() {
        return dialogServer;
    }

    public void setDialogServer(DialogServer dialogServer) {
        this.dialogServer = dialogServer;
    }

    public DialogTheme getDialogTheme() {
        return dialogTheme;
    }

    public void setDialogTheme(DialogTheme dialogTheme) {
        this.dialogTheme = dialogTheme;
    }
    
    
    
}
