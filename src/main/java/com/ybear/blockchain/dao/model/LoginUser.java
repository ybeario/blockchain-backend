package com.ybear.blockchain.dao.model;

import java.util.Arrays;
import java.util.Date;

public class LoginUser {
    private String id;

    private String cellphone;

    private Boolean cellhoneVerified;

    private String code;

    private Date createdTime;

    private Boolean disabled;

    private String email;

    private Boolean emailVerified;

    private String gender;

    private Integer birthday;

    private Boolean locked;

    private String name;

    private String profileImage;

    private Date updatedTime;

    private Long version;

    private Integer cityId;

    private Integer districtId;

    private Integer provinceId;

    private String street;

    private Long lastUserLockRecordId;

    private Integer realNameIdentificationStatus;

    private String nickName;

    private String encodePassword;

    private String recommendId;

    private String registerfrom;

    private String registerFrom;

    private String registerBy;

    private Byte isTest;

    private byte[] additionalInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public Boolean getCellhoneVerified() {
        return cellhoneVerified;
    }

    public void setCellhoneVerified(Boolean cellhoneVerified) {
        this.cellhoneVerified = cellhoneVerified;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage == null ? null : profileImage.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public Long getLastUserLockRecordId() {
        return lastUserLockRecordId;
    }

    public void setLastUserLockRecordId(Long lastUserLockRecordId) {
        this.lastUserLockRecordId = lastUserLockRecordId;
    }

    public Integer getRealNameIdentificationStatus() {
        return realNameIdentificationStatus;
    }

    public void setRealNameIdentificationStatus(Integer realNameIdentificationStatus) {
        this.realNameIdentificationStatus = realNameIdentificationStatus;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEncodePassword() {
        return encodePassword;
    }

    public void setEncodePassword(String encodePassword) {
        this.encodePassword = encodePassword == null ? null : encodePassword.trim();
    }

    public String getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId == null ? null : recommendId.trim();
    }

    public String getRegisterfrom() {
        return registerfrom;
    }

    public void setRegisterfrom(String registerfrom) {
        this.registerfrom = registerfrom == null ? null : registerfrom.trim();
    }

    public String getRegisterFrom() {
        return registerFrom;
    }

    public void setRegisterFrom(String registerFrom) {
        this.registerFrom = registerFrom == null ? null : registerFrom.trim();
    }

    public String getRegisterBy() {
        return registerBy;
    }

    public void setRegisterBy(String registerBy) {
        this.registerBy = registerBy == null ? null : registerBy.trim();
    }

    public Byte getIsTest() {
        return isTest;
    }

    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    public byte[] getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(byte[] additionalInfo) {
        this.additionalInfo = additionalInfo;
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
        LoginUser other = (LoginUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCellphone() == null ? other.getCellphone() == null : this.getCellphone().equals(other.getCellphone()))
            && (this.getCellhoneVerified() == null ? other.getCellhoneVerified() == null : this.getCellhoneVerified().equals(other.getCellhoneVerified()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getEmailVerified() == null ? other.getEmailVerified() == null : this.getEmailVerified().equals(other.getEmailVerified()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProfileImage() == null ? other.getProfileImage() == null : this.getProfileImage().equals(other.getProfileImage()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getDistrictId() == null ? other.getDistrictId() == null : this.getDistrictId().equals(other.getDistrictId()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getStreet() == null ? other.getStreet() == null : this.getStreet().equals(other.getStreet()))
            && (this.getLastUserLockRecordId() == null ? other.getLastUserLockRecordId() == null : this.getLastUserLockRecordId().equals(other.getLastUserLockRecordId()))
            && (this.getRealNameIdentificationStatus() == null ? other.getRealNameIdentificationStatus() == null : this.getRealNameIdentificationStatus().equals(other.getRealNameIdentificationStatus()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getEncodePassword() == null ? other.getEncodePassword() == null : this.getEncodePassword().equals(other.getEncodePassword()))
            && (this.getRecommendId() == null ? other.getRecommendId() == null : this.getRecommendId().equals(other.getRecommendId()))
            && (this.getRegisterfrom() == null ? other.getRegisterfrom() == null : this.getRegisterfrom().equals(other.getRegisterfrom()))
            && (this.getRegisterFrom() == null ? other.getRegisterFrom() == null : this.getRegisterFrom().equals(other.getRegisterFrom()))
            && (this.getRegisterBy() == null ? other.getRegisterBy() == null : this.getRegisterBy().equals(other.getRegisterBy()))
            && (this.getIsTest() == null ? other.getIsTest() == null : this.getIsTest().equals(other.getIsTest()))
            && (Arrays.equals(this.getAdditionalInfo(), other.getAdditionalInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCellphone() == null) ? 0 : getCellphone().hashCode());
        result = prime * result + ((getCellhoneVerified() == null) ? 0 : getCellhoneVerified().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getEmailVerified() == null) ? 0 : getEmailVerified().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProfileImage() == null) ? 0 : getProfileImage().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getDistrictId() == null) ? 0 : getDistrictId().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getStreet() == null) ? 0 : getStreet().hashCode());
        result = prime * result + ((getLastUserLockRecordId() == null) ? 0 : getLastUserLockRecordId().hashCode());
        result = prime * result + ((getRealNameIdentificationStatus() == null) ? 0 : getRealNameIdentificationStatus().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getEncodePassword() == null) ? 0 : getEncodePassword().hashCode());
        result = prime * result + ((getRecommendId() == null) ? 0 : getRecommendId().hashCode());
        result = prime * result + ((getRegisterfrom() == null) ? 0 : getRegisterfrom().hashCode());
        result = prime * result + ((getRegisterFrom() == null) ? 0 : getRegisterFrom().hashCode());
        result = prime * result + ((getRegisterBy() == null) ? 0 : getRegisterBy().hashCode());
        result = prime * result + ((getIsTest() == null) ? 0 : getIsTest().hashCode());
        result = prime * result + (Arrays.hashCode(getAdditionalInfo()));
        return result;
    }
}