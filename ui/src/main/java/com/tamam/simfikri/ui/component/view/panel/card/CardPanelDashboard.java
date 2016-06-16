package com.tamam.simfikri.ui.component.view.panel.card;

import com.tamam.swing.component.base.IComponentInitalizer;
import com.tamam.simfikri.ui.component.label.LabelImageDashboard;
import com.tamam.simfikri.ui.component.label.LabelSimfikri;
import com.tamam.simfikri.ui.component.label.LabelSistemInformasiManajemen;
import javax.annotation.PostConstruct;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelDashboard extends JPanel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -1394046529854035697L;

    @Autowired
    private LabelImageDashboard labelImageDashboard;
    
    @Autowired
    private LabelSistemInformasiManajemen labelSistemInformasiManajemen;
    
    @Autowired
    private LabelSimfikri labelSimfikri;
    
    @Autowired
    private CardPanelMaster cardPanelMaster;
    
    @PostConstruct
    @Override
    public void init() {
        this.setOpaque(false);        
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        this.add(labelImageDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        this.add(labelSistemInformasiManajemen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 600, 80));       
        this.add(labelSimfikri, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 380, 80));
        
//        this.add(this, "dashboard");
//        this.add(cardPanelMaster, "master");
    }

}
