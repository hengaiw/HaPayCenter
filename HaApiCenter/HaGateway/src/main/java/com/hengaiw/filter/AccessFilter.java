package com.hengaiw.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

public class AccessFilter extends ZuulFilter {

	// private static final MyLog _log = MyLog.getLog(ZuulFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();

		// logger.info("--->>> TokenFilter {},{}", request.getMethod(),
		// request.getRequestURL().toString());
		String  merchant_no= request.getParameter("merchant_no");// 检查是否在在商户编号
		String sign=request.getParameter("sign");// 检查是否在校验加密数据
		String nonce_str=request.getParameter("nonce_str");// 检查是否在校验加密数据
		if (StringUtils.isBlank(merchant_no)) {
			ctx.setSendZuulResponse(false); // 不对其进行路由
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("商户编号不能为空！！");
			ctx.set("isSuccess", false);
			return null;
		}else if(StringUtils.isBlank(sign)) {
			ctx.setSendZuulResponse(false); // 不对其进行路由
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("验签数据不能为空！！");
			ctx.set("isSuccess", false);
			return null;
		}else if(StringUtils.isBlank(nonce_str)) {
			ctx.setSendZuulResponse(false); // 不对其进行路由
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("随机数不能为空！！");
			ctx.set("isSuccess", false);
			return null;
		}else {
			ctx.setSendZuulResponse(true); // 对请求进行路由
			ctx.setResponseStatusCode(200);
			ctx.set("isSuccess", true);
			return null;
		}
	}

}
