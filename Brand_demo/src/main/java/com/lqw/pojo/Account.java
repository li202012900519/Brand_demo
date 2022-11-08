package com.lqw.pojo;

public class Account {
    private  Integer identify;
    private  String username;
    private Integer tel;
    private Double money;

    @Override
    public String toString() {
        return "Account{" +
                "identify=" + identify +
                ", username='" + username + '\'' +
                ", tel=" + tel +
                ", money=" + money +
                '}';
    }



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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

}
