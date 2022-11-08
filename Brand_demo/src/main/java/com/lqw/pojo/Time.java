package com.lqw.pojo;

import javafx.scene.chart.PieChart;

import java.util.Date;

public class Time {
    String username;
    Integer identify;
    String teltime;
    Integer continuetime;
    Integer tel;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }

    public String getTeltime() {
        return teltime;
    }

    public void setTeltime(String teltime) {
        this.teltime = teltime;
    }

    public Integer getContinuetime() {
        return continuetime;
    }

    public void setContinuetime(Integer continuetime) {
        this.continuetime = continuetime;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Time{" +
                "username='" + username + '\'' +
                ", identify=" + identify +
                ", teltime='" + teltime + '\'' +
                ", continuetime=" + continuetime +
                ", tel=" + tel +
                '}';
    }
}
