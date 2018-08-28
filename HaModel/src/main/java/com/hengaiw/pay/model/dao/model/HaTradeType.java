package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaTradeType implements Serializable {
    /**
     * 交易类型ID
     *
     * @mbg.generated
     */
    private Integer trade_type_id;

    /**
     * 交易类型名称
     *
     * @mbg.generated
     */
    private String trade_type_name;

    /**
     * 交易类型简称
     *
     * @mbg.generated
     */
    private String trade_type_nickname;

    /**
     * 添加时间
     *
     * @mbg.generated
     */
    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Integer getTrade_type_id() {
        return trade_type_id;
    }

    public void setTrade_type_id(Integer trade_type_id) {
        this.trade_type_id = trade_type_id;
    }

    public String getTrade_type_name() {
        return trade_type_name;
    }

    public void setTrade_type_name(String trade_type_name) {
        this.trade_type_name = trade_type_name;
    }

    public String getTrade_type_nickname() {
        return trade_type_nickname;
    }

    public void setTrade_type_nickname(String trade_type_nickname) {
        this.trade_type_nickname = trade_type_nickname;
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
        HaTradeType other = (HaTradeType) that;
        return (this.getTrade_type_id() == null ? other.getTrade_type_id() == null : this.getTrade_type_id().equals(other.getTrade_type_id()))
            && (this.getTrade_type_name() == null ? other.getTrade_type_name() == null : this.getTrade_type_name().equals(other.getTrade_type_name()))
            && (this.getTrade_type_nickname() == null ? other.getTrade_type_nickname() == null : this.getTrade_type_nickname().equals(other.getTrade_type_nickname()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrade_type_id() == null) ? 0 : getTrade_type_id().hashCode());
        result = prime * result + ((getTrade_type_name() == null) ? 0 : getTrade_type_name().hashCode());
        result = prime * result + ((getTrade_type_nickname() == null) ? 0 : getTrade_type_nickname().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        return result;
    }
}