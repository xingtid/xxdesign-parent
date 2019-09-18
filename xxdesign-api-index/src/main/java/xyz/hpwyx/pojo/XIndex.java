package xyz.hpwyx.pojo;

import java.util.Date;

public class XIndex {
    private Integer iId;

    private String iName;

    private String iType;

    private String iImg;

    private Integer iParent;

    private Date iTime;

    private String iPath;

    private String iUrl;

    private String iMark;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName == null ? null : iName.trim();
    }

    public String getiType() {
        return iType;
    }

    public void setiType(String iType) {
        this.iType = iType == null ? null : iType.trim();
    }

    public String getiImg() {
        return iImg;
    }

    public void setiImg(String iImg) {
        this.iImg = iImg == null ? null : iImg.trim();
    }

    public Integer getiParent() {
        return iParent;
    }

    public void setiParent(Integer iParent) {
        this.iParent = iParent;
    }

    public Date getiTime() {
        return iTime;
    }

    public void setiTime(Date iTime) {
        this.iTime = iTime;
    }

    public String getiPath() {
        return iPath;
    }

    public void setiPath(String iPath) {
        this.iPath = iPath == null ? null : iPath.trim();
    }

    public String getiUrl() {
        return iUrl;
    }

    public void setiUrl(String iUrl) {
        this.iUrl = iUrl == null ? null : iUrl.trim();
    }

    public String getiMark() {
        return iMark;
    }

    public void setiMark(String iMark) {
        this.iMark = iMark == null ? null : iMark.trim();
    }
}