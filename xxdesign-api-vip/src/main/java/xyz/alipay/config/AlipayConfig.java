package xyz.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101000653020";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDKb6rH4U/9RiO2dEewXf03Tnao7or1ZaNWbcb2JLn4h4Cm+ub/FOyhyXI3r81fwbGk2J2uRHdXSgb6fSHRd8FdnIU+s1eMKqnkPD3L6VVcNcFPWB7tydj4CNjn0RaGOusAUGlo1bdEG7eXnJOQPFkc+6FuoZISegbgWUGIY8wUe1ljPsOrxOZrm3D6b/dkgSO2KqfcPiZj/cDeQ868g//oOvL19y1Ur2UrrkK5/yUh9Iv+QOYbqY+38+wbqEC+4hwBhAwHpIHX1CaajCcjExqjUdd8xj+o851MLa7lW6RfjCDUmA6ELqoqpKxXsWHqFC0ttz1wPbXE8m5qdMxrmXOpAgMBAAECggEAKAzrttvm3W8RBbn/rO8Ld/O4GjgHmgFfzWuun2gouvjkBSVCqljTcDbQuB+5/CXwJXMNzzqQed6Vft1e4XhV81VSL1OAEKUoM5WPjFY/oxyngDEo/Vaf7IKjl0mQsUHa2JcQI8OUnI73RbGeqDyoTMmj6KVipvEphx1hj8Be0fYy8hYCnswU5H3dPlFRM/IhyBr/ok3A+ta0ygUlJOK+SOXW6E6Twx0htzHP3Nl1qt3yUoc3XDOU4F99CoguAMTpFXRRNXqTgPAgVKXTKnQxqi2jtOov2S/m43UUzsxzmPCVYQbIivT00mlXhj3mttiWOASLy0okslJhXfIDhNGXYQKBgQD7xCIwOGqgGZvwsKnJFXZM99nbqtWQtuhQzHCwwkG7je5l/KtoDabr+2QP6lKzEfMmgoNPAawzSqbbQwlj4qyUzxhTWK0mYOHfFOEV6VEU/r3ZjzUiDv3mCwcr/EvqClllIaQWYT9HpwfiFUDE8NQEG585X27SiJBlQKIOdxs2nQKBgQDN1yph/u2wabcgA1stnM6gDEnuj62fp6P/FJcSkKGHNnsmddnYwEhjTk9Zu7TEbYU5Fu/mZ5qy8iGPzKGx/0GdQ3OvVDAU/QPdredAIbjv/wTj2uQkwtWwjeBB1jNqxtc7xBZpRj9F7/bIxGfoLu2wTgV11WFPG4wYtxVofKAdfQKBgQDUJN3GEhPOmiWrd8Fpflsz2flKPzY7/dPeGZavatCmsJ78cx8fy7kmyar0Oje7Slm/zmPE1Bz9D19wDJnCAAP6VFMkD+m/GA3bwyUzKGm5LjpdM23LKCTLjelaJ/rz2Aqhy+oPLZx7zQQ4fj4YdPHCEGBnoMGqR4acuwyS8cwNhQKBgQDCHAfhxa+LzwVb8Q5IozjPAQevKlrG1iX25Ana/fz1L1FO4Y//sMQSscRukG5VVhptzc2Jb2YZHfC8VHKfEmFj1jn/utpk0HyWzennNmXaHJkV7lN6vykYh5JVQ5PVO5G40J95wz7jyvjkNyLtd2O6ALlxdzl+ijHBFNXhZLTxWQKBgCtfZmCpVOgdPfG4HssYCOs126e5oL+HlsyA9hvAqBQW6I8ENrg3sbIISAOgeJdgouKv9nAddHidBQAoP/VX7o4hc4E0dDO9toDmcdeqUV3MNN0piRoMqMXFBrc/1EOJkSGnKM5ZrkF896gekOa6eGTKTMfcptVubvXXM3k4pGW8";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoVMbMrTXCv7Fk1kObMbkPTTvJY+6jaf4nVX7G+/Sp+CT6yy4RAjOfVnnH4SCqL+GsbjUZZSLMkNoqSeO7cmr9njGDnvskJJZqhEGuEZlI1AtVHesnIrdKT9/nDA61z1+b4fVTz5TaJCsv8sWHUYYHx+ltc6TbACKQ0g2FR8SFvBI8o4ulHW4et0WAJwZ2g2lQ0NLxeCv3/DyQkeWWrtYmWb5GTN6lMK34uV8oUF2tZZGeQhg0Pfn8JuhyCM+bGCrMU+4quMH49XRCi9wLbwC6b+bk0MVs0DDvWHWtM1T+5UOZxhK5GMSy/uVR9V+JzC9fsHBfkTd+8GukUurRsN8SQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://itmayiedu.s1.natapp.cc/alibaba/callBack/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://itmayiedu.s1.natapp.cc/alibaba/callBack/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

