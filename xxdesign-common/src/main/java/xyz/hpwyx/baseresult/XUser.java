package xyz.hpwyx.baseresult;

import lombok.Data;

import java.util.Date;

/**
 * @author tid
 * @create 2019-09-06 10:41 上午
 **/
@Data
public class XUser {
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uPhone;
    private String uOpenid;
    private String uIp;
    private Date uCreateAt;
    private Date uLoginAt;
    private String uIsdesign;
    private String uEx1;
    private String uEx2;
}
