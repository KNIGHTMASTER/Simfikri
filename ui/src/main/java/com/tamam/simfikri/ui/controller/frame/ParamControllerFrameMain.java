package com.tamam.simfikri.ui.controller.frame;

import com.tamam.simfikri.ui.component.dialog.DialogAbout;
import com.tamam.simfikri.ui.component.dialog.DialogLogin;
import com.tamam.simfikri.ui.component.dialog.DialogServer;
import com.tamam.simfikri.ui.component.dialog.DialogTheme;
import com.tamam.simfikri.ui.component.view.desktoppane.DesktopPaneMain;
import com.tamam.simfikri.ui.component.view.frame.FrameMain;
import com.tamam.simfikri.ui.component.view.internalframe.dashboard.InternalFrameDashboard;
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

    private FrameMain frameMain;
    private DesktopPaneMain desktopPaneMain;
    private InternalFrameDashboard internalFrameDashboard;
    private DialogLogin dialogLogin;
    private DialogAbout dialogAbout;
    private DialogServer dialogServer;
    private DialogTheme dialogTheme;

    public FrameMain getFrameMain() {
        return frameMain;
    }

    public void setFrameMain(FrameMain frameMain) {
        this.frameMain = frameMain;
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
