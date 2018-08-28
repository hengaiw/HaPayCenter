package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaAgentProduct implements Serializable {
    /**
     * ID
     *
     * @mbg.generated
     */
    private Integer agent_product_id;

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
     * 代理商费率（%）
     *
     * @mbg.generated
     */
    private Integer agent_rate;

    /**
     * 添加时间
     *
     * @mbg.generated
     */
    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Integer getAgent_product_id() {
        return agent_product_id;
    }

    public void setAgent_product_id(Integer agent_product_id) {
        this.agent_product_id = agent_product_id;
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

    public Integer getAgent_rate() {
        return agent_rate;
    }

    public void setAgent_rate(Integer agent_rate) {
        this.agent_rate = agent_rate;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
        HaAgentProduct other = (HaAgentProduct) that;
        return (this.getAgent_product_id() == null ? other.getAgent_product_id() == null : this.getAgent_product_id().equals(other.getAgent_product_id()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getAgent_rate() == null ? other.getAgent_rate() == null : this.getAgent_rate().equals(other.getAgent_rate()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgent_product_id() == null) ? 0 : getAgent_product_id().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getAgent_rate() == null) ? 0 : getAgent_rate().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}