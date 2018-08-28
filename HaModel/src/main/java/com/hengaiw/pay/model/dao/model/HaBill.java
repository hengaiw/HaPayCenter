package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaBill implements Serializable {
    /**
     * 对帐单ID
     *
     * @mbg.generated
     */
    private Integer bill_id;

    /**
     * 对帐日期
     *
     * @mbg.generated
     */
    private String bill_date;

    /**
     * 对帐批次号
     *
     * @mbg.generated
     */
    private String bill_sn;

    /**
     * 通道ID
     *
     * @mbg.generated
     */
    private Integer channel_id;

    /**
     * 产品ID
     *
     * @mbg.generated
     */
    private Integer product_id;

    /**
     * 平台交易笔数
     *
     * @mbg.generated
     */
    private Integer order_num;

    /**
     * 平台交易金额（分）
     *
     * @mbg.generated
     */
    private Long order_money;

    /**
     * 通道交易笔数
     *
     * @mbg.generated
     */
    private Integer channel_order_num;

    /**
     * 通道交易金额（分）
     *
     * @mbg.generated
     */
    private Long channel_order_money;

    /**
     * 异常笔数
     *
     * @mbg.generated
     */
    private Integer error_num;

    /**
     * 异常金额（分）
     *
     * @mbg.generated
     */
    private Long error_money;

    /**
     * 对帐状态（1平帐，2异常，3对帐中）
     *
     * @mbg.generated
     */
    private Byte bill_status;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Integer getBill_id() {
        return bill_id;
    }

    public void setBill_id(Integer bill_id) {
        this.bill_id = bill_id;
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public String getBill_sn() {
        return bill_sn;
    }

    public void setBill_sn(String bill_sn) {
        this.bill_sn = bill_sn;
    }

    public Integer getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Integer channel_id) {
        this.channel_id = channel_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public Long getOrder_money() {
        return order_money;
    }

    public void setOrder_money(Long order_money) {
        this.order_money = order_money;
    }

    public Integer getChannel_order_num() {
        return channel_order_num;
    }

    public void setChannel_order_num(Integer channel_order_num) {
        this.channel_order_num = channel_order_num;
    }

    public Long getChannel_order_money() {
        return channel_order_money;
    }

    public void setChannel_order_money(Long channel_order_money) {
        this.channel_order_money = channel_order_money;
    }

    public Integer getError_num() {
        return error_num;
    }

    public void setError_num(Integer error_num) {
        this.error_num = error_num;
    }

    public Long getError_money() {
        return error_money;
    }

    public void setError_money(Long error_money) {
        this.error_money = error_money;
    }

    public Byte getBill_status() {
        return bill_status;
    }

    public void setBill_status(Byte bill_status) {
        this.bill_status = bill_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
        HaBill other = (HaBill) that;
        return (this.getBill_id() == null ? other.getBill_id() == null : this.getBill_id().equals(other.getBill_id()))
            && (this.getBill_date() == null ? other.getBill_date() == null : this.getBill_date().equals(other.getBill_date()))
            && (this.getBill_sn() == null ? other.getBill_sn() == null : this.getBill_sn().equals(other.getBill_sn()))
            && (this.getChannel_id() == null ? other.getChannel_id() == null : this.getChannel_id().equals(other.getChannel_id()))
            && (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getOrder_num() == null ? other.getOrder_num() == null : this.getOrder_num().equals(other.getOrder_num()))
            && (this.getOrder_money() == null ? other.getOrder_money() == null : this.getOrder_money().equals(other.getOrder_money()))
            && (this.getChannel_order_num() == null ? other.getChannel_order_num() == null : this.getChannel_order_num().equals(other.getChannel_order_num()))
            && (this.getChannel_order_money() == null ? other.getChannel_order_money() == null : this.getChannel_order_money().equals(other.getChannel_order_money()))
            && (this.getError_num() == null ? other.getError_num() == null : this.getError_num().equals(other.getError_num()))
            && (this.getError_money() == null ? other.getError_money() == null : this.getError_money().equals(other.getError_money()))
            && (this.getBill_status() == null ? other.getBill_status() == null : this.getBill_status().equals(other.getBill_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBill_id() == null) ? 0 : getBill_id().hashCode());
        result = prime * result + ((getBill_date() == null) ? 0 : getBill_date().hashCode());
        result = prime * result + ((getBill_sn() == null) ? 0 : getBill_sn().hashCode());
        result = prime * result + ((getChannel_id() == null) ? 0 : getChannel_id().hashCode());
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getOrder_num() == null) ? 0 : getOrder_num().hashCode());
        result = prime * result + ((getOrder_money() == null) ? 0 : getOrder_money().hashCode());
        result = prime * result + ((getChannel_order_num() == null) ? 0 : getChannel_order_num().hashCode());
        result = prime * result + ((getChannel_order_money() == null) ? 0 : getChannel_order_money().hashCode());
        result = prime * result + ((getError_num() == null) ? 0 : getError_num().hashCode());
        result = prime * result + ((getError_money() == null) ? 0 : getError_money().hashCode());
        result = prime * result + ((getBill_status() == null) ? 0 : getBill_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}