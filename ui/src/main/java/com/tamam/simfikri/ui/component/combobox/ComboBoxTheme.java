package com.tamam.simfikri.ui.component.combobox;

import com.tamam.simfikri.ui.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JComboBox;
import org.springframework.stereotype.Component;

/**
 *
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ComboBoxTheme extends JComboBox implements IComponentInitalizer {

    private static final long serialVersionUID = -1712871069399746990L;

    @PostConstruct
    @Override
    public void init() {
        this.setModel(
                new javax.swing.DefaultComboBoxModel(
                        new String[]{
                            "Nimbus",
                            "Windows Classic",
                            "Windows",
                            "Acryl",
                            "Aero",
                            "Aluminium",
                            "Bernstein",
                            "Fast",
                            "Graphite",
                            "HiFi",
                            "Luna",
                            "Metal",
                            "McWin",
                            "Mint",
                            "Noire",
                            "Smart",
                            "Texture"
                        }
                )
        );
    }
}
