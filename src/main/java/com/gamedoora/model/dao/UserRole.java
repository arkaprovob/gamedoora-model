package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users_roles")
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "role_id")
    Roles roles;
    @ManyToOne
    @JoinColumn(name = "user_id")
    Users users;
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
