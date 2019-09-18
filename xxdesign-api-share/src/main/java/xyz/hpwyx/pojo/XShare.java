package xyz.hpwyx.pojo;

import java.util.Date;

public class XShare {
    private Integer sId;

    private String sContent;

    private Integer sAnthId;

    private Integer sGetClick;

    private String sType1;

    private String sType2;

    private String sTitle;

    private Date sTime;

    private String sImg;

    private String sEx1;

    private String sEx2;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsContent() {
        return sContent;
    }

    public void setsContent(String sContent) {
        this.sContent = sContent == null ? null : sContent.trim();
    }

    public Integer getsAnthId() {
        return sAnthId;
    }

    public void setsAnthId(Integer sAnthId) {
        this.sAnthId = sAnthId;
    }

    public Integer getsGetClick() {
        return sGetClick;
    }

    public void setsGetClick(Integer sGetClick) {
        this.sGetClick = sGetClick;
    }

    public String getsType1() {
        return sType1;
    }

    public void setsType1(String sType1) {
        this.sType1 = sType1 == null ? null : sType1.trim();
    }

    public String getsType2() {
        return sType2;
    }

    public void setsType2(String sType2) {
        this.sType2 = sType2 == null ? null : sType2.trim();
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle == null ? null : sTitle.trim();
    }

    public Date getsTime() {
        return sTime;
    }

    public void setsTime(Date sTime) {
        this.sTime = sTime;
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg == null ? null : sImg.trim();
    }

    public String getsEx1() {
        return sEx1;
    }

    public void setsEx1(String sEx1) {
        this.sEx1 = sEx1 == null ? null : sEx1.trim();
    }

    public String getsEx2() {
        return sEx2;
    }

    public void setsEx2(String sEx2) {
        this.sEx2 = sEx2 == null ? null : sEx2.trim();
    }
}