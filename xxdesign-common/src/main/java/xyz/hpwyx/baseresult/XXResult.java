package xyz.hpwyx.baseresult;

/**
 * @author tid
 * @create 2019-09-05 4:41 下午
 *
 * 返回结果封装方法
 **/
public class XXResult {
    /**
     * 通用封装
     * @param code 状态码
     * @param msg 信息
     * @param data 数据
     * @return
     */
    public static ResponseBase build(Integer code, String msg, Object data) {
        return new ResponseBase (code, msg, data);
    }

    /**
     * 成功返回无数据
     * @return
     */
    public static ResponseBase isOk() {

        return build (Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
    }

    /**
     * 成功返回有数据
     * @param data
     * @return
     */
    public static ResponseBase isOk(Object data) {

        return build (Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
    }

    /**
     * 失败返回有信息
     * @param msg
     * @return
     */
    public static ResponseBase failMsg(String msg) {

        return build (Constants.HTTP_RES_CODE_500, msg, null);
    }
    /**
     * 失败返回无信息
     * @return
     */
    public static ResponseBase failNoMsg() {

        return build (Constants.HTTP_RES_CODE_500, Constants.HTTP_RES_CODE_500_VALUE, null);
    }
}
