package com.tamam.simfikri.ui.component.view.panel.card;

import com.tamam.swing.component.ButtonNice;
import com.tamam.swing.component.base.IComponentInitalizer;
import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="fauzi.knightthis.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class CardPanelMaster extends JLabel implements IComponentInitalizer{
    
    private static final long serialVersionUID = -1333772299710964047L;

    @Autowired
    @Qualifier(value = "button_nice")
    ButtonNice btBarang;
    
    @PostConstruct
    @Override
    public void init() {
        this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btBarang.setText("Barang");
        this.add(btBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        JButton btStokUlang = new JButton("stok ulang");
        this.add(btStokUlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        JButton btTipe = new JButton("tipe");
        this.add(btTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        JButton btBarangBesar = new JButton("barang besar");
        this.add(btBarangBesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        JButton btMerek = new JButton("merek");
        this.add(btMerek, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        JButton btPelanggan = new JButton("pelanggan");
        this.add(btPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        JButton StokUlangBarangBesar = new JButton("stok ulang");
        this.add(StokUlangBarangBesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        JButton btSatuan = new JButton("satuan");
        this.add(btSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        JButton btUser = new JButton("user");
        this.add(btUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        JButton btSupplier = new JButton("supplier");
        this.add(btSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        JButton btNamaBarang = new JButton("nama barang");
        this.add(btNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

//        this.add(btPenjualBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));
//
//        this.add(btBarangToko, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));
    }

}
