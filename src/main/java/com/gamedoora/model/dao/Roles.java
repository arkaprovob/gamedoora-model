package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles extends Audit implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "roles")
    Set<UserRole> userRole;
    @OneToMany(mappedBy = "roles")
    Set<RoleSkills> roleSkills;
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "role_name")
    private String name;
    @Basic
    @Column(name = "role_description")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }

}
