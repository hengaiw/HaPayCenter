package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaAgentProductExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaAgentProductExample() {
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

        public Criteria andAgent_product_idIsNull() {
            addCriterion("agent_product_id is null");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idIsNotNull() {
            addCriterion("agent_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idEqualTo(Integer value) {
            addCriterion("agent_product_id =", value, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idNotEqualTo(Integer value) {
            addCriterion("agent_product_id <>", value, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idGreaterThan(Integer value) {
            addCriterion("agent_product_id >", value, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_product_id >=", value, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idLessThan(Integer value) {
            addCriterion("agent_product_id <", value, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idLessThanOrEqualTo(Integer value) {
            addCriterion("agent_product_id <=", value, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idIn(List<Integer> values) {
            addCriterion("agent_product_id in", values, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idNotIn(List<Integer> values) {
            addCriterion("agent_product_id not in", values, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idBetween(Integer value1, Integer value2) {
            addCriterion("agent_product_id between", value1, value2, "agent_product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_product_idNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_product_id not between", value1, value2, "agent_product_id");
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

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Integer value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Integer value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Integer value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Integer> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andAgent_rateIsNull() {
            addCriterion("agent_rate is null");
            return (Criteria) this;
        }

        public Criteria andAgent_rateIsNotNull() {
            addCriterion("agent_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_rateEqualTo(Integer value) {
            addCriterion("agent_rate =", value, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateNotEqualTo(Integer value) {
            addCriterion("agent_rate <>", value, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateGreaterThan(Integer value) {
            addCriterion("agent_rate >", value, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_rate >=", value, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateLessThan(Integer value) {
            addCriterion("agent_rate <", value, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateLessThanOrEqualTo(Integer value) {
            addCriterion("agent_rate <=", value, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateIn(List<Integer> values) {
            addCriterion("agent_rate in", values, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateNotIn(List<Integer> values) {
            addCriterion("agent_rate not in", values, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateBetween(Integer value1, Integer value2) {
            addCriterion("agent_rate between", value1, value2, "agent_rate");
            return (Criteria) this;
        }

        public Criteria andAgent_rateNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_rate not between", value1, value2, "agent_rate");
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