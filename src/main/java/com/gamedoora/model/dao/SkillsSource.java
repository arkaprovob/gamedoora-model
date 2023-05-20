package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "skills_sources")
public class SkillsSource implements Serializable {

    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    Skills skills;
    @ManyToOne
    @JoinColumn(name = "source_id")
    Sources sources;
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

    public Sources getSources() {
        return sources;
    }

    public void setSources(Sources sources) {
        this.sources = sources;
    }

}
