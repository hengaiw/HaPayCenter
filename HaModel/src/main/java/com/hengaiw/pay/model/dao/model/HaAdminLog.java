package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;

public class HaAdminLog implements Serializable {
    private Integer id;

    /**
     * 操作内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 发生时间
     *
     * @mbg.generated
     */
    private Integer createtime;

    /**
     * 管理员
     *
     * @mbg.generated
     */
    private String admin_name;

    /**
     * 管理员ID
     *
     * @mbg.generated
     */
    private Integer admin_id;

    /**
     * IP
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * act&op
     *
     * @mbg.generated
     */
    private String url;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        HaAdminLog other = (HaAdminLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getAdmin_name() == null ? other.getAdmin_name() == null : this.getAdmin_name().equals(other.getAdmin_name()))
            && (this.getAdmin_id() == null ? other.getAdmin_id() == null : this.getAdmin_id().equals(other.getAdmin_id()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getAdmin_name() == null) ? 0 : getAdmin_name().hashCode());
        result = prime * result + ((getAdmin_id() == null) ? 0 : getAdmin_id().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }
}