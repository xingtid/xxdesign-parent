package xyz.hpwyx.pojo;

import xyz.hpwyx.baseresult.XUser;

import java.io.Serializable;
import java.util.Date;

public class SearchItem implements Serializable {
    private Integer cId;

    private String cTitle;

    private String cContent;

    private String cImg;

    private Date cTime;

    private Integer cUserId;

    private Integer cGetClick;

    private Integer cState;

    private Integer cComment;

    private XUser user;

    public XUser getUser() {
        return user;
    }

    public void setUser(XUser user) {
        this.user = user;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle == null ? null : cTitle.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getcImg() {
        return cImg;
    }

    public void setcImg(String cImg) {
        this.cImg = cImg == null ? null : cImg.trim();
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }



    public Integer getcGetClick() {
        return cGetClick;
    }

    public void setcGetClick(Integer cGetClick) {
        this.cGetClick = cGetClick;
    }

    public Integer getcState() {
        return cState;
    }

    public void setcState(Integer cState) {
        this.cState = cState;
    }

    public Integer getcComment() {
        return cComment;
    }

    public void setcComment(Integer cComment) {
        this.cComment = cComment;
    }
}
