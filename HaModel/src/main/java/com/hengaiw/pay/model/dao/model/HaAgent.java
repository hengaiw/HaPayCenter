package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaAgent implements Serializable {
    /**
     * 代理商ID
     *
     * @mbg.generated
     */
    private Integer agent_id;

    /**
     * 代理商名称
     *
     * @mbg.generated
     */
    private String agent_name;

    /**
     * 代理商简称
     *
     * @mbg.generated
     */
    private String agent_nickname;

    /**
     * 后台登陆密码
     *
     * @mbg.generated
     */
    private String agent_password;

    /**
     * 代理商营业执照号
     *
     * @mbg.generated
     */
    private String agent_business_no;

    /**
     * 代理商营业执照到期时间
     *
     * @mbg.generated
     */
    private String agent_business_date;

    /**
     * 代理商邮箱
     *
     * @mbg.generated
     */
    private String agent_email;

    /**
     * 代理商法人身份证号
     *
     * @mbg.generated
     */
    private String agent_user_no;

    /**
     * 代理商法人姓名
     *
     * @mbg.generated
     */
    private String agent_user_name;

    /**
     * 代理商法人联系电话
     *
     * @mbg.generated
     */
    private String agent_user_phone;

    /**
     * 代理商公司地址
     *
     * @mbg.generated
     */
    private String agent_address;

    /**
     * 代理商网站
     *
     * @mbg.generated
     */
    private String agent_site;

    /**
     * 代理商网站ICP备案号
     *
     * @mbg.generated
     */
    private String agent_icp;

    /**
     * 代理商结算帐户名称
     *
     * @mbg.generated
     */
    private String agent_bank_account_name;

    /**
     * 代理商结算帐号
     *
     * @mbg.generated
     */
    private String agent_bank_account;

    /**
     * 代理商结算银行开户行名称
     *
     * @mbg.generated
     */
    private String agent_bank_name;

    /**
     * 代理商结算银行预留手机号
     *
     * @mbg.generated
     */
    private String agent_bank_phone;

    /**
     * 代理商状态（0为禁用，1为启用）
     *
     * @mbg.generated
     */
    private Boolean agent_status;

    /**
     * 代理商添加时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 代理商备注
     *
     * @mbg.generated
     */
    private String agent_res;

    private static final long serialVersionUID = 1L;

    public Integer getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getAgent_nickname() {
        return agent_nickname;
    }

    public void setAgent_nickname(String agent_nickname) {
        this.agent_nickname = agent_nickname;
    }

    public String getAgent_password() {
        return agent_password;
    }

    public void setAgent_password(String agent_password) {
        this.agent_password = agent_password;
    }

    public String getAgent_business_no() {
        return agent_business_no;
    }

    public void setAgent_business_no(String agent_business_no) {
        this.agent_business_no = agent_business_no;
    }

    public String getAgent_business_date() {
        return agent_business_date;
    }

    public void setAgent_business_date(String agent_business_date) {
        this.agent_business_date = agent_business_date;
    }

    public String getAgent_email() {
        return agent_email;
    }

    public void setAgent_email(String agent_email) {
        this.agent_email = agent_email;
    }

    public String getAgent_user_no() {
        return agent_user_no;
    }

    public void setAgent_user_no(String agent_user_no) {
        this.agent_user_no = agent_user_no;
    }

    public String getAgent_user_name() {
        return agent_user_name;
    }

    public void setAgent_user_name(String agent_user_name) {
        this.agent_user_name = agent_user_name;
    }

    public String getAgent_user_phone() {
        return agent_user_phone;
    }

    public void setAgent_user_phone(String agent_user_phone) {
        this.agent_user_phone = agent_user_phone;
    }

    public String getAgent_address() {
        return agent_address;
    }

    public void setAgent_address(String agent_address) {
        this.agent_address = agent_address;
    }

    public String getAgent_site() {
        return agent_site;
    }

    public void setAgent_site(String agent_site) {
        this.agent_site = agent_site;
    }

    public String getAgent_icp() {
        return agent_icp;
    }

    public void setAgent_icp(String agent_icp) {
        this.agent_icp = agent_icp;
    }

    public String getAgent_bank_account_name() {
        return agent_bank_account_name;
    }

    public void setAgent_bank_account_name(String agent_bank_account_name) {
        this.agent_bank_account_name = agent_bank_account_name;
    }

    public String getAgent_bank_account() {
        return agent_bank_account;
    }

    public void setAgent_bank_account(String agent_bank_account) {
        this.agent_bank_account = agent_bank_account;
    }

    public String getAgent_bank_name() {
        return agent_bank_name;
    }

    public void setAgent_bank_name(String agent_bank_name) {
        this.agent_bank_name = agent_bank_name;
    }

    public String getAgent_bank_phone() {
        return agent_bank_phone;
    }

    public void setAgent_bank_phone(String agent_bank_phone) {
        this.agent_bank_phone = agent_bank_phone;
    }

    public Boolean getAgent_status() {
        return agent_status;
    }

    public void setAgent_status(Boolean agent_status) {
        this.agent_status = agent_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getAgent_res() {
        return agent_res;
    }

    public void setAgent_res(String agent_res) {
        this.agent_res = agent_res;
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
        HaAgent other = (HaAgent) that;
        return (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getAgent_name() == null ? other.getAgent_name() == null : this.getAgent_name().equals(other.getAgent_name()))
            && (this.getAgent_nickname() == null ? other.getAgent_nickname() == null : this.getAgent_nickname().equals(other.getAgent_nickname()))
            && (this.getAgent_password() == null ? other.getAgent_password() == null : this.getAgent_password().equals(other.getAgent_password()))
            && (this.getAgent_business_no() == null ? other.getAgent_business_no() == null : this.getAgent_business_no().equals(other.getAgent_business_no()))
            && (this.getAgent_business_date() == null ? other.getAgent_business_date() == null : this.getAgent_business_date().equals(other.getAgent_business_date()))
            && (this.getAgent_email() == null ? other.getAgent_email() == null : this.getAgent_email().equals(other.getAgent_email()))
            && (this.getAgent_user_no() == null ? other.getAgent_user_no() == null : this.getAgent_user_no().equals(other.getAgent_user_no()))
            && (this.getAgent_user_name() == null ? other.getAgent_user_name() == null : this.getAgent_user_name().equals(other.getAgent_user_name()))
            && (this.getAgent_user_phone() == null ? other.getAgent_user_phone() == null : this.getAgent_user_phone().equals(other.getAgent_user_phone()))
            && (this.getAgent_address() == null ? other.getAgent_address() == null : this.getAgent_address().equals(other.getAgent_address()))
            && (this.getAgent_site() == null ? other.getAgent_site() == null : this.getAgent_site().equals(other.getAgent_site()))
            && (this.getAgent_icp() == null ? other.getAgent_icp() == null : this.getAgent_icp().equals(other.getAgent_icp()))
            && (this.getAgent_bank_account_name() == null ? other.getAgent_bank_account_name() == null : this.getAgent_bank_account_name().equals(other.getAgent_bank_account_name()))
            && (this.getAgent_bank_account() == null ? other.getAgent_bank_account() == null : this.getAgent_bank_account().equals(other.getAgent_bank_account()))
            && (this.getAgent_bank_name() == null ? other.getAgent_bank_name() == null : this.getAgent_bank_name().equals(other.getAgent_bank_name()))
            && (this.getAgent_bank_phone() == null ? other.getAgent_bank_phone() == null : this.getAgent_bank_phone().equals(other.getAgent_bank_phone()))
            && (this.getAgent_status() == null ? other.getAgent_status() == null : this.getAgent_status().equals(other.getAgent_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getAgent_res() == null ? other.getAgent_res() == null : this.getAgent_res().equals(other.getAgent_res()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getAgent_name() == null) ? 0 : getAgent_name().hashCode());
        result = prime * result + ((getAgent_nickname() == null) ? 0 : getAgent_nickname().hashCode());
        result = prime * result + ((getAgent_password() == null) ? 0 : getAgent_password().hashCode());
        result = prime * result + ((getAgent_business_no() == null) ? 0 : getAgent_business_no().hashCode());
        result = prime * result + ((getAgent_business_date() == null) ? 0 : getAgent_business_date().hashCode());
        result = prime * result + ((getAgent_email() == null) ? 0 : getAgent_email().hashCode());
        result = prime * result + ((getAgent_user_no() == null) ? 0 : getAgent_user_no().hashCode());
        result = prime * result + ((getAgent_user_name() == null) ? 0 : getAgent_user_name().hashCode());
        result = prime * result + ((getAgent_user_phone() == null) ? 0 : getAgent_user_phone().hashCode());
        result = prime * result + ((getAgent_address() == null) ? 0 : getAgent_address().hashCode());
        result = prime * result + ((getAgent_site() == null) ? 0 : getAgent_site().hashCode());
        result = prime * result + ((getAgent_icp() == null) ? 0 : getAgent_icp().hashCode());
        result = prime * result + ((getAgent_bank_account_name() == null) ? 0 : getAgent_bank_account_name().hashCode());
        result = prime * result + ((getAgent_bank_account() == null) ? 0 : getAgent_bank_account().hashCode());
        result = prime * result + ((getAgent_bank_name() == null) ? 0 : getAgent_bank_name().hashCode());
        result = prime * result + ((getAgent_bank_phone() == null) ? 0 : getAgent_bank_phone().hashCode());
        result = prime * result + ((getAgent_status() == null) ? 0 : getAgent_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getAgent_res() == null) ? 0 : getAgent_res().hashCode());
        return result;
    }
}