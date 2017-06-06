package id.co.telkomsigma.etc.swing.component.base;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ICentralizePositionComponent {

    void setComponentToCenter(Component p_Component);

    void setDialogToCenter(JDialog p_JDialog);

    void setIFrameToCenter(JInternalFrame p_JInternalFrame);
}
