package com.ybear.blockchain.dao.model;

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
}