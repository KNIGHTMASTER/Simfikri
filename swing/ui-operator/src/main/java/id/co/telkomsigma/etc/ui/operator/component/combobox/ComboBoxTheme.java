package id.co.telkomsigma.etc.ui.operator.component.combobox;

import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 *
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ComboBoxTheme extends JComboBox implements IComponentInitializer {

    /**
     *
     *
     */
    private static final long serialVersionUID = -1712871069399746990L;

    @PostConstruct
    @Override
    public void initComponents() {
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
