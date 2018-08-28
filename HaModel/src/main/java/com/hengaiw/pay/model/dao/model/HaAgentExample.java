package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaAgentExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaAgentExample() {
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

        public Criteria andAgent_idIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgent_idIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_idEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idLessThan(Integer value) {
            addCriterion("agent_id <", value, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agent_id");
            return (Criteria) this;
        }

        public Criteria andAgent_nameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgent_nameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_nameEqualTo(String value) {
            addCriterion("agent_name =", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameLessThan(String value) {
            addCriterion("agent_name <", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameLike(String value) {
            addCriterion("agent_name like", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameNotLike(String value) {
            addCriterion("agent_name not like", value, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameIn(List<String> values) {
            addCriterion("agent_name in", values, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agent_name");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameIsNull() {
            addCriterion("agent_nickname is null");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameIsNotNull() {
            addCriterion("agent_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameEqualTo(String value) {
            addCriterion("agent_nickname =", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameNotEqualTo(String value) {
            addCriterion("agent_nickname <>", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameGreaterThan(String value) {
            addCriterion("agent_nickname >", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_nickname >=", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameLessThan(String value) {
            addCriterion("agent_nickname <", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameLessThanOrEqualTo(String value) {
            addCriterion("agent_nickname <=", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameLike(String value) {
            addCriterion("agent_nickname like", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameNotLike(String value) {
            addCriterion("agent_nickname not like", value, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameIn(List<String> values) {
            addCriterion("agent_nickname in", values, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameNotIn(List<String> values) {
            addCriterion("agent_nickname not in", values, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameBetween(String value1, String value2) {
            addCriterion("agent_nickname between", value1, value2, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_nicknameNotBetween(String value1, String value2) {
            addCriterion("agent_nickname not between", value1, value2, "agent_nickname");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordIsNull() {
            addCriterion("agent_password is null");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordIsNotNull() {
            addCriterion("agent_password is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordEqualTo(String value) {
            addCriterion("agent_password =", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordNotEqualTo(String value) {
            addCriterion("agent_password <>", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordGreaterThan(String value) {
            addCriterion("agent_password >", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("agent_password >=", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordLessThan(String value) {
            addCriterion("agent_password <", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordLessThanOrEqualTo(String value) {
            addCriterion("agent_password <=", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordLike(String value) {
            addCriterion("agent_password like", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordNotLike(String value) {
            addCriterion("agent_password not like", value, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordIn(List<String> values) {
            addCriterion("agent_password in", values, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordNotIn(List<String> values) {
            addCriterion("agent_password not in", values, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordBetween(String value1, String value2) {
            addCriterion("agent_password between", value1, value2, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_passwordNotBetween(String value1, String value2) {
            addCriterion("agent_password not between", value1, value2, "agent_password");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noIsNull() {
            addCriterion("agent_business_no is null");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noIsNotNull() {
            addCriterion("agent_business_no is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noEqualTo(String value) {
            addCriterion("agent_business_no =", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noNotEqualTo(String value) {
            addCriterion("agent_business_no <>", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noGreaterThan(String value) {
            addCriterion("agent_business_no >", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noGreaterThanOrEqualTo(String value) {
            addCriterion("agent_business_no >=", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noLessThan(String value) {
            addCriterion("agent_business_no <", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noLessThanOrEqualTo(String value) {
            addCriterion("agent_business_no <=", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noLike(String value) {
            addCriterion("agent_business_no like", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noNotLike(String value) {
            addCriterion("agent_business_no not like", value, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noIn(List<String> values) {
            addCriterion("agent_business_no in", values, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noNotIn(List<String> values) {
            addCriterion("agent_business_no not in", values, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noBetween(String value1, String value2) {
            addCriterion("agent_business_no between", value1, value2, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_noNotBetween(String value1, String value2) {
            addCriterion("agent_business_no not between", value1, value2, "agent_business_no");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateIsNull() {
            addCriterion("agent_business_date is null");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateIsNotNull() {
            addCriterion("agent_business_date is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateEqualTo(String value) {
            addCriterion("agent_business_date =", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateNotEqualTo(String value) {
            addCriterion("agent_business_date <>", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateGreaterThan(String value) {
            addCriterion("agent_business_date >", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateGreaterThanOrEqualTo(String value) {
            addCriterion("agent_business_date >=", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateLessThan(String value) {
            addCriterion("agent_business_date <", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateLessThanOrEqualTo(String value) {
            addCriterion("agent_business_date <=", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateLike(String value) {
            addCriterion("agent_business_date like", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateNotLike(String value) {
            addCriterion("agent_business_date not like", value, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateIn(List<String> values) {
            addCriterion("agent_business_date in", values, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateNotIn(List<String> values) {
            addCriterion("agent_business_date not in", values, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateBetween(String value1, String value2) {
            addCriterion("agent_business_date between", value1, value2, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_business_dateNotBetween(String value1, String value2) {
            addCriterion("agent_business_date not between", value1, value2, "agent_business_date");
            return (Criteria) this;
        }

        public Criteria andAgent_emailIsNull() {
            addCriterion("agent_email is null");
            return (Criteria) this;
        }

        public Criteria andAgent_emailIsNotNull() {
            addCriterion("agent_email is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_emailEqualTo(String value) {
            addCriterion("agent_email =", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailNotEqualTo(String value) {
            addCriterion("agent_email <>", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailGreaterThan(String value) {
            addCriterion("agent_email >", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailGreaterThanOrEqualTo(String value) {
            addCriterion("agent_email >=", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailLessThan(String value) {
            addCriterion("agent_email <", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailLessThanOrEqualTo(String value) {
            addCriterion("agent_email <=", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailLike(String value) {
            addCriterion("agent_email like", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailNotLike(String value) {
            addCriterion("agent_email not like", value, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailIn(List<String> values) {
            addCriterion("agent_email in", values, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailNotIn(List<String> values) {
            addCriterion("agent_email not in", values, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailBetween(String value1, String value2) {
            addCriterion("agent_email between", value1, value2, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_emailNotBetween(String value1, String value2) {
            addCriterion("agent_email not between", value1, value2, "agent_email");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noIsNull() {
            addCriterion("agent_user_no is null");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noIsNotNull() {
            addCriterion("agent_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noEqualTo(String value) {
            addCriterion("agent_user_no =", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noNotEqualTo(String value) {
            addCriterion("agent_user_no <>", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noGreaterThan(String value) {
            addCriterion("agent_user_no >", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noGreaterThanOrEqualTo(String value) {
            addCriterion("agent_user_no >=", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noLessThan(String value) {
            addCriterion("agent_user_no <", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noLessThanOrEqualTo(String value) {
            addCriterion("agent_user_no <=", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noLike(String value) {
            addCriterion("agent_user_no like", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noNotLike(String value) {
            addCriterion("agent_user_no not like", value, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noIn(List<String> values) {
            addCriterion("agent_user_no in", values, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noNotIn(List<String> values) {
            addCriterion("agent_user_no not in", values, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noBetween(String value1, String value2) {
            addCriterion("agent_user_no between", value1, value2, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_noNotBetween(String value1, String value2) {
            addCriterion("agent_user_no not between", value1, value2, "agent_user_no");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameIsNull() {
            addCriterion("agent_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameIsNotNull() {
            addCriterion("agent_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameEqualTo(String value) {
            addCriterion("agent_user_name =", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameNotEqualTo(String value) {
            addCriterion("agent_user_name <>", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameGreaterThan(String value) {
            addCriterion("agent_user_name >", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_user_name >=", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameLessThan(String value) {
            addCriterion("agent_user_name <", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameLessThanOrEqualTo(String value) {
            addCriterion("agent_user_name <=", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameLike(String value) {
            addCriterion("agent_user_name like", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameNotLike(String value) {
            addCriterion("agent_user_name not like", value, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameIn(List<String> values) {
            addCriterion("agent_user_name in", values, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameNotIn(List<String> values) {
            addCriterion("agent_user_name not in", values, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameBetween(String value1, String value2) {
            addCriterion("agent_user_name between", value1, value2, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_nameNotBetween(String value1, String value2) {
            addCriterion("agent_user_name not between", value1, value2, "agent_user_name");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneIsNull() {
            addCriterion("agent_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneIsNotNull() {
            addCriterion("agent_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneEqualTo(String value) {
            addCriterion("agent_user_phone =", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneNotEqualTo(String value) {
            addCriterion("agent_user_phone <>", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneGreaterThan(String value) {
            addCriterion("agent_user_phone >", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_user_phone >=", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneLessThan(String value) {
            addCriterion("agent_user_phone <", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneLessThanOrEqualTo(String value) {
            addCriterion("agent_user_phone <=", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneLike(String value) {
            addCriterion("agent_user_phone like", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneNotLike(String value) {
            addCriterion("agent_user_phone not like", value, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneIn(List<String> values) {
            addCriterion("agent_user_phone in", values, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneNotIn(List<String> values) {
            addCriterion("agent_user_phone not in", values, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneBetween(String value1, String value2) {
            addCriterion("agent_user_phone between", value1, value2, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_user_phoneNotBetween(String value1, String value2) {
            addCriterion("agent_user_phone not between", value1, value2, "agent_user_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_addressIsNull() {
            addCriterion("agent_address is null");
            return (Criteria) this;
        }

        public Criteria andAgent_addressIsNotNull() {
            addCriterion("agent_address is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_addressEqualTo(String value) {
            addCriterion("agent_address =", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressNotEqualTo(String value) {
            addCriterion("agent_address <>", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressGreaterThan(String value) {
            addCriterion("agent_address >", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressGreaterThanOrEqualTo(String value) {
            addCriterion("agent_address >=", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressLessThan(String value) {
            addCriterion("agent_address <", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressLessThanOrEqualTo(String value) {
            addCriterion("agent_address <=", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressLike(String value) {
            addCriterion("agent_address like", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressNotLike(String value) {
            addCriterion("agent_address not like", value, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressIn(List<String> values) {
            addCriterion("agent_address in", values, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressNotIn(List<String> values) {
            addCriterion("agent_address not in", values, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressBetween(String value1, String value2) {
            addCriterion("agent_address between", value1, value2, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_addressNotBetween(String value1, String value2) {
            addCriterion("agent_address not between", value1, value2, "agent_address");
            return (Criteria) this;
        }

        public Criteria andAgent_siteIsNull() {
            addCriterion("agent_site is null");
            return (Criteria) this;
        }

        public Criteria andAgent_siteIsNotNull() {
            addCriterion("agent_site is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_siteEqualTo(String value) {
            addCriterion("agent_site =", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteNotEqualTo(String value) {
            addCriterion("agent_site <>", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteGreaterThan(String value) {
            addCriterion("agent_site >", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteGreaterThanOrEqualTo(String value) {
            addCriterion("agent_site >=", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteLessThan(String value) {
            addCriterion("agent_site <", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteLessThanOrEqualTo(String value) {
            addCriterion("agent_site <=", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteLike(String value) {
            addCriterion("agent_site like", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteNotLike(String value) {
            addCriterion("agent_site not like", value, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteIn(List<String> values) {
            addCriterion("agent_site in", values, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteNotIn(List<String> values) {
            addCriterion("agent_site not in", values, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteBetween(String value1, String value2) {
            addCriterion("agent_site between", value1, value2, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_siteNotBetween(String value1, String value2) {
            addCriterion("agent_site not between", value1, value2, "agent_site");
            return (Criteria) this;
        }

        public Criteria andAgent_icpIsNull() {
            addCriterion("agent_icp is null");
            return (Criteria) this;
        }

        public Criteria andAgent_icpIsNotNull() {
            addCriterion("agent_icp is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_icpEqualTo(String value) {
            addCriterion("agent_icp =", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpNotEqualTo(String value) {
            addCriterion("agent_icp <>", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpGreaterThan(String value) {
            addCriterion("agent_icp >", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpGreaterThanOrEqualTo(String value) {
            addCriterion("agent_icp >=", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpLessThan(String value) {
            addCriterion("agent_icp <", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpLessThanOrEqualTo(String value) {
            addCriterion("agent_icp <=", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpLike(String value) {
            addCriterion("agent_icp like", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpNotLike(String value) {
            addCriterion("agent_icp not like", value, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpIn(List<String> values) {
            addCriterion("agent_icp in", values, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpNotIn(List<String> values) {
            addCriterion("agent_icp not in", values, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpBetween(String value1, String value2) {
            addCriterion("agent_icp between", value1, value2, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_icpNotBetween(String value1, String value2) {
            addCriterion("agent_icp not between", value1, value2, "agent_icp");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameIsNull() {
            addCriterion("agent_bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameIsNotNull() {
            addCriterion("agent_bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameEqualTo(String value) {
            addCriterion("agent_bank_account_name =", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameNotEqualTo(String value) {
            addCriterion("agent_bank_account_name <>", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameGreaterThan(String value) {
            addCriterion("agent_bank_account_name >", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_bank_account_name >=", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameLessThan(String value) {
            addCriterion("agent_bank_account_name <", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameLessThanOrEqualTo(String value) {
            addCriterion("agent_bank_account_name <=", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameLike(String value) {
            addCriterion("agent_bank_account_name like", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameNotLike(String value) {
            addCriterion("agent_bank_account_name not like", value, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameIn(List<String> values) {
            addCriterion("agent_bank_account_name in", values, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameNotIn(List<String> values) {
            addCriterion("agent_bank_account_name not in", values, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameBetween(String value1, String value2) {
            addCriterion("agent_bank_account_name between", value1, value2, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_account_nameNotBetween(String value1, String value2) {
            addCriterion("agent_bank_account_name not between", value1, value2, "agent_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountIsNull() {
            addCriterion("agent_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountIsNotNull() {
            addCriterion("agent_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountEqualTo(String value) {
            addCriterion("agent_bank_account =", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountNotEqualTo(String value) {
            addCriterion("agent_bank_account <>", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountGreaterThan(String value) {
            addCriterion("agent_bank_account >", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountGreaterThanOrEqualTo(String value) {
            addCriterion("agent_bank_account >=", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountLessThan(String value) {
            addCriterion("agent_bank_account <", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountLessThanOrEqualTo(String value) {
            addCriterion("agent_bank_account <=", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountLike(String value) {
            addCriterion("agent_bank_account like", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountNotLike(String value) {
            addCriterion("agent_bank_account not like", value, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountIn(List<String> values) {
            addCriterion("agent_bank_account in", values, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountNotIn(List<String> values) {
            addCriterion("agent_bank_account not in", values, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountBetween(String value1, String value2) {
            addCriterion("agent_bank_account between", value1, value2, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_accountNotBetween(String value1, String value2) {
            addCriterion("agent_bank_account not between", value1, value2, "agent_bank_account");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameIsNull() {
            addCriterion("agent_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameIsNotNull() {
            addCriterion("agent_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameEqualTo(String value) {
            addCriterion("agent_bank_name =", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameNotEqualTo(String value) {
            addCriterion("agent_bank_name <>", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameGreaterThan(String value) {
            addCriterion("agent_bank_name >", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_bank_name >=", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameLessThan(String value) {
            addCriterion("agent_bank_name <", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameLessThanOrEqualTo(String value) {
            addCriterion("agent_bank_name <=", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameLike(String value) {
            addCriterion("agent_bank_name like", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameNotLike(String value) {
            addCriterion("agent_bank_name not like", value, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameIn(List<String> values) {
            addCriterion("agent_bank_name in", values, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameNotIn(List<String> values) {
            addCriterion("agent_bank_name not in", values, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameBetween(String value1, String value2) {
            addCriterion("agent_bank_name between", value1, value2, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_nameNotBetween(String value1, String value2) {
            addCriterion("agent_bank_name not between", value1, value2, "agent_bank_name");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneIsNull() {
            addCriterion("agent_bank_phone is null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneIsNotNull() {
            addCriterion("agent_bank_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneEqualTo(String value) {
            addCriterion("agent_bank_phone =", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneNotEqualTo(String value) {
            addCriterion("agent_bank_phone <>", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneGreaterThan(String value) {
            addCriterion("agent_bank_phone >", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_bank_phone >=", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneLessThan(String value) {
            addCriterion("agent_bank_phone <", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneLessThanOrEqualTo(String value) {
            addCriterion("agent_bank_phone <=", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneLike(String value) {
            addCriterion("agent_bank_phone like", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneNotLike(String value) {
            addCriterion("agent_bank_phone not like", value, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneIn(List<String> values) {
            addCriterion("agent_bank_phone in", values, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneNotIn(List<String> values) {
            addCriterion("agent_bank_phone not in", values, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneBetween(String value1, String value2) {
            addCriterion("agent_bank_phone between", value1, value2, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_bank_phoneNotBetween(String value1, String value2) {
            addCriterion("agent_bank_phone not between", value1, value2, "agent_bank_phone");
            return (Criteria) this;
        }

        public Criteria andAgent_statusIsNull() {
            addCriterion("agent_status is null");
            return (Criteria) this;
        }

        public Criteria andAgent_statusIsNotNull() {
            addCriterion("agent_status is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_statusEqualTo(Boolean value) {
            addCriterion("agent_status =", value, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusNotEqualTo(Boolean value) {
            addCriterion("agent_status <>", value, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusGreaterThan(Boolean value) {
            addCriterion("agent_status >", value, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("agent_status >=", value, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusLessThan(Boolean value) {
            addCriterion("agent_status <", value, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("agent_status <=", value, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusIn(List<Boolean> values) {
            addCriterion("agent_status in", values, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusNotIn(List<Boolean> values) {
            addCriterion("agent_status not in", values, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("agent_status between", value1, value2, "agent_status");
            return (Criteria) this;
        }

        public Criteria andAgent_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("agent_status not between", value1, value2, "agent_status");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
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