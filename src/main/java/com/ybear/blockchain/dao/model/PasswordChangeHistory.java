package com.ybear.blockchain.dao.model;

import java.util.Date;

public class PasswordChangeHistory {
    private Long id;

    private Date changedTime;

    private String newPassword;

    private String oldPassword;

    private String userId;

    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(Date changedTime) {
        this.changedTime = changedTime;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword == null ? null : newPassword.trim();
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword == null ? null : oldPassword.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PasswordChangeHistory other = (PasswordChangeHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChangedTime() == null ? other.getChangedTime() == null : this.getChangedTime().equals(other.getChangedTime()))
            && (this.getNewPassword() == null ? other.getNewPassword() == null : this.getNewPassword().equals(other.getNewPassword()))
            && (this.getOldPassword() == null ? other.getOldPassword() == null : this.getOldPassword().equals(other.getOldPassword()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChangedTime() == null) ? 0 : getChangedTime().hashCode());
        result = prime * result + ((getNewPassword() == null) ? 0 : getNewPassword().hashCode());
        result = prime * result + ((getOldPassword() == null) ? 0 : getOldPassword().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }
}