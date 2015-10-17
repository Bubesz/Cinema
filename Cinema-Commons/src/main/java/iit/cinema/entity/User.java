package iit.cinema.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    private String useName;
    private String password;

    @ManyToMany
    @JoinTable(
            name="USER_ROLE",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="USER_ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")})
    private List<Role> roles;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
