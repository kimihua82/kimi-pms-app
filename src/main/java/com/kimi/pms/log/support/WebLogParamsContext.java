package com.kimi.pms.log.support;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/5/9.
 */
public class WebLogParamsContext {

    private String url;
    private String httpMethod;
    private String requestParams;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }


    public WebLogParamsContext(HttpServletRequest request){
         setHttpMethod(request.getMethod());
         setRequestParams(JSON.toJSONString(request.getParameterMap()));
         setUrl(request.getRequestURI());
    }
}
