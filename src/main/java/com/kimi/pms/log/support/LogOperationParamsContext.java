package com.kimi.pms.log.support;

/**
 * Created by Administrator on 2016/5/9.
 */
public class LogOperationParamsContext {

    // 操作用户
    private Long operationUserId;

    // 操作用户IP
    private String operationUserIP;

    // 操作用户名
    private String operationUserName;

    // 应用Code
    private String appCode;

    // 服务器Id
    private Integer serverId;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }

    public String getOperationUserIP() {
        return operationUserIP;
    }

    public void setOperationUserIP(String operationUserIP) {
        this.operationUserIP = operationUserIP;
    }

    public String getOperationUserName() {
        return operationUserName;
    }

    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}
