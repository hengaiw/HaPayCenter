package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;

public class HaAdmin implements Serializable {
    /**
     * 管理员ID
     *
     * @mbg.generated
     */
    private Integer admin_id;

    /**
     * 管理员名称
     *
     * @mbg.generated
     */
    private String admin_name;

    /**
     * 管理员密码
     *
     * @mbg.generated
     */
    private String admin_password;

    /**
     * 登录时间
     *
     * @mbg.generated
     */
    private Integer admin_login_time;

    /**
     * 登录次数
     *
     * @mbg.generated
     */
    private Integer admin_login_num;

    /**
     * 是否超级管理员
     *
     * @mbg.generated
     */
    private Boolean admin_is_super;

    /**
     * 权限组ID
     *
     * @mbg.generated
     */
    private Short admin_gid;

    private static final long serialVersionUID = 1L;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public Integer getAdmin_login_time() {
        return admin_login_time;
    }

    public void setAdmin_login_time(Integer admin_login_time) {
        this.admin_login_time = admin_login_time;
    }

    public Integer getAdmin_login_num() {
        return admin_login_num;
    }

    public void setAdmin_login_num(Integer admin_login_num) {
        this.admin_login_num = admin_login_num;
    }

    public Boolean getAdmin_is_super() {
        return admin_is_super;
    }

    public void setAdmin_is_super(Boolean admin_is_super) {
        this.admin_is_super = admin_is_super;
    }

    public Short getAdmin_gid() {
        return admin_gid;
    }

    public void setAdmin_gid(Short admin_gid) {
        this.admin_gid = admin_gid;
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
        HaAdmin other = (HaAdmin) that;
        return (this.getAdmin_id() == null ? other.getAdmin_id() == null : this.getAdmin_id().equals(other.getAdmin_id()))
            && (this.getAdmin_name() == null ? other.getAdmin_name() == null : this.getAdmin_name().equals(other.getAdmin_name()))
            && (this.getAdmin_password() == null ? other.getAdmin_password() == null : this.getAdmin_password().equals(other.getAdmin_password()))
            && (this.getAdmin_login_time() == null ? other.getAdmin_login_time() == null : this.getAdmin_login_time().equals(other.getAdmin_login_time()))
            && (this.getAdmin_login_num() == null ? other.getAdmin_login_num() == null : this.getAdmin_login_num().equals(other.getAdmin_login_num()))
            && (this.getAdmin_is_super() == null ? other.getAdmin_is_super() == null : this.getAdmin_is_super().equals(other.getAdmin_is_super()))
            && (this.getAdmin_gid() == null ? other.getAdmin_gid() == null : this.getAdmin_gid().equals(other.getAdmin_gid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmin_id() == null) ? 0 : getAdmin_id().hashCode());
        result = prime * result + ((getAdmin_name() == null) ? 0 : getAdmin_name().hashCode());
        result = prime * result + ((getAdmin_password() == null) ? 0 : getAdmin_password().hashCode());
        result = prime * result + ((getAdmin_login_time() == null) ? 0 : getAdmin_login_time().hashCode());
        result = prime * result + ((getAdmin_login_num() == null) ? 0 : getAdmin_login_num().hashCode());
        result = prime * result + ((getAdmin_is_super() == null) ? 0 : getAdmin_is_super().hashCode());
        result = prime * result + ((getAdmin_gid() == null) ? 0 : getAdmin_gid().hashCode());
        return result;
    }
}