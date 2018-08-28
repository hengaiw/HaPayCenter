package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaChannel implements Serializable {
    /**
     * 通道ID
     *
     * @mbg.generated
     */
    private Integer channel_id;

    /**
     * 通道名称
     *
     * @mbg.generated
     */
    private String channel_name;

    /**
     * 通道商户号
     *
     * @mbg.generated
     */
    private String channel_mchid;

    /**
     * 通道状态（0为禁用，1为启用）
     *
     * @mbg.generated
     */
    private Boolean channel_status;

    /**
     * 通道请求地址
     *
     * @mbg.generated
     */
    private String channel_url;

    /**
     * 通道日限额（分）
     *
     * @mbg.generated
     */
    private Long channel_day_limit;

    /**
     * 通道当日已使用限额（分）
     *
     * @mbg.generated
     */
    private Long channel_day_use;

    /**
     * 通道单笔限额（分）
     *
     * @mbg.generated
     */
    private Long channel_order_limit;

    /**
     * 可提现百分比
     *
     * @mbg.generated
     */
    private Integer channel_cash;

    /**
     * 通道签名类型（MD5,AES,RSA,DES）
     *
     * @mbg.generated
     */
    private String channel_sign;

    private Date create_time;

    /**
     * 通道请求参数
     *
     * @mbg.generated
     */
    private String channel_param;

    /**
     * 通道公钥
     *
     * @mbg.generated
     */
    private String channel_pub_key;

    /**
     * 通道私钥
     *
     * @mbg.generated
     */
    private String channel_pri_key;

    /**
     * MD5秘钥
     *
     * @mbg.generated
     */
    private String channel_md5;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String channel_res;

    private static final long serialVersionUID = 1L;

    public Integer getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(Integer channel_id) {
        this.channel_id = channel_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getChannel_mchid() {
        return channel_mchid;
    }

    public void setChannel_mchid(String channel_mchid) {
        this.channel_mchid = channel_mchid;
    }

    public Boolean getChannel_status() {
        return channel_status;
    }

    public void setChannel_status(Boolean channel_status) {
        this.channel_status = channel_status;
    }

    public String getChannel_url() {
        return channel_url;
    }

    public void setChannel_url(String channel_url) {
        this.channel_url = channel_url;
    }

    public Long getChannel_day_limit() {
        return channel_day_limit;
    }

    public void setChannel_day_limit(Long channel_day_limit) {
        this.channel_day_limit = channel_day_limit;
    }

    public Long getChannel_day_use() {
        return channel_day_use;
    }

    public void setChannel_day_use(Long channel_day_use) {
        this.channel_day_use = channel_day_use;
    }

    public Long getChannel_order_limit() {
        return channel_order_limit;
    }

    public void setChannel_order_limit(Long channel_order_limit) {
        this.channel_order_limit = channel_order_limit;
    }

    public Integer getChannel_cash() {
        return channel_cash;
    }

    public void setChannel_cash(Integer channel_cash) {
        this.channel_cash = channel_cash;
    }

    public String getChannel_sign() {
        return channel_sign;
    }

    public void setChannel_sign(String channel_sign) {
        this.channel_sign = channel_sign;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getChannel_param() {
        return channel_param;
    }

    public void setChannel_param(String channel_param) {
        this.channel_param = channel_param;
    }

    public String getChannel_pub_key() {
        return channel_pub_key;
    }

    public void setChannel_pub_key(String channel_pub_key) {
        this.channel_pub_key = channel_pub_key;
    }

    public String getChannel_pri_key() {
        return channel_pri_key;
    }

    public void setChannel_pri_key(String channel_pri_key) {
        this.channel_pri_key = channel_pri_key;
    }

    public String getChannel_md5() {
        return channel_md5;
    }

    public void setChannel_md5(String channel_md5) {
        this.channel_md5 = channel_md5;
    }

    public String getChannel_res() {
        return channel_res;
    }

    public void setChannel_res(String channel_res) {
        this.channel_res = channel_res;
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
        HaChannel other = (HaChannel) that;
        return (this.getChannel_id() == null ? other.getChannel_id() == null : this.getChannel_id().equals(other.getChannel_id()))
            && (this.getChannel_name() == null ? other.getChannel_name() == null : this.getChannel_name().equals(other.getChannel_name()))
            && (this.getChannel_mchid() == null ? other.getChannel_mchid() == null : this.getChannel_mchid().equals(other.getChannel_mchid()))
            && (this.getChannel_status() == null ? other.getChannel_status() == null : this.getChannel_status().equals(other.getChannel_status()))
            && (this.getChannel_url() == null ? other.getChannel_url() == null : this.getChannel_url().equals(other.getChannel_url()))
            && (this.getChannel_day_limit() == null ? other.getChannel_day_limit() == null : this.getChannel_day_limit().equals(other.getChannel_day_limit()))
            && (this.getChannel_day_use() == null ? other.getChannel_day_use() == null : this.getChannel_day_use().equals(other.getChannel_day_use()))
            && (this.getChannel_order_limit() == null ? other.getChannel_order_limit() == null : this.getChannel_order_limit().equals(other.getChannel_order_limit()))
            && (this.getChannel_cash() == null ? other.getChannel_cash() == null : this.getChannel_cash().equals(other.getChannel_cash()))
            && (this.getChannel_sign() == null ? other.getChannel_sign() == null : this.getChannel_sign().equals(other.getChannel_sign()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getChannel_param() == null ? other.getChannel_param() == null : this.getChannel_param().equals(other.getChannel_param()))
            && (this.getChannel_pub_key() == null ? other.getChannel_pub_key() == null : this.getChannel_pub_key().equals(other.getChannel_pub_key()))
            && (this.getChannel_pri_key() == null ? other.getChannel_pri_key() == null : this.getChannel_pri_key().equals(other.getChannel_pri_key()))
            && (this.getChannel_md5() == null ? other.getChannel_md5() == null : this.getChannel_md5().equals(other.getChannel_md5()))
            && (this.getChannel_res() == null ? other.getChannel_res() == null : this.getChannel_res().equals(other.getChannel_res()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannel_id() == null) ? 0 : getChannel_id().hashCode());
        result = prime * result + ((getChannel_name() == null) ? 0 : getChannel_name().hashCode());
        result = prime * result + ((getChannel_mchid() == null) ? 0 : getChannel_mchid().hashCode());
        result = prime * result + ((getChannel_status() == null) ? 0 : getChannel_status().hashCode());
        result = prime * result + ((getChannel_url() == null) ? 0 : getChannel_url().hashCode());
        result = prime * result + ((getChannel_day_limit() == null) ? 0 : getChannel_day_limit().hashCode());
        result = prime * result + ((getChannel_day_use() == null) ? 0 : getChannel_day_use().hashCode());
        result = prime * result + ((getChannel_order_limit() == null) ? 0 : getChannel_order_limit().hashCode());
        result = prime * result + ((getChannel_cash() == null) ? 0 : getChannel_cash().hashCode());
        result = prime * result + ((getChannel_sign() == null) ? 0 : getChannel_sign().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getChannel_param() == null) ? 0 : getChannel_param().hashCode());
        result = prime * result + ((getChannel_pub_key() == null) ? 0 : getChannel_pub_key().hashCode());
        result = prime * result + ((getChannel_pri_key() == null) ? 0 : getChannel_pri_key().hashCode());
        result = prime * result + ((getChannel_md5() == null) ? 0 : getChannel_md5().hashCode());
        result = prime * result + ((getChannel_res() == null) ? 0 : getChannel_res().hashCode());
        return result;
    }
}