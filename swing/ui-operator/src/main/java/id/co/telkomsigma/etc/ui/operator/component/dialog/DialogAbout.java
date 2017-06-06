package id.co.telkomsigma.etc.ui.operator.component.dialog;

import id.co.telkomsigma.etc.swing.component.base.ICentralizePositionComponent;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.swing.component.base.IResourceBundleLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class DialogAbout extends JDialog implements IComponentInitializer {
    
    private static final long serialVersionUID = -5546517331962931229L;

    @Autowired
    IResourceBundleLocator rb;

    @Autowired
    ICentralizePositionComponent centralizePositionComponent;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setModal(true);
        centralizePositionComponent.setDialogToCenter(this);
        this.setSize(300, 300);
        this.setTitle(rb.getResourceBundle("").getString("ui.dialog.about.title"));
        JScrollPane scroller = new javax.swing.JScrollPane();
        JTextArea textAreaInformation = new JTextArea();        
        textAreaInformation.setText("ABCDEFGHIJKLM\n"+"OPQRSTUVWXYZ");
        textAreaInformation.setEditable(false);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);        
        textAreaInformation.setColumns(20);
        textAreaInformation.setRows(5);
        scroller.setViewportView(textAreaInformation);
        this.getContentPane().add(scroller, java.awt.BorderLayout.CENTER);        
        pack();
    }

    
}
