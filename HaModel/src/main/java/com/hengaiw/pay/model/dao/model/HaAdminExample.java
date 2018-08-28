package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HaAdminExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaAdminExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andAdmin_idIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_idIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_idEqualTo(Integer value) {
            addCriterion("admin_id =", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idLessThan(Integer value) {
            addCriterion("admin_id <", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idIn(List<Integer> values) {
            addCriterion("admin_id in", values, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameEqualTo(String value) {
            addCriterion("admin_name =", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThan(String value) {
            addCriterion("admin_name >", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThan(String value) {
            addCriterion("admin_name <", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLike(String value) {
            addCriterion("admin_name like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotLike(String value) {
            addCriterion("admin_name not like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIn(List<String> values) {
            addCriterion("admin_name in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordEqualTo(String value) {
            addCriterion("admin_password =", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThan(String value) {
            addCriterion("admin_password >", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThan(String value) {
            addCriterion("admin_password <", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLike(String value) {
            addCriterion("admin_password like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotLike(String value) {
            addCriterion("admin_password not like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIn(List<String> values) {
            addCriterion("admin_password in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeIsNull() {
            addCriterion("admin_login_time is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeIsNotNull() {
            addCriterion("admin_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeEqualTo(Integer value) {
            addCriterion("admin_login_time =", value, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeNotEqualTo(Integer value) {
            addCriterion("admin_login_time <>", value, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeGreaterThan(Integer value) {
            addCriterion("admin_login_time >", value, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_login_time >=", value, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeLessThan(Integer value) {
            addCriterion("admin_login_time <", value, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_login_time <=", value, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeIn(List<Integer> values) {
            addCriterion("admin_login_time in", values, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeNotIn(List<Integer> values) {
            addCriterion("admin_login_time not in", values, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeBetween(Integer value1, Integer value2) {
            addCriterion("admin_login_time between", value1, value2, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_login_time not between", value1, value2, "admin_login_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numIsNull() {
            addCriterion("admin_login_num is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numIsNotNull() {
            addCriterion("admin_login_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numEqualTo(Integer value) {
            addCriterion("admin_login_num =", value, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numNotEqualTo(Integer value) {
            addCriterion("admin_login_num <>", value, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numGreaterThan(Integer value) {
            addCriterion("admin_login_num >", value, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_login_num >=", value, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numLessThan(Integer value) {
            addCriterion("admin_login_num <", value, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numLessThanOrEqualTo(Integer value) {
            addCriterion("admin_login_num <=", value, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numIn(List<Integer> values) {
            addCriterion("admin_login_num in", values, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numNotIn(List<Integer> values) {
            addCriterion("admin_login_num not in", values, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numBetween(Integer value1, Integer value2) {
            addCriterion("admin_login_num between", value1, value2, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_login_numNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_login_num not between", value1, value2, "admin_login_num");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superIsNull() {
            addCriterion("admin_is_super is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superIsNotNull() {
            addCriterion("admin_is_super is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superEqualTo(Boolean value) {
            addCriterion("admin_is_super =", value, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superNotEqualTo(Boolean value) {
            addCriterion("admin_is_super <>", value, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superGreaterThan(Boolean value) {
            addCriterion("admin_is_super >", value, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superGreaterThanOrEqualTo(Boolean value) {
            addCriterion("admin_is_super >=", value, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superLessThan(Boolean value) {
            addCriterion("admin_is_super <", value, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superLessThanOrEqualTo(Boolean value) {
            addCriterion("admin_is_super <=", value, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superIn(List<Boolean> values) {
            addCriterion("admin_is_super in", values, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superNotIn(List<Boolean> values) {
            addCriterion("admin_is_super not in", values, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_is_super between", value1, value2, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_is_superNotBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_is_super not between", value1, value2, "admin_is_super");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidIsNull() {
            addCriterion("admin_gid is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidIsNotNull() {
            addCriterion("admin_gid is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidEqualTo(Short value) {
            addCriterion("admin_gid =", value, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidNotEqualTo(Short value) {
            addCriterion("admin_gid <>", value, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidGreaterThan(Short value) {
            addCriterion("admin_gid >", value, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidGreaterThanOrEqualTo(Short value) {
            addCriterion("admin_gid >=", value, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidLessThan(Short value) {
            addCriterion("admin_gid <", value, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidLessThanOrEqualTo(Short value) {
            addCriterion("admin_gid <=", value, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidIn(List<Short> values) {
            addCriterion("admin_gid in", values, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidNotIn(List<Short> values) {
            addCriterion("admin_gid not in", values, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidBetween(Short value1, Short value2) {
            addCriterion("admin_gid between", value1, value2, "admin_gid");
            return (Criteria) this;
        }

        public Criteria andAdmin_gidNotBetween(Short value1, Short value2) {
            addCriterion("admin_gid not between", value1, value2, "admin_gid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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