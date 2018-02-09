package com.ybear.blockchain.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PasswordChangeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PasswordChangeHistoryExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChangedTimeIsNull() {
            addCriterion("changed_time is null");
            return (Criteria) this;
        }

        public Criteria andChangedTimeIsNotNull() {
            addCriterion("changed_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangedTimeEqualTo(Date value) {
            addCriterion("changed_time =", value, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeNotEqualTo(Date value) {
            addCriterion("changed_time <>", value, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeGreaterThan(Date value) {
            addCriterion("changed_time >", value, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("changed_time >=", value, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeLessThan(Date value) {
            addCriterion("changed_time <", value, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeLessThanOrEqualTo(Date value) {
            addCriterion("changed_time <=", value, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeIn(List<Date> values) {
            addCriterion("changed_time in", values, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeNotIn(List<Date> values) {
            addCriterion("changed_time not in", values, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeBetween(Date value1, Date value2) {
            addCriterion("changed_time between", value1, value2, "changedTime");
            return (Criteria) this;
        }

        public Criteria andChangedTimeNotBetween(Date value1, Date value2) {
            addCriterion("changed_time not between", value1, value2, "changedTime");
            return (Criteria) this;
        }

        public Criteria andNewPasswordIsNull() {
            addCriterion("new_password is null");
            return (Criteria) this;
        }

        public Criteria andNewPasswordIsNotNull() {
            addCriterion("new_password is not null");
            return (Criteria) this;
        }

        public Criteria andNewPasswordEqualTo(String value) {
            addCriterion("new_password =", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotEqualTo(String value) {
            addCriterion("new_password <>", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordGreaterThan(String value) {
            addCriterion("new_password >", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("new_password >=", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordLessThan(String value) {
            addCriterion("new_password <", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordLessThanOrEqualTo(String value) {
            addCriterion("new_password <=", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordLike(String value) {
            addCriterion("new_password like", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotLike(String value) {
            addCriterion("new_password not like", value, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordIn(List<String> values) {
            addCriterion("new_password in", values, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotIn(List<String> values) {
            addCriterion("new_password not in", values, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordBetween(String value1, String value2) {
            addCriterion("new_password between", value1, value2, "newPassword");
            return (Criteria) this;
        }

        public Criteria andNewPasswordNotBetween(String value1, String value2) {
            addCriterion("new_password not between", value1, value2, "newPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordIsNull() {
            addCriterion("old_password is null");
            return (Criteria) this;
        }

        public Criteria andOldPasswordIsNotNull() {
            addCriterion("old_password is not null");
            return (Criteria) this;
        }

        public Criteria andOldPasswordEqualTo(String value) {
            addCriterion("old_password =", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotEqualTo(String value) {
            addCriterion("old_password <>", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordGreaterThan(String value) {
            addCriterion("old_password >", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("old_password >=", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordLessThan(String value) {
            addCriterion("old_password <", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordLessThanOrEqualTo(String value) {
            addCriterion("old_password <=", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordLike(String value) {
            addCriterion("old_password like", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotLike(String value) {
            addCriterion("old_password not like", value, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordIn(List<String> values) {
            addCriterion("old_password in", values, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotIn(List<String> values) {
            addCriterion("old_password not in", values, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordBetween(String value1, String value2) {
            addCriterion("old_password between", value1, value2, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andOldPasswordNotBetween(String value1, String value2) {
            addCriterion("old_password not between", value1, value2, "oldPassword");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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