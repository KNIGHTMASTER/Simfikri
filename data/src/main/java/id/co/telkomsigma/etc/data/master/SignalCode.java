package id.co.telkomsigma.etc.data.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Table(name = "mst_signal_code")
@Entity
public class SignalCode implements Serializable{

    /**
     *
     *
     */
    private static final long serialVersionUID = -5643592570610762953L;

    private String code;
    private String flagDeduct;
    private String flagReport;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "flag_deduct")
    public String getFlagDeduct() {
        return flagDeduct;
    }

    public void setFlagDeduct(String flagDeduct) {
        this.flagDeduct = flagDeduct;
    }

    @Column(name = "flag_report")
    public String getFlagReport() {
        return flagReport;
    }

    public void setFlagReport(String flagReport) {
        this.flagReport = flagReport;
    }
}
