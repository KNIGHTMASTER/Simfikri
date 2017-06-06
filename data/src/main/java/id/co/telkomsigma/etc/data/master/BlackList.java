package id.co.telkomsigma.etc.data.master;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created on 5/30/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Table(name = "mst_blacklist")
@Entity
public class BlackList implements Serializable{

    /**
     *
     *
     */
    private static final long serialVersionUID = -2779730408289741275L;

    private Long id;
    private String obuId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "obu_id")
    public String getObuId() {
        return obuId;
    }

    public void setObuId(String obuId) {
        this.obuId = obuId;
    }

    @Override
    public String toString() {
        return "BlackList{" +
                "id=" + id +
                ", obuId='" + obuId + '\'' +
                '}';
    }
}
