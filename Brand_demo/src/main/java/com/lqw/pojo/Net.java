package com.lqw.pojo;

public class Net {
    private  Integer identify;
    private  String username;
    private Integer tel;
    private Double net;

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

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }

    @Override
    public String toString() {
        return "Net{" +
                "identify=" + identify +
                ", username='" + username + '\'' +
                ", tel=" + tel +
                ", net=" + net +
                '}';
    }
}
