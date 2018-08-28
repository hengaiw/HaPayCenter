package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaMerchantProductExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaMerchantProductExample() {
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

        public Criteria andMerchant_day_limitIsNull() {
            addCriterion("merchant_day_limit is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitIsNotNull() {
            addCriterion("merchant_day_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitEqualTo(Long value) {
            addCriterion("merchant_day_limit =", value, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitNotEqualTo(Long value) {
            addCriterion("merchant_day_limit <>", value, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitGreaterThan(Long value) {
            addCriterion("merchant_day_limit >", value, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_day_limit >=", value, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitLessThan(Long value) {
            addCriterion("merchant_day_limit <", value, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitLessThanOrEqualTo(Long value) {
            addCriterion("merchant_day_limit <=", value, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitIn(List<Long> values) {
            addCriterion("merchant_day_limit in", values, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitNotIn(List<Long> values) {
            addCriterion("merchant_day_limit not in", values, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitBetween(Long value1, Long value2) {
            addCriterion("merchant_day_limit between", value1, value2, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_limitNotBetween(Long value1, Long value2) {
            addCriterion("merchant_day_limit not between", value1, value2, "merchant_day_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useIsNull() {
            addCriterion("merchant_day_use is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useIsNotNull() {
            addCriterion("merchant_day_use is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useEqualTo(Long value) {
            addCriterion("merchant_day_use =", value, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useNotEqualTo(Long value) {
            addCriterion("merchant_day_use <>", value, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useGreaterThan(Long value) {
            addCriterion("merchant_day_use >", value, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_day_use >=", value, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useLessThan(Long value) {
            addCriterion("merchant_day_use <", value, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useLessThanOrEqualTo(Long value) {
            addCriterion("merchant_day_use <=", value, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useIn(List<Long> values) {
            addCriterion("merchant_day_use in", values, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useNotIn(List<Long> values) {
            addCriterion("merchant_day_use not in", values, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useBetween(Long value1, Long value2) {
            addCriterion("merchant_day_use between", value1, value2, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_day_useNotBetween(Long value1, Long value2) {
            addCriterion("merchant_day_use not between", value1, value2, "merchant_day_use");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitIsNull() {
            addCriterion("merchant_order_limit is null");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitIsNotNull() {
            addCriterion("merchant_order_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitEqualTo(Long value) {
            addCriterion("merchant_order_limit =", value, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitNotEqualTo(Long value) {
            addCriterion("merchant_order_limit <>", value, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitGreaterThan(Long value) {
            addCriterion("merchant_order_limit >", value, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_order_limit >=", value, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitLessThan(Long value) {
            addCriterion("merchant_order_limit <", value, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitLessThanOrEqualTo(Long value) {
            addCriterion("merchant_order_limit <=", value, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitIn(List<Long> values) {
            addCriterion("merchant_order_limit in", values, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitNotIn(List<Long> values) {
            addCriterion("merchant_order_limit not in", values, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitBetween(Long value1, Long value2) {
            addCriterion("merchant_order_limit between", value1, value2, "merchant_order_limit");
            return (Criteria) this;
        }

        public Criteria andMerchant_order_limitNotBetween(Long value1, Long value2) {
            addCriterion("merchant_order_limit not between", value1, value2, "merchant_order_limit");
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

        public Criteria andProduct_statusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProduct_statusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_statusEqualTo(Boolean value) {
            addCriterion("product_status =", value, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusNotEqualTo(Boolean value) {
            addCriterion("product_status <>", value, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusGreaterThan(Boolean value) {
            addCriterion("product_status >", value, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("product_status >=", value, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusLessThan(Boolean value) {
            addCriterion("product_status <", value, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("product_status <=", value, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusIn(List<Boolean> values) {
            addCriterion("product_status in", values, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusNotIn(List<Boolean> values) {
            addCriterion("product_status not in", values, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("product_status between", value1, value2, "product_status");
            return (Criteria) this;
        }

        public Criteria andProduct_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("product_status not between", value1, value2, "product_status");
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