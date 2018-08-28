package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaBillExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaBillExample() {
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

        public Criteria andBill_dateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBill_dateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBill_dateEqualTo(String value) {
            addCriterion("bill_date =", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotEqualTo(String value) {
            addCriterion("bill_date <>", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateGreaterThan(String value) {
            addCriterion("bill_date >", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateGreaterThanOrEqualTo(String value) {
            addCriterion("bill_date >=", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLessThan(String value) {
            addCriterion("bill_date <", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLessThanOrEqualTo(String value) {
            addCriterion("bill_date <=", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateLike(String value) {
            addCriterion("bill_date like", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotLike(String value) {
            addCriterion("bill_date not like", value, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateIn(List<String> values) {
            addCriterion("bill_date in", values, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotIn(List<String> values) {
            addCriterion("bill_date not in", values, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateBetween(String value1, String value2) {
            addCriterion("bill_date between", value1, value2, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_dateNotBetween(String value1, String value2) {
            addCriterion("bill_date not between", value1, value2, "bill_date");
            return (Criteria) this;
        }

        public Criteria andBill_snIsNull() {
            addCriterion("bill_sn is null");
            return (Criteria) this;
        }

        public Criteria andBill_snIsNotNull() {
            addCriterion("bill_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBill_snEqualTo(String value) {
            addCriterion("bill_sn =", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snNotEqualTo(String value) {
            addCriterion("bill_sn <>", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snGreaterThan(String value) {
            addCriterion("bill_sn >", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snGreaterThanOrEqualTo(String value) {
            addCriterion("bill_sn >=", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snLessThan(String value) {
            addCriterion("bill_sn <", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snLessThanOrEqualTo(String value) {
            addCriterion("bill_sn <=", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snLike(String value) {
            addCriterion("bill_sn like", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snNotLike(String value) {
            addCriterion("bill_sn not like", value, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snIn(List<String> values) {
            addCriterion("bill_sn in", values, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snNotIn(List<String> values) {
            addCriterion("bill_sn not in", values, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snBetween(String value1, String value2) {
            addCriterion("bill_sn between", value1, value2, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andBill_snNotBetween(String value1, String value2) {
            addCriterion("bill_sn not between", value1, value2, "bill_sn");
            return (Criteria) this;
        }

        public Criteria andChannel_idIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannel_idIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_idEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idLessThan(Integer value) {
            addCriterion("channel_id <", value, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channel_id");
            return (Criteria) this;
        }

        public Criteria andChannel_idNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channel_id");
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

        public Criteria andOrder_numIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrder_numIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_numEqualTo(Integer value) {
            addCriterion("order_num =", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThan(Integer value) {
            addCriterion("order_num >", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThan(Integer value) {
            addCriterion("order_num <", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numIn(List<Integer> values) {
            addCriterion("order_num in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyEqualTo(Long value) {
            addCriterion("order_money =", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyNotEqualTo(Long value) {
            addCriterion("order_money <>", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyGreaterThan(Long value) {
            addCriterion("order_money >", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyGreaterThanOrEqualTo(Long value) {
            addCriterion("order_money >=", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyLessThan(Long value) {
            addCriterion("order_money <", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyLessThanOrEqualTo(Long value) {
            addCriterion("order_money <=", value, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyIn(List<Long> values) {
            addCriterion("order_money in", values, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyNotIn(List<Long> values) {
            addCriterion("order_money not in", values, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyBetween(Long value1, Long value2) {
            addCriterion("order_money between", value1, value2, "order_money");
            return (Criteria) this;
        }

        public Criteria andOrder_moneyNotBetween(Long value1, Long value2) {
            addCriterion("order_money not between", value1, value2, "order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numIsNull() {
            addCriterion("channel_order_num is null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numIsNotNull() {
            addCriterion("channel_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numEqualTo(Integer value) {
            addCriterion("channel_order_num =", value, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numNotEqualTo(Integer value) {
            addCriterion("channel_order_num <>", value, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numGreaterThan(Integer value) {
            addCriterion("channel_order_num >", value, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_order_num >=", value, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numLessThan(Integer value) {
            addCriterion("channel_order_num <", value, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numLessThanOrEqualTo(Integer value) {
            addCriterion("channel_order_num <=", value, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numIn(List<Integer> values) {
            addCriterion("channel_order_num in", values, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numNotIn(List<Integer> values) {
            addCriterion("channel_order_num not in", values, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numBetween(Integer value1, Integer value2) {
            addCriterion("channel_order_num between", value1, value2, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_numNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_order_num not between", value1, value2, "channel_order_num");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyIsNull() {
            addCriterion("channel_order_money is null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyIsNotNull() {
            addCriterion("channel_order_money is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyEqualTo(Long value) {
            addCriterion("channel_order_money =", value, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyNotEqualTo(Long value) {
            addCriterion("channel_order_money <>", value, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyGreaterThan(Long value) {
            addCriterion("channel_order_money >", value, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_order_money >=", value, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyLessThan(Long value) {
            addCriterion("channel_order_money <", value, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyLessThanOrEqualTo(Long value) {
            addCriterion("channel_order_money <=", value, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyIn(List<Long> values) {
            addCriterion("channel_order_money in", values, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyNotIn(List<Long> values) {
            addCriterion("channel_order_money not in", values, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyBetween(Long value1, Long value2) {
            addCriterion("channel_order_money between", value1, value2, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andChannel_order_moneyNotBetween(Long value1, Long value2) {
            addCriterion("channel_order_money not between", value1, value2, "channel_order_money");
            return (Criteria) this;
        }

        public Criteria andError_numIsNull() {
            addCriterion("error_num is null");
            return (Criteria) this;
        }

        public Criteria andError_numIsNotNull() {
            addCriterion("error_num is not null");
            return (Criteria) this;
        }

        public Criteria andError_numEqualTo(Integer value) {
            addCriterion("error_num =", value, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numNotEqualTo(Integer value) {
            addCriterion("error_num <>", value, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numGreaterThan(Integer value) {
            addCriterion("error_num >", value, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_num >=", value, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numLessThan(Integer value) {
            addCriterion("error_num <", value, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numLessThanOrEqualTo(Integer value) {
            addCriterion("error_num <=", value, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numIn(List<Integer> values) {
            addCriterion("error_num in", values, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numNotIn(List<Integer> values) {
            addCriterion("error_num not in", values, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numBetween(Integer value1, Integer value2) {
            addCriterion("error_num between", value1, value2, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_numNotBetween(Integer value1, Integer value2) {
            addCriterion("error_num not between", value1, value2, "error_num");
            return (Criteria) this;
        }

        public Criteria andError_moneyIsNull() {
            addCriterion("error_money is null");
            return (Criteria) this;
        }

        public Criteria andError_moneyIsNotNull() {
            addCriterion("error_money is not null");
            return (Criteria) this;
        }

        public Criteria andError_moneyEqualTo(Long value) {
            addCriterion("error_money =", value, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyNotEqualTo(Long value) {
            addCriterion("error_money <>", value, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyGreaterThan(Long value) {
            addCriterion("error_money >", value, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyGreaterThanOrEqualTo(Long value) {
            addCriterion("error_money >=", value, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyLessThan(Long value) {
            addCriterion("error_money <", value, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyLessThanOrEqualTo(Long value) {
            addCriterion("error_money <=", value, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyIn(List<Long> values) {
            addCriterion("error_money in", values, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyNotIn(List<Long> values) {
            addCriterion("error_money not in", values, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyBetween(Long value1, Long value2) {
            addCriterion("error_money between", value1, value2, "error_money");
            return (Criteria) this;
        }

        public Criteria andError_moneyNotBetween(Long value1, Long value2) {
            addCriterion("error_money not between", value1, value2, "error_money");
            return (Criteria) this;
        }

        public Criteria andBill_statusIsNull() {
            addCriterion("bill_status is null");
            return (Criteria) this;
        }

        public Criteria andBill_statusIsNotNull() {
            addCriterion("bill_status is not null");
            return (Criteria) this;
        }

        public Criteria andBill_statusEqualTo(Byte value) {
            addCriterion("bill_status =", value, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusNotEqualTo(Byte value) {
            addCriterion("bill_status <>", value, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusGreaterThan(Byte value) {
            addCriterion("bill_status >", value, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("bill_status >=", value, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusLessThan(Byte value) {
            addCriterion("bill_status <", value, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusLessThanOrEqualTo(Byte value) {
            addCriterion("bill_status <=", value, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusIn(List<Byte> values) {
            addCriterion("bill_status in", values, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusNotIn(List<Byte> values) {
            addCriterion("bill_status not in", values, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusBetween(Byte value1, Byte value2) {
            addCriterion("bill_status between", value1, value2, "bill_status");
            return (Criteria) this;
        }

        public Criteria andBill_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("bill_status not between", value1, value2, "bill_status");
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