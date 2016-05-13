package com.kimi.pms.log;

import com.kimi.pms.log.support.IErrorLogProcess;
import com.kimi.pms.log.support.ILogOperationParams;
import com.kimi.pms.log.support.ILogProcess;
import com.kimi.pms.log.support.LogOperationParamsContext;

/**
 * Created by Administrator on 2016/5/10.
 */
public class LogInterceptorBase {

    public  LogOperationParamsContext logOperationParamsContext;

    private ILogProcess logProcess;

    private ILogOperationParams logOperationParams;

    private IErrorLogProcess errorLogProcess;


    public IErrorLogProcess getErrorLogProcess() {
        return errorLogProcess;
    }

    public void setErrorLogProcess(IErrorLogProcess errorLogProcess) {
        this.errorLogProcess = errorLogProcess;
    }

    public ILogOperationParams getLogOperationParams() {
        return logOperationParams;
    }

    public void setLogOperationParams(ILogOperationParams logOperationParams) {
        this.logOperationParams = logOperationParams;
    }

    public ILogProcess getLogProcess() {
        return logProcess;
    }

    public void setLogProcess(ILogProcess logProcess) {
        this.logProcess = logProcess;
    }
}
