package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaPayOrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaPayOrderExample() {
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

        public Criteria andPay_order_idIsNull() {
            addCriterion("pay_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPay_order_idIsNotNull() {
            addCriterion("pay_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPay_order_idEqualTo(Long value) {
            addCriterion("pay_order_id =", value, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idNotEqualTo(Long value) {
            addCriterion("pay_order_id <>", value, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idGreaterThan(Long value) {
            addCriterion("pay_order_id >", value, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_order_id >=", value, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idLessThan(Long value) {
            addCriterion("pay_order_id <", value, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idLessThanOrEqualTo(Long value) {
            addCriterion("pay_order_id <=", value, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idIn(List<Long> values) {
            addCriterion("pay_order_id in", values, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idNotIn(List<Long> values) {
            addCriterion("pay_order_id not in", values, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idBetween(Long value1, Long value2) {
            addCriterion("pay_order_id between", value1, value2, "pay_order_id");
            return (Criteria) this;
        }

        public Criteria andPay_order_idNotBetween(Long value1, Long value2) {
            addCriterion("pay_order_id not between", value1, value2, "pay_order_id");
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

        public Criteria andMerchant_product_idIsNull() {
            addCriterion("merchant_product_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idIsNotNull() {
            addCriterion("merchant_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idEqualTo(Integer value) {
            addCriterion("merchant_product_id =", value, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idNotEqualTo(Integer value) {
            addCriterion("merchant_product_id <>", value, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idGreaterThan(Integer value) {
            addCriterion("merchant_product_id >", value, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_product_id >=", value, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idLessThan(Integer value) {
            addCriterion("merchant_product_id <", value, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_product_id <=", value, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idIn(List<Integer> values) {
            addCriterion("merchant_product_id in", values, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idNotIn(List<Integer> values) {
            addCriterion("merchant_product_id not in", values, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idBetween(Integer value1, Integer value2) {
            addCriterion("merchant_product_id between", value1, value2, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andMerchant_product_idNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_product_id not between", value1, value2, "merchant_product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_typeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProduct_typeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_typeEqualTo(String value) {
            addCriterion("product_type =", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeGreaterThan(String value) {
            addCriterion("product_type >", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeLessThan(String value) {
            addCriterion("product_type <", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeLike(String value) {
            addCriterion("product_type like", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotLike(String value) {
            addCriterion("product_type not like", value, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeIn(List<String> values) {
            addCriterion("product_type in", values, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "product_type");
            return (Criteria) this;
        }

        public Criteria andProduct_typeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "product_type");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameIsNull() {
            addCriterion("trade_type_nickname is null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameIsNotNull() {
            addCriterion("trade_type_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameEqualTo(String value) {
            addCriterion("trade_type_nickname =", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotEqualTo(String value) {
            addCriterion("trade_type_nickname <>", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameGreaterThan(String value) {
            addCriterion("trade_type_nickname >", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type_nickname >=", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameLessThan(String value) {
            addCriterion("trade_type_nickname <", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameLessThanOrEqualTo(String value) {
            addCriterion("trade_type_nickname <=", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameLike(String value) {
            addCriterion("trade_type_nickname like", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotLike(String value) {
            addCriterion("trade_type_nickname not like", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameIn(List<String> values) {
            addCriterion("trade_type_nickname in", values, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotIn(List<String> values) {
            addCriterion("trade_type_nickname not in", values, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameBetween(String value1, String value2) {
            addCriterion("trade_type_nickname between", value1, value2, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotBetween(String value1, String value2) {
            addCriterion("trade_type_nickname not between", value1, value2, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateIsNull() {
            addCriterion("merchant_rate is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateIsNotNull() {
            addCriterion("merchant_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateEqualTo(Integer value) {
            addCriterion("merchant_rate =", value, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateNotEqualTo(Integer value) {
            addCriterion("merchant_rate <>", value, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateGreaterThan(Integer value) {
            addCriterion("merchant_rate >", value, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_rate >=", value, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateLessThan(Integer value) {
            addCriterion("merchant_rate <", value, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_rate <=", value, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateIn(List<Integer> values) {
            addCriterion("merchant_rate in", values, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateNotIn(List<Integer> values) {
            addCriterion("merchant_rate not in", values, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateBetween(Integer value1, Integer value2) {
            addCriterion("merchant_rate between", value1, value2, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_rateNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_rate not between", value1, value2, "merchant_rate");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeIsNull() {
            addCriterion("merchant_charge is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeIsNotNull() {
            addCriterion("merchant_charge is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeEqualTo(Integer value) {
            addCriterion("merchant_charge =", value, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeNotEqualTo(Integer value) {
            addCriterion("merchant_charge <>", value, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeGreaterThan(Integer value) {
            addCriterion("merchant_charge >", value, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_charge >=", value, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeLessThan(Integer value) {
            addCriterion("merchant_charge <", value, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_charge <=", value, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeIn(List<Integer> values) {
            addCriterion("merchant_charge in", values, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeNotIn(List<Integer> values) {
            addCriterion("merchant_charge not in", values, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeBetween(Integer value1, Integer value2) {
            addCriterion("merchant_charge between", value1, value2, "merchant_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_chargeNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_charge not between", value1, value2, "merchant_charge");
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

        public Criteria andAgent_chargeIsNull() {
            addCriterion("agent_charge is null");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeIsNotNull() {
            addCriterion("agent_charge is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeEqualTo(Integer value) {
            addCriterion("agent_charge =", value, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeNotEqualTo(Integer value) {
            addCriterion("agent_charge <>", value, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeGreaterThan(Integer value) {
            addCriterion("agent_charge >", value, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_charge >=", value, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeLessThan(Integer value) {
            addCriterion("agent_charge <", value, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeLessThanOrEqualTo(Integer value) {
            addCriterion("agent_charge <=", value, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeIn(List<Integer> values) {
            addCriterion("agent_charge in", values, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeNotIn(List<Integer> values) {
            addCriterion("agent_charge not in", values, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeBetween(Integer value1, Integer value2) {
            addCriterion("agent_charge between", value1, value2, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andAgent_chargeNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_charge not between", value1, value2, "agent_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_rateIsNull() {
            addCriterion("product_rate is null");
            return (Criteria) this;
        }

        public Criteria andProduct_rateIsNotNull() {
            addCriterion("product_rate is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_rateEqualTo(Integer value) {
            addCriterion("product_rate =", value, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateNotEqualTo(Integer value) {
            addCriterion("product_rate <>", value, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateGreaterThan(Integer value) {
            addCriterion("product_rate >", value, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_rate >=", value, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateLessThan(Integer value) {
            addCriterion("product_rate <", value, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateLessThanOrEqualTo(Integer value) {
            addCriterion("product_rate <=", value, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateIn(List<Integer> values) {
            addCriterion("product_rate in", values, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateNotIn(List<Integer> values) {
            addCriterion("product_rate not in", values, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateBetween(Integer value1, Integer value2) {
            addCriterion("product_rate between", value1, value2, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_rateNotBetween(Integer value1, Integer value2) {
            addCriterion("product_rate not between", value1, value2, "product_rate");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeIsNull() {
            addCriterion("product_charge is null");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeIsNotNull() {
            addCriterion("product_charge is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeEqualTo(Integer value) {
            addCriterion("product_charge =", value, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeNotEqualTo(Integer value) {
            addCriterion("product_charge <>", value, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeGreaterThan(Integer value) {
            addCriterion("product_charge >", value, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_charge >=", value, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeLessThan(Integer value) {
            addCriterion("product_charge <", value, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeLessThanOrEqualTo(Integer value) {
            addCriterion("product_charge <=", value, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeIn(List<Integer> values) {
            addCriterion("product_charge in", values, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeNotIn(List<Integer> values) {
            addCriterion("product_charge not in", values, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeBetween(Integer value1, Integer value2) {
            addCriterion("product_charge between", value1, value2, "product_charge");
            return (Criteria) this;
        }

        public Criteria andProduct_chargeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_charge not between", value1, value2, "product_charge");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noIsNull() {
            addCriterion("merchant_order_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noIsNotNull() {
            addCriterion("merchant_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noEqualTo(String value) {
            addCriterion("merchant_order_no =", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotEqualTo(String value) {
            addCriterion("merchant_order_no <>", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noGreaterThan(String value) {
            addCriterion("merchant_order_no >", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_order_no >=", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noLessThan(String value) {
            addCriterion("merchant_order_no <", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noLessThanOrEqualTo(String value) {
            addCriterion("merchant_order_no <=", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noLike(String value) {
            addCriterion("merchant_order_no like", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotLike(String value) {
            addCriterion("merchant_order_no not like", value, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noIn(List<String> values) {
            addCriterion("merchant_order_no in", values, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotIn(List<String> values) {
            addCriterion("merchant_order_no not in", values, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noBetween(String value1, String value2) {
            addCriterion("merchant_order_no between", value1, value2, "merchant_order_no");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_noNotBetween(String value1, String value2) {
            addCriterion("merchant_order_no not between", value1, value2, "merchant_order_no");
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

        public Criteria andOrder_amountEqualTo(Long value) {
            addCriterion("order_amount =", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotEqualTo(Long value) {
            addCriterion("order_amount <>", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThan(Long value) {
            addCriterion("order_amount >", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThanOrEqualTo(Long value) {
            addCriterion("order_amount >=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThan(Long value) {
            addCriterion("order_amount <", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThanOrEqualTo(Long value) {
            addCriterion("order_amount <=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIn(List<Long> values) {
            addCriterion("order_amount in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotIn(List<Long> values) {
            addCriterion("order_amount not in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountBetween(Long value1, Long value2) {
            addCriterion("order_amount between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotBetween(Long value1, Long value2) {
            addCriterion("order_amount not between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyIsNull() {
            addCriterion("order_currency is null");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyIsNotNull() {
            addCriterion("order_currency is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyEqualTo(String value) {
            addCriterion("order_currency =", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyNotEqualTo(String value) {
            addCriterion("order_currency <>", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyGreaterThan(String value) {
            addCriterion("order_currency >", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyGreaterThanOrEqualTo(String value) {
            addCriterion("order_currency >=", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyLessThan(String value) {
            addCriterion("order_currency <", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyLessThanOrEqualTo(String value) {
            addCriterion("order_currency <=", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyLike(String value) {
            addCriterion("order_currency like", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyNotLike(String value) {
            addCriterion("order_currency not like", value, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyIn(List<String> values) {
            addCriterion("order_currency in", values, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyNotIn(List<String> values) {
            addCriterion("order_currency not in", values, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyBetween(String value1, String value2) {
            addCriterion("order_currency between", value1, value2, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_currencyNotBetween(String value1, String value2) {
            addCriterion("order_currency not between", value1, value2, "order_currency");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_statusEqualTo(Byte value) {
            addCriterion("order_status =", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusLessThan(Byte value) {
            addCriterion("order_status <", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIn(List<Byte> values) {
            addCriterion("order_status in", values, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpIsNull() {
            addCriterion("order_clientIp is null");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpIsNotNull() {
            addCriterion("order_clientIp is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpEqualTo(String value) {
            addCriterion("order_clientIp =", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpNotEqualTo(String value) {
            addCriterion("order_clientIp <>", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpGreaterThan(String value) {
            addCriterion("order_clientIp >", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpGreaterThanOrEqualTo(String value) {
            addCriterion("order_clientIp >=", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpLessThan(String value) {
            addCriterion("order_clientIp <", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpLessThanOrEqualTo(String value) {
            addCriterion("order_clientIp <=", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpLike(String value) {
            addCriterion("order_clientIp like", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpNotLike(String value) {
            addCriterion("order_clientIp not like", value, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpIn(List<String> values) {
            addCriterion("order_clientIp in", values, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpNotIn(List<String> values) {
            addCriterion("order_clientIp not in", values, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpBetween(String value1, String value2) {
            addCriterion("order_clientIp between", value1, value2, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_clientIpNotBetween(String value1, String value2) {
            addCriterion("order_clientIp not between", value1, value2, "order_clientIp");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceIsNull() {
            addCriterion("order_device is null");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceIsNotNull() {
            addCriterion("order_device is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceEqualTo(String value) {
            addCriterion("order_device =", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceNotEqualTo(String value) {
            addCriterion("order_device <>", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceGreaterThan(String value) {
            addCriterion("order_device >", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceGreaterThanOrEqualTo(String value) {
            addCriterion("order_device >=", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceLessThan(String value) {
            addCriterion("order_device <", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceLessThanOrEqualTo(String value) {
            addCriterion("order_device <=", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceLike(String value) {
            addCriterion("order_device like", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceNotLike(String value) {
            addCriterion("order_device not like", value, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceIn(List<String> values) {
            addCriterion("order_device in", values, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceNotIn(List<String> values) {
            addCriterion("order_device not in", values, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceBetween(String value1, String value2) {
            addCriterion("order_device between", value1, value2, "order_device");
            return (Criteria) this;
        }

        public Criteria andOrder_deviceNotBetween(String value1, String value2) {
            addCriterion("order_device not between", value1, value2, "order_device");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidIsNull() {
            addCriterion("channel_mchid is null");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidIsNotNull() {
            addCriterion("channel_mchid is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidEqualTo(String value) {
            addCriterion("channel_mchid =", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidNotEqualTo(String value) {
            addCriterion("channel_mchid <>", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidGreaterThan(String value) {
            addCriterion("channel_mchid >", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidGreaterThanOrEqualTo(String value) {
            addCriterion("channel_mchid >=", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidLessThan(String value) {
            addCriterion("channel_mchid <", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidLessThanOrEqualTo(String value) {
            addCriterion("channel_mchid <=", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidLike(String value) {
            addCriterion("channel_mchid like", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidNotLike(String value) {
            addCriterion("channel_mchid not like", value, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidIn(List<String> values) {
            addCriterion("channel_mchid in", values, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidNotIn(List<String> values) {
            addCriterion("channel_mchid not in", values, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidBetween(String value1, String value2) {
            addCriterion("channel_mchid between", value1, value2, "channel_mchid");
            return (Criteria) this;
        }

        public Criteria andChannel_mchidNotBetween(String value1, String value2) {
            addCriterion("channel_mchid not between", value1, value2, "channel_mchid");
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

        public Criteria andErr_codeIsNull() {
            addCriterion("err_code is null");
            return (Criteria) this;
        }

        public Criteria andErr_codeIsNotNull() {
            addCriterion("err_code is not null");
            return (Criteria) this;
        }

        public Criteria andErr_codeEqualTo(String value) {
            addCriterion("err_code =", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeNotEqualTo(String value) {
            addCriterion("err_code <>", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeGreaterThan(String value) {
            addCriterion("err_code >", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeGreaterThanOrEqualTo(String value) {
            addCriterion("err_code >=", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeLessThan(String value) {
            addCriterion("err_code <", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeLessThanOrEqualTo(String value) {
            addCriterion("err_code <=", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeLike(String value) {
            addCriterion("err_code like", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeNotLike(String value) {
            addCriterion("err_code not like", value, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeIn(List<String> values) {
            addCriterion("err_code in", values, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeNotIn(List<String> values) {
            addCriterion("err_code not in", values, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeBetween(String value1, String value2) {
            addCriterion("err_code between", value1, value2, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_codeNotBetween(String value1, String value2) {
            addCriterion("err_code not between", value1, value2, "err_code");
            return (Criteria) this;
        }

        public Criteria andErr_msgIsNull() {
            addCriterion("err_msg is null");
            return (Criteria) this;
        }

        public Criteria andErr_msgIsNotNull() {
            addCriterion("err_msg is not null");
            return (Criteria) this;
        }

        public Criteria andErr_msgEqualTo(String value) {
            addCriterion("err_msg =", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgNotEqualTo(String value) {
            addCriterion("err_msg <>", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgGreaterThan(String value) {
            addCriterion("err_msg >", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgGreaterThanOrEqualTo(String value) {
            addCriterion("err_msg >=", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgLessThan(String value) {
            addCriterion("err_msg <", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgLessThanOrEqualTo(String value) {
            addCriterion("err_msg <=", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgLike(String value) {
            addCriterion("err_msg like", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgNotLike(String value) {
            addCriterion("err_msg not like", value, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgIn(List<String> values) {
            addCriterion("err_msg in", values, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgNotIn(List<String> values) {
            addCriterion("err_msg not in", values, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgBetween(String value1, String value2) {
            addCriterion("err_msg between", value1, value2, "err_msg");
            return (Criteria) this;
        }

        public Criteria andErr_msgNotBetween(String value1, String value2) {
            addCriterion("err_msg not between", value1, value2, "err_msg");
            return (Criteria) this;
        }

        public Criteria andNotify_urlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotify_urlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_urlEqualTo(String value) {
            addCriterion("notify_url =", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlLessThan(String value) {
            addCriterion("notify_url <", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlLike(String value) {
            addCriterion("notify_url like", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotLike(String value) {
            addCriterion("notify_url not like", value, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlIn(List<String> values) {
            addCriterion("notify_url in", values, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_urlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notify_url");
            return (Criteria) this;
        }

        public Criteria andNotify_countIsNull() {
            addCriterion("notify_count is null");
            return (Criteria) this;
        }

        public Criteria andNotify_countIsNotNull() {
            addCriterion("notify_count is not null");
            return (Criteria) this;
        }

        public Criteria andNotify_countEqualTo(Byte value) {
            addCriterion("notify_count =", value, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countNotEqualTo(Byte value) {
            addCriterion("notify_count <>", value, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countGreaterThan(Byte value) {
            addCriterion("notify_count >", value, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countGreaterThanOrEqualTo(Byte value) {
            addCriterion("notify_count >=", value, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countLessThan(Byte value) {
            addCriterion("notify_count <", value, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countLessThanOrEqualTo(Byte value) {
            addCriterion("notify_count <=", value, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countIn(List<Byte> values) {
            addCriterion("notify_count in", values, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countNotIn(List<Byte> values) {
            addCriterion("notify_count not in", values, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countBetween(Byte value1, Byte value2) {
            addCriterion("notify_count between", value1, value2, "notify_count");
            return (Criteria) this;
        }

        public Criteria andNotify_countNotBetween(Byte value1, Byte value2) {
            addCriterion("notify_count not between", value1, value2, "notify_count");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeIsNull() {
            addCriterion("last_notify_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeIsNotNull() {
            addCriterion("last_notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeEqualTo(Long value) {
            addCriterion("last_notify_time =", value, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeNotEqualTo(Long value) {
            addCriterion("last_notify_time <>", value, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeGreaterThan(Long value) {
            addCriterion("last_notify_time >", value, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_notify_time >=", value, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeLessThan(Long value) {
            addCriterion("last_notify_time <", value, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeLessThanOrEqualTo(Long value) {
            addCriterion("last_notify_time <=", value, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeIn(List<Long> values) {
            addCriterion("last_notify_time in", values, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeNotIn(List<Long> values) {
            addCriterion("last_notify_time not in", values, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeBetween(Long value1, Long value2) {
            addCriterion("last_notify_time between", value1, value2, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andLast_notify_timeNotBetween(Long value1, Long value2) {
            addCriterion("last_notify_time not between", value1, value2, "last_notify_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpire_timeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpire_timeEqualTo(Long value) {
            addCriterion("expire_time =", value, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeNotEqualTo(Long value) {
            addCriterion("expire_time <>", value, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeGreaterThan(Long value) {
            addCriterion("expire_time >", value, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeGreaterThanOrEqualTo(Long value) {
            addCriterion("expire_time >=", value, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeLessThan(Long value) {
            addCriterion("expire_time <", value, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeLessThanOrEqualTo(Long value) {
            addCriterion("expire_time <=", value, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeIn(List<Long> values) {
            addCriterion("expire_time in", values, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeNotIn(List<Long> values) {
            addCriterion("expire_time not in", values, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeBetween(Long value1, Long value2) {
            addCriterion("expire_time between", value1, value2, "expire_time");
            return (Criteria) this;
        }

        public Criteria andExpire_timeNotBetween(Long value1, Long value2) {
            addCriterion("expire_time not between", value1, value2, "expire_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeIsNull() {
            addCriterion("pay_succ_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeIsNotNull() {
            addCriterion("pay_succ_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeEqualTo(Long value) {
            addCriterion("pay_succ_time =", value, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeNotEqualTo(Long value) {
            addCriterion("pay_succ_time <>", value, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeGreaterThan(Long value) {
            addCriterion("pay_succ_time >", value, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_succ_time >=", value, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeLessThan(Long value) {
            addCriterion("pay_succ_time <", value, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeLessThanOrEqualTo(Long value) {
            addCriterion("pay_succ_time <=", value, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeIn(List<Long> values) {
            addCriterion("pay_succ_time in", values, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeNotIn(List<Long> values) {
            addCriterion("pay_succ_time not in", values, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeBetween(Long value1, Long value2) {
            addCriterion("pay_succ_time between", value1, value2, "pay_succ_time");
            return (Criteria) this;
        }

        public Criteria andPay_succ_timeNotBetween(Long value1, Long value2) {
            addCriterion("pay_succ_time not between", value1, value2, "pay_succ_time");
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

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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