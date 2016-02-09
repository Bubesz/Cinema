package iit.cinema.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Attila on 2015.09.27.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    private String userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String useName) {
        this.userName = useName;
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
