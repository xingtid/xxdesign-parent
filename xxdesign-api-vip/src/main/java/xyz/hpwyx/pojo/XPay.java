package xyz.hpwyx.pojo;

import java.util.Date;

public class XPay {
    private String oId;

    private Integer oTypeid;

    private String oPlatformorderid;

    private Double oPrice;

    private Integer oState;

    private Integer oUserid;

    private Date oDate;

    private String oMark;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
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

    public Double getoPrice() {
        return oPrice;
    }

    public void setoPrice(Double oPrice) {
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