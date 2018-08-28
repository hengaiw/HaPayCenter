package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaProduct implements Serializable {
    /**
     * 产品ID
     *
     * @mbg.generated
     */
    private Integer product_id;

    /**
     * 所属通道ID
     *
     * @mbg.generated
     */
    private Integer channel_id;

    /**
     * 交易类型ID
     *
     * @mbg.generated
     */
    private Integer trade_type_id;

    /**
     * 交易类型昵称
     *
     * @mbg.generated
     */
    private String trade_type_nickname;

    /**
     * 产品名称
     *
     * @mbg.generated
     */
    private String product_name;

    /**
     * 产品分类（PAY为支付类产品，DATA为数据查询类）
     *
     * @mbg.generated
     */
    private String product_type;

    /**
     * 计费方式（固定金额/FIXED_AMOUNT,百分比/PERCENTAGE,固定+百分比/FIXED_AMOUNT_PERCENTAGE,百分比+保底/PERCENTAGE_BAODI）
     *
     * @mbg.generated
     */
    private String product_charging_type;

    /**
     * 结算方式（T1/D0）
     *
     * @mbg.generated
     */
    private String product_clear_method;

    /**
     * 清算模式（直清/CLEAE_DIRECTLY，非直清/UN_CLEAR_DIRECTLY）
     *
     * @mbg.generated
     */
    private String product_clear_type;

    /**
     * 产品单日限额（分）
     *
     * @mbg.generated
     */
    private Long product_day_limit;

    /**
     * 产品单日已使用限额（分）
     *
     * @mbg.generated
     */
    private Long product_day_use;

    /**
     * 产品每笔限额（分）
     *
     * @mbg.generated
     */
    private Long product_order_limit;

    /**
     * 产品费率（%）
     *
     * @mbg.generated
     */
    private Integer product_rate;

    /**
     * 产品请求地址
     *
     * @mbg.generated
     */
    private String product_url;

    /**
     * 产品状态（0为禁用，1为启用）
     *
     * @mbg.generated
     */
    private Boolean product_status;

    /**
     * 产品添加时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 产品备注
     *
     * @mbg.generated
     */
    private String product_res;

    private static final long serialVersionUID = 1L;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Integer channel_id) {
        this.channel_id = channel_id;
    }

    public Integer getTrade_type_id() {
        return trade_type_id;
    }

    public void setTrade_type_id(Integer trade_type_id) {
        this.trade_type_id = trade_type_id;
    }

    public String getTrade_type_nickname() {
        return trade_type_nickname;
    }

    public void setTrade_type_nickname(String trade_type_nickname) {
        this.trade_type_nickname = trade_type_nickname;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_charging_type() {
        return product_charging_type;
    }

    public void setProduct_charging_type(String product_charging_type) {
        this.product_charging_type = product_charging_type;
    }

    public String getProduct_clear_method() {
        return product_clear_method;
    }

    public void setProduct_clear_method(String product_clear_method) {
        this.product_clear_method = product_clear_method;
    }

    public String getProduct_clear_type() {
        return product_clear_type;
    }

    public void setProduct_clear_type(String product_clear_type) {
        this.product_clear_type = product_clear_type;
    }

    public Long getProduct_day_limit() {
        return product_day_limit;
    }

    public void setProduct_day_limit(Long product_day_limit) {
        this.product_day_limit = product_day_limit;
    }

    public Long getProduct_day_use() {
        return product_day_use;
    }

    public void setProduct_day_use(Long product_day_use) {
        this.product_day_use = product_day_use;
    }

    public Long getProduct_order_limit() {
        return product_order_limit;
    }

    public void setProduct_order_limit(Long product_order_limit) {
        this.product_order_limit = product_order_limit;
    }

    public Integer getProduct_rate() {
        return product_rate;
    }

    public void setProduct_rate(Integer product_rate) {
        this.product_rate = product_rate;
    }

    public String getProduct_url() {
        return product_url;
    }

    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }

    public Boolean getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Boolean product_status) {
        this.product_status = product_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getProduct_res() {
        return product_res;
    }

    public void setProduct_res(String product_res) {
        this.product_res = product_res;
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
        HaProduct other = (HaProduct) that;
        return (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getChannel_id() == null ? other.getChannel_id() == null : this.getChannel_id().equals(other.getChannel_id()))
            && (this.getTrade_type_id() == null ? other.getTrade_type_id() == null : this.getTrade_type_id().equals(other.getTrade_type_id()))
            && (this.getTrade_type_nickname() == null ? other.getTrade_type_nickname() == null : this.getTrade_type_nickname().equals(other.getTrade_type_nickname()))
            && (this.getProduct_name() == null ? other.getProduct_name() == null : this.getProduct_name().equals(other.getProduct_name()))
            && (this.getProduct_type() == null ? other.getProduct_type() == null : this.getProduct_type().equals(other.getProduct_type()))
            && (this.getProduct_charging_type() == null ? other.getProduct_charging_type() == null : this.getProduct_charging_type().equals(other.getProduct_charging_type()))
            && (this.getProduct_clear_method() == null ? other.getProduct_clear_method() == null : this.getProduct_clear_method().equals(other.getProduct_clear_method()))
            && (this.getProduct_clear_type() == null ? other.getProduct_clear_type() == null : this.getProduct_clear_type().equals(other.getProduct_clear_type()))
            && (this.getProduct_day_limit() == null ? other.getProduct_day_limit() == null : this.getProduct_day_limit().equals(other.getProduct_day_limit()))
            && (this.getProduct_day_use() == null ? other.getProduct_day_use() == null : this.getProduct_day_use().equals(other.getProduct_day_use()))
            && (this.getProduct_order_limit() == null ? other.getProduct_order_limit() == null : this.getProduct_order_limit().equals(other.getProduct_order_limit()))
            && (this.getProduct_rate() == null ? other.getProduct_rate() == null : this.getProduct_rate().equals(other.getProduct_rate()))
            && (this.getProduct_url() == null ? other.getProduct_url() == null : this.getProduct_url().equals(other.getProduct_url()))
            && (this.getProduct_status() == null ? other.getProduct_status() == null : this.getProduct_status().equals(other.getProduct_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getProduct_res() == null ? other.getProduct_res() == null : this.getProduct_res().equals(other.getProduct_res()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getChannel_id() == null) ? 0 : getChannel_id().hashCode());
        result = prime * result + ((getTrade_type_id() == null) ? 0 : getTrade_type_id().hashCode());
        result = prime * result + ((getTrade_type_nickname() == null) ? 0 : getTrade_type_nickname().hashCode());
        result = prime * result + ((getProduct_name() == null) ? 0 : getProduct_name().hashCode());
        result = prime * result + ((getProduct_type() == null) ? 0 : getProduct_type().hashCode());
        result = prime * result + ((getProduct_charging_type() == null) ? 0 : getProduct_charging_type().hashCode());
        result = prime * result + ((getProduct_clear_method() == null) ? 0 : getProduct_clear_method().hashCode());
        result = prime * result + ((getProduct_clear_type() == null) ? 0 : getProduct_clear_type().hashCode());
        result = prime * result + ((getProduct_day_limit() == null) ? 0 : getProduct_day_limit().hashCode());
        result = prime * result + ((getProduct_day_use() == null) ? 0 : getProduct_day_use().hashCode());
        result = prime * result + ((getProduct_order_limit() == null) ? 0 : getProduct_order_limit().hashCode());
        result = prime * result + ((getProduct_rate() == null) ? 0 : getProduct_rate().hashCode());
        result = prime * result + ((getProduct_url() == null) ? 0 : getProduct_url().hashCode());
        result = prime * result + ((getProduct_status() == null) ? 0 : getProduct_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getProduct_res() == null) ? 0 : getProduct_res().hashCode());
        return result;
    }
}