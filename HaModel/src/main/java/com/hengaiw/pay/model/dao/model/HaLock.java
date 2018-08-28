package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;

public class HaLock implements Serializable {
    /**
     * IP+TYPE
     *
     * @mbg.generated
     */
    private Long pid;

    /**
     * 次数
     *
     * @mbg.generated
     */
    private Byte pvalue;

    /**
     * 锁定截止时间
     *
     * @mbg.generated
     */
    private Integer expiretime;

    private static final long serialVersionUID = 1L;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Byte getPvalue() {
        return pvalue;
    }

    public void setPvalue(Byte pvalue) {
        this.pvalue = pvalue;
    }

    public Integer getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Integer expiretime) {
        this.expiretime = expiretime;
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
        HaLock other = (HaLock) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPvalue() == null ? other.getPvalue() == null : this.getPvalue().equals(other.getPvalue()))
            && (this.getExpiretime() == null ? other.getExpiretime() == null : this.getExpiretime().equals(other.getExpiretime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPvalue() == null) ? 0 : getPvalue().hashCode());
        result = prime * result + ((getExpiretime() == null) ? 0 : getExpiretime().hashCode());
        return result;
    }
}