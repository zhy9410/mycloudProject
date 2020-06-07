package param;

import java.io.Serializable;

/**
 * 用户基础类
 */
public class UserParam implements Serializable {
    // 用户名称
    private String userName;
    // 登录账号
    private String loginName;
    // 密码
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
