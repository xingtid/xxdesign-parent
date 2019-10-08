package xyz.hpwyx.baseresult;

/**
 * 常量类
 *
 * @author tid
 * @create 2019-07-11 22:05
 **/
public interface Constants {
    // 响应请求成功
    String HTTP_RES_CODE_200_VALUE = "success";
    // 系统错误
    String HTTP_RES_CODE_500_VALUE = "fall";
    // 响应请求成功code
    Integer HTTP_RES_CODE_200 = 200;
    // 系统错误
    Integer HTTP_RES_CODE_500 = 500;
    // 系统错误
    Integer HTTP_RES_CODE_201 = 201;
    // 系统错误
    Integer HTTP_RES_CODE_404 = 404;
    //发送邮件
    String MSG_EMAIL = "email";
    // 支付token
    String TOKEN_PAY = "TOKEN_pay";
    // 用户有效期 90天
    Long TOKEN_MEMBER_TIME = (long) (60 * 60 * 24 * 90);
    int COOKIE_TOKEN_MEMBER_TIME = (60 * 60 * 24 * 90);
    Long PAY_TOKEN_MEMBER_TIME =(long)  (60 * 15 );
    //TOKEN
    String TOKEN_MEMBER = "TOKEN_MEMBER";

    //Cookie
    String COOKIE_TOKEN = "cookie_token";

    String PAY_SUCCESS = "success";
    String PAY_FAIL = "fail";
}
