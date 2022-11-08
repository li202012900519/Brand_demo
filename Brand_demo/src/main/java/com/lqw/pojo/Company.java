package com.lqw.pojo;

public class Company {
    private  Integer identify;
    private  String username;
    private Integer tel;
    private String company ;

    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String
    toString() {
        return "company{" +
                "identify=" + identify +
                ", username='" + username + '\'' +
                ", tel=" + tel +
                ", company='" + company + '\'' +
                '}';
    }
}
