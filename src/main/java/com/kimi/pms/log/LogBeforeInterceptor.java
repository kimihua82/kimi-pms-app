package com.kimi.pms.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/9.
 */
public class LogBeforeInterceptor extends LogInterceptorBase implements  org.springframework.aop.MethodBeforeAdvice {

    private static Logger logger = LoggerFactory.getLogger(LogBeforeInterceptor.class);

    public void before(Method method, Object[] args, Object target)
            throws Throwable {

        logger.debug("before: "+method.toGenericString()+"-"+args.toString());

        if (this.logOperationParamsContext == null){
            if (this.getLogOperationParams()!=null) {
                logOperationParamsContext = this.getLogOperationParams().getLogOperationParams();
            }
        }

        if (this.getLogProcess()!=null) {
            this.getLogProcess().logProcess(logOperationParamsContext,method,args,target,null);
        }

    }
}
