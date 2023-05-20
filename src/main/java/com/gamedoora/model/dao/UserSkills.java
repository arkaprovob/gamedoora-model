package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_skills")
public class UserSkills implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    Skills skills;
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

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
