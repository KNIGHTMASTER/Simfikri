package id.co.telkomsigma.etc.ui.operator.component.tabel.model;

import id.co.telkomsigma.etc.data.master.BlackList;
import id.co.telkomsigma.etc.ui.operator.component.tabel.ITableModelListener;
import org.springframework.stereotype.Component;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class TableModelBlackList extends AbstractTableModel implements ITableModelListener<BlackList>{
    /**
     *
     *
     */
    private static final long serialVersionUID = 4068659785331643639L;

    private static final String [] COLUMN_NAMES = {"id", "obu id"};

    private List<BlackList> blackListData = new ArrayList<>();

    public void setBlackListData(List<BlackList> blackListData) {
        this.blackListData = blackListData;
        fireTableDataChanged();
    }

    @Override
    public boolean add(BlackList p_Object) {
        try{
            return blackListData.add(p_Object);
        }finally{
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    @Override
    public BlackList get(int p_Index) {
        return blackListData.get(p_Index);
    }

    @Override
    public BlackList set(int p_Index, BlackList p_Element) {
        try{
            return blackListData.set(p_Index, p_Element);
        }finally{
            fireTableRowsUpdated(p_Index, p_Index);
        }
    }

    @Override
    public BlackList remove(int p_Index) {
        try{
            return blackListData.remove(p_Index);
        }finally{
            fireTableRowsDeleted(p_Index, p_Index);
        }
    }

    @Override
    public boolean removeAll(Collection<BlackList> p_CollectionObjects) {
        try{
            return blackListData.removeAll(p_CollectionObjects);
        }finally{
            fireTableDataChanged();
        }
    }

    @Override
    public int getRowCount() {
        return blackListData.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0 : return blackListData.get(rowIndex).getId();
            case 1 : return blackListData.get(rowIndex).getObuId();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }
}
