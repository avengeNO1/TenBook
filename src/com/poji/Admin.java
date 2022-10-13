package com.poji;

/**
 * @author HuAng
 * 说明：管理员对象类
 */
public class Admin {

    private String adminName;//姓名
    private String adminAcc;//账号
    private String adminPwd;//密码

    public Admin() {

    }

    public Admin(String adminName, String adminAcc, String adminPwd) {
        this.adminName = adminName;
        this.adminAcc = adminAcc;
        this.adminPwd = adminPwd;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminAcc() {
        return adminAcc;
    }

    public void setAdminAcc(String adminAcc) {
        this.adminAcc = adminAcc;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminName='" + adminName + '\'' +
                ", adminAcc='" + adminAcc + '\'' +
                ", adminPwd='" + adminPwd + '\'' +
                '}';
    }
}

   