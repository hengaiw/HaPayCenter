package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;

public class HaGadmin implements Serializable {
    /**
     * 自增id
     *
     * @mbg.generated
     */
    private Short gid;

    /**
     * 组名
     *
     * @mbg.generated
     */
    private String gname;

    /**
     * 权限内容
     *
     * @mbg.generated
     */
    private String limits;

    private static final long serialVersionUID = 1L;

    public Short getGid() {
        return gid;
    }

    public void setGid(Short gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
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
        HaGadmin other = (HaGadmin) that;
        return (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getGname() == null ? other.getGname() == null : this.getGname().equals(other.getGname()))
            && (this.getLimits() == null ? other.getLimits() == null : this.getLimits().equals(other.getLimits()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getGname() == null) ? 0 : getGname().hashCode());
        result = prime * result + ((getLimits() == null) ? 0 : getLimits().hashCode());
        return result;
    }
}