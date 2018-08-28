package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaPayNotify implements Serializable {
    /**
     * 支付宝的通知ID
     *
     * @mbg.generated
     */
    private Integer notify_id;

    /**
     * 通知来源，支付宝或微信等
     *
     * @mbg.generated
     */
    private String notify_type;

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

    private static final long serialVersionUID = 1L;

    public Integer getNotify_id() {
        return notify_id;
    }

    public void setNotify_id(Integer notify_id) {
        this.notify_id = notify_id;
    }

    public String getNotify_type() {
        return notify_type;
    }

    public void setNotify_type(String notify_type) {
        this.notify_type = notify_type;
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
        HaPayNotify other = (HaPayNotify) that;
        return (this.getNotify_id() == null ? other.getNotify_id() == null : this.getNotify_id().equals(other.getNotify_id()))
            && (this.getNotify_type() == null ? other.getNotify_type() == null : this.getNotify_type().equals(other.getNotify_type()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getNotify_content() == null ? other.getNotify_content() == null : this.getNotify_content().equals(other.getNotify_content()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNotify_id() == null) ? 0 : getNotify_id().hashCode());
        result = prime * result + ((getNotify_type() == null) ? 0 : getNotify_type().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getNotify_content() == null) ? 0 : getNotify_content().hashCode());
        return result;
    }
}