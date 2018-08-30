package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaPayOrder implements Serializable {
    /**
     * 平台订单ID
     *
     * @mbg.generated
     */
    private Long pay_order_id;

    /**
     * 平台订单编号
     *
     * @mbg.generated
     */
    private String pay_order_sn;

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
     * 代理商ID
     *
     * @mbg.generated
     */
    private Integer agent_id;

    /**
     * 产品ID
     *
     * @mbg.generated
     */
    private Integer product_id;

    /**
     * 商家产品ID
     *
     * @mbg.generated
     */
    private Integer merchant_product_id;

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
     * 商户费率（%）
     *
     * @mbg.generated
     */
    private Integer merchant_rate;

    /**
     * 商户手续费（分）
     *
     * @mbg.generated
     */
    private Integer merchant_charge;

    /**
     * 代理商费率（%）
     *
     * @mbg.generated
     */
    private Integer agent_rate;

    /**
     * 代理商手续费（分）
     *
     * @mbg.generated
     */
    private Integer agent_charge;

    /**
     * 产品费率（%）
     *
     * @mbg.generated
     */
    private Integer product_rate;

    /**
     * 产品手续费（分）
     *
     * @mbg.generated
     */
    private Integer product_charge;

    /**
     * 商户订单号
     *
     * @mbg.generated
     */
    private String merchant_order_no;

    /**
     * 支付金额,单位分
     *
     * @mbg.generated
     */
    private Long order_amount;

    /**
     * 三位货币代码,人民币:cny
     *
     * @mbg.generated
     */
    private String order_currency;

    /**
     * 支付状态,0-订单生成,1-支付中(目前未使用),2-支付成功,3-业务处理完成,4-已申请退款
     *
     * @mbg.generated
     */
    private Byte order_status;

    /**
     * 客户端IP
     *
     * @mbg.generated
     */
    private String order_clientIp;

    /**
     * 设备
     *
     * @mbg.generated
     */
    private String order_device;

    /**
     * 通道商户ID
     *
     * @mbg.generated
     */
    private String channel_mchid;

    /**
     * 通道订单号
     *
     * @mbg.generated
     */
    private String channel_orderno;

    /**
     * 通道支付错误码
     *
     * @mbg.generated
     */
    private String err_code;

    /**
     * 通道支付错误描述
     *
     * @mbg.generated
     */
    private String err_msg;

    /**
     * 通知地址
     *
     * @mbg.generated
     */
    private String notify_url;

    /**
     * 通知次数
     *
     * @mbg.generated
     */
    private Byte notify_count;

    /**
     * 最后一次通知时间
     *
     * @mbg.generated
     */
    private Long last_notify_time;

    /**
     * 订单失效时间
     *
     * @mbg.generated
     */
    private Long expire_time;

    /**
     * 订单支付成功时间
     *
     * @mbg.generated
     */
    private Long pay_succ_time;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date update_time;

    /**
     * 商品标题
     *
     * @mbg.generated
     */
    private String order_subject;

    /**
     * 商品描述信息
     *
     * @mbg.generated
     */
    private String order_body;

    /**
     * 特定渠道发起时额外参数
     *
     * @mbg.generated
     */
    private String order_extra;

    private static final long serialVersionUID = 1L;

    public Long getPay_order_id() {
        return pay_order_id;
    }

    public void setPay_order_id(Long pay_order_id) {
        this.pay_order_id = pay_order_id;
    }

    public String getPay_order_sn() {
        return pay_order_sn;
    }

    public void setPay_order_sn(String pay_order_sn) {
        this.pay_order_sn = pay_order_sn;
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

    public Integer getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getMerchant_product_id() {
        return merchant_product_id;
    }

    public void setMerchant_product_id(Integer merchant_product_id) {
        this.merchant_product_id = merchant_product_id;
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

    public Integer getMerchant_rate() {
        return merchant_rate;
    }

    public void setMerchant_rate(Integer merchant_rate) {
        this.merchant_rate = merchant_rate;
    }

    public Integer getMerchant_charge() {
        return merchant_charge;
    }

    public void setMerchant_charge(Integer merchant_charge) {
        this.merchant_charge = merchant_charge;
    }

    public Integer getAgent_rate() {
        return agent_rate;
    }

    public void setAgent_rate(Integer agent_rate) {
        this.agent_rate = agent_rate;
    }

    public Integer getAgent_charge() {
        return agent_charge;
    }

    public void setAgent_charge(Integer agent_charge) {
        this.agent_charge = agent_charge;
    }

    public Integer getProduct_rate() {
        return product_rate;
    }

    public void setProduct_rate(Integer product_rate) {
        this.product_rate = product_rate;
    }

    public Integer getProduct_charge() {
        return product_charge;
    }

    public void setProduct_charge(Integer product_charge) {
        this.product_charge = product_charge;
    }

    public String getMerchant_order_no() {
        return merchant_order_no;
    }

    public void setMerchant_order_no(String merchant_order_no) {
        this.merchant_order_no = merchant_order_no;
    }

    public Long getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(Long order_amount) {
        this.order_amount = order_amount;
    }

    public String getOrder_currency() {
        return order_currency;
    }

    public void setOrder_currency(String order_currency) {
        this.order_currency = order_currency;
    }

    public Byte getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Byte order_status) {
        this.order_status = order_status;
    }

    public String getOrder_clientIp() {
        return order_clientIp;
    }

    public void setOrder_clientIp(String order_clientIp) {
        this.order_clientIp = order_clientIp;
    }

    public String getOrder_device() {
        return order_device;
    }

    public void setOrder_device(String order_device) {
        this.order_device = order_device;
    }

    public String getChannel_mchid() {
        return channel_mchid;
    }

    public void setChannel_mchid(String channel_mchid) {
        this.channel_mchid = channel_mchid;
    }

    public String getChannel_orderno() {
        return channel_orderno;
    }

    public void setChannel_orderno(String channel_orderno) {
        this.channel_orderno = channel_orderno;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public Byte getNotify_count() {
        return notify_count;
    }

    public void setNotify_count(Byte notify_count) {
        this.notify_count = notify_count;
    }

    public Long getLast_notify_time() {
        return last_notify_time;
    }

    public void setLast_notify_time(Long last_notify_time) {
        this.last_notify_time = last_notify_time;
    }

    public Long getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(Long expire_time) {
        this.expire_time = expire_time;
    }

    public Long getPay_succ_time() {
        return pay_succ_time;
    }

    public void setPay_succ_time(Long pay_succ_time) {
        this.pay_succ_time = pay_succ_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getOrder_subject() {
        return order_subject;
    }

    public void setOrder_subject(String order_subject) {
        this.order_subject = order_subject;
    }

    public String getOrder_body() {
        return order_body;
    }

    public void setOrder_body(String order_body) {
        this.order_body = order_body;
    }

    public String getOrder_extra() {
        return order_extra;
    }

    public void setOrder_extra(String order_extra) {
        this.order_extra = order_extra;
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
        HaPayOrder other = (HaPayOrder) that;
        return (this.getPay_order_id() == null ? other.getPay_order_id() == null : this.getPay_order_id().equals(other.getPay_order_id()))
            && (this.getPay_order_sn() == null ? other.getPay_order_sn() == null : this.getPay_order_sn().equals(other.getPay_order_sn()))
            && (this.getMerchant_id() == null ? other.getMerchant_id() == null : this.getMerchant_id().equals(other.getMerchant_id()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getMerchant_product_id() == null ? other.getMerchant_product_id() == null : this.getMerchant_product_id().equals(other.getMerchant_product_id()))
            && (this.getProduct_type() == null ? other.getProduct_type() == null : this.getProduct_type().equals(other.getProduct_type()))
            && (this.getTrade_type_nickname() == null ? other.getTrade_type_nickname() == null : this.getTrade_type_nickname().equals(other.getTrade_type_nickname()))
            && (this.getMerchant_rate() == null ? other.getMerchant_rate() == null : this.getMerchant_rate().equals(other.getMerchant_rate()))
            && (this.getMerchant_charge() == null ? other.getMerchant_charge() == null : this.getMerchant_charge().equals(other.getMerchant_charge()))
            && (this.getAgent_rate() == null ? other.getAgent_rate() == null : this.getAgent_rate().equals(other.getAgent_rate()))
            && (this.getAgent_charge() == null ? other.getAgent_charge() == null : this.getAgent_charge().equals(other.getAgent_charge()))
            && (this.getProduct_rate() == null ? other.getProduct_rate() == null : this.getProduct_rate().equals(other.getProduct_rate()))
            && (this.getProduct_charge() == null ? other.getProduct_charge() == null : this.getProduct_charge().equals(other.getProduct_charge()))
            && (this.getMerchant_order_no() == null ? other.getMerchant_order_no() == null : this.getMerchant_order_no().equals(other.getMerchant_order_no()))
            && (this.getOrder_amount() == null ? other.getOrder_amount() == null : this.getOrder_amount().equals(other.getOrder_amount()))
            && (this.getOrder_currency() == null ? other.getOrder_currency() == null : this.getOrder_currency().equals(other.getOrder_currency()))
            && (this.getOrder_status() == null ? other.getOrder_status() == null : this.getOrder_status().equals(other.getOrder_status()))
            && (this.getOrder_clientIp() == null ? other.getOrder_clientIp() == null : this.getOrder_clientIp().equals(other.getOrder_clientIp()))
            && (this.getOrder_device() == null ? other.getOrder_device() == null : this.getOrder_device().equals(other.getOrder_device()))
            && (this.getChannel_mchid() == null ? other.getChannel_mchid() == null : this.getChannel_mchid().equals(other.getChannel_mchid()))
            && (this.getChannel_orderno() == null ? other.getChannel_orderno() == null : this.getChannel_orderno().equals(other.getChannel_orderno()))
            && (this.getErr_code() == null ? other.getErr_code() == null : this.getErr_code().equals(other.getErr_code()))
            && (this.getErr_msg() == null ? other.getErr_msg() == null : this.getErr_msg().equals(other.getErr_msg()))
            && (this.getNotify_url() == null ? other.getNotify_url() == null : this.getNotify_url().equals(other.getNotify_url()))
            && (this.getNotify_count() == null ? other.getNotify_count() == null : this.getNotify_count().equals(other.getNotify_count()))
            && (this.getLast_notify_time() == null ? other.getLast_notify_time() == null : this.getLast_notify_time().equals(other.getLast_notify_time()))
            && (this.getExpire_time() == null ? other.getExpire_time() == null : this.getExpire_time().equals(other.getExpire_time()))
            && (this.getPay_succ_time() == null ? other.getPay_succ_time() == null : this.getPay_succ_time().equals(other.getPay_succ_time()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getOrder_subject() == null ? other.getOrder_subject() == null : this.getOrder_subject().equals(other.getOrder_subject()))
            && (this.getOrder_body() == null ? other.getOrder_body() == null : this.getOrder_body().equals(other.getOrder_body()))
            && (this.getOrder_extra() == null ? other.getOrder_extra() == null : this.getOrder_extra().equals(other.getOrder_extra()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPay_order_id() == null) ? 0 : getPay_order_id().hashCode());
        result = prime * result + ((getPay_order_sn() == null) ? 0 : getPay_order_sn().hashCode());
        result = prime * result + ((getMerchant_id() == null) ? 0 : getMerchant_id().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getMerchant_product_id() == null) ? 0 : getMerchant_product_id().hashCode());
        result = prime * result + ((getProduct_type() == null) ? 0 : getProduct_type().hashCode());
        result = prime * result + ((getTrade_type_nickname() == null) ? 0 : getTrade_type_nickname().hashCode());
        result = prime * result + ((getMerchant_rate() == null) ? 0 : getMerchant_rate().hashCode());
        result = prime * result + ((getMerchant_charge() == null) ? 0 : getMerchant_charge().hashCode());
        result = prime * result + ((getAgent_rate() == null) ? 0 : getAgent_rate().hashCode());
        result = prime * result + ((getAgent_charge() == null) ? 0 : getAgent_charge().hashCode());
        result = prime * result + ((getProduct_rate() == null) ? 0 : getProduct_rate().hashCode());
        result = prime * result + ((getProduct_charge() == null) ? 0 : getProduct_charge().hashCode());
        result = prime * result + ((getMerchant_order_no() == null) ? 0 : getMerchant_order_no().hashCode());
        result = prime * result + ((getOrder_amount() == null) ? 0 : getOrder_amount().hashCode());
        result = prime * result + ((getOrder_currency() == null) ? 0 : getOrder_currency().hashCode());
        result = prime * result + ((getOrder_status() == null) ? 0 : getOrder_status().hashCode());
        result = prime * result + ((getOrder_clientIp() == null) ? 0 : getOrder_clientIp().hashCode());
        result = prime * result + ((getOrder_device() == null) ? 0 : getOrder_device().hashCode());
        result = prime * result + ((getChannel_mchid() == null) ? 0 : getChannel_mchid().hashCode());
        result = prime * result + ((getChannel_orderno() == null) ? 0 : getChannel_orderno().hashCode());
        result = prime * result + ((getErr_code() == null) ? 0 : getErr_code().hashCode());
        result = prime * result + ((getErr_msg() == null) ? 0 : getErr_msg().hashCode());
        result = prime * result + ((getNotify_url() == null) ? 0 : getNotify_url().hashCode());
        result = prime * result + ((getNotify_count() == null) ? 0 : getNotify_count().hashCode());
        result = prime * result + ((getLast_notify_time() == null) ? 0 : getLast_notify_time().hashCode());
        result = prime * result + ((getExpire_time() == null) ? 0 : getExpire_time().hashCode());
        result = prime * result + ((getPay_succ_time() == null) ? 0 : getPay_succ_time().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getOrder_subject() == null) ? 0 : getOrder_subject().hashCode());
        result = prime * result + ((getOrder_body() == null) ? 0 : getOrder_body().hashCode());
        result = prime * result + ((getOrder_extra() == null) ? 0 : getOrder_extra().hashCode());
        return result;
    }
}