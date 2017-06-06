package id.co.telkomsigma.etc.ui.operator.component.chart.data;

import java.io.Serializable;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class BarObuHealthData implements Serializable{
    /**
     *
     *
     */
    private static final long serialVersionUID = -6998989202356520363L;

    private String item;
    private String key;
    private String value;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BarObuHealthData{" +
                "item='" + item + '\'' +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
