package xyz.hpwyx.pojo;

import java.util.Date;

public class XMessage {
    private Integer mId;

    private Integer mSendId;

    private Integer mBesendId;

    private String mTitle;

    private String mContent;

    private Date mTime;

    private Integer mType;

    private Integer mParent;

    private String mMee;

    private String mMark;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getmSendId() {
        return mSendId;
    }

    public void setmSendId(Integer mSendId) {
        this.mSendId = mSendId;
    }

    public Integer getmBesendId() {
        return mBesendId;
    }

    public void setmBesendId(Integer mBesendId) {
        this.mBesendId = mBesendId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public Integer getmType() {
        return mType;
    }

    public void setmType(Integer mType) {
        this.mType = mType;
    }

    public Integer getmParent() {
        return mParent;
    }

    public void setmParent(Integer mParent) {
        this.mParent = mParent;
    }

    public String getmMee() {
        return mMee;
    }

    public void setmMee(String mMee) {
        this.mMee = mMee == null ? null : mMee.trim();
    }

    public String getmMark() {
        return mMark;
    }

    public void setmMark(String mMark) {
        this.mMark = mMark == null ? null : mMark.trim();
    }
}