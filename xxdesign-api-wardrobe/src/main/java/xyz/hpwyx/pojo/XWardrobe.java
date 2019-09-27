package xyz.hpwyx.pojo;

import java.util.Date;

public class XWardrobe {
    private Integer wId;

    private String wBroud;

    private Date wDate;

    private String wImg;

    private String wImg2;

    private String wImg3;

    private String wStyle;

    private String wSeason;

    private Float wPrice;

    private Integer wUserid;

    private String wMark;

    private Date wCreateTime;

    private String wExx;

    private String wExe;

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getwBroud() {
        return wBroud;
    }

    public void setwBroud(String wBroud) {
        this.wBroud = wBroud == null ? null : wBroud.trim();
    }

    public Date getwDate() {
        return wDate;
    }

    public void setwDate(Date wDate) {
        this.wDate = wDate;
    }

    public String getwImg() {
        return wImg;
    }

    public void setwImg(String wImg) {
        this.wImg = wImg == null ? null : wImg.trim();
    }

    public String getwImg2() {
        return wImg2;
    }

    public void setwImg2(String wImg2) {
        this.wImg2 = wImg2 == null ? null : wImg2.trim();
    }

    public String getwImg3() {
        return wImg3;
    }

    public void setwImg3(String wImg3) {
        this.wImg3 = wImg3 == null ? null : wImg3.trim();
    }

    public String getwStyle() {
        return wStyle;
    }

    public void setwStyle(String wStyle) {
        this.wStyle = wStyle == null ? null : wStyle.trim();
    }

    public String getwSeason() {
        return wSeason;
    }

    public void setwSeason(String wSeason) {
        this.wSeason = wSeason == null ? null : wSeason.trim();
    }

    public Float getwPrice() {
        return wPrice;
    }

    public void setwPrice(Float wPrice) {
        this.wPrice = wPrice;
    }

    public Integer getwUserid() {
        return wUserid;
    }

    public void setwUserid(Integer wUserid) {
        this.wUserid = wUserid;
    }

    public String getwMark() {
        return wMark;
    }

    public void setwMark(String wMark) {
        this.wMark = wMark == null ? null : wMark.trim();
    }

    public Date getwCreateTime() {
        return wCreateTime;
    }

    public void setwCreateTime(Date wCreateTime) {
        this.wCreateTime = wCreateTime;
    }

    public String getwExx() {
        return wExx;
    }

    public void setwExx(String wExx) {
        this.wExx = wExx == null ? null : wExx.trim();
    }

    public String getwExe() {
        return wExe;
    }

    public void setwExe(String wExe) {
        this.wExe = wExe == null ? null : wExe.trim();
    }
}