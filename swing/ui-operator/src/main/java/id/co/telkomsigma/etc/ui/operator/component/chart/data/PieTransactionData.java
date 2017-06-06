package id.co.telkomsigma.etc.ui.operator.component.chart.data;

import java.io.Serializable;

/**
 * Created on 5/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class PieTransactionData implements Serializable{
    /**
     *
     *
     */
    private static final long serialVersionUID = 8081418531696789231L;

    private String code;
    private Double value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
