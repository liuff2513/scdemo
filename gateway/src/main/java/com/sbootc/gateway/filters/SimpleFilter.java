package com.sbootc.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: SimpleFilter
 * Description: //TODO
 * Created by feifei.liu on 2018/3/2 11:13
 **/
public class SimpleFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(SimpleFilter.class);

    //返回一个String。这代表了过滤器的类型，在该例中，pre或者可以是route来作为一个过滤器的路由。
    @Override
    public String filterType() {
        return "pre";
    }

    //给出过滤器执行的顺序，或者相对于其他过滤器的顺序。
    @Override
    public int filterOrder() {
        return 1;
    }

    //包含决定是否执行过滤器的逻辑，在该例中，它将会始终执行。
    @Override
    public boolean shouldFilter() {
        return true;
    }

    //包含了过滤的功能。
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        return null;
    }
}
