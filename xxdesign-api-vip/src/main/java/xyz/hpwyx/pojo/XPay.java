package xyz.hpwyx.pojo;

import java.util.Date;

public class XPay {
    private Integer oId;

    private Integer oTypeid;

    private String oPlatformorderid;

    private Integer oPrice;

    private Integer oState;

    private Integer oUserid;

    private Date oDate;

    private String oMark;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getoTypeid() {
        return oTypeid;
    }

    public void setoTypeid(Integer oTypeid) {
        this.oTypeid = oTypeid;
    }

    public String getoPlatformorderid() {
        return oPlatformorderid;
    }

    public void setoPlatformorderid(String oPlatformorderid) {
        this.oPlatformorderid = oPlatformorderid == null ? null : oPlatformorderid.trim();
    }

    public Integer getoPrice() {
        return oPrice;
    }

    public void setoPrice(Integer oPrice) {
        this.oPrice = oPrice;
    }

    public Integer getoState() {
        return oState;
    }

    public void setoState(Integer oState) {
        this.oState = oState;
    }

    public Integer getoUserid() {
        return oUserid;
    }

    public void setoUserid(Integer oUserid) {
        this.oUserid = oUserid;
    }

    public Date getoDate() {
        return oDate;
    }

    public void setoDate(Date oDate) {
        this.oDate = oDate;
    }

    public String getoMark() {
        return oMark;
    }

    public void setoMark(String oMark) {
        this.oMark = oMark == null ? null : oMark.trim();
    }
}