package com.gamedoora.model.dao;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class Audit {

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)

    @Column(name = "created_on", updatable = false)
    private Date createdOn;

    @Column(name = "update_by")
    private String updateBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_on", updatable = false)
    private Date updateOn;

    @Column(name = "active")
    private boolean active;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
