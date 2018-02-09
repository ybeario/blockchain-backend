package com.ybear.blockchain.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("cellphone is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("cellphone is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("cellphone =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("cellphone <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("cellphone >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cellphone >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("cellphone <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("cellphone <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("cellphone like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("cellphone not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("cellphone in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("cellphone not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("cellphone between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("cellphone not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedIsNull() {
            addCriterion("cellhone_verified is null");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedIsNotNull() {
            addCriterion("cellhone_verified is not null");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedEqualTo(Boolean value) {
            addCriterion("cellhone_verified =", value, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedNotEqualTo(Boolean value) {
            addCriterion("cellhone_verified <>", value, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedGreaterThan(Boolean value) {
            addCriterion("cellhone_verified >", value, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cellhone_verified >=", value, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedLessThan(Boolean value) {
            addCriterion("cellhone_verified <", value, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("cellhone_verified <=", value, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedIn(List<Boolean> values) {
            addCriterion("cellhone_verified in", values, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedNotIn(List<Boolean> values) {
            addCriterion("cellhone_verified not in", values, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("cellhone_verified between", value1, value2, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCellhoneVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cellhone_verified not between", value1, value2, "cellhoneVerified");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Boolean value) {
            addCriterion("disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Boolean value) {
            addCriterion("disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Boolean value) {
            addCriterion("disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Boolean value) {
            addCriterion("disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Boolean value) {
            addCriterion("disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Boolean> values) {
            addCriterion("disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Boolean> values) {
            addCriterion("disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Boolean value1, Boolean value2) {
            addCriterion("disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("disabled not between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedIsNull() {
            addCriterion("email_verified is null");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedIsNotNull() {
            addCriterion("email_verified is not null");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedEqualTo(Boolean value) {
            addCriterion("email_verified =", value, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedNotEqualTo(Boolean value) {
            addCriterion("email_verified <>", value, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedGreaterThan(Boolean value) {
            addCriterion("email_verified >", value, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_verified >=", value, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedLessThan(Boolean value) {
            addCriterion("email_verified <", value, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("email_verified <=", value, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedIn(List<Boolean> values) {
            addCriterion("email_verified in", values, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedNotIn(List<Boolean> values) {
            addCriterion("email_verified not in", values, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("email_verified between", value1, value2, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andEmailVerifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_verified not between", value1, value2, "emailVerified");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Integer value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Integer value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Integer value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Integer value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Integer> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Integer> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProfileImageIsNull() {
            addCriterion("profile_image is null");
            return (Criteria) this;
        }

        public Criteria andProfileImageIsNotNull() {
            addCriterion("profile_image is not null");
            return (Criteria) this;
        }

        public Criteria andProfileImageEqualTo(String value) {
            addCriterion("profile_image =", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageNotEqualTo(String value) {
            addCriterion("profile_image <>", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageGreaterThan(String value) {
            addCriterion("profile_image >", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageGreaterThanOrEqualTo(String value) {
            addCriterion("profile_image >=", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageLessThan(String value) {
            addCriterion("profile_image <", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageLessThanOrEqualTo(String value) {
            addCriterion("profile_image <=", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageLike(String value) {
            addCriterion("profile_image like", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageNotLike(String value) {
            addCriterion("profile_image not like", value, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageIn(List<String> values) {
            addCriterion("profile_image in", values, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageNotIn(List<String> values) {
            addCriterion("profile_image not in", values, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageBetween(String value1, String value2) {
            addCriterion("profile_image between", value1, value2, "profileImage");
            return (Criteria) this;
        }

        public Criteria andProfileImageNotBetween(String value1, String value2) {
            addCriterion("profile_image not between", value1, value2, "profileImage");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdIsNull() {
            addCriterion("last_user_lock_record_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdIsNotNull() {
            addCriterion("last_user_lock_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdEqualTo(Long value) {
            addCriterion("last_user_lock_record_id =", value, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdNotEqualTo(Long value) {
            addCriterion("last_user_lock_record_id <>", value, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdGreaterThan(Long value) {
            addCriterion("last_user_lock_record_id >", value, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_user_lock_record_id >=", value, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdLessThan(Long value) {
            addCriterion("last_user_lock_record_id <", value, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("last_user_lock_record_id <=", value, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdIn(List<Long> values) {
            addCriterion("last_user_lock_record_id in", values, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdNotIn(List<Long> values) {
            addCriterion("last_user_lock_record_id not in", values, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdBetween(Long value1, Long value2) {
            addCriterion("last_user_lock_record_id between", value1, value2, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andLastUserLockRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("last_user_lock_record_id not between", value1, value2, "lastUserLockRecordId");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusIsNull() {
            addCriterion("real_name_identification_status is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusIsNotNull() {
            addCriterion("real_name_identification_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusEqualTo(Integer value) {
            addCriterion("real_name_identification_status =", value, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusNotEqualTo(Integer value) {
            addCriterion("real_name_identification_status <>", value, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusGreaterThan(Integer value) {
            addCriterion("real_name_identification_status >", value, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_name_identification_status >=", value, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusLessThan(Integer value) {
            addCriterion("real_name_identification_status <", value, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("real_name_identification_status <=", value, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusIn(List<Integer> values) {
            addCriterion("real_name_identification_status in", values, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusNotIn(List<Integer> values) {
            addCriterion("real_name_identification_status not in", values, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusBetween(Integer value1, Integer value2) {
            addCriterion("real_name_identification_status between", value1, value2, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIdentificationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("real_name_identification_status not between", value1, value2, "realNameIdentificationStatus");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordIsNull() {
            addCriterion("encode_password is null");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordIsNotNull() {
            addCriterion("encode_password is not null");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordEqualTo(String value) {
            addCriterion("encode_password =", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordNotEqualTo(String value) {
            addCriterion("encode_password <>", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordGreaterThan(String value) {
            addCriterion("encode_password >", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("encode_password >=", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordLessThan(String value) {
            addCriterion("encode_password <", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordLessThanOrEqualTo(String value) {
            addCriterion("encode_password <=", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordLike(String value) {
            addCriterion("encode_password like", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordNotLike(String value) {
            addCriterion("encode_password not like", value, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordIn(List<String> values) {
            addCriterion("encode_password in", values, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordNotIn(List<String> values) {
            addCriterion("encode_password not in", values, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordBetween(String value1, String value2) {
            addCriterion("encode_password between", value1, value2, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andEncodePasswordNotBetween(String value1, String value2) {
            addCriterion("encode_password not between", value1, value2, "encodePassword");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNull() {
            addCriterion("recommend_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNotNull() {
            addCriterion("recommend_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdEqualTo(String value) {
            addCriterion("recommend_id =", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotEqualTo(String value) {
            addCriterion("recommend_id <>", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThan(String value) {
            addCriterion("recommend_id >", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_id >=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThan(String value) {
            addCriterion("recommend_id <", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThanOrEqualTo(String value) {
            addCriterion("recommend_id <=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLike(String value) {
            addCriterion("recommend_id like", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotLike(String value) {
            addCriterion("recommend_id not like", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIn(List<String> values) {
            addCriterion("recommend_id in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotIn(List<String> values) {
            addCriterion("recommend_id not in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdBetween(String value1, String value2) {
            addCriterion("recommend_id between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotBetween(String value1, String value2) {
            addCriterion("recommend_id not between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRegisterfromIsNull() {
            addCriterion("REGISTERFROM is null");
            return (Criteria) this;
        }

        public Criteria andRegisterfromIsNotNull() {
            addCriterion("REGISTERFROM is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterfromEqualTo(String value) {
            addCriterion("REGISTERFROM =", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromNotEqualTo(String value) {
            addCriterion("REGISTERFROM <>", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromGreaterThan(String value) {
            addCriterion("REGISTERFROM >", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERFROM >=", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromLessThan(String value) {
            addCriterion("REGISTERFROM <", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromLessThanOrEqualTo(String value) {
            addCriterion("REGISTERFROM <=", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromLike(String value) {
            addCriterion("REGISTERFROM like", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromNotLike(String value) {
            addCriterion("REGISTERFROM not like", value, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromIn(List<String> values) {
            addCriterion("REGISTERFROM in", values, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromNotIn(List<String> values) {
            addCriterion("REGISTERFROM not in", values, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromBetween(String value1, String value2) {
            addCriterion("REGISTERFROM between", value1, value2, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterfromNotBetween(String value1, String value2) {
            addCriterion("REGISTERFROM not between", value1, value2, "registerfrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromIsNull() {
            addCriterion("register_from is null");
            return (Criteria) this;
        }

        public Criteria andRegisterFromIsNotNull() {
            addCriterion("register_from is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterFromEqualTo(String value) {
            addCriterion("register_from =", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromNotEqualTo(String value) {
            addCriterion("register_from <>", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromGreaterThan(String value) {
            addCriterion("register_from >", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromGreaterThanOrEqualTo(String value) {
            addCriterion("register_from >=", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromLessThan(String value) {
            addCriterion("register_from <", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromLessThanOrEqualTo(String value) {
            addCriterion("register_from <=", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromLike(String value) {
            addCriterion("register_from like", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromNotLike(String value) {
            addCriterion("register_from not like", value, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromIn(List<String> values) {
            addCriterion("register_from in", values, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromNotIn(List<String> values) {
            addCriterion("register_from not in", values, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromBetween(String value1, String value2) {
            addCriterion("register_from between", value1, value2, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterFromNotBetween(String value1, String value2) {
            addCriterion("register_from not between", value1, value2, "registerFrom");
            return (Criteria) this;
        }

        public Criteria andRegisterByIsNull() {
            addCriterion("register_by is null");
            return (Criteria) this;
        }

        public Criteria andRegisterByIsNotNull() {
            addCriterion("register_by is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterByEqualTo(String value) {
            addCriterion("register_by =", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByNotEqualTo(String value) {
            addCriterion("register_by <>", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByGreaterThan(String value) {
            addCriterion("register_by >", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByGreaterThanOrEqualTo(String value) {
            addCriterion("register_by >=", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByLessThan(String value) {
            addCriterion("register_by <", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByLessThanOrEqualTo(String value) {
            addCriterion("register_by <=", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByLike(String value) {
            addCriterion("register_by like", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByNotLike(String value) {
            addCriterion("register_by not like", value, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByIn(List<String> values) {
            addCriterion("register_by in", values, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByNotIn(List<String> values) {
            addCriterion("register_by not in", values, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByBetween(String value1, String value2) {
            addCriterion("register_by between", value1, value2, "registerBy");
            return (Criteria) this;
        }

        public Criteria andRegisterByNotBetween(String value1, String value2) {
            addCriterion("register_by not between", value1, value2, "registerBy");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNull() {
            addCriterion("is_test is null");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNotNull() {
            addCriterion("is_test is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestEqualTo(Byte value) {
            addCriterion("is_test =", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotEqualTo(Byte value) {
            addCriterion("is_test <>", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThan(Byte value) {
            addCriterion("is_test >", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_test >=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThan(Byte value) {
            addCriterion("is_test <", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThanOrEqualTo(Byte value) {
            addCriterion("is_test <=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestIn(List<Byte> values) {
            addCriterion("is_test in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotIn(List<Byte> values) {
            addCriterion("is_test not in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestBetween(Byte value1, Byte value2) {
            addCriterion("is_test between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotBetween(Byte value1, Byte value2) {
            addCriterion("is_test not between", value1, value2, "isTest");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}