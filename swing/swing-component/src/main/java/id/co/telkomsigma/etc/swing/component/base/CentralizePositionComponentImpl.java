package id.co.telkomsigma.etc.swing.component.base;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class CentralizePositionComponentImpl implements ICentralizePositionComponent{

    @Override
    public void setComponentToCenter(Component p_Component) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        p_Component.setLocation(dim.width / 2 - p_Component.getSize().width / 2, dim.height / 2 - p_Component.getSize().height/2);
    }

    @Override
    public void setDialogToCenter(JDialog p_JDialog) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - p_JDialog.getWidth()) / 2;
        final int y = (screenSize.height - p_JDialog.getHeight()) / 2;
        p_JDialog.setLocation(x, y);
    }

    @Override
    public void setIFrameToCenter(JInternalFrame p_JInternalFrame) {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        Dimension jInternalFrameSize = p_JInternalFrame.getSize();
        p_JInternalFrame.setLocation((screenSize.width - jInternalFrameSize.width)/2,
                (screenSize.height- jInternalFrameSize.height)/2);
    }
}
