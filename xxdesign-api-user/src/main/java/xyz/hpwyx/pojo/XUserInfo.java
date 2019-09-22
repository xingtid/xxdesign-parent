package xyz.hpwyx.pojo;

public class XUserInfo {
    private Integer uId;

    private String uEmail;

    private String uSex;

    private Integer uAge;

    private String uCity;

    private String uFace;

    private String uStyle1;

    private String uStyle2;

    private String uStyle3;

    private Integer uHeight;

    private Integer uWeight;

    private String uSkin;

    private String uHair;

    private String uPosition;

    private String uPhoto;

    private String uOther;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public String getuCity() {
        return uCity;
    }

    public void setuCity(String uCity) {
        this.uCity = uCity == null ? null : uCity.trim();
    }

    public String getuFace() {
        return uFace;
    }

    public void setuFace(String uFace) {
        this.uFace = uFace == null ? null : uFace.trim();
    }

    public String getuStyle1() {
        return uStyle1;
    }

    public void setuStyle1(String uStyle1) {
        this.uStyle1 = uStyle1 == null ? null : uStyle1.trim();
    }

    public String getuStyle2() {
        return uStyle2;
    }

    public void setuStyle2(String uStyle2) {
        this.uStyle2 = uStyle2 == null ? null : uStyle2.trim();
    }

    public String getuStyle3() {
        return uStyle3;
    }

    public void setuStyle3(String uStyle3) {
        this.uStyle3 = uStyle3 == null ? null : uStyle3.trim();
    }

    public Integer getuHeight() {
        return uHeight;
    }

    public void setuHeight(Integer uHeight) {
        this.uHeight = uHeight;
    }

    public Integer getuWeight() {
        return uWeight;
    }

    public void setuWeight(Integer uWeight) {
        this.uWeight = uWeight;
    }

    public String getuSkin() {
        return uSkin;
    }

    public void setuSkin(String uSkin) {
        this.uSkin = uSkin == null ? null : uSkin.trim();
    }

    public String getuHair() {
        return uHair;
    }

    public void setuHair(String uHair) {
        this.uHair = uHair == null ? null : uHair.trim();
    }

    public String getuPosition() {
        return uPosition;
    }

    public void setuPosition(String uPosition) {
        this.uPosition = uPosition == null ? null : uPosition.trim();
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto == null ? null : uPhoto.trim();
    }

    public String getuOther() {
        return uOther;
    }

    public void setuOther(String uOther) {
        this.uOther = uOther == null ? null : uOther.trim();
    }
}