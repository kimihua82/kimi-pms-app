package com.kimi.pms.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/9.
 */
public class LogAfterInterceptor extends LogInterceptorBase implements  org.springframework.aop.AfterReturningAdvice {
    private static Logger logger = LoggerFactory.getLogger(LogAfterInterceptor.class);



    public void afterReturning(Object returnValue, Method method, Object[] args,
                               Object target) throws Throwable {

        logger.info("after: " + method.toGenericString() + "-" + args.toString());

        if (this.logOperationParamsContext == null){
            if (this.getLogOperationParams()!=null) {
                logOperationParamsContext = this.getLogOperationParams().getLogOperationParams();
            }
        }

        if (this.getLogProcess()!=null) {
            this.getLogProcess().logProcess(logOperationParamsContext,method,args,target,returnValue);
        }


    }
}
