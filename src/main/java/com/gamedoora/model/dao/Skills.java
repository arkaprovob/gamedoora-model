package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "skills")
public class Skills extends Audit implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "skills")
    Set<UserSkills> userSkills;
    @OneToMany(mappedBy = "skills")
    Set<SkillsSource> skillsSources;
    @OneToMany(mappedBy = "skills")
    Set<RoleSkills> roleSkills;
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "skill_name")
    private String name;
    @Basic
    @Column(name = "skill_description")
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

}
