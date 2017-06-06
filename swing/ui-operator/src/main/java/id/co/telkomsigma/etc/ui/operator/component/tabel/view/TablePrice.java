package id.co.telkomsigma.etc.ui.operator.component.tabel.view;

import id.co.telkomsigma.etc.service.master.IPriceService;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.tabel.model.TableModelPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TablePrice extends JTable implements IComponentInitializer{
    /**
     *
     *
     */
    private static final long serialVersionUID = 1174713788009405013L;

    @Autowired
    IPriceService priceService;

    @Autowired
    TableModelPrice tableModelPrice;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setModel(tableModelPrice);
        tableModelPrice.setPriceList(priceService.findAll());
    }
}
