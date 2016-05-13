package com.kimi.pms.log.support;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/9.
 */
public interface IErrorLogProcess {

    void errorLogProcess(LogOperationParamsContext context, Method method, Object[] args, Object target, Exception ex);

    void webErrorLogProcess(LogOperationParamsContext context, WebLogParamsContext webLogParamsContext, Exception ex);

}
