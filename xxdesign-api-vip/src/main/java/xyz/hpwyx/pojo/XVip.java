package xyz.hpwyx.pojo;

import java.util.Date;

public class XVip {
    private String vId;

    private Integer vUid;

    private String vTimeLeft;

    private Date vTime;

    private String vCode;

    private Integer vLevel;

    private Integer vScore;

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId == null ? null : vId.trim();
    }

    public Integer getvUid() {
        return vUid;
    }

    public void setvUid(Integer vUid) {
        this.vUid = vUid;
    }

    public String getvTimeLeft() {
        return vTimeLeft;
    }

    public void setvTimeLeft(String vTimeLeft) {
        this.vTimeLeft = vTimeLeft == null ? null : vTimeLeft.trim();
    }

    public Date getvTime() {
        return vTime;
    }

    public void setvTime(Date vTime) {
        this.vTime = vTime;
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode == null ? null : vCode.trim();
    }

    public Integer getvLevel() {
        return vLevel;
    }

    public void setvLevel(Integer vLevel) {
        this.vLevel = vLevel;
    }

    public Integer getvScore() {
        return vScore;
    }

    public void setvScore(Integer vScore) {
        this.vScore = vScore;
    }
}