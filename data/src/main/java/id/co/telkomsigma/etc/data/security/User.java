package id.co.telkomsigma.etc.data.security;

import javax.persistence.*;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Table(name = "sec_user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "code")
    private String code;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "status")
    private Integer status;
    
    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 73 * hash + (this.code != null ? this.code.hashCode() : 0);
        hash = 73 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 73 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 73 * hash + (this.status != null ? this.status.hashCode() : 0);
        hash = 73 * hash + (this.description != null ? this.description.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.code == null) ? (other.code != null) : !this.code.equals(other.code)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.password == null) ? (other.password != null) : !this.password.equals(other.password)) {
            return false;
        }
        if (this.status != other.status && (this.status == null || !this.status.equals(other.status))) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", code=" + code + ", name=" + name + ", password=" + password + ", status=" + status + ", description=" + description + '}';
    }
    
    
    
}
