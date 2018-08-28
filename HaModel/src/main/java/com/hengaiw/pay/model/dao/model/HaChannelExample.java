package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaChannelExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaChannelExample() {
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

        public Criteria andChannel_nameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannel_nameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_nameEqualTo(String value) {
            addCriterion("channel_name =", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameLessThan(String value) {
            addCriterion("channel_name <", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameLike(String value) {
            addCriterion("channel_name like", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotLike(String value) {
            addCriterion("channel_name not like", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameIn(List<String> values) {
            addCriterion("channel_name in", values, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channel_name");
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

        public Criteria andChannel_statusIsNull() {
            addCriterion("channel_status is null");
            return (Criteria) this;
        }

        public Criteria andChannel_statusIsNotNull() {
            addCriterion("channel_status is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_statusEqualTo(Boolean value) {
            addCriterion("channel_status =", value, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusNotEqualTo(Boolean value) {
            addCriterion("channel_status <>", value, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusGreaterThan(Boolean value) {
            addCriterion("channel_status >", value, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("channel_status >=", value, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusLessThan(Boolean value) {
            addCriterion("channel_status <", value, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("channel_status <=", value, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusIn(List<Boolean> values) {
            addCriterion("channel_status in", values, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusNotIn(List<Boolean> values) {
            addCriterion("channel_status not in", values, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("channel_status between", value1, value2, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("channel_status not between", value1, value2, "channel_status");
            return (Criteria) this;
        }

        public Criteria andChannel_urlIsNull() {
            addCriterion("channel_url is null");
            return (Criteria) this;
        }

        public Criteria andChannel_urlIsNotNull() {
            addCriterion("channel_url is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_urlEqualTo(String value) {
            addCriterion("channel_url =", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlNotEqualTo(String value) {
            addCriterion("channel_url <>", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlGreaterThan(String value) {
            addCriterion("channel_url >", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlGreaterThanOrEqualTo(String value) {
            addCriterion("channel_url >=", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlLessThan(String value) {
            addCriterion("channel_url <", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlLessThanOrEqualTo(String value) {
            addCriterion("channel_url <=", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlLike(String value) {
            addCriterion("channel_url like", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlNotLike(String value) {
            addCriterion("channel_url not like", value, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlIn(List<String> values) {
            addCriterion("channel_url in", values, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlNotIn(List<String> values) {
            addCriterion("channel_url not in", values, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlBetween(String value1, String value2) {
            addCriterion("channel_url between", value1, value2, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_urlNotBetween(String value1, String value2) {
            addCriterion("channel_url not between", value1, value2, "channel_url");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitIsNull() {
            addCriterion("channel_day_limit is null");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitIsNotNull() {
            addCriterion("channel_day_limit is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitEqualTo(Long value) {
            addCriterion("channel_day_limit =", value, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitNotEqualTo(Long value) {
            addCriterion("channel_day_limit <>", value, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitGreaterThan(Long value) {
            addCriterion("channel_day_limit >", value, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_day_limit >=", value, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitLessThan(Long value) {
            addCriterion("channel_day_limit <", value, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitLessThanOrEqualTo(Long value) {
            addCriterion("channel_day_limit <=", value, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitIn(List<Long> values) {
            addCriterion("channel_day_limit in", values, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitNotIn(List<Long> values) {
            addCriterion("channel_day_limit not in", values, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitBetween(Long value1, Long value2) {
            addCriterion("channel_day_limit between", value1, value2, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_limitNotBetween(Long value1, Long value2) {
            addCriterion("channel_day_limit not between", value1, value2, "channel_day_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useIsNull() {
            addCriterion("channel_day_use is null");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useIsNotNull() {
            addCriterion("channel_day_use is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useEqualTo(Long value) {
            addCriterion("channel_day_use =", value, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useNotEqualTo(Long value) {
            addCriterion("channel_day_use <>", value, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useGreaterThan(Long value) {
            addCriterion("channel_day_use >", value, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_day_use >=", value, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useLessThan(Long value) {
            addCriterion("channel_day_use <", value, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useLessThanOrEqualTo(Long value) {
            addCriterion("channel_day_use <=", value, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useIn(List<Long> values) {
            addCriterion("channel_day_use in", values, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useNotIn(List<Long> values) {
            addCriterion("channel_day_use not in", values, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useBetween(Long value1, Long value2) {
            addCriterion("channel_day_use between", value1, value2, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_day_useNotBetween(Long value1, Long value2) {
            addCriterion("channel_day_use not between", value1, value2, "channel_day_use");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitIsNull() {
            addCriterion("channel_order_limit is null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitIsNotNull() {
            addCriterion("channel_order_limit is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitEqualTo(Long value) {
            addCriterion("channel_order_limit =", value, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitNotEqualTo(Long value) {
            addCriterion("channel_order_limit <>", value, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitGreaterThan(Long value) {
            addCriterion("channel_order_limit >", value, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_order_limit >=", value, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitLessThan(Long value) {
            addCriterion("channel_order_limit <", value, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitLessThanOrEqualTo(Long value) {
            addCriterion("channel_order_limit <=", value, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitIn(List<Long> values) {
            addCriterion("channel_order_limit in", values, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitNotIn(List<Long> values) {
            addCriterion("channel_order_limit not in", values, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitBetween(Long value1, Long value2) {
            addCriterion("channel_order_limit between", value1, value2, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_order_limitNotBetween(Long value1, Long value2) {
            addCriterion("channel_order_limit not between", value1, value2, "channel_order_limit");
            return (Criteria) this;
        }

        public Criteria andChannel_cashIsNull() {
            addCriterion("channel_cash is null");
            return (Criteria) this;
        }

        public Criteria andChannel_cashIsNotNull() {
            addCriterion("channel_cash is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_cashEqualTo(Integer value) {
            addCriterion("channel_cash =", value, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashNotEqualTo(Integer value) {
            addCriterion("channel_cash <>", value, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashGreaterThan(Integer value) {
            addCriterion("channel_cash >", value, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_cash >=", value, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashLessThan(Integer value) {
            addCriterion("channel_cash <", value, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashLessThanOrEqualTo(Integer value) {
            addCriterion("channel_cash <=", value, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashIn(List<Integer> values) {
            addCriterion("channel_cash in", values, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashNotIn(List<Integer> values) {
            addCriterion("channel_cash not in", values, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashBetween(Integer value1, Integer value2) {
            addCriterion("channel_cash between", value1, value2, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_cashNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_cash not between", value1, value2, "channel_cash");
            return (Criteria) this;
        }

        public Criteria andChannel_signIsNull() {
            addCriterion("channel_sign is null");
            return (Criteria) this;
        }

        public Criteria andChannel_signIsNotNull() {
            addCriterion("channel_sign is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_signEqualTo(String value) {
            addCriterion("channel_sign =", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signNotEqualTo(String value) {
            addCriterion("channel_sign <>", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signGreaterThan(String value) {
            addCriterion("channel_sign >", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signGreaterThanOrEqualTo(String value) {
            addCriterion("channel_sign >=", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signLessThan(String value) {
            addCriterion("channel_sign <", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signLessThanOrEqualTo(String value) {
            addCriterion("channel_sign <=", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signLike(String value) {
            addCriterion("channel_sign like", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signNotLike(String value) {
            addCriterion("channel_sign not like", value, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signIn(List<String> values) {
            addCriterion("channel_sign in", values, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signNotIn(List<String> values) {
            addCriterion("channel_sign not in", values, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signBetween(String value1, String value2) {
            addCriterion("channel_sign between", value1, value2, "channel_sign");
            return (Criteria) this;
        }

        public Criteria andChannel_signNotBetween(String value1, String value2) {
            addCriterion("channel_sign not between", value1, value2, "channel_sign");
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