package id.co.telkomsigma.etc.ui.operator.component.tabel;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ITabellListener {

    public void onChange(Object p_Object);

    public void onInsert(Object p_Object);

    public void onUpdate(Object p_Object);

    public void onDelete();

    public void onTruncate();
}
