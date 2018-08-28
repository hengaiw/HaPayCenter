package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaProductExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaProductExample() {
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

        public Criteria andTrade_type_idIsNull() {
            addCriterion("trade_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idIsNotNull() {
            addCriterion("trade_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idEqualTo(Integer value) {
            addCriterion("trade_type_id =", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idNotEqualTo(Integer value) {
            addCriterion("trade_type_id <>", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idGreaterThan(Integer value) {
            addCriterion("trade_type_id >", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type_id >=", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idLessThan(Integer value) {
            addCriterion("trade_type_id <", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type_id <=", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idIn(List<Integer> values) {
            addCriterion("trade_type_id in", values, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idNotIn(List<Integer> values) {
            addCriterion("trade_type_id not in", values, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idBetween(Integer value1, Integer value2) {
            addCriterion("trade_type_id between", value1, value2, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type_id not between", value1, value2, "trade_type_id");
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

        public Criteria andProduct_nameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_nameEqualTo(String value) {
            addCriterion("product_name =", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameGreaterThan(String value) {
            addCriterion("product_name >", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLessThan(String value) {
            addCriterion("product_name <", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameLike(String value) {
            addCriterion("product_name like", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotLike(String value) {
            addCriterion("product_name not like", value, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameIn(List<String> values) {
            addCriterion("product_name in", values, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "product_name");
            return (Criteria) this;
        }

        public Criteria andProduct_nameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "product_name");
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

        public Criteria andProduct_charging_typeIsNull() {
            addCriterion("product_charging_type is null");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeIsNotNull() {
            addCriterion("product_charging_type is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeEqualTo(String value) {
            addCriterion("product_charging_type =", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeNotEqualTo(String value) {
            addCriterion("product_charging_type <>", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeGreaterThan(String value) {
            addCriterion("product_charging_type >", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeGreaterThanOrEqualTo(String value) {
            addCriterion("product_charging_type >=", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeLessThan(String value) {
            addCriterion("product_charging_type <", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeLessThanOrEqualTo(String value) {
            addCriterion("product_charging_type <=", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeLike(String value) {
            addCriterion("product_charging_type like", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeNotLike(String value) {
            addCriterion("product_charging_type not like", value, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeIn(List<String> values) {
            addCriterion("product_charging_type in", values, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeNotIn(List<String> values) {
            addCriterion("product_charging_type not in", values, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeBetween(String value1, String value2) {
            addCriterion("product_charging_type between", value1, value2, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_charging_typeNotBetween(String value1, String value2) {
            addCriterion("product_charging_type not between", value1, value2, "product_charging_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodIsNull() {
            addCriterion("product_clear_method is null");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodIsNotNull() {
            addCriterion("product_clear_method is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodEqualTo(String value) {
            addCriterion("product_clear_method =", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodNotEqualTo(String value) {
            addCriterion("product_clear_method <>", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodGreaterThan(String value) {
            addCriterion("product_clear_method >", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodGreaterThanOrEqualTo(String value) {
            addCriterion("product_clear_method >=", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodLessThan(String value) {
            addCriterion("product_clear_method <", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodLessThanOrEqualTo(String value) {
            addCriterion("product_clear_method <=", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodLike(String value) {
            addCriterion("product_clear_method like", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodNotLike(String value) {
            addCriterion("product_clear_method not like", value, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodIn(List<String> values) {
            addCriterion("product_clear_method in", values, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodNotIn(List<String> values) {
            addCriterion("product_clear_method not in", values, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodBetween(String value1, String value2) {
            addCriterion("product_clear_method between", value1, value2, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_methodNotBetween(String value1, String value2) {
            addCriterion("product_clear_method not between", value1, value2, "product_clear_method");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeIsNull() {
            addCriterion("product_clear_type is null");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeIsNotNull() {
            addCriterion("product_clear_type is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeEqualTo(String value) {
            addCriterion("product_clear_type =", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeNotEqualTo(String value) {
            addCriterion("product_clear_type <>", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeGreaterThan(String value) {
            addCriterion("product_clear_type >", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeGreaterThanOrEqualTo(String value) {
            addCriterion("product_clear_type >=", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeLessThan(String value) {
            addCriterion("product_clear_type <", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeLessThanOrEqualTo(String value) {
            addCriterion("product_clear_type <=", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeLike(String value) {
            addCriterion("product_clear_type like", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeNotLike(String value) {
            addCriterion("product_clear_type not like", value, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeIn(List<String> values) {
            addCriterion("product_clear_type in", values, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeNotIn(List<String> values) {
            addCriterion("product_clear_type not in", values, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeBetween(String value1, String value2) {
            addCriterion("product_clear_type between", value1, value2, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_clear_typeNotBetween(String value1, String value2) {
            addCriterion("product_clear_type not between", value1, value2, "product_clear_type");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitIsNull() {
            addCriterion("product_day_limit is null");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitIsNotNull() {
            addCriterion("product_day_limit is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitEqualTo(Long value) {
            addCriterion("product_day_limit =", value, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitNotEqualTo(Long value) {
            addCriterion("product_day_limit <>", value, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitGreaterThan(Long value) {
            addCriterion("product_day_limit >", value, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitGreaterThanOrEqualTo(Long value) {
            addCriterion("product_day_limit >=", value, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitLessThan(Long value) {
            addCriterion("product_day_limit <", value, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitLessThanOrEqualTo(Long value) {
            addCriterion("product_day_limit <=", value, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitIn(List<Long> values) {
            addCriterion("product_day_limit in", values, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitNotIn(List<Long> values) {
            addCriterion("product_day_limit not in", values, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitBetween(Long value1, Long value2) {
            addCriterion("product_day_limit between", value1, value2, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_limitNotBetween(Long value1, Long value2) {
            addCriterion("product_day_limit not between", value1, value2, "product_day_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useIsNull() {
            addCriterion("product_day_use is null");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useIsNotNull() {
            addCriterion("product_day_use is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useEqualTo(Long value) {
            addCriterion("product_day_use =", value, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useNotEqualTo(Long value) {
            addCriterion("product_day_use <>", value, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useGreaterThan(Long value) {
            addCriterion("product_day_use >", value, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useGreaterThanOrEqualTo(Long value) {
            addCriterion("product_day_use >=", value, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useLessThan(Long value) {
            addCriterion("product_day_use <", value, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useLessThanOrEqualTo(Long value) {
            addCriterion("product_day_use <=", value, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useIn(List<Long> values) {
            addCriterion("product_day_use in", values, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useNotIn(List<Long> values) {
            addCriterion("product_day_use not in", values, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useBetween(Long value1, Long value2) {
            addCriterion("product_day_use between", value1, value2, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_day_useNotBetween(Long value1, Long value2) {
            addCriterion("product_day_use not between", value1, value2, "product_day_use");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitIsNull() {
            addCriterion("product_order_limit is null");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitIsNotNull() {
            addCriterion("product_order_limit is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitEqualTo(Long value) {
            addCriterion("product_order_limit =", value, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitNotEqualTo(Long value) {
            addCriterion("product_order_limit <>", value, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitGreaterThan(Long value) {
            addCriterion("product_order_limit >", value, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitGreaterThanOrEqualTo(Long value) {
            addCriterion("product_order_limit >=", value, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitLessThan(Long value) {
            addCriterion("product_order_limit <", value, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitLessThanOrEqualTo(Long value) {
            addCriterion("product_order_limit <=", value, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitIn(List<Long> values) {
            addCriterion("product_order_limit in", values, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitNotIn(List<Long> values) {
            addCriterion("product_order_limit not in", values, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitBetween(Long value1, Long value2) {
            addCriterion("product_order_limit between", value1, value2, "product_order_limit");
            return (Criteria) this;
        }

        public Criteria andProduct_order_limitNotBetween(Long value1, Long value2) {
            addCriterion("product_order_limit not between", value1, value2, "product_order_limit");
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

        public Criteria andProduct_urlIsNull() {
            addCriterion("product_url is null");
            return (Criteria) this;
        }

        public Criteria andProduct_urlIsNotNull() {
            addCriterion("product_url is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_urlEqualTo(String value) {
            addCriterion("product_url =", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlNotEqualTo(String value) {
            addCriterion("product_url <>", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlGreaterThan(String value) {
            addCriterion("product_url >", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlGreaterThanOrEqualTo(String value) {
            addCriterion("product_url >=", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlLessThan(String value) {
            addCriterion("product_url <", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlLessThanOrEqualTo(String value) {
            addCriterion("product_url <=", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlLike(String value) {
            addCriterion("product_url like", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlNotLike(String value) {
            addCriterion("product_url not like", value, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlIn(List<String> values) {
            addCriterion("product_url in", values, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlNotIn(List<String> values) {
            addCriterion("product_url not in", values, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlBetween(String value1, String value2) {
            addCriterion("product_url between", value1, value2, "product_url");
            return (Criteria) this;
        }

        public Criteria andProduct_urlNotBetween(String value1, String value2) {
            addCriterion("product_url not between", value1, value2, "product_url");
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