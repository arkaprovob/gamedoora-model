package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "sources")
public class Sources extends Audit implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "sources")
    Set<SkillsSource> skillsSources;
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "source_name")
    private String name;

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

    public Set<SkillsSource> getSkillsSources() {
        return skillsSources;
    }

    public void setSkillsSources(Set<SkillsSource> skillsSources) {
        this.skillsSources = skillsSources;
    }

}
