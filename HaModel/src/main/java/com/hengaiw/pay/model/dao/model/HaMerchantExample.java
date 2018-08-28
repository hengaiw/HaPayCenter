package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaMerchantExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaMerchantExample() {
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

        public Criteria andMerchant_idIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_idIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_idEqualTo(Integer value) {
            addCriterion("merchant_id =", value, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idNotEqualTo(Integer value) {
            addCriterion("merchant_id <>", value, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idGreaterThan(Integer value) {
            addCriterion("merchant_id >", value, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_id >=", value, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idLessThan(Integer value) {
            addCriterion("merchant_id <", value, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_id <=", value, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idIn(List<Integer> values) {
            addCriterion("merchant_id in", values, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idNotIn(List<Integer> values) {
            addCriterion("merchant_id not in", values, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id between", value1, value2, "merchant_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_idNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id not between", value1, value2, "merchant_id");
            return (Criteria) this;
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

        public Criteria andMerchant_nameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameLike(String value) {
            addCriterion("merchant_name like", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchant_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameIsNull() {
            addCriterion("merchant_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameIsNotNull() {
            addCriterion("merchant_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameEqualTo(String value) {
            addCriterion("merchant_nickname =", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameNotEqualTo(String value) {
            addCriterion("merchant_nickname <>", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameGreaterThan(String value) {
            addCriterion("merchant_nickname >", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_nickname >=", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameLessThan(String value) {
            addCriterion("merchant_nickname <", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameLessThanOrEqualTo(String value) {
            addCriterion("merchant_nickname <=", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameLike(String value) {
            addCriterion("merchant_nickname like", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameNotLike(String value) {
            addCriterion("merchant_nickname not like", value, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameIn(List<String> values) {
            addCriterion("merchant_nickname in", values, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameNotIn(List<String> values) {
            addCriterion("merchant_nickname not in", values, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameBetween(String value1, String value2) {
            addCriterion("merchant_nickname between", value1, value2, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_nicknameNotBetween(String value1, String value2) {
            addCriterion("merchant_nickname not between", value1, value2, "merchant_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noIsNull() {
            addCriterion("merchant_business_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noIsNotNull() {
            addCriterion("merchant_business_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noEqualTo(String value) {
            addCriterion("merchant_business_no =", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noNotEqualTo(String value) {
            addCriterion("merchant_business_no <>", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noGreaterThan(String value) {
            addCriterion("merchant_business_no >", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_business_no >=", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noLessThan(String value) {
            addCriterion("merchant_business_no <", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noLessThanOrEqualTo(String value) {
            addCriterion("merchant_business_no <=", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noLike(String value) {
            addCriterion("merchant_business_no like", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noNotLike(String value) {
            addCriterion("merchant_business_no not like", value, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noIn(List<String> values) {
            addCriterion("merchant_business_no in", values, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noNotIn(List<String> values) {
            addCriterion("merchant_business_no not in", values, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noBetween(String value1, String value2) {
            addCriterion("merchant_business_no between", value1, value2, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_noNotBetween(String value1, String value2) {
            addCriterion("merchant_business_no not between", value1, value2, "merchant_business_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateIsNull() {
            addCriterion("merchant_business_date is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateIsNotNull() {
            addCriterion("merchant_business_date is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateEqualTo(String value) {
            addCriterion("merchant_business_date =", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateNotEqualTo(String value) {
            addCriterion("merchant_business_date <>", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateGreaterThan(String value) {
            addCriterion("merchant_business_date >", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_business_date >=", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateLessThan(String value) {
            addCriterion("merchant_business_date <", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateLessThanOrEqualTo(String value) {
            addCriterion("merchant_business_date <=", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateLike(String value) {
            addCriterion("merchant_business_date like", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateNotLike(String value) {
            addCriterion("merchant_business_date not like", value, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateIn(List<String> values) {
            addCriterion("merchant_business_date in", values, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateNotIn(List<String> values) {
            addCriterion("merchant_business_date not in", values, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateBetween(String value1, String value2) {
            addCriterion("merchant_business_date between", value1, value2, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_business_dateNotBetween(String value1, String value2) {
            addCriterion("merchant_business_date not between", value1, value2, "merchant_business_date");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailIsNull() {
            addCriterion("merchant_email is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailIsNotNull() {
            addCriterion("merchant_email is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailEqualTo(String value) {
            addCriterion("merchant_email =", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailNotEqualTo(String value) {
            addCriterion("merchant_email <>", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailGreaterThan(String value) {
            addCriterion("merchant_email >", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_email >=", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailLessThan(String value) {
            addCriterion("merchant_email <", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailLessThanOrEqualTo(String value) {
            addCriterion("merchant_email <=", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailLike(String value) {
            addCriterion("merchant_email like", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailNotLike(String value) {
            addCriterion("merchant_email not like", value, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailIn(List<String> values) {
            addCriterion("merchant_email in", values, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailNotIn(List<String> values) {
            addCriterion("merchant_email not in", values, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailBetween(String value1, String value2) {
            addCriterion("merchant_email between", value1, value2, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_emailNotBetween(String value1, String value2) {
            addCriterion("merchant_email not between", value1, value2, "merchant_email");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noIsNull() {
            addCriterion("merchant_user_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noIsNotNull() {
            addCriterion("merchant_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noEqualTo(String value) {
            addCriterion("merchant_user_no =", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noNotEqualTo(String value) {
            addCriterion("merchant_user_no <>", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noGreaterThan(String value) {
            addCriterion("merchant_user_no >", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_user_no >=", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noLessThan(String value) {
            addCriterion("merchant_user_no <", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noLessThanOrEqualTo(String value) {
            addCriterion("merchant_user_no <=", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noLike(String value) {
            addCriterion("merchant_user_no like", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noNotLike(String value) {
            addCriterion("merchant_user_no not like", value, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noIn(List<String> values) {
            addCriterion("merchant_user_no in", values, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noNotIn(List<String> values) {
            addCriterion("merchant_user_no not in", values, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noBetween(String value1, String value2) {
            addCriterion("merchant_user_no between", value1, value2, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_noNotBetween(String value1, String value2) {
            addCriterion("merchant_user_no not between", value1, value2, "merchant_user_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameIsNull() {
            addCriterion("merchant_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameIsNotNull() {
            addCriterion("merchant_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameEqualTo(String value) {
            addCriterion("merchant_user_name =", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameNotEqualTo(String value) {
            addCriterion("merchant_user_name <>", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameGreaterThan(String value) {
            addCriterion("merchant_user_name >", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_user_name >=", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameLessThan(String value) {
            addCriterion("merchant_user_name <", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameLessThanOrEqualTo(String value) {
            addCriterion("merchant_user_name <=", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameLike(String value) {
            addCriterion("merchant_user_name like", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameNotLike(String value) {
            addCriterion("merchant_user_name not like", value, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameIn(List<String> values) {
            addCriterion("merchant_user_name in", values, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameNotIn(List<String> values) {
            addCriterion("merchant_user_name not in", values, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameBetween(String value1, String value2) {
            addCriterion("merchant_user_name between", value1, value2, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_nameNotBetween(String value1, String value2) {
            addCriterion("merchant_user_name not between", value1, value2, "merchant_user_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneIsNull() {
            addCriterion("merchant_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneIsNotNull() {
            addCriterion("merchant_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneEqualTo(String value) {
            addCriterion("merchant_user_phone =", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneNotEqualTo(String value) {
            addCriterion("merchant_user_phone <>", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneGreaterThan(String value) {
            addCriterion("merchant_user_phone >", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_user_phone >=", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneLessThan(String value) {
            addCriterion("merchant_user_phone <", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneLessThanOrEqualTo(String value) {
            addCriterion("merchant_user_phone <=", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneLike(String value) {
            addCriterion("merchant_user_phone like", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneNotLike(String value) {
            addCriterion("merchant_user_phone not like", value, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneIn(List<String> values) {
            addCriterion("merchant_user_phone in", values, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneNotIn(List<String> values) {
            addCriterion("merchant_user_phone not in", values, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneBetween(String value1, String value2) {
            addCriterion("merchant_user_phone between", value1, value2, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_user_phoneNotBetween(String value1, String value2) {
            addCriterion("merchant_user_phone not between", value1, value2, "merchant_user_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressIsNull() {
            addCriterion("merchant_address is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressIsNotNull() {
            addCriterion("merchant_address is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressEqualTo(String value) {
            addCriterion("merchant_address =", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressNotEqualTo(String value) {
            addCriterion("merchant_address <>", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressGreaterThan(String value) {
            addCriterion("merchant_address >", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_address >=", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressLessThan(String value) {
            addCriterion("merchant_address <", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressLessThanOrEqualTo(String value) {
            addCriterion("merchant_address <=", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressLike(String value) {
            addCriterion("merchant_address like", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressNotLike(String value) {
            addCriterion("merchant_address not like", value, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressIn(List<String> values) {
            addCriterion("merchant_address in", values, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressNotIn(List<String> values) {
            addCriterion("merchant_address not in", values, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressBetween(String value1, String value2) {
            addCriterion("merchant_address between", value1, value2, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_addressNotBetween(String value1, String value2) {
            addCriterion("merchant_address not between", value1, value2, "merchant_address");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteIsNull() {
            addCriterion("merchant_site is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteIsNotNull() {
            addCriterion("merchant_site is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteEqualTo(String value) {
            addCriterion("merchant_site =", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteNotEqualTo(String value) {
            addCriterion("merchant_site <>", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteGreaterThan(String value) {
            addCriterion("merchant_site >", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_site >=", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteLessThan(String value) {
            addCriterion("merchant_site <", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteLessThanOrEqualTo(String value) {
            addCriterion("merchant_site <=", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteLike(String value) {
            addCriterion("merchant_site like", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteNotLike(String value) {
            addCriterion("merchant_site not like", value, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteIn(List<String> values) {
            addCriterion("merchant_site in", values, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteNotIn(List<String> values) {
            addCriterion("merchant_site not in", values, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteBetween(String value1, String value2) {
            addCriterion("merchant_site between", value1, value2, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_siteNotBetween(String value1, String value2) {
            addCriterion("merchant_site not between", value1, value2, "merchant_site");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpIsNull() {
            addCriterion("merchant_icp is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpIsNotNull() {
            addCriterion("merchant_icp is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpEqualTo(String value) {
            addCriterion("merchant_icp =", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpNotEqualTo(String value) {
            addCriterion("merchant_icp <>", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpGreaterThan(String value) {
            addCriterion("merchant_icp >", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_icp >=", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpLessThan(String value) {
            addCriterion("merchant_icp <", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpLessThanOrEqualTo(String value) {
            addCriterion("merchant_icp <=", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpLike(String value) {
            addCriterion("merchant_icp like", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpNotLike(String value) {
            addCriterion("merchant_icp not like", value, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpIn(List<String> values) {
            addCriterion("merchant_icp in", values, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpNotIn(List<String> values) {
            addCriterion("merchant_icp not in", values, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpBetween(String value1, String value2) {
            addCriterion("merchant_icp between", value1, value2, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_icpNotBetween(String value1, String value2) {
            addCriterion("merchant_icp not between", value1, value2, "merchant_icp");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameIsNull() {
            addCriterion("merchant_bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameIsNotNull() {
            addCriterion("merchant_bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameEqualTo(String value) {
            addCriterion("merchant_bank_account_name =", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameNotEqualTo(String value) {
            addCriterion("merchant_bank_account_name <>", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameGreaterThan(String value) {
            addCriterion("merchant_bank_account_name >", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_bank_account_name >=", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameLessThan(String value) {
            addCriterion("merchant_bank_account_name <", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameLessThanOrEqualTo(String value) {
            addCriterion("merchant_bank_account_name <=", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameLike(String value) {
            addCriterion("merchant_bank_account_name like", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameNotLike(String value) {
            addCriterion("merchant_bank_account_name not like", value, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameIn(List<String> values) {
            addCriterion("merchant_bank_account_name in", values, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameNotIn(List<String> values) {
            addCriterion("merchant_bank_account_name not in", values, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameBetween(String value1, String value2) {
            addCriterion("merchant_bank_account_name between", value1, value2, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_account_nameNotBetween(String value1, String value2) {
            addCriterion("merchant_bank_account_name not between", value1, value2, "merchant_bank_account_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountIsNull() {
            addCriterion("merchant_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountIsNotNull() {
            addCriterion("merchant_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountEqualTo(String value) {
            addCriterion("merchant_bank_account =", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountNotEqualTo(String value) {
            addCriterion("merchant_bank_account <>", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountGreaterThan(String value) {
            addCriterion("merchant_bank_account >", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_bank_account >=", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountLessThan(String value) {
            addCriterion("merchant_bank_account <", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountLessThanOrEqualTo(String value) {
            addCriterion("merchant_bank_account <=", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountLike(String value) {
            addCriterion("merchant_bank_account like", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountNotLike(String value) {
            addCriterion("merchant_bank_account not like", value, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountIn(List<String> values) {
            addCriterion("merchant_bank_account in", values, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountNotIn(List<String> values) {
            addCriterion("merchant_bank_account not in", values, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountBetween(String value1, String value2) {
            addCriterion("merchant_bank_account between", value1, value2, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_accountNotBetween(String value1, String value2) {
            addCriterion("merchant_bank_account not between", value1, value2, "merchant_bank_account");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameIsNull() {
            addCriterion("merchant_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameIsNotNull() {
            addCriterion("merchant_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameEqualTo(String value) {
            addCriterion("merchant_bank_name =", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameNotEqualTo(String value) {
            addCriterion("merchant_bank_name <>", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameGreaterThan(String value) {
            addCriterion("merchant_bank_name >", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_bank_name >=", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameLessThan(String value) {
            addCriterion("merchant_bank_name <", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameLessThanOrEqualTo(String value) {
            addCriterion("merchant_bank_name <=", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameLike(String value) {
            addCriterion("merchant_bank_name like", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameNotLike(String value) {
            addCriterion("merchant_bank_name not like", value, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameIn(List<String> values) {
            addCriterion("merchant_bank_name in", values, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameNotIn(List<String> values) {
            addCriterion("merchant_bank_name not in", values, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameBetween(String value1, String value2) {
            addCriterion("merchant_bank_name between", value1, value2, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_nameNotBetween(String value1, String value2) {
            addCriterion("merchant_bank_name not between", value1, value2, "merchant_bank_name");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneIsNull() {
            addCriterion("merchant_bank_phone is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneIsNotNull() {
            addCriterion("merchant_bank_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneEqualTo(String value) {
            addCriterion("merchant_bank_phone =", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneNotEqualTo(String value) {
            addCriterion("merchant_bank_phone <>", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneGreaterThan(String value) {
            addCriterion("merchant_bank_phone >", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_bank_phone >=", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneLessThan(String value) {
            addCriterion("merchant_bank_phone <", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneLessThanOrEqualTo(String value) {
            addCriterion("merchant_bank_phone <=", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneLike(String value) {
            addCriterion("merchant_bank_phone like", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneNotLike(String value) {
            addCriterion("merchant_bank_phone not like", value, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneIn(List<String> values) {
            addCriterion("merchant_bank_phone in", values, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneNotIn(List<String> values) {
            addCriterion("merchant_bank_phone not in", values, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneBetween(String value1, String value2) {
            addCriterion("merchant_bank_phone between", value1, value2, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_bank_phoneNotBetween(String value1, String value2) {
            addCriterion("merchant_bank_phone not between", value1, value2, "merchant_bank_phone");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusIsNull() {
            addCriterion("merchant_status is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusIsNotNull() {
            addCriterion("merchant_status is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusEqualTo(Boolean value) {
            addCriterion("merchant_status =", value, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusNotEqualTo(Boolean value) {
            addCriterion("merchant_status <>", value, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusGreaterThan(Boolean value) {
            addCriterion("merchant_status >", value, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("merchant_status >=", value, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusLessThan(Boolean value) {
            addCriterion("merchant_status <", value, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("merchant_status <=", value, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusIn(List<Boolean> values) {
            addCriterion("merchant_status in", values, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusNotIn(List<Boolean> values) {
            addCriterion("merchant_status not in", values, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("merchant_status between", value1, value2, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("merchant_status not between", value1, value2, "merchant_status");
            return (Criteria) this;
        }

        public Criteria andMerchant_noIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_noIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_noEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noLessThan(String value) {
            addCriterion("merchant_no <", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noLike(String value) {
            addCriterion("merchant_no like", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_noNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchant_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyIsNull() {
            addCriterion("merchant_req_key is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyIsNotNull() {
            addCriterion("merchant_req_key is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyEqualTo(String value) {
            addCriterion("merchant_req_key =", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyNotEqualTo(String value) {
            addCriterion("merchant_req_key <>", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyGreaterThan(String value) {
            addCriterion("merchant_req_key >", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_req_key >=", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyLessThan(String value) {
            addCriterion("merchant_req_key <", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyLessThanOrEqualTo(String value) {
            addCriterion("merchant_req_key <=", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyLike(String value) {
            addCriterion("merchant_req_key like", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyNotLike(String value) {
            addCriterion("merchant_req_key not like", value, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyIn(List<String> values) {
            addCriterion("merchant_req_key in", values, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyNotIn(List<String> values) {
            addCriterion("merchant_req_key not in", values, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyBetween(String value1, String value2) {
            addCriterion("merchant_req_key between", value1, value2, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_req_keyNotBetween(String value1, String value2) {
            addCriterion("merchant_req_key not between", value1, value2, "merchant_req_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyIsNull() {
            addCriterion("merchant_res_key is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyIsNotNull() {
            addCriterion("merchant_res_key is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyEqualTo(String value) {
            addCriterion("merchant_res_key =", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyNotEqualTo(String value) {
            addCriterion("merchant_res_key <>", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyGreaterThan(String value) {
            addCriterion("merchant_res_key >", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_res_key >=", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyLessThan(String value) {
            addCriterion("merchant_res_key <", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyLessThanOrEqualTo(String value) {
            addCriterion("merchant_res_key <=", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyLike(String value) {
            addCriterion("merchant_res_key like", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyNotLike(String value) {
            addCriterion("merchant_res_key not like", value, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyIn(List<String> values) {
            addCriterion("merchant_res_key in", values, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyNotIn(List<String> values) {
            addCriterion("merchant_res_key not in", values, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyBetween(String value1, String value2) {
            addCriterion("merchant_res_key between", value1, value2, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_res_keyNotBetween(String value1, String value2) {
            addCriterion("merchant_res_key not between", value1, value2, "merchant_res_key");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashIsNull() {
            addCriterion("merchant_total_cash is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashIsNotNull() {
            addCriterion("merchant_total_cash is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashEqualTo(Long value) {
            addCriterion("merchant_total_cash =", value, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashNotEqualTo(Long value) {
            addCriterion("merchant_total_cash <>", value, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashGreaterThan(Long value) {
            addCriterion("merchant_total_cash >", value, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_total_cash >=", value, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashLessThan(Long value) {
            addCriterion("merchant_total_cash <", value, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashLessThanOrEqualTo(Long value) {
            addCriterion("merchant_total_cash <=", value, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashIn(List<Long> values) {
            addCriterion("merchant_total_cash in", values, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashNotIn(List<Long> values) {
            addCriterion("merchant_total_cash not in", values, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashBetween(Long value1, Long value2) {
            addCriterion("merchant_total_cash between", value1, value2, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_total_cashNotBetween(Long value1, Long value2) {
            addCriterion("merchant_total_cash not between", value1, value2, "merchant_total_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashIsNull() {
            addCriterion("merchant_wait_cash is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashIsNotNull() {
            addCriterion("merchant_wait_cash is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashEqualTo(Long value) {
            addCriterion("merchant_wait_cash =", value, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashNotEqualTo(Long value) {
            addCriterion("merchant_wait_cash <>", value, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashGreaterThan(Long value) {
            addCriterion("merchant_wait_cash >", value, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_wait_cash >=", value, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashLessThan(Long value) {
            addCriterion("merchant_wait_cash <", value, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashLessThanOrEqualTo(Long value) {
            addCriterion("merchant_wait_cash <=", value, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashIn(List<Long> values) {
            addCriterion("merchant_wait_cash in", values, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashNotIn(List<Long> values) {
            addCriterion("merchant_wait_cash not in", values, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashBetween(Long value1, Long value2) {
            addCriterion("merchant_wait_cash between", value1, value2, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_wait_cashNotBetween(Long value1, Long value2) {
            addCriterion("merchant_wait_cash not between", value1, value2, "merchant_wait_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashIsNull() {
            addCriterion("merchant_withdraw_cash is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashIsNotNull() {
            addCriterion("merchant_withdraw_cash is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashEqualTo(Long value) {
            addCriterion("merchant_withdraw_cash =", value, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashNotEqualTo(Long value) {
            addCriterion("merchant_withdraw_cash <>", value, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashGreaterThan(Long value) {
            addCriterion("merchant_withdraw_cash >", value, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_withdraw_cash >=", value, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashLessThan(Long value) {
            addCriterion("merchant_withdraw_cash <", value, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashLessThanOrEqualTo(Long value) {
            addCriterion("merchant_withdraw_cash <=", value, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashIn(List<Long> values) {
            addCriterion("merchant_withdraw_cash in", values, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashNotIn(List<Long> values) {
            addCriterion("merchant_withdraw_cash not in", values, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashBetween(Long value1, Long value2) {
            addCriterion("merchant_withdraw_cash between", value1, value2, "merchant_withdraw_cash");
            return (Criteria) this;
        }

        public Criteria andMerchant_withdraw_cashNotBetween(Long value1, Long value2) {
            addCriterion("merchant_withdraw_cash not between", value1, value2, "merchant_withdraw_cash");
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

        public Criteria andMerchant_passwordIsNull() {
            addCriterion("merchant_password is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordIsNotNull() {
            addCriterion("merchant_password is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordEqualTo(String value) {
            addCriterion("merchant_password =", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordNotEqualTo(String value) {
            addCriterion("merchant_password <>", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordGreaterThan(String value) {
            addCriterion("merchant_password >", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_password >=", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordLessThan(String value) {
            addCriterion("merchant_password <", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordLessThanOrEqualTo(String value) {
            addCriterion("merchant_password <=", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordLike(String value) {
            addCriterion("merchant_password like", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordNotLike(String value) {
            addCriterion("merchant_password not like", value, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordIn(List<String> values) {
            addCriterion("merchant_password in", values, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordNotIn(List<String> values) {
            addCriterion("merchant_password not in", values, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordBetween(String value1, String value2) {
            addCriterion("merchant_password between", value1, value2, "merchant_password");
            return (Criteria) this;
        }

        public Criteria andMerchant_passwordNotBetween(String value1, String value2) {
            addCriterion("merchant_password not between", value1, value2, "merchant_password");
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