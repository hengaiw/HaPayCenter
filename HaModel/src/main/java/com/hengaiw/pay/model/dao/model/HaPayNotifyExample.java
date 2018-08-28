package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaPayNotifyExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaPayNotifyExample() {
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

        public Criteria andNotify_idIsNull() {
            addCriterion("notify_id is null");
            return (Criteria) this;
        }

        public Criteria andNotify_idIsNotNull() {
            addCriterion("notify_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_idEqualTo(Integer value) {
            addCriterion("notify_id =", value, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idNotEqualTo(Integer value) {
            addCriterion("notify_id <>", value, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idGreaterThan(Integer value) {
            addCriterion("notify_id >", value, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_id >=", value, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idLessThan(Integer value) {
            addCriterion("notify_id <", value, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idLessThanOrEqualTo(Integer value) {
            addCriterion("notify_id <=", value, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idIn(List<Integer> values) {
            addCriterion("notify_id in", values, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idNotIn(List<Integer> values) {
            addCriterion("notify_id not in", values, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idBetween(Integer value1, Integer value2) {
            addCriterion("notify_id between", value1, value2, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_idNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_id not between", value1, value2, "notify_id");
            return (Criteria) this;
        }

        public Criteria andNotify_typeIsNull() {
            addCriterion("notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNotify_typeIsNotNull() {
            addCriterion("notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_typeEqualTo(String value) {
            addCriterion("notify_type =", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotEqualTo(String value) {
            addCriterion("notify_type <>", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeGreaterThan(String value) {
            addCriterion("notify_type >", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeGreaterThanOrEqualTo(String value) {
            addCriterion("notify_type >=", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeLessThan(String value) {
            addCriterion("notify_type <", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeLessThanOrEqualTo(String value) {
            addCriterion("notify_type <=", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeLike(String value) {
            addCriterion("notify_type like", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotLike(String value) {
            addCriterion("notify_type not like", value, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeIn(List<String> values) {
            addCriterion("notify_type in", values, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotIn(List<String> values) {
            addCriterion("notify_type not in", values, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeBetween(String value1, String value2) {
            addCriterion("notify_type between", value1, value2, "notify_type");
            return (Criteria) this;
        }

        public Criteria andNotify_typeNotBetween(String value1, String value2) {
            addCriterion("notify_type not between", value1, value2, "notify_type");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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