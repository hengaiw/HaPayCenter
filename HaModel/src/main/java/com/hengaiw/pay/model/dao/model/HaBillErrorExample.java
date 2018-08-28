package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaBillErrorExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaBillErrorExample() {
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

        public Criteria andBill_error_idIsNull() {
            addCriterion("bill_error_id is null");
            return (Criteria) this;
        }

        public Criteria andBill_error_idIsNotNull() {
            addCriterion("bill_error_id is not null");
            return (Criteria) this;
        }

        public Criteria andBill_error_idEqualTo(Integer value) {
            addCriterion("bill_error_id =", value, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idNotEqualTo(Integer value) {
            addCriterion("bill_error_id <>", value, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idGreaterThan(Integer value) {
            addCriterion("bill_error_id >", value, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_error_id >=", value, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idLessThan(Integer value) {
            addCriterion("bill_error_id <", value, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idLessThanOrEqualTo(Integer value) {
            addCriterion("bill_error_id <=", value, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idIn(List<Integer> values) {
            addCriterion("bill_error_id in", values, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idNotIn(List<Integer> values) {
            addCriterion("bill_error_id not in", values, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idBetween(Integer value1, Integer value2) {
            addCriterion("bill_error_id between", value1, value2, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_error_idNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_error_id not between", value1, value2, "bill_error_id");
            return (Criteria) this;
        }

        public Criteria andBill_idIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBill_idIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBill_idEqualTo(Integer value) {
            addCriterion("bill_id =", value, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idLessThan(Integer value) {
            addCriterion("bill_id <", value, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idIn(List<Integer> values) {
            addCriterion("bill_id in", values, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "bill_id");
            return (Criteria) this;
        }

        public Criteria andBill_idNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "bill_id");
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

        public Criteria andOrder_amountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_amountEqualTo(Integer value) {
            addCriterion("order_amount =", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotEqualTo(Integer value) {
            addCriterion("order_amount <>", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThan(Integer value) {
            addCriterion("order_amount >", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_amount >=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThan(Integer value) {
            addCriterion("order_amount <", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThanOrEqualTo(Integer value) {
            addCriterion("order_amount <=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIn(List<Integer> values) {
            addCriterion("order_amount in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotIn(List<Integer> values) {
            addCriterion("order_amount not in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountBetween(Integer value1, Integer value2) {
            addCriterion("order_amount between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_amount not between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoIsNull() {
            addCriterion("channel_orderno is null");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoIsNotNull() {
            addCriterion("channel_orderno is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoEqualTo(String value) {
            addCriterion("channel_orderno =", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoNotEqualTo(String value) {
            addCriterion("channel_orderno <>", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoGreaterThan(String value) {
            addCriterion("channel_orderno >", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoGreaterThanOrEqualTo(String value) {
            addCriterion("channel_orderno >=", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoLessThan(String value) {
            addCriterion("channel_orderno <", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoLessThanOrEqualTo(String value) {
            addCriterion("channel_orderno <=", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoLike(String value) {
            addCriterion("channel_orderno like", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoNotLike(String value) {
            addCriterion("channel_orderno not like", value, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoIn(List<String> values) {
            addCriterion("channel_orderno in", values, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoNotIn(List<String> values) {
            addCriterion("channel_orderno not in", values, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoBetween(String value1, String value2) {
            addCriterion("channel_orderno between", value1, value2, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_ordernoNotBetween(String value1, String value2) {
            addCriterion("channel_orderno not between", value1, value2, "channel_orderno");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountIsNull() {
            addCriterion("channel_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountIsNotNull() {
            addCriterion("channel_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountEqualTo(Integer value) {
            addCriterion("channel_order_amount =", value, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountNotEqualTo(Integer value) {
            addCriterion("channel_order_amount <>", value, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountGreaterThan(Integer value) {
            addCriterion("channel_order_amount >", value, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_order_amount >=", value, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountLessThan(Integer value) {
            addCriterion("channel_order_amount <", value, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountLessThanOrEqualTo(Integer value) {
            addCriterion("channel_order_amount <=", value, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountIn(List<Integer> values) {
            addCriterion("channel_order_amount in", values, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountNotIn(List<Integer> values) {
            addCriterion("channel_order_amount not in", values, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountBetween(Integer value1, Integer value2) {
            addCriterion("channel_order_amount between", value1, value2, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andChannel_order_amountNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_order_amount not between", value1, value2, "channel_order_amount");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeIsNull() {
            addCriterion("bill_error_type is null");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeIsNotNull() {
            addCriterion("bill_error_type is not null");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeEqualTo(Boolean value) {
            addCriterion("bill_error_type =", value, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeNotEqualTo(Boolean value) {
            addCriterion("bill_error_type <>", value, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeGreaterThan(Boolean value) {
            addCriterion("bill_error_type >", value, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bill_error_type >=", value, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeLessThan(Boolean value) {
            addCriterion("bill_error_type <", value, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("bill_error_type <=", value, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeIn(List<Boolean> values) {
            addCriterion("bill_error_type in", values, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeNotIn(List<Boolean> values) {
            addCriterion("bill_error_type not in", values, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("bill_error_type between", value1, value2, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bill_error_type not between", value1, value2, "bill_error_type");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusIsNull() {
            addCriterion("bill_error_status is null");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusIsNotNull() {
            addCriterion("bill_error_status is not null");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusEqualTo(Boolean value) {
            addCriterion("bill_error_status =", value, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusNotEqualTo(Boolean value) {
            addCriterion("bill_error_status <>", value, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusGreaterThan(Boolean value) {
            addCriterion("bill_error_status >", value, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bill_error_status >=", value, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusLessThan(Boolean value) {
            addCriterion("bill_error_status <", value, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("bill_error_status <=", value, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusIn(List<Boolean> values) {
            addCriterion("bill_error_status in", values, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusNotIn(List<Boolean> values) {
            addCriterion("bill_error_status not in", values, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("bill_error_status between", value1, value2, "bill_error_status");
            return (Criteria) this;
        }

        public Criteria andBill_error_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bill_error_status not between", value1, value2, "bill_error_status");
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