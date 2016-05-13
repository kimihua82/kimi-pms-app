package com.kimi.pms.log.support;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/9.
 */
public interface ILogProcess {

    void logProcess(LogOperationParamsContext operationParamsContext, Method method, Object[] args,
                    Object target, Object returnValue);

}
