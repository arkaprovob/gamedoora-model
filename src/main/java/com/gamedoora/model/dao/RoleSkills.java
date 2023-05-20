package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles_skills")
public class RoleSkills implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "role_id")
    Roles roles;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    Skills skills;
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

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

}
