package id.co.telkomsigma.etc.swing.component.button;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;

import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ButtonSave extends JButton implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = -1441161236689632531L;

    @Override
    public void initComponents() {
        this.setText("Save");
        this.setMnemonic('S');
        this.setFocusable(false);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    }

}
