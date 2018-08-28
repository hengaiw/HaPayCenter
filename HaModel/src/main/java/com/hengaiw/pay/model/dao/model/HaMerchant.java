package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.Date;

public class HaMerchant implements Serializable {
    /**
     * 商户ID
     *
     * @mbg.generated
     */
    private Integer merchant_id;

    /**
     * 代理商ID
     *
     * @mbg.generated
     */
    private Integer agent_id;

    /**
     * 商户名称
     *
     * @mbg.generated
     */
    private String merchant_name;

    /**
     * 商户简称
     *
     * @mbg.generated
     */
    private String merchant_nickname;

    /**
     * 商户营业执照号
     *
     * @mbg.generated
     */
    private String merchant_business_no;

    /**
     * 商户营业执照到期时间
     *
     * @mbg.generated
     */
    private String merchant_business_date;

    /**
     * 商户邮箱
     *
     * @mbg.generated
     */
    private String merchant_email;

    /**
     * 商户法人身份证号
     *
     * @mbg.generated
     */
    private String merchant_user_no;

    /**
     * 商户法人姓名
     *
     * @mbg.generated
     */
    private String merchant_user_name;

    /**
     * 商户法人联系电话
     *
     * @mbg.generated
     */
    private String merchant_user_phone;

    /**
     * 商户公司地址
     *
     * @mbg.generated
     */
    private String merchant_address;

    /**
     * 商户网站
     *
     * @mbg.generated
     */
    private String merchant_site;

    /**
     * 商户网站ICP备案号
     *
     * @mbg.generated
     */
    private String merchant_icp;

    /**
     * 商户结算帐户名称
     *
     * @mbg.generated
     */
    private String merchant_bank_account_name;

    /**
     * 商户结算帐号
     *
     * @mbg.generated
     */
    private String merchant_bank_account;

    /**
     * 商户结算银行开户行名称
     *
     * @mbg.generated
     */
    private String merchant_bank_name;

    /**
     * 商户结算银行预留手机号
     *
     * @mbg.generated
     */
    private String merchant_bank_phone;

    /**
     * 商户状态（0为禁用，1为启用）
     *
     * @mbg.generated
     */
    private Boolean merchant_status;

    /**
     * 商户编号
     *
     * @mbg.generated
     */
    private String merchant_no;

    /**
     * 商户请求秘钥
     *
     * @mbg.generated
     */
    private String merchant_req_key;

    /**
     * 商户响应私钥
     *
     * @mbg.generated
     */
    private String merchant_res_key;

    /**
     * 商户累计金额
     *
     * @mbg.generated
     */
    private Long merchant_total_cash;

    /**
     * 商户待结算金额
     *
     * @mbg.generated
     */
    private Long merchant_wait_cash;

    /**
     * 商户可提现金额
     *
     * @mbg.generated
     */
    private Long merchant_withdraw_cash;

    /**
     * 商户添加时间
     *
     * @mbg.generated
     */
    private Date create_time;

    /**
     * 商户登录密码
     *
     * @mbg.generated
     */
    private String merchant_password;

    /**
     * 商户备注
     *
     * @mbg.generated
     */
    private String merchant_res;

    private static final long serialVersionUID = 1L;

    public Integer getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(Integer merchant_id) {
        this.merchant_id = merchant_id;
    }

    public Integer getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getMerchant_nickname() {
        return merchant_nickname;
    }

    public void setMerchant_nickname(String merchant_nickname) {
        this.merchant_nickname = merchant_nickname;
    }

    public String getMerchant_business_no() {
        return merchant_business_no;
    }

    public void setMerchant_business_no(String merchant_business_no) {
        this.merchant_business_no = merchant_business_no;
    }

    public String getMerchant_business_date() {
        return merchant_business_date;
    }

    public void setMerchant_business_date(String merchant_business_date) {
        this.merchant_business_date = merchant_business_date;
    }

    public String getMerchant_email() {
        return merchant_email;
    }

    public void setMerchant_email(String merchant_email) {
        this.merchant_email = merchant_email;
    }

    public String getMerchant_user_no() {
        return merchant_user_no;
    }

    public void setMerchant_user_no(String merchant_user_no) {
        this.merchant_user_no = merchant_user_no;
    }

    public String getMerchant_user_name() {
        return merchant_user_name;
    }

    public void setMerchant_user_name(String merchant_user_name) {
        this.merchant_user_name = merchant_user_name;
    }

    public String getMerchant_user_phone() {
        return merchant_user_phone;
    }

    public void setMerchant_user_phone(String merchant_user_phone) {
        this.merchant_user_phone = merchant_user_phone;
    }

    public String getMerchant_address() {
        return merchant_address;
    }

    public void setMerchant_address(String merchant_address) {
        this.merchant_address = merchant_address;
    }

    public String getMerchant_site() {
        return merchant_site;
    }

    public void setMerchant_site(String merchant_site) {
        this.merchant_site = merchant_site;
    }

    public String getMerchant_icp() {
        return merchant_icp;
    }

    public void setMerchant_icp(String merchant_icp) {
        this.merchant_icp = merchant_icp;
    }

    public String getMerchant_bank_account_name() {
        return merchant_bank_account_name;
    }

    public void setMerchant_bank_account_name(String merchant_bank_account_name) {
        this.merchant_bank_account_name = merchant_bank_account_name;
    }

    public String getMerchant_bank_account() {
        return merchant_bank_account;
    }

    public void setMerchant_bank_account(String merchant_bank_account) {
        this.merchant_bank_account = merchant_bank_account;
    }

    public String getMerchant_bank_name() {
        return merchant_bank_name;
    }

    public void setMerchant_bank_name(String merchant_bank_name) {
        this.merchant_bank_name = merchant_bank_name;
    }

    public String getMerchant_bank_phone() {
        return merchant_bank_phone;
    }

    public void setMerchant_bank_phone(String merchant_bank_phone) {
        this.merchant_bank_phone = merchant_bank_phone;
    }

    public Boolean getMerchant_status() {
        return merchant_status;
    }

    public void setMerchant_status(Boolean merchant_status) {
        this.merchant_status = merchant_status;
    }

    public String getMerchant_no() {
        return merchant_no;
    }

    public void setMerchant_no(String merchant_no) {
        this.merchant_no = merchant_no;
    }

    public String getMerchant_req_key() {
        return merchant_req_key;
    }

    public void setMerchant_req_key(String merchant_req_key) {
        this.merchant_req_key = merchant_req_key;
    }

    public String getMerchant_res_key() {
        return merchant_res_key;
    }

    public void setMerchant_res_key(String merchant_res_key) {
        this.merchant_res_key = merchant_res_key;
    }

    public Long getMerchant_total_cash() {
        return merchant_total_cash;
    }

    public void setMerchant_total_cash(Long merchant_total_cash) {
        this.merchant_total_cash = merchant_total_cash;
    }

    public Long getMerchant_wait_cash() {
        return merchant_wait_cash;
    }

    public void setMerchant_wait_cash(Long merchant_wait_cash) {
        this.merchant_wait_cash = merchant_wait_cash;
    }

    public Long getMerchant_withdraw_cash() {
        return merchant_withdraw_cash;
    }

    public void setMerchant_withdraw_cash(Long merchant_withdraw_cash) {
        this.merchant_withdraw_cash = merchant_withdraw_cash;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getMerchant_password() {
        return merchant_password;
    }

    public void setMerchant_password(String merchant_password) {
        this.merchant_password = merchant_password;
    }

    public String getMerchant_res() {
        return merchant_res;
    }

    public void setMerchant_res(String merchant_res) {
        this.merchant_res = merchant_res;
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
        HaMerchant other = (HaMerchant) that;
        return (this.getMerchant_id() == null ? other.getMerchant_id() == null : this.getMerchant_id().equals(other.getMerchant_id()))
            && (this.getAgent_id() == null ? other.getAgent_id() == null : this.getAgent_id().equals(other.getAgent_id()))
            && (this.getMerchant_name() == null ? other.getMerchant_name() == null : this.getMerchant_name().equals(other.getMerchant_name()))
            && (this.getMerchant_nickname() == null ? other.getMerchant_nickname() == null : this.getMerchant_nickname().equals(other.getMerchant_nickname()))
            && (this.getMerchant_business_no() == null ? other.getMerchant_business_no() == null : this.getMerchant_business_no().equals(other.getMerchant_business_no()))
            && (this.getMerchant_business_date() == null ? other.getMerchant_business_date() == null : this.getMerchant_business_date().equals(other.getMerchant_business_date()))
            && (this.getMerchant_email() == null ? other.getMerchant_email() == null : this.getMerchant_email().equals(other.getMerchant_email()))
            && (this.getMerchant_user_no() == null ? other.getMerchant_user_no() == null : this.getMerchant_user_no().equals(other.getMerchant_user_no()))
            && (this.getMerchant_user_name() == null ? other.getMerchant_user_name() == null : this.getMerchant_user_name().equals(other.getMerchant_user_name()))
            && (this.getMerchant_user_phone() == null ? other.getMerchant_user_phone() == null : this.getMerchant_user_phone().equals(other.getMerchant_user_phone()))
            && (this.getMerchant_address() == null ? other.getMerchant_address() == null : this.getMerchant_address().equals(other.getMerchant_address()))
            && (this.getMerchant_site() == null ? other.getMerchant_site() == null : this.getMerchant_site().equals(other.getMerchant_site()))
            && (this.getMerchant_icp() == null ? other.getMerchant_icp() == null : this.getMerchant_icp().equals(other.getMerchant_icp()))
            && (this.getMerchant_bank_account_name() == null ? other.getMerchant_bank_account_name() == null : this.getMerchant_bank_account_name().equals(other.getMerchant_bank_account_name()))
            && (this.getMerchant_bank_account() == null ? other.getMerchant_bank_account() == null : this.getMerchant_bank_account().equals(other.getMerchant_bank_account()))
            && (this.getMerchant_bank_name() == null ? other.getMerchant_bank_name() == null : this.getMerchant_bank_name().equals(other.getMerchant_bank_name()))
            && (this.getMerchant_bank_phone() == null ? other.getMerchant_bank_phone() == null : this.getMerchant_bank_phone().equals(other.getMerchant_bank_phone()))
            && (this.getMerchant_status() == null ? other.getMerchant_status() == null : this.getMerchant_status().equals(other.getMerchant_status()))
            && (this.getMerchant_no() == null ? other.getMerchant_no() == null : this.getMerchant_no().equals(other.getMerchant_no()))
            && (this.getMerchant_req_key() == null ? other.getMerchant_req_key() == null : this.getMerchant_req_key().equals(other.getMerchant_req_key()))
            && (this.getMerchant_res_key() == null ? other.getMerchant_res_key() == null : this.getMerchant_res_key().equals(other.getMerchant_res_key()))
            && (this.getMerchant_total_cash() == null ? other.getMerchant_total_cash() == null : this.getMerchant_total_cash().equals(other.getMerchant_total_cash()))
            && (this.getMerchant_wait_cash() == null ? other.getMerchant_wait_cash() == null : this.getMerchant_wait_cash().equals(other.getMerchant_wait_cash()))
            && (this.getMerchant_withdraw_cash() == null ? other.getMerchant_withdraw_cash() == null : this.getMerchant_withdraw_cash().equals(other.getMerchant_withdraw_cash()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getMerchant_password() == null ? other.getMerchant_password() == null : this.getMerchant_password().equals(other.getMerchant_password()))
            && (this.getMerchant_res() == null ? other.getMerchant_res() == null : this.getMerchant_res().equals(other.getMerchant_res()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchant_id() == null) ? 0 : getMerchant_id().hashCode());
        result = prime * result + ((getAgent_id() == null) ? 0 : getAgent_id().hashCode());
        result = prime * result + ((getMerchant_name() == null) ? 0 : getMerchant_name().hashCode());
        result = prime * result + ((getMerchant_nickname() == null) ? 0 : getMerchant_nickname().hashCode());
        result = prime * result + ((getMerchant_business_no() == null) ? 0 : getMerchant_business_no().hashCode());
        result = prime * result + ((getMerchant_business_date() == null) ? 0 : getMerchant_business_date().hashCode());
        result = prime * result + ((getMerchant_email() == null) ? 0 : getMerchant_email().hashCode());
        result = prime * result + ((getMerchant_user_no() == null) ? 0 : getMerchant_user_no().hashCode());
        result = prime * result + ((getMerchant_user_name() == null) ? 0 : getMerchant_user_name().hashCode());
        result = prime * result + ((getMerchant_user_phone() == null) ? 0 : getMerchant_user_phone().hashCode());
        result = prime * result + ((getMerchant_address() == null) ? 0 : getMerchant_address().hashCode());
        result = prime * result + ((getMerchant_site() == null) ? 0 : getMerchant_site().hashCode());
        result = prime * result + ((getMerchant_icp() == null) ? 0 : getMerchant_icp().hashCode());
        result = prime * result + ((getMerchant_bank_account_name() == null) ? 0 : getMerchant_bank_account_name().hashCode());
        result = prime * result + ((getMerchant_bank_account() == null) ? 0 : getMerchant_bank_account().hashCode());
        result = prime * result + ((getMerchant_bank_name() == null) ? 0 : getMerchant_bank_name().hashCode());
        result = prime * result + ((getMerchant_bank_phone() == null) ? 0 : getMerchant_bank_phone().hashCode());
        result = prime * result + ((getMerchant_status() == null) ? 0 : getMerchant_status().hashCode());
        result = prime * result + ((getMerchant_no() == null) ? 0 : getMerchant_no().hashCode());
        result = prime * result + ((getMerchant_req_key() == null) ? 0 : getMerchant_req_key().hashCode());
        result = prime * result + ((getMerchant_res_key() == null) ? 0 : getMerchant_res_key().hashCode());
        result = prime * result + ((getMerchant_total_cash() == null) ? 0 : getMerchant_total_cash().hashCode());
        result = prime * result + ((getMerchant_wait_cash() == null) ? 0 : getMerchant_wait_cash().hashCode());
        result = prime * result + ((getMerchant_withdraw_cash() == null) ? 0 : getMerchant_withdraw_cash().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getMerchant_password() == null) ? 0 : getMerchant_password().hashCode());
        result = prime * result + ((getMerchant_res() == null) ? 0 : getMerchant_res().hashCode());
        return result;
    }
}