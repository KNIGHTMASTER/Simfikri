package id.co.telkomsigma.etc.data.master;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Table(name = "mst_price")
@Entity
public class Price implements Serializable{

    /**
     *
     *
     */
    private static final long serialVersionUID = -6761517298937333191L;

    private Long id;
    private String gateInCode;
    private String gateOutCode;
    private BigDecimal amount;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "gate_in_code")
    public String getGateInCode() {
        return gateInCode;
    }

    public void setGateInCode(String gateInCode) {
        this.gateInCode = gateInCode;
    }

    @Column(name = "gate_out_code")
    public String getGateOutCode() {
        return gateOutCode;
    }

    public void setGateOutCode(String gateOutCode) {
        this.gateOutCode = gateOutCode;
    }

    @Column(name = "amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
