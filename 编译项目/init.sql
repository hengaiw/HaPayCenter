# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 101.200.161.45 (MySQL 5.6.34-log)
# Database: ha_center
# Generation Time: 2018-08-29 00:00:15 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table ha_admin
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_admin`;

CREATE TABLE `ha_admin` (
  `admin_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `admin_name` varchar(20) NOT NULL COMMENT '管理员名称',
  `admin_password` varchar(32) NOT NULL DEFAULT '' COMMENT '管理员密码',
  `admin_login_time` int(10) NOT NULL DEFAULT '0' COMMENT '登录时间',
  `admin_login_num` int(11) NOT NULL DEFAULT '0' COMMENT '登录次数',
  `admin_is_super` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否超级管理员',
  `admin_gid` smallint(6) DEFAULT '0' COMMENT '权限组ID',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';

LOCK TABLES `ha_admin` WRITE;
/*!40000 ALTER TABLE `ha_admin` DISABLE KEYS */;

INSERT INTO `ha_admin` (`admin_id`, `admin_name`, `admin_password`, `admin_login_time`, `admin_login_num`, `admin_is_super`, `admin_gid`)
VALUES
	(1,'admin','7fef6171469e80d32c0559f88b377245',1531319596,28,1,0);

/*!40000 ALTER TABLE `ha_admin` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_admin_log
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_admin_log`;

CREATE TABLE `ha_admin_log` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(50) NOT NULL COMMENT '操作内容',
  `createtime` int(10) unsigned DEFAULT NULL COMMENT '发生时间',
  `admin_name` char(20) NOT NULL COMMENT '管理员',
  `admin_id` mediumint(8) unsigned NOT NULL DEFAULT '0' COMMENT '管理员ID',
  `ip` char(15) NOT NULL COMMENT 'IP',
  `url` varchar(50) NOT NULL DEFAULT '' COMMENT 'act&op',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员操作日志';



# Dump of table ha_agent
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_agent`;

CREATE TABLE `ha_agent` (
  `agent_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '代理商ID',
  `agent_name` varchar(100) DEFAULT NULL COMMENT '代理商名称',
  `agent_nickname` varchar(100) DEFAULT NULL COMMENT '代理商简称',
  `agent_password` varchar(35) DEFAULT NULL COMMENT '后台登陆密码',
  `agent_business_no` varchar(50) DEFAULT NULL COMMENT '代理商营业执照号',
  `agent_business_date` varchar(100) DEFAULT NULL COMMENT '代理商营业执照到期时间',
  `agent_email` varchar(100) DEFAULT NULL COMMENT '代理商邮箱',
  `agent_user_no` varchar(50) DEFAULT NULL COMMENT '代理商法人身份证号',
  `agent_user_name` varchar(20) DEFAULT NULL COMMENT '代理商法人姓名',
  `agent_user_phone` varchar(20) DEFAULT NULL COMMENT '代理商法人联系电话',
  `agent_address` varchar(200) DEFAULT NULL COMMENT '代理商公司地址',
  `agent_site` varchar(200) DEFAULT NULL COMMENT '代理商网站',
  `agent_icp` varchar(11) DEFAULT NULL COMMENT '代理商网站ICP备案号',
  `agent_res` text COMMENT '代理商备注',
  `agent_bank_account_name` varchar(100) DEFAULT NULL COMMENT '代理商结算帐户名称',
  `agent_bank_account` varchar(50) DEFAULT NULL COMMENT '代理商结算帐号',
  `agent_bank_name` varchar(100) DEFAULT NULL COMMENT '代理商结算银行开户行名称',
  `agent_bank_phone` varchar(20) DEFAULT NULL COMMENT '代理商结算银行预留手机号',
  `agent_status` tinyint(1) DEFAULT '1' COMMENT '代理商状态（0为禁用，1为启用）',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '代理商添加时间',
  PRIMARY KEY (`agent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='渠道（代理商）';

LOCK TABLES `ha_agent` WRITE;
/*!40000 ALTER TABLE `ha_agent` DISABLE KEYS */;

INSERT INTO `ha_agent` (`agent_id`, `agent_name`, `agent_nickname`, `agent_password`, `agent_business_no`, `agent_business_date`, `agent_email`, `agent_user_no`, `agent_user_name`, `agent_user_phone`, `agent_address`, `agent_site`, `agent_icp`, `agent_res`, `agent_bank_account_name`, `agent_bank_account`, `agent_bank_name`, `agent_bank_phone`, `agent_status`, `create_time`)
VALUES
	(1,'测试代理商','代理商01','e10adc3949ba59abbe56e057f20f883e','110108001445941','2018-07-04','996775420@qq.com','622223199805181657','测试法人','13812345678','北京市朝阳区','www.baidu.com','京-ICP','代理商备注','测试结算名','110108001445921','测试开户银行','13812345679',1,'2018-07-03 15:29:16');

/*!40000 ALTER TABLE `ha_agent` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_agent_product
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_agent_product`;

CREATE TABLE `ha_agent_product` (
  `agent_product_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `agent_id` int(11) DEFAULT NULL COMMENT '代理商ID',
  `product_id` int(11) DEFAULT NULL COMMENT '产品ID',
  `agent_rate` int(11) DEFAULT NULL COMMENT '代理商费率（%）',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`agent_product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代理商产品配置表';

LOCK TABLES `ha_agent_product` WRITE;
/*!40000 ALTER TABLE `ha_agent_product` DISABLE KEYS */;

INSERT INTO `ha_agent_product` (`agent_product_id`, `agent_id`, `product_id`, `agent_rate`, `create_time`)
VALUES
	(1,1,1,40,'2018-07-03 17:49:02');

/*!40000 ALTER TABLE `ha_agent_product` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_bill
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_bill`;

CREATE TABLE `ha_bill` (
  `bill_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '对帐单ID',
  `bill_date` varchar(20) DEFAULT NULL COMMENT '对帐日期',
  `bill_sn` varchar(100) DEFAULT NULL COMMENT '对帐批次号',
  `channel_id` int(11) DEFAULT NULL COMMENT '通道ID',
  `product_id` int(11) DEFAULT NULL COMMENT '产品ID',
  `order_num` int(11) DEFAULT NULL COMMENT '平台交易笔数',
  `order_money` bigint(20) DEFAULT NULL COMMENT '平台交易金额（分）',
  `channel_order_num` int(11) DEFAULT NULL COMMENT '通道交易笔数',
  `channel_order_money` bigint(20) DEFAULT NULL COMMENT '通道交易金额（分）',
  `error_num` int(11) DEFAULT NULL COMMENT '异常笔数',
  `error_money` bigint(20) DEFAULT NULL COMMENT '异常金额（分）',
  `bill_status` tinyint(4) DEFAULT NULL COMMENT '对帐状态（1平帐，2异常，3对帐中）',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`bill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='对帐单';



# Dump of table ha_bill_error
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_bill_error`;

CREATE TABLE `ha_bill_error` (
  `bill_error_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '差错订单ID',
  `bill_id` int(11) DEFAULT NULL COMMENT '对帐单ID',
  `pay_order_sn` varchar(50) DEFAULT NULL COMMENT '平台订单编号',
  `order_amount` int(11) DEFAULT NULL COMMENT '平台订单金额',
  `channel_orderno` varchar(100) DEFAULT NULL COMMENT '通道订单编号',
  `channel_order_amount` int(11) DEFAULT NULL COMMENT '通道订单金额',
  `bill_error_type` tinyint(1) DEFAULT NULL COMMENT '差错类型（1平台单边,2上游单边,3金额不符,4状态不一致）',
  `bill_error_status` tinyint(1) DEFAULT NULL COMMENT '差错处理状态（0待处理,1已挂起,2加入对账,3已处理）',
  `bill_error_res` text COMMENT '处理备注',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`bill_error_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='对帐差错表';



# Dump of table ha_channel
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_channel`;

CREATE TABLE `ha_channel` (
  `channel_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '通道ID',
  `channel_name` varchar(200) DEFAULT NULL COMMENT '通道名称',
  `channel_mchid` varchar(100) DEFAULT NULL COMMENT '通道商户号',
  `channel_status` tinyint(1) DEFAULT '1' COMMENT '通道状态（0为禁用，1为启用）',
  `channel_url` varchar(200) DEFAULT NULL COMMENT '通道请求地址',
  `channel_param` text COMMENT '通道请求参数',
  `channel_day_limit` bigint(20) DEFAULT '0' COMMENT '通道日限额（分）',
  `channel_day_use` bigint(20) DEFAULT NULL COMMENT '通道当日已使用限额（分）',
  `channel_order_limit` bigint(20) DEFAULT '0' COMMENT '通道单笔限额（分）',
  `channel_cash` int(11) DEFAULT '0' COMMENT '可提现百分比',
  `channel_sign` varchar(20) DEFAULT NULL COMMENT '通道签名类型（MD5,AES,RSA,DES）',
  `channel_pub_key` text COMMENT '通道公钥',
  `channel_pri_key` text COMMENT '通道私钥',
  `channel_md5` text COMMENT 'MD5秘钥',
  `channel_res` text COMMENT '备注',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`channel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通道管理';

LOCK TABLES `ha_channel` WRITE;
/*!40000 ALTER TABLE `ha_channel` DISABLE KEYS */;

INSERT INTO `ha_channel` (`channel_id`, `channel_name`, `channel_mchid`, `channel_status`, `channel_url`, `channel_param`, `channel_day_limit`, `channel_day_use`, `channel_order_limit`, `channel_cash`, `channel_sign`, `channel_pub_key`, `channel_pri_key`, `channel_md5`, `channel_res`, `create_time`)
VALUES
	(1,'小视科技','1',1,'www.hengkj.com','{id=1?channel_name=&quot;测试&quot;}',10,20,30,40,'MD5','adcaec3805aa912c0d0b14a81bedb6ff','05aa912c0d0b14a8','05aa912c0d0b14a9','测试备注','2018-07-03 15:41:35'),
	(2,'小视科技1','1',0,'www.hengkj.com','{id=1?channel_name=&quot;测试&quot;}',10,20,30,40,'MD5','adcaec3805aa912c0d0b14a81bedb6ff','05aa912c0d0b14a8','05aa912c0d0b14a9','测试备注','2018-07-03 15:41:35');

/*!40000 ALTER TABLE `ha_channel` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_gadmin
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_gadmin`;

CREATE TABLE `ha_gadmin` (
  `gid` smallint(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `gname` varchar(50) DEFAULT NULL COMMENT '组名',
  `limits` text COMMENT '权限内容',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限组';



# Dump of table ha_lock
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_lock`;

CREATE TABLE `ha_lock` (
  `pid` bigint(20) unsigned NOT NULL COMMENT 'IP+TYPE',
  `pvalue` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '次数',
  `expiretime` int(11) NOT NULL DEFAULT '0' COMMENT '锁定截止时间',
  KEY `ip` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='防灌水表';



# Dump of table ha_merchant
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_merchant`;

CREATE TABLE `ha_merchant` (
  `merchant_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '商户ID',
  `agent_id` int(11) DEFAULT NULL COMMENT '代理商ID',
  `merchant_name` varchar(100) DEFAULT NULL COMMENT '商户名称',
  `merchant_nickname` varchar(100) DEFAULT NULL COMMENT '商户简称',
  `merchant_business_no` varchar(50) DEFAULT NULL COMMENT '商户营业执照号',
  `merchant_business_date` varchar(100) DEFAULT NULL COMMENT '商户营业执照到期时间',
  `merchant_email` varchar(100) DEFAULT NULL COMMENT '商户邮箱',
  `merchant_user_no` varchar(50) DEFAULT NULL COMMENT '商户法人身份证号',
  `merchant_user_name` varchar(20) DEFAULT NULL COMMENT '商户法人姓名',
  `merchant_user_phone` varchar(20) DEFAULT NULL COMMENT '商户法人联系电话',
  `merchant_address` varchar(200) DEFAULT NULL COMMENT '商户公司地址',
  `merchant_site` varchar(200) DEFAULT NULL COMMENT '商户网站',
  `merchant_icp` varchar(11) DEFAULT NULL COMMENT '商户网站ICP备案号',
  `merchant_res` text COMMENT '商户备注',
  `merchant_bank_account_name` varchar(100) DEFAULT NULL COMMENT '商户结算帐户名称',
  `merchant_bank_account` varchar(50) DEFAULT NULL COMMENT '商户结算帐号',
  `merchant_bank_name` varchar(100) DEFAULT NULL COMMENT '商户结算银行开户行名称',
  `merchant_bank_phone` varchar(20) DEFAULT NULL COMMENT '商户结算银行预留手机号',
  `merchant_status` tinyint(1) DEFAULT '1' COMMENT '商户状态（0为禁用，1为启用）',
  `merchant_no` varchar(100) DEFAULT NULL COMMENT '商户编号',
  `merchant_req_key` varchar(100) DEFAULT NULL COMMENT '商户请求秘钥',
  `merchant_res_key` varchar(100) DEFAULT NULL COMMENT '商户响应私钥',
  `merchant_total_cash` bigint(20) DEFAULT NULL COMMENT '商户累计金额',
  `merchant_wait_cash` bigint(20) DEFAULT NULL COMMENT '商户待结算金额',
  `merchant_withdraw_cash` bigint(20) DEFAULT NULL COMMENT '商户可提现金额',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '商户添加时间',
  `merchant_password` varchar(32) NOT NULL DEFAULT '' COMMENT '商户登录密码',
  PRIMARY KEY (`merchant_id`),
  UNIQUE KEY `merchant_no` (`merchant_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='渠道（代理商）';

LOCK TABLES `ha_merchant` WRITE;
/*!40000 ALTER TABLE `ha_merchant` DISABLE KEYS */;

INSERT INTO `ha_merchant` (`merchant_id`, `agent_id`, `merchant_name`, `merchant_nickname`, `merchant_business_no`, `merchant_business_date`, `merchant_email`, `merchant_user_no`, `merchant_user_name`, `merchant_user_phone`, `merchant_address`, `merchant_site`, `merchant_icp`, `merchant_res`, `merchant_bank_account_name`, `merchant_bank_account`, `merchant_bank_name`, `merchant_bank_phone`, `merchant_status`, `merchant_no`, `merchant_req_key`, `merchant_res_key`, `merchant_total_cash`, `merchant_wait_cash`, `merchant_withdraw_cash`, `create_time`, `merchant_password`)
VALUES
	(1,1,'测试商户','商户01','220108001445941','2018-07-05','1597280902@qq.com','622223199209021835','测试法人姓名','13812345678','北京望京','www.baidu.com','京-ICP','备注内容','测试结算名称','220108001445945','测试开户银行','13812345679',1,'844df47735689e50847ba6f89e6b78e8','0vkodt0vww9an0kcajs9aedf56jocjrbe2ntvu73n9gs1kpcnmb6o3w8tw6w1a65tbmw1u0pisj1wrmfaq6fvj58ouwbe7g1048m','tmn7o6tkrppge6baow2ke3f2b9et0t0vp524g5q3tgfrmh6wdartjmn9hop5drl38pbavnha7h9v8dmeacmlua358ebvb4vw4d4n',0,NULL,NULL,'2018-07-03 15:36:29','e10adc3949ba59abbe56e057f20f883e'),
	(2,1,'测试商户','商户01','220108001445942','2018-07-05','1597280902@qq.com','622223199209021835','测试法人姓名','13812345678','北京望京','www.baidu.com','京-ICP','备注内容','测试结算名称','220108001445945','测试开户银行','13812345679',1,'844df47735689e50847ba6f89e6b78e9','0vkodt0vww9an0kcajs9aedf56jocjrbe2ntvu73n9gs1kpcnmb6o3w8tw6w1a65tbmw1u0pisj1wrmfaq6fvj58ouwbe7g1048m','tmn7o6tkrppge6baow2ke3f2b9et0t0vp524g5q3tgfrmh6wdartjmn9hop5drl38pbavnha7h9v8dmeacmlua358ebvb4vw4d4n',0,NULL,NULL,'2018-07-03 15:36:29','e10adc3949ba59abbe56e057f20f883e');

/*!40000 ALTER TABLE `ha_merchant` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_merchant_notify
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_merchant_notify`;

CREATE TABLE `ha_merchant_notify` (
  `merchant_notify_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '商家通知ID',
  `notify_url` varchar(512) DEFAULT '' COMMENT '通知地址',
  `notify_content` text COMMENT '通知内容',
  `notify_result` text COMMENT '通知返回的结果',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '通知时间',
  PRIMARY KEY (`merchant_notify_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table ha_merchant_product
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_merchant_product`;

CREATE TABLE `ha_merchant_product` (
  `merchant_product_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `merchant_id` int(11) DEFAULT NULL COMMENT '商户ID',
  `merchant_no` varchar(100) DEFAULT NULL COMMENT '商户编号',
  `product_id` int(11) DEFAULT NULL COMMENT '产品ID',
  `product_type` enum('ALIPAY','DATA') DEFAULT NULL COMMENT '产品分类（PAY为支付类产品，DATA为数据查询类）',
  `trade_type_nickname` varchar(100) DEFAULT NULL COMMENT '交易类型昵称',
  `merchant_day_limit` bigint(20) DEFAULT '0' COMMENT '商家单日限额（分）',
  `merchant_day_use` bigint(20) DEFAULT '0' COMMENT '商家单日已使用限额（分）',
  `merchant_order_limit` bigint(20) DEFAULT '0' COMMENT '商家每笔限额（分）',
  `merchant_rate` int(11) DEFAULT '0' COMMENT '商户费率（%）',
  `merchant_product_params` text COMMENT '产品的请求参数',
  `product_status` tinyint(1) DEFAULT '0' COMMENT '产品状态（0，禁用 1，使用）',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`merchant_product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='代理商产品配置表';

LOCK TABLES `ha_merchant_product` WRITE;
/*!40000 ALTER TABLE `ha_merchant_product` DISABLE KEYS */;

INSERT INTO `ha_merchant_product` (`merchant_product_id`, `merchant_id`, `merchant_no`, `product_id`, `product_type`, `trade_type_nickname`, `merchant_day_limit`, `merchant_day_use`, `merchant_order_limit`, `merchant_rate`, `merchant_product_params`, `product_status`, `create_time`)
VALUES
	(1,1,'844df47735689e50847ba6f89e6b78e8',1,'ALIPAY','ALIPAY.QR',100000000,3000,100000,50,'{\"appid\":\"2016080700191241\",\"openApiDomain\":\"https://openapi.alipaydev.com/gateway.do\",\"privateKey\":\"MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCUDOjstwt/EV9vuhhA81tYzGRy5Pli3LBuXP+7eElAFK0pweJOsoltHnwXdoX6oOMHoGomInZJuamSqIdwTzd078CS7tT7NsDLycVOq+82t7noHIcX2TDSV3tFhdBtlfV9dcIEzVqz1MB8jEYdorP6H/MDq2bZW7pyan23M9f/hJo5Roj0ZyPKK6WrpbcONajVku4Ets+Ce/mXA4UXsuv72Tsr/7RIj9/IkbGbETxgRbHG05tqBPpWRYYbf/M9O3HRjlkfXfCHhwtO+b+eOUhHap+IsnLQG/Z4F5qOlFQUiKdKlSna4uAT3n8y395lsPGnSmTtvfrektLmh2sI72rrAgMBAAECggEAPuTRGqaUMrHtqigTX5xCZRHHZmvRaec46FmHpltuOtPN0Fx2SFpeOUXnD4yhVBx+9eF21qZzO9Ssrgn8J4DvnTSwyXq+bc4Pz0LzF/3AjK02Q93CoiX5MJJLYvh61+MJu/eHqcSXUKgD8aUhsDtLW+mwshFhitsF9M86gtZ6XyiPc/0A/Ro3gsXMVHrxZSCQWD9eUpIBchcvKoIekVLY2Wrvyv28rILeBjhfkgEzBCNCVPeP4xxeCvuJx2msFbhywwBu5Q5KSmB406IYSC2tI3gGd2/IDucxzQK/m+P5lvaiYEo/o0hg+bdk7REhloaJWoO5CuQRKfrO8FL6AMfSGQKBgQDFD5j9jWxyb5nIoGG1H+WZgYBsfflN+eAMC5fhJMti9AhrV5+6rlUcOXJKkLoMpl+Eb6F5qrXXlK9mosdFehpRBnoZYGsDhCchiQX2fHXu/YP/BO0W9gTLcBNvsNMGlipZKCB2H3jspmphE+0FctqlJ95k4tVkwHT70fh0RtV+nwKBgQDAVLdBNydgDRIkmPWOa/kUUFnWCe66IN+qZ6+QUDP46epOzhSiOCsXL/yelZfFvZyFMDD5folk8sP4xRwjJJVEQSkRTmijUVeEJfomQc7sJqnzBu1aUbmqhz5SEXHFJlB2qHDSijX8trUTLwfAQ1IHYL8U60IShHCIPZQVIbtMNQKBgFcAKeVXeNeVGeoPlNOof2+kUxSTEWwxs47d13IZEopffxAVIXoD2aOaYTE2cE2Bbo5D0qCqk5nYFRBVMXElFVVMbL+jZ9unjrcpja5jCJY46vu+KwaGG1vN4WbgRGqWBaBTLPG5t2OTnUe6ylwrdwiPb4pO8zOGHJ/I9c4wL7W1AoGASoGG7DCdhEwL9zl6Bs41E3V9F7mJTXlmq/C2xkULnSWgqx6SR7VSnAzu49A3l1a4x6+/iSdHul+BI2HYYJTPbj1/10B0sK/WI09C9IcRzdG8jHTmhdKbBkCWF9zCIgmRqiXebvEzsM5mnyPc8NIjeNA1tbjdQ6cioOSZ9QW4NPECgYAO87ZaKkEsw8fgc6X5Hljw8h89qUM4IdrNGkkuwbavhPGndBOpRxZm3m853wCVN3kQdq+XtumXsjoFPYJzd4sQvhGmcfEL2x5k3xHsAaXdrT5L1mYMVQxhvUNbQBqBBOYIj8OkGjEI+9A6Ku9yR9rq73u+btvtfrpoqj9dTXd2dA==\",\"alipayPublicKey\":\"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxxFcrGcRxFOhLQW8qtz137CtSsj4PSCvkAtcDvLS0lr1jrO5L+xA9LQxlo1eIwwevCIpCEbUlYWutZs1DK+imvWdLqHIiCc6KOw+fQNO0q3beA4bPpc6KmArIvTKUIktvInC19bpnJwKbvUpPBTUb7aOcIuIWU+PrYC4ElMPEyd5KqRdHsN+BOJ2B9DuOmp9ZhYPPrlG9D7K4BsdjJ1gZa8wBeZcn5t1ygVQ8LVdDilnJitR8DWIBHy2IECME9DewHdcm2Ng3gAbCiSt5pSiRjWtXYC17jGa4ULUlWwD3VKsq9d4QoYXhDMrw1KGyEkylDPKSmA5QmmVvsprSgXLpwIDAQAB\"}',1,'2018-07-11 22:34:38'),
	(2,1,'844df47735689e50847ba6f89e6b78e8',2,'ALIPAY','ALIPAY.FACE',1000000000,0,100000,50,'{\"appid\":\"2016080700191241\",\"openApiDomain\":\"https://openapi.alipaydev.com/gateway.do\",\"privateKey\":\"MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCUDOjstwt/EV9vuhhA81tYzGRy5Pli3LBuXP+7eElAFK0pweJOsoltHnwXdoX6oOMHoGomInZJuamSqIdwTzd078CS7tT7NsDLycVOq+82t7noHIcX2TDSV3tFhdBtlfV9dcIEzVqz1MB8jEYdorP6H/MDq2bZW7pyan23M9f/hJo5Roj0ZyPKK6WrpbcONajVku4Ets+Ce/mXA4UXsuv72Tsr/7RIj9/IkbGbETxgRbHG05tqBPpWRYYbf/M9O3HRjlkfXfCHhwtO+b+eOUhHap+IsnLQG/Z4F5qOlFQUiKdKlSna4uAT3n8y395lsPGnSmTtvfrektLmh2sI72rrAgMBAAECggEAPuTRGqaUMrHtqigTX5xCZRHHZmvRaec46FmHpltuOtPN0Fx2SFpeOUXnD4yhVBx+9eF21qZzO9Ssrgn8J4DvnTSwyXq+bc4Pz0LzF/3AjK02Q93CoiX5MJJLYvh61+MJu/eHqcSXUKgD8aUhsDtLW+mwshFhitsF9M86gtZ6XyiPc/0A/Ro3gsXMVHrxZSCQWD9eUpIBchcvKoIekVLY2Wrvyv28rILeBjhfkgEzBCNCVPeP4xxeCvuJx2msFbhywwBu5Q5KSmB406IYSC2tI3gGd2/IDucxzQK/m+P5lvaiYEo/o0hg+bdk7REhloaJWoO5CuQRKfrO8FL6AMfSGQKBgQDFD5j9jWxyb5nIoGG1H+WZgYBsfflN+eAMC5fhJMti9AhrV5+6rlUcOXJKkLoMpl+Eb6F5qrXXlK9mosdFehpRBnoZYGsDhCchiQX2fHXu/YP/BO0W9gTLcBNvsNMGlipZKCB2H3jspmphE+0FctqlJ95k4tVkwHT70fh0RtV+nwKBgQDAVLdBNydgDRIkmPWOa/kUUFnWCe66IN+qZ6+QUDP46epOzhSiOCsXL/yelZfFvZyFMDD5folk8sP4xRwjJJVEQSkRTmijUVeEJfomQc7sJqnzBu1aUbmqhz5SEXHFJlB2qHDSijX8trUTLwfAQ1IHYL8U60IShHCIPZQVIbtMNQKBgFcAKeVXeNeVGeoPlNOof2+kUxSTEWwxs47d13IZEopffxAVIXoD2aOaYTE2cE2Bbo5D0qCqk5nYFRBVMXElFVVMbL+jZ9unjrcpja5jCJY46vu+KwaGG1vN4WbgRGqWBaBTLPG5t2OTnUe6ylwrdwiPb4pO8zOGHJ/I9c4wL7W1AoGASoGG7DCdhEwL9zl6Bs41E3V9F7mJTXlmq/C2xkULnSWgqx6SR7VSnAzu49A3l1a4x6+/iSdHul+BI2HYYJTPbj1/10B0sK/WI09C9IcRzdG8jHTmhdKbBkCWF9zCIgmRqiXebvEzsM5mnyPc8NIjeNA1tbjdQ6cioOSZ9QW4NPECgYAO87ZaKkEsw8fgc6X5Hljw8h89qUM4IdrNGkkuwbavhPGndBOpRxZm3m853wCVN3kQdq+XtumXsjoFPYJzd4sQvhGmcfEL2x5k3xHsAaXdrT5L1mYMVQxhvUNbQBqBBOYIj8OkGjEI+9A6Ku9yR9rq73u+btvtfrpoqj9dTXd2dA==\",\"alipayPublicKey\":\"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxxFcrGcRxFOhLQW8qtz137CtSsj4PSCvkAtcDvLS0lr1jrO5L+xA9LQxlo1eIwwevCIpCEbUlYWutZs1DK+imvWdLqHIiCc6KOw+fQNO0q3beA4bPpc6KmArIvTKUIktvInC19bpnJwKbvUpPBTUb7aOcIuIWU+PrYC4ElMPEyd5KqRdHsN+BOJ2B9DuOmp9ZhYPPrlG9D7K4BsdjJ1gZa8wBeZcn5t1ygVQ8LVdDilnJitR8DWIBHy2IECME9DewHdcm2Ng3gAbCiSt5pSiRjWtXYC17jGa4ULUlWwD3VKsq9d4QoYXhDMrw1KGyEkylDPKSmA5QmmVvsprSgXLpwIDAQAB\"}',1,'2018-07-11 22:34:38'),
	(3,2,'844df47735689e50847ba6f89e6b78e9',1,'ALIPAY','ALIPAY.QR',100000000,20043,100000,50,'{\"appid\":\"2018082161113033\",\"openApiDomain\":\"https://openapi.alipay.com/gateway.do\",\"privateKey\":\"MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC4s4/7ClY+mfQ8diFwrVAq8/FQdhD3No4Ez1TTovRCjtVFcCgdI0Jvx2WDLcjQHTkSIXPHbZ96ePP/D7N/8/3fjIRpJHxPDqpUKqKbsyZGu0+B81+UTouX06fkuOVH6C8d85umHgfNDe0CnihBzVVFg/GXrreWQr36Qgu5sj4dbm3Tof8q1zNgzmK4NG4uEq1c7TDzhSwtyFgLTnwYCWYu1jaX9j7PvgzxJTRbIMQOKV4hRdPmUENXhwiXBonn0f1IHTkakEGxGFRn2pAmwEtQYtbLgS9Xb6ofxoo0y3cKmwbvp5r/FfvKiqnQjTgQjCYd98ZJzerAp5M5lBin25h5AgMBAAECggEAU+5c7jIbUOU65EK2HXLUbEBgFzUfroce8DabEHULVDd92MkHoX4FUbAlg//JMjElXwTOjQBWqRvPnMcwxWNFqVE8Vl8bEf3TDt40+FXnfdreXWoPs+AhdQPcVoZiwlNTHeQ2hb09xEOgwUDHgGdjaWx0232stV5s4A0lMOQ7b7mY282ZWPJc82CHEBemXTuqUv/vGV7OAWACNQHGiFdwuxxe2fLRfFvj9O3WYrh8ddMpM9qiWER6zpjSID9AJRbwKPq52xcnepAiMZ8gzsXwFtN5VLWKp4i+yZBaoNuTjxLB54sI5MQes+QDCptTTSs9Ivz20hYmd8B5Gsq/y52L0QKBgQDzAQiLiBbN5MDmg/nwoe9qfLHnqEDCILLExWA9Rw7XzoAYHwWuIPGwArSNbKE4nwofBkX/bM5oROLA5iF7SpYhMaKnASe4i+vzIqbqWulTc0YS3G8rmObxSgoqsM3YiFEX8Tuna6056a+UAajEBtU4q8666KH+PApBlt8i83VDFQKBgQDClE7p6/m5fxDXq2ycOlQbpXDUmXvdR7NrkVXtPQyHqqhDd5wzD7LfdunLQzJQ3cP5GUx4kO7e44nS3GwOI3PPOpDuN2rM2bP8O+pLJsEMpHn9EgpTnB7ZkO56YGR+WGxToluvFXwr/zYGFKNLtZ998bVKjUCnI85RW7RYK3Go1QKBgBIhr5uJqfnu6Z3JlyqnSo/tgfDBEyPpAK3B9G5eEPN1SwWBuxDFEIOLkCFFS7pH05+A/lQSsEwDZ8/w2+qxJAaSB4rigS458n8PxNiTs/kwDrh1ji34mLLETYHl81YGxdY9f6/8Ts6Vay5l+Uu3Hs29tA0qMnwfyrweH8Qh2kwJAoGAedzSs5Rz2WYoUTpukkXBqXLrAGuD9OlUCHmEfElw0ILkUSTXMe+SEnxyHjheieDqPNdIWnZC9FtDVUlxb0Vq4Y2HeXpBrDxoif+oVBrYayeTsxiaWRT9CTvI7+Hw7mRIq/SSQUxOcWusFRDV2LPOSN2ZsjBXHpbBP5kUkOfcjmUCgYEAsAKWDiUxBt6/Mv9KuEAq3VzwUqtaG5fFg2ucYha+lPp5OXFwc/Uo8UrTt02xCGRJ17G6luuq9FDqdYh8OtC3E81J8E5tPMvTNWAT81ZITXqHdYDThPIkg4yh4ZfxhK+Oxt7Ve4mOFIcmypPMlYSPfArBszWxYDSPz6/ZmtGCRQY=\",\"alipayPublicKey\":\"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA51RXOgwz+DsBJMgNQrKMTFsgNGuhFl/L6OLs0qt24CXbjq3JT2etCLCRu0TXQ284GfnUkbxpovhTFFWMJiU/EZMXdGqwq5c5O/wI7a/RqKI1WLbqD4tvroXFeC+BP0rQYyfFcitnVXS+HZ/mvBaIPkBI/PdtytNBT5LU2Gtu2ZjBtDbkM/6ujcDfTcELZnjPbxtbP3sYGsgR0gc7qQ3/ai8UrSkVyW7dgWd/mIlNkvjuXeqKokl35k5WA8EYioeCDdhAhWcBg/t/aLOw9+yY9+OwDX+RG2zECeQUfe4OmBA5XZq/C/LO72IU5B67CCkiOT5Sovr1ltaeJI51mxEBrQIDAQAB\"}',1,'2018-07-11 22:34:38');

/*!40000 ALTER TABLE `ha_merchant_product` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_pay_notify
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_pay_notify`;

CREATE TABLE `ha_pay_notify` (
  `notify_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '支付宝的通知ID',
  `notify_type` enum('ALIPAY','WX') DEFAULT NULL COMMENT '通知来源，支付宝或微信等',
  `notify_content` text COMMENT '通知内容',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '通知时间',
  PRIMARY KEY (`notify_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table ha_pay_order
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_pay_order`;

CREATE TABLE `ha_pay_order` (
  `pay_order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '平台订单ID',
  `pay_order_sn` varchar(100) DEFAULT NULL COMMENT '平台订单编号',
  `merchant_id` int(11) NOT NULL COMMENT '商户ID',
  `merchant_no` varchar(100) DEFAULT NULL COMMENT '商户编号',
  `agent_id` int(11) DEFAULT NULL COMMENT '代理商ID',
  `product_id` int(11) NOT NULL COMMENT '产品ID',
  `product_type` enum('ALIPAY','DATA') DEFAULT NULL COMMENT '产品分类（PAY为支付类产品，DATA为数据查询类）',
  `trade_type_nickname` varchar(100) DEFAULT NULL COMMENT '交易类型昵称',
  `merchant_rate` int(11) DEFAULT NULL COMMENT '商户费率（%）',
  `merchant_charge` int(11) DEFAULT NULL COMMENT '商户手续费（分）',
  `agent_rate` int(11) DEFAULT NULL COMMENT '代理商费率（%）',
  `agent_charge` int(11) DEFAULT NULL COMMENT '代理商手续费（分）',
  `product_rate` int(11) DEFAULT NULL COMMENT '产品费率（%）',
  `product_charge` int(11) DEFAULT NULL COMMENT '产品手续费（分）',
  `merchant_order_no` varchar(30) NOT NULL DEFAULT '' COMMENT '商户订单号',
  `order_amount` bigint(20) NOT NULL COMMENT '支付金额,单位分',
  `order_currency` varchar(3) DEFAULT 'cny' COMMENT '三位货币代码,人民币:cny',
  `order_status` tinyint(6) NOT NULL DEFAULT '0' COMMENT '支付状态,0-订单生成,1-支付中(目前未使用),2-支付成功,3-业务处理完成,4-已申请退款',
  `order_clientIp` varchar(32) DEFAULT NULL COMMENT '客户端IP',
  `order_device` varchar(64) DEFAULT NULL COMMENT '设备',
  `order_subject` text NOT NULL COMMENT '商品标题',
  `order_body` text NOT NULL COMMENT '商品描述信息',
  `order_extra` text COMMENT '特定渠道发起时额外参数',
  `channel_mchid` varchar(32) NOT NULL DEFAULT '' COMMENT '通道商户ID',
  `channel_orderno` varchar(64) DEFAULT NULL COMMENT '通道订单号',
  `err_code` varchar(64) DEFAULT NULL COMMENT '通道支付错误码',
  `err_msg` varchar(128) DEFAULT NULL COMMENT '通道支付错误描述',
  `notify_url` varchar(128) NOT NULL DEFAULT '' COMMENT '通知地址',
  `notify_count` tinyint(6) NOT NULL DEFAULT '0' COMMENT '通知次数',
  `last_notify_time` bigint(20) DEFAULT NULL COMMENT '最后一次通知时间',
  `expire_time` bigint(20) DEFAULT NULL COMMENT '订单失效时间',
  `pay_succ_time` bigint(20) DEFAULT NULL COMMENT '订单支付成功时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`pay_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付订单表';



# Dump of table ha_product
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_product`;

CREATE TABLE `ha_product` (
  `product_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '产品ID',
  `channel_id` int(11) DEFAULT NULL COMMENT '所属通道ID',
  `trade_type_id` int(11) DEFAULT NULL COMMENT '交易类型ID',
  `trade_type_nickname` varchar(100) DEFAULT NULL COMMENT '交易类型昵称',
  `product_name` varchar(255) DEFAULT NULL COMMENT '产品名称',
  `product_type` enum('ALIPAY','DATA') DEFAULT NULL COMMENT '产品分类（PAY为支付类产品，DATA为数据查询类）',
  `product_charging_type` enum('FIXED_AMOUNT','PERCENTAGE','FIXED_AMOUNT_PERCENTAGE','PERCENTAGE_BAODI') DEFAULT NULL COMMENT '计费方式（固定金额/FIXED_AMOUNT,百分比/PERCENTAGE,固定+百分比/FIXED_AMOUNT_PERCENTAGE,百分比+保底/PERCENTAGE_BAODI）',
  `product_clear_method` enum('T1','D0') DEFAULT NULL COMMENT '结算方式（T1/D0）',
  `product_clear_type` enum('CLEAE_DIRECTLY','UN_CLEAR_DIRECTLY') DEFAULT NULL COMMENT '清算模式（直清/CLEAE_DIRECTLY，非直清/UN_CLEAR_DIRECTLY）',
  `product_day_limit` bigint(20) DEFAULT NULL COMMENT '产品单日限额（分）',
  `product_day_use` bigint(20) DEFAULT NULL COMMENT '产品单日已使用限额（分）',
  `product_order_limit` bigint(20) DEFAULT NULL COMMENT '产品每笔限额（分）',
  `product_rate` int(11) DEFAULT NULL COMMENT '产品费率（%）',
  `product_url` varchar(200) DEFAULT NULL COMMENT '产品请求地址',
  `product_res` text COMMENT '产品备注',
  `product_status` tinyint(1) DEFAULT '1' COMMENT '产品状态（0为禁用，1为启用）',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '产品添加时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品管理';

LOCK TABLES `ha_product` WRITE;
/*!40000 ALTER TABLE `ha_product` DISABLE KEYS */;

INSERT INTO `ha_product` (`product_id`, `channel_id`, `trade_type_id`, `trade_type_nickname`, `product_name`, `product_type`, `product_charging_type`, `product_clear_method`, `product_clear_type`, `product_day_limit`, `product_day_use`, `product_order_limit`, `product_rate`, `product_url`, `product_res`, `product_status`, `create_time`)
VALUES
	(1,1,1,'ALIPAY.QR','支付宝当面付二维码','ALIPAY','FIXED_AMOUNT_PERCENTAGE','T1','CLEAE_DIRECTLY',1000000000,20043,300000000000,30,'www.hengaikj.com','测试备注',1,'2018-07-03 15:48:02'),
	(2,1,2,'ALIPAY.FACE','支付宝当面付','ALIPAY','FIXED_AMOUNT_PERCENTAGE','T1','CLEAE_DIRECTLY',1000000000,0,300000000000,30,'www.hengaikj.com','测试备注',1,'2018-07-03 15:48:02');

/*!40000 ALTER TABLE `ha_product` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_query_order
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_query_order`;

CREATE TABLE `ha_query_order` (
  `query_order_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `merchant_no` varchar(100) DEFAULT NULL COMMENT '请求商家号',
  `query_order_sn` varchar(100) DEFAULT NULL COMMENT '平台查询订单号',
  `pay_order_sn` varchar(100) DEFAULT NULL COMMENT '平台交易订单号',
  `query_result` text COMMENT '返回的查询结果',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '查询请求时间',
  PRIMARY KEY (`query_order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易查询接口';



# Dump of table ha_setting
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_setting`;

CREATE TABLE `ha_setting` (
  `name` varchar(50) NOT NULL COMMENT '名称',
  `value` text COMMENT '值',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统设置表';

LOCK TABLES `ha_setting` WRITE;
/*!40000 ALTER TABLE `ha_setting` DISABLE KEYS */;

INSERT INTO `ha_setting` (`name`, `value`)
VALUES
	('admin',''),
	('captcha_status_login','1'),
	('captcha_status_register','1'),
	('complain_time_limit','2592000'),
	('cust_auto',''),
	('cust_base_count',''),
	('email_addr',''),
	('email_enabled','0'),
	('email_host',''),
	('email_id',''),
	('email_pass',''),
	('email_port','25'),
	('email_type','1'),
	('getcspstatus','1'),
	('image_allow_ext','gif,jpg,jpeg,bmp,png,swf'),
	('image_dir_type','1'),
	('image_max_filesize','1024'),
	('login_logo',''),
	('login_pic','a:4:{i:0;s:5:\"1.jpg\";i:1;s:5:\"2.jpg\";i:2;s:5:\"3.jpg\";i:3;s:5:\"4.jpg\";}'),
	('malbum_max_sum','200'),
	('md5_key','cb96cf872954b30ca9757d48bfe55215'),
	('member_lable',''),
	('member_logo','04837953027282086.png'),
	('message_contro',''),
	('message_small_contro',''),
	('music','http://202.98.123.241/data/upload/ha/common/05192616583701336.mp3'),
	('seo',''),
	('site_bank_account',''),
	('site_email',''),
	('site_ename','支付中心'),
	('site_logo','04855219675503293.png'),
	('site_name','支付中心'),
	('site_phone','4000999696'),
	('site_status',''),
	('sms_password',''),
	('sms_username',''),
	('statistics_code',''),
	('system_count',''),
	('system_info',''),
	('system_samll_info',''),
	('system_set',''),
	('taobao_api_isuse','0'),
	('taobao_app_key',''),
	('taobao_secret_key',''),
	('time_zone','Asia/Shanghai'),
	('voucher_allow','1');

/*!40000 ALTER TABLE `ha_setting` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table ha_trade_type
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ha_trade_type`;

CREATE TABLE `ha_trade_type` (
  `trade_type_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '交易类型ID',
  `trade_type_name` varchar(100) DEFAULT NULL COMMENT '交易类型名称',
  `trade_type_nickname` varchar(20) DEFAULT NULL COMMENT '交易类型简称',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`trade_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `ha_trade_type` WRITE;
/*!40000 ALTER TABLE `ha_trade_type` DISABLE KEYS */;

INSERT INTO `ha_trade_type` (`trade_type_id`, `trade_type_name`, `trade_type_nickname`, `create_time`)
VALUES
	(1,'支付宝当面付二维码','ALIPAY.QR','2018-06-22 11:59:56'),
	(2,'支付宝当面付扫码','ALIPAY.FACE','2018-06-22 12:00:20'),
	(3,'微信刷卡','WX.MICROPAY','2018-06-22 12:00:41'),
	(4,'微信公众号','WX.JSAPI','2018-06-22 12:00:57'),
	(5,'微信APP','WX.APP','2018-06-22 12:01:17'),
	(6,'网银快捷','BANK.QUICKPAY','2018-06-22 12:02:00'),
	(7,'网银网关','BANK.GATEWAY','2018-06-22 12:02:16'),
	(8,'代付','BANK.PAID','2018-06-22 12:02:32');

/*!40000 ALTER TABLE `ha_trade_type` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
