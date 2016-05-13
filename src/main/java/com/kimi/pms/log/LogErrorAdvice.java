package com.kimi.pms.log;

import com.kimi.pms.log.support.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/5/9.
 */
public class LogErrorAdvice  extends LogInterceptorBase implements ThrowsAdvice {

    private static Logger logger = LoggerFactory.getLogger(LogErrorAdvice.class);

    

    public void afterThrowing(Method method, Object[] args, Object target,
                              Exception ex) throws Throwable {

        logger.error(method.toGenericString()+"-"+ex.toString());

        if (this.logOperationParamsContext == null){
            if (this.getLogOperationParams()!=null) {
                logOperationParamsContext = this.getLogOperationParams().getLogOperationParams();
            }
        }

        if (this.getErrorLogProcess()!=null) {
            this.getErrorLogProcess().errorLogProcess(logOperationParamsContext,method,args,target,ex);
        }

        //todo 自定义异常
        if (!(ex instanceof BusinessException)) {


        }else {
            ex = null;

        }
    }

}
