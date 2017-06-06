package id.co.telkomsigma.etc.ui.operator.component.tabel.view;

import id.co.telkomsigma.etc.service.master.ISignalCodeService;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.tabel.model.TableModelSignalCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TableSignalCode extends JTable implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 1425702155321659391L;

    @Autowired
    TableModelSignalCode tableModelSignalCode;

    @Autowired
    ISignalCodeService signalCodeService;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setModel(tableModelSignalCode);
        tableModelSignalCode.setSignalCodes(signalCodeService.findAll());
    }
}
