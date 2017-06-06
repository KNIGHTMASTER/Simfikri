package id.co.telkomsigma.etc.ui.operator.component.tabel.model;

import id.co.telkomsigma.etc.data.master.Price;
import id.co.telkomsigma.etc.ui.operator.component.tabel.ITableModelListener;
import org.springframework.stereotype.Component;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TableModelPrice extends AbstractTableModel implements ITableModelListener<Price> {
    /**
     *
     *
     */
    private static final long serialVersionUID = 4025860616695154994L;

    private List<Price> priceList = new ArrayList<>();

    private static final String [] COLUMN_NAMES = {"Id", "GateIn Code", "GateOut Code", "Amount"};

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }

    @Override
    public boolean add(Price p_Object) {
        try{
            return priceList.add(p_Object);
        }finally{
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    @Override
    public Price get(int p_Index) {
        return priceList.get(p_Index);
    }

    @Override
    public Price set(int p_Index, Price p_Element) {
        try{
            return priceList.set(p_Index, p_Element);
        }finally{
            fireTableRowsUpdated(p_Index, p_Index);
        }
    }

    @Override
    public Price remove(int p_Index) {
        try{
            return priceList.remove(p_Index);
        }finally{
            fireTableRowsDeleted(p_Index, p_Index);
        }
    }

    @Override
    public boolean removeAll(Collection<Price> p_CollectionObjects) {
        try{
            return priceList.removeAll(p_CollectionObjects);
        }finally{
            fireTableDataChanged();
        }
    }

    @Override
    public int getRowCount() {
        return priceList.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 : return priceList.get(rowIndex).getId();
            case 1 : return priceList.get(rowIndex).getGateInCode();
            case 2 : return priceList.get(rowIndex).getGateOutCode();
            case 3 : return priceList.get(rowIndex).getAmount();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }
}
