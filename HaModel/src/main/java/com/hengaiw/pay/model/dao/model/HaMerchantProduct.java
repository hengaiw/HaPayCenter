package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaMerchantProduct implements Serializable {
    /**
     * ID
     *
     * @mbg.generated
     */
    private Integer merchant_product_id;

    /**
     * 商户ID
     *
     * @mbg.generated
     */
    private Integer merchant_id;

    /**
     * 商户编号
     *
     * @mbg.generated
     */
    private String merchant_no;

    /**
     * 产品ID
     *
     * @mbg.generated
     */
    private Integer product_id;

    /**
     * 产品分类（PAY为支付类产品，DATA为数据查询类）
     *
     * @mbg.generated
     */
    private String product_type;

    /**
     * 交易类型昵称
     *
     * @mbg.generated
     */
    private String trade_type_nickname;

    /**
     * 商家单日限额（分）
     *
     * @mbg.generated
     */
    private Long merchant_day_limit;

    /**
     * 商家单日已使用限额（分）
     *
     * @mbg.generated
     */
    private Long merchant_day_use;

    /**
     * 商家每笔限额（分）
     *
     * @mbg.generated
     */
    private Long merchant_order_limit;

    /**
     * 商户费率（%）
     *
     * @mbg.generated
     */
    private Integer merchant_rate;

    /**
     * 产品状态（0，禁用 1，使用）
     *
     * @mbg.generated
     */
    private Boolean product_status;

    /**
     * 添加时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 产品的请求参数
     *
     * @mbg.generated
     */
    private String merchant_product_params;

    private static final long serialVersionUID = 1L;

    public Integer getMerchant_product_id() {
        return merchant_product_id;
    }

    public void setMerchant_product_id(Integer merchant_product_id) {
        this.merchant_product_id = merchant_product_id;
    }

    public Integer getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getMerchant_no() {
        return merchant_no;
    }

    public void setMerchant_no(String merchant_no) {
        this.merchant_no = merchant_no;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getTrade_type_nickname() {
        return trade_type_nickname;
    }

    public void setTrade_type_nickname(String trade_type_nickname) {
        this.trade_type_nickname = trade_type_nickname;
    }

    public Long getMerchant_day_limit() {
        return merchant_day_limit;
    }

    public void setMerchant_day_limit(Long merchant_day_limit) {
        this.merchant_day_limit = merchant_day_limit;
    }

    public Long getMerchant_day_use() {
        return merchant_day_use;
    }

    public void setMerchant_day_use(Long merchant_day_use) {
        this.merchant_day_use = merchant_day_use;
    }

    public Long getMerchant_order_limit() {
        return merchant_order_limit;
    }

    public void setMerchant_order_limit(Long merchant_order_limit) {
        this.merchant_order_limit = merchant_order_limit;
    }

    public Integer getMerchant_rate() {
        return merchant_rate;
    }

    public void setMerchant_rate(Integer merchant_rate) {
        this.merchant_rate = merchant_rate;
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

    public String getMerchant_product_params() {
        return merchant_product_params;
    }

    public void setMerchant_product_params(String merchant_product_params) {
        this.merchant_product_params = merchant_product_params;
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
        HaMerchantProduct other = (HaMerchantProduct) that;
        return (this.getMerchant_product_id() == null ? other.getMerchant_product_id() == null : this.getMerchant_product_id().equals(other.getMerchant_product_id()))
            && (this.getMerchant_id() == null ? other.getMerchant_id() == null : this.getMerchant_id().equals(other.getMerchant_id()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getProduct_type() == null ? other.getProduct_type() == null : this.getProduct_type().equals(other.getProduct_type()))
            && (this.getTrade_type_nickname() == null ? other.getTrade_type_nickname() == null : this.getTrade_type_nickname().equals(other.getTrade_type_nickname()))
            && (this.getMerchant_day_limit() == null ? other.getMerchant_day_limit() == null : this.getMerchant_day_limit().equals(other.getMerchant_day_limit()))
            && (this.getMerchant_day_use() == null ? other.getMerchant_day_use() == null : this.getMerchant_day_use().equals(other.getMerchant_day_use()))
            && (this.getMerchant_order_limit() == null ? other.getMerchant_order_limit() == null : this.getMerchant_order_limit().equals(other.getMerchant_order_limit()))
            && (this.getMerchant_rate() == null ? other.getMerchant_rate() == null : this.getMerchant_rate().equals(other.getMerchant_rate()))
            && (this.getProduct_status() == null ? other.getProduct_status() == null : this.getProduct_status().equals(other.getProduct_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getMerchant_product_params() == null ? other.getMerchant_product_params() == null : this.getMerchant_product_params().equals(other.getMerchant_product_params()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchant_product_id() == null) ? 0 : getMerchant_product_id().hashCode());
        result = prime * result + ((getMerchant_id() == null) ? 0 : getMerchant_id().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getProduct_type() == null) ? 0 : getProduct_type().hashCode());
        result = prime * result + ((getTrade_type_nickname() == null) ? 0 : getTrade_type_nickname().hashCode());
        result = prime * result + ((getMerchant_day_limit() == null) ? 0 : getMerchant_day_limit().hashCode());
        result = prime * result + ((getMerchant_day_use() == null) ? 0 : getMerchant_day_use().hashCode());
        result = prime * result + ((getMerchant_order_limit() == null) ? 0 : getMerchant_order_limit().hashCode());
        result = prime * result + ((getMerchant_rate() == null) ? 0 : getMerchant_rate().hashCode());
        result = prime * result + ((getProduct_status() == null) ? 0 : getProduct_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getMerchant_product_params() == null) ? 0 : getMerchant_product_params().hashCode());
        return result;
    }
}