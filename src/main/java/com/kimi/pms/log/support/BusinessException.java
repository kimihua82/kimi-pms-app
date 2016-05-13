package com.kimi.pms.log.support;

/**
 * Created by Administrator on 2016/5/9.
 */
public class BusinessException extends Exception {

    private String BusinessExCode;
    private String BusinessExName;

    public String getBusinessExCode() {
        return BusinessExCode;
    }

    public void setBusinessExCode(String businessExCode) {
        BusinessExCode = businessExCode;
    }

    public String getBusinessExName() {
        return BusinessExName;
    }

    public void setBusinessExName(String businessExName) {
        BusinessExName = businessExName;
    }
}
