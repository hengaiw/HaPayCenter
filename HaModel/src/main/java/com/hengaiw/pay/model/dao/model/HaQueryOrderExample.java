package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaQueryOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaQueryOrderExample() {
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

        public Criteria andQuery_order_idIsNull() {
            addCriterion("query_order_id is null");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idIsNotNull() {
            addCriterion("query_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idEqualTo(Integer value) {
            addCriterion("query_order_id =", value, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idNotEqualTo(Integer value) {
            addCriterion("query_order_id <>", value, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idGreaterThan(Integer value) {
            addCriterion("query_order_id >", value, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_order_id >=", value, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idLessThan(Integer value) {
            addCriterion("query_order_id <", value, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idLessThanOrEqualTo(Integer value) {
            addCriterion("query_order_id <=", value, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idIn(List<Integer> values) {
            addCriterion("query_order_id in", values, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idNotIn(List<Integer> values) {
            addCriterion("query_order_id not in", values, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idBetween(Integer value1, Integer value2) {
            addCriterion("query_order_id between", value1, value2, "query_order_id");
            return (Criteria) this;
        }

        public Criteria andQuery_order_idNotBetween(Integer value1, Integer value2) {
            addCriterion("query_order_id not between", value1, value2, "query_order_id");
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

        public Criteria andQuery_order_snIsNull() {
            addCriterion("query_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snIsNotNull() {
            addCriterion("query_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snEqualTo(String value) {
            addCriterion("query_order_sn =", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snNotEqualTo(String value) {
            addCriterion("query_order_sn <>", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snGreaterThan(String value) {
            addCriterion("query_order_sn >", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snGreaterThanOrEqualTo(String value) {
            addCriterion("query_order_sn >=", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snLessThan(String value) {
            addCriterion("query_order_sn <", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snLessThanOrEqualTo(String value) {
            addCriterion("query_order_sn <=", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snLike(String value) {
            addCriterion("query_order_sn like", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snNotLike(String value) {
            addCriterion("query_order_sn not like", value, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snIn(List<String> values) {
            addCriterion("query_order_sn in", values, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snNotIn(List<String> values) {
            addCriterion("query_order_sn not in", values, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snBetween(String value1, String value2) {
            addCriterion("query_order_sn between", value1, value2, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andQuery_order_snNotBetween(String value1, String value2) {
            addCriterion("query_order_sn not between", value1, value2, "query_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snIsNull() {
            addCriterion("pay_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andPay_order_snIsNotNull() {
            addCriterion("pay_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPay_order_snEqualTo(String value) {
            addCriterion("pay_order_sn =", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snNotEqualTo(String value) {
            addCriterion("pay_order_sn <>", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snGreaterThan(String value) {
            addCriterion("pay_order_sn >", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snGreaterThanOrEqualTo(String value) {
            addCriterion("pay_order_sn >=", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snLessThan(String value) {
            addCriterion("pay_order_sn <", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snLessThanOrEqualTo(String value) {
            addCriterion("pay_order_sn <=", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snLike(String value) {
            addCriterion("pay_order_sn like", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snNotLike(String value) {
            addCriterion("pay_order_sn not like", value, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snIn(List<String> values) {
            addCriterion("pay_order_sn in", values, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snNotIn(List<String> values) {
            addCriterion("pay_order_sn not in", values, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snBetween(String value1, String value2) {
            addCriterion("pay_order_sn between", value1, value2, "pay_order_sn");
            return (Criteria) this;
        }

        public Criteria andPay_order_snNotBetween(String value1, String value2) {
            addCriterion("pay_order_sn not between", value1, value2, "pay_order_sn");
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