package com.kimi.pms.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/13.
 */
public class UserEntity implements Serializable {


    private static final long serialVersionUID = -2093121099338543498L;

    private Long userId;
    private String userName;



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
