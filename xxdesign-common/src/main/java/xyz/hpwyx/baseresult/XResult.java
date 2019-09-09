package xyz.hpwyx.baseresult;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tid
 * @create 2019-07-11 21:58
 **/

@Slf4j
@Getter
@Setter
public class XResult {
    private Integer rtnCode;
    private String msg;
    private Object data;

    public XResult() {
    }

    public XResult(Integer rtnCode, String msg, Object data) {
        this.rtnCode = rtnCode;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 通用封装
     * @param code 状态码
     * @param msg 信息
     * @param data 数据
     * @return
     */
    public static XResult build(Integer code, String msg, Object data) {
        return new XResult (code, msg, data);
    }

    /**
     * 成功返回无数据
     * @return
     */
    public static XResult isOk() {

        return build (Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
    }

    /**
     * 成功返回有数据
     * @param data
     * @return
     */
    public static XResult isOk(Object data) {

        return build (Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
    }

    /**
     * 失败返回有信息
     * @param msg
     * @return
     */
    public static XResult failMsg(String msg) {

        return build (Constants.HTTP_RES_CODE_500, msg, null);
    }
    /**
     * 失败返回无信息
     * @return
     */
    public static XResult failNoMsg() {

        return build (Constants.HTTP_RES_CODE_500, Constants.HTTP_RES_CODE_500_VALUE, null);
    }
}
