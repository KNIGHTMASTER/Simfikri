package id.co.telkomsigma.etc.ui.operator.component.tabel.model;

import id.co.telkomsigma.etc.data.master.SignalCode;
import id.co.telkomsigma.etc.ui.operator.component.tabel.ITableModelListener;
import org.springframework.stereotype.Component;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TableModelSignalCode extends AbstractTableModel implements ITableModelListener<SignalCode> {

    /**
     *
     *
     */
    private static final long serialVersionUID = 4278641139115310353L;

    private List<SignalCode> signalCodes = new ArrayList<>();

    private static final String [] COLUMN_NAMES = {"code", "flag deduct", "flag report"};

    public void setSignalCodes(List<SignalCode> signalCodes) {
        this.signalCodes = signalCodes;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    @Override
    public int getRowCount() {
        return signalCodes.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 : return signalCodes.get(rowIndex).getCode();
            case 1 : return signalCodes.get(rowIndex).getFlagDeduct();
            case 2 : return signalCodes.get(rowIndex).getFlagReport();
            default:return null;
        }
    }


    @Override
    public boolean add(SignalCode p_Object) {
        try{
            return signalCodes.add(p_Object);
        }finally{
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    @Override
    public SignalCode get(int p_Index) {
        return signalCodes.get(p_Index);
    }

    @Override
    public SignalCode set(int p_Index, SignalCode p_Element) {
        try{
            return signalCodes.set(p_Index, p_Element);
        }finally{
            fireTableRowsUpdated(p_Index, p_Index);
        }
    }

    @Override
    public SignalCode remove(int p_Index) {
        try{
            return signalCodes.remove(p_Index);
        }finally{
            fireTableRowsDeleted(p_Index, p_Index);
        }
    }

    @Override
    public boolean removeAll(Collection<SignalCode> p_CollectionObjects) {
        try{
            return signalCodes.removeAll(p_CollectionObjects);
        }finally{
            fireTableDataChanged();
        }
    }
}
