package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaBillError implements Serializable {
    /**
     * 差错订单ID
     *
     * @mbg.generated
     */
    private Integer bill_error_id;

    /**
     * 对帐单ID
     *
     * @mbg.generated
     */
    private Integer bill_id;

    /**
     * 平台订单编号
     *
     * @mbg.generated
     */
    private String pay_order_sn;

    /**
     * 平台订单金额
     *
     * @mbg.generated
     */
    private Integer order_amount;

    /**
     * 通道订单编号
     *
     * @mbg.generated
     */
    private String channel_orderno;

    /**
     * 通道订单金额
     *
     * @mbg.generated
     */
    private Integer channel_order_amount;

    /**
     * 差错类型（1平台单边,2上游单边,3金额不符,4状态不一致）
     *
     * @mbg.generated
     */
    private Boolean bill_error_type;

    /**
     * 差错处理状态（0待处理,1已挂起,2加入对账,3已处理）
     *
     * @mbg.generated
     */
    private Boolean bill_error_status;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 处理备注
     *
     * @mbg.generated
     */
    private String bill_error_res;

    private static final long serialVersionUID = 1L;

    public Integer getBill_error_id() {
        return bill_error_id;
    }

    public void setBill_error_id(Integer bill_error_id) {
        this.bill_error_id = bill_error_id;
    }

    public Integer getBill_id() {
        return bill_id;
    }

    public void setBill_id(Integer bill_id) {
        this.bill_id = bill_id;
    }

    public String getPay_order_sn() {
        return pay_order_sn;
    }

    public void setPay_order_sn(String pay_order_sn) {
        this.pay_order_sn = pay_order_sn;
    }

    public Integer getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(Integer order_amount) {
        this.order_amount = order_amount;
    }

    public String getChannel_orderno() {
        return channel_orderno;
    }

    public void setChannel_orderno(String channel_orderno) {
        this.channel_orderno = channel_orderno;
    }

    public Integer getChannel_order_amount() {
        return channel_order_amount;
    }

    public void setChannel_order_amount(Integer channel_order_amount) {
        this.channel_order_amount = channel_order_amount;
    }

    public Boolean getBill_error_type() {
        return bill_error_type;
    }

    public void setBill_error_type(Boolean bill_error_type) {
        this.bill_error_type = bill_error_type;
    }

    public Boolean getBill_error_status() {
        return bill_error_status;
    }

    public void setBill_error_status(Boolean bill_error_status) {
        this.bill_error_status = bill_error_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getBill_error_res() {
        return bill_error_res;
    }

    public void setBill_error_res(String bill_error_res) {
        this.bill_error_res = bill_error_res;
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
        HaBillError other = (HaBillError) that;
        return (this.getBill_error_id() == null ? other.getBill_error_id() == null : this.getBill_error_id().equals(other.getBill_error_id()))
            && (this.getBill_id() == null ? other.getBill_id() == null : this.getBill_id().equals(other.getBill_id()))
            && (this.getPay_order_sn() == null ? other.getPay_order_sn() == null : this.getPay_order_sn().equals(other.getPay_order_sn()))
            && (this.getOrder_amount() == null ? other.getOrder_amount() == null : this.getOrder_amount().equals(other.getOrder_amount()))
            && (this.getChannel_orderno() == null ? other.getChannel_orderno() == null : this.getChannel_orderno().equals(other.getChannel_orderno()))
            && (this.getChannel_order_amount() == null ? other.getChannel_order_amount() == null : this.getChannel_order_amount().equals(other.getChannel_order_amount()))
            && (this.getBill_error_type() == null ? other.getBill_error_type() == null : this.getBill_error_type().equals(other.getBill_error_type()))
            && (this.getBill_error_status() == null ? other.getBill_error_status() == null : this.getBill_error_status().equals(other.getBill_error_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getBill_error_res() == null ? other.getBill_error_res() == null : this.getBill_error_res().equals(other.getBill_error_res()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBill_error_id() == null) ? 0 : getBill_error_id().hashCode());
        result = prime * result + ((getBill_id() == null) ? 0 : getBill_id().hashCode());
        result = prime * result + ((getPay_order_sn() == null) ? 0 : getPay_order_sn().hashCode());
        result = prime * result + ((getOrder_amount() == null) ? 0 : getOrder_amount().hashCode());
        result = prime * result + ((getChannel_orderno() == null) ? 0 : getChannel_orderno().hashCode());
        result = prime * result + ((getChannel_order_amount() == null) ? 0 : getChannel_order_amount().hashCode());
        result = prime * result + ((getBill_error_type() == null) ? 0 : getBill_error_type().hashCode());
        result = prime * result + ((getBill_error_status() == null) ? 0 : getBill_error_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getBill_error_res() == null) ? 0 : getBill_error_res().hashCode());
        return result;
    }
}