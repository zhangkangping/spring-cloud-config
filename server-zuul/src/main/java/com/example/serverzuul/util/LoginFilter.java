package com.example.serverzuul.util;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class LoginFilter extends ZuulFilter {
    public LoginFilter() {
        super();
    }

    @Override
    public boolean isStaticFilter() {
        return super.isStaticFilter();
    }

    @Override
    public String disablePropertyName() {
        return super.disablePropertyName();
    }

    @Override
    public boolean isFilterDisabled() {
        return super.isFilterDisabled();
    }

    @Override
    public ZuulFilterResult runFilter() {
        return super.runFilter();
    }

    @Override
    public int compareTo(ZuulFilter filter) {
        return super.compareTo(filter);
    }

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
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        Object token = httpServletRequest.getParameter("token");
        if (Objects.isNull(token)) {
            requestContext.setSendZuulResponse(false);
            //防止返回给前端时中文乱码
            requestContext.getResponse().setContentType("text/html;charset=UTF-8");
            requestContext.setResponseBody("当前状态未登录,请重新登录");
            requestContext.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}