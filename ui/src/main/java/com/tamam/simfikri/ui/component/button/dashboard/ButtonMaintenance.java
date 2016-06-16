package com.tamam.simfikri.ui.component.button.dashboard;

import com.tamam.swing.component.ButtonNice;
import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonMaintenance extends ButtonNice implements IComponentInitalizer{
    
    private static final long serialVersionUID = -5483870054081522249L;

    @PostConstruct
    @Override
    public void init() {
        super.init();
        this.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/button-black-maintenance.png")));
    }

}
