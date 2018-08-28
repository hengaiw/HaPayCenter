package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaMerchantNotify implements Serializable {
    /**
     * 商家通知ID
     *
     * @mbg.generated
     */
    private Integer merchant_notify_id;

    /**
     * 通知地址
     *
     * @mbg.generated
     */
    private String notify_url;

    /**
     * 通知时间
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * 通知内容
     *
     * @mbg.generated
     */
    private String notify_content;

    /**
     * 通知返回的结果
     *
     * @mbg.generated
     */
    private String notify_result;

    private static final long serialVersionUID = 1L;

    public Integer getMerchant_notify_id() {
        return merchant_notify_id;
    }

    public void setMerchant_notify_id(Integer merchant_notify_id) {
        this.merchant_notify_id = merchant_notify_id;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNotify_content() {
        return notify_content;
    }

    public void setNotify_content(String notify_content) {
        this.notify_content = notify_content;
    }

    public String getNotify_result() {
        return notify_result;
    }

    public void setNotify_result(String notify_result) {
        this.notify_result = notify_result;
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
        HaMerchantNotify other = (HaMerchantNotify) that;
        return (this.getMerchant_notify_id() == null ? other.getMerchant_notify_id() == null : this.getMerchant_notify_id().equals(other.getMerchant_notify_id()))
            && (this.getNotify_url() == null ? other.getNotify_url() == null : this.getNotify_url().equals(other.getNotify_url()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getNotify_content() == null ? other.getNotify_content() == null : this.getNotify_content().equals(other.getNotify_content()))
            && (this.getNotify_result() == null ? other.getNotify_result() == null : this.getNotify_result().equals(other.getNotify_result()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchant_notify_id() == null) ? 0 : getMerchant_notify_id().hashCode());
        result = prime * result + ((getNotify_url() == null) ? 0 : getNotify_url().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getNotify_content() == null) ? 0 : getNotify_content().hashCode());
        result = prime * result + ((getNotify_result() == null) ? 0 : getNotify_result().hashCode());
        return result;
    }
}