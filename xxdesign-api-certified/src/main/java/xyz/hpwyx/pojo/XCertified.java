package xyz.hpwyx.pojo;

import java.util.Date;

public class XCertified {
    private Integer rId;

    private String rName;

    private Date rTime;

    private Integer rType;

    private String rMark;

    private String rImg;

    private String rEx;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public Integer getrType() {
        return rType;
    }

    public void setrType(Integer rType) {
        this.rType = rType;
    }

    public String getrMark() {
        return rMark;
    }

    public void setrMark(String rMark) {
        this.rMark = rMark == null ? null : rMark.trim();
    }

    public String getrImg() {
        return rImg;
    }

    public void setrImg(String rImg) {
        this.rImg = rImg == null ? null : rImg.trim();
    }

    public String getrEx() {
        return rEx;
    }

    public void setrEx(String rEx) {
        this.rEx = rEx == null ? null : rEx.trim();
    }
}