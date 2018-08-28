package com.hengaiw.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

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
		String  params= request.getParameter("params");// 检查是否在在商户编号
		if (StringUtils.isBlank(params)) {
			ctx.setSendZuulResponse(false); // 不对其进行路由
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("随机数不能为空！！");
			ctx.set("isSuccess", false);
			return null;
		}else {
			JSONObject paramsObject = JSONObject.parseObject(params);
			ctx.setSendZuulResponse(true); // 对请求进行路由
			ctx.setResponseStatusCode(200);
			ctx.set("isSuccess", true);
			return null;
		}
	}

}
