package id.co.telkomsigma.etc.ui.operator.component.tabel.view;

import id.co.telkomsigma.etc.service.master.IBlackListService;
import id.co.telkomsigma.etc.swing.component.base.IComponentInitializer;
import id.co.telkomsigma.etc.ui.operator.component.tabel.model.TableModelBlackList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * Created on 6/1/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TableBlackList extends JTable implements IComponentInitializer {
    /**
     *
     *
     */
    private static final long serialVersionUID = 5868284370677555168L;

    @Autowired
    TableModelBlackList tableModelBlackList;

    @Autowired
    IBlackListService blackListService;

    @PostConstruct
    @Override
    public void initComponents() {
        this.setModel(tableModelBlackList);
        tableModelBlackList.setBlackListData(blackListService.findAll());
    }
}
