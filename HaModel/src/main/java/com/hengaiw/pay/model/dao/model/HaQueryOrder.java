package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaQueryOrder implements Serializable {
    private Integer query_order_id;

    /**
     * 请求商家号
     *
     * @mbg.generated
     */
    private String merchant_no;

    /**
     * 平台查询订单号
     *
     * @mbg.generated
     */
    private String query_order_sn;

    /**
     * 平台交易订单号
     *
     * @mbg.generated
     */
    private String pay_order_sn;

    /**
     * 查询请求时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 返回的查询结果
     *
     * @mbg.generated
     */
    private String query_result;

    private static final long serialVersionUID = 1L;

    public Integer getQuery_order_id() {
        return query_order_id;
    }

    public void setQuery_order_id(Integer query_order_id) {
        this.query_order_id = query_order_id;
    }

    public String getMerchant_no() {
        return merchant_no;
    }

    public void setMerchant_no(String merchant_no) {
        this.merchant_no = merchant_no;
    }

    public String getQuery_order_sn() {
        return query_order_sn;
    }

    public void setQuery_order_sn(String query_order_sn) {
        this.query_order_sn = query_order_sn;
    }

    public String getPay_order_sn() {
        return pay_order_sn;
    }

    public void setPay_order_sn(String pay_order_sn) {
        this.pay_order_sn = pay_order_sn;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getQuery_result() {
        return query_result;
    }

    public void setQuery_result(String query_result) {
        this.query_result = query_result;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HaQueryOrder other = (HaQueryOrder) that;
        return (this.getQuery_order_id() == null ? other.getQuery_order_id() == null : this.getQuery_order_id().equals(other.getQuery_order_id()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getQuery_order_sn() == null ? other.getQuery_order_sn() == null : this.getQuery_order_sn().equals(other.getQuery_order_sn()))
            && (this.getPay_order_sn() == null ? other.getPay_order_sn() == null : this.getPay_order_sn().equals(other.getPay_order_sn()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getQuery_result() == null ? other.getQuery_result() == null : this.getQuery_result().equals(other.getQuery_result()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuery_order_id() == null) ? 0 : getQuery_order_id().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getQuery_order_sn() == null) ? 0 : getQuery_order_sn().hashCode());
        result = prime * result + ((getPay_order_sn() == null) ? 0 : getPay_order_sn().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getQuery_result() == null) ? 0 : getQuery_result().hashCode());
        return result;
    }
}