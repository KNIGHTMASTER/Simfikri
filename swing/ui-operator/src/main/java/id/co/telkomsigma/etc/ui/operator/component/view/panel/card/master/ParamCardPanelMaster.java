package id.co.telkomsigma.etc.ui.operator.component.view.panel.card.master;

import id.co.telkomsigma.etc.ui.operator.component.view.desktoppane.DesktopPaneMain;
import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ParamCardPanelMaster implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 7829183403313730444L;

    private DesktopPaneMain desktopPaneMain;
    private MainFrame mainFrame;

    public DesktopPaneMain getDesktopPaneMain() {
        return desktopPaneMain;
    }

    public void setDesktopPaneMain(DesktopPaneMain desktopPaneMain) {
        this.desktopPaneMain = desktopPaneMain;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public String toString() {
        return "ParamCardPanelMaster{" +
                "desktopPaneMain=" + desktopPaneMain.getClass().getName() +
                ", mainFrame=" + mainFrame.getClass().getName() +
                '}';
    }
}
