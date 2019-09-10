package xyz.hpwyx.msg;

/**
 * @author tid
 * @create 2019-09-10 10:56 上午
 **/
public class SendMsg {
    public static String sendduanxing(String phone){

        String code = (int) ((Math.random()*9+1)*1000)+"";
        String testUsername = "18896785465"; //在短信宝注册的用户名
        String testPassword = "hewenxing"; //在短信宝注册的密码
        String testPhone = phone;
        String testContent = "【xx形象设计】您的验证码是"+ code+",1分钟内有效。若非本人操作请忽略此消息。"; // 注意测试时，也请带上公司简称或网站签名，发送正规内容短信。千万不要发送无意义的内容：例如 测一下、您好。否则可能会收不到

        String httpUrl = "http://api.smsbao.com/sms";

        StringBuffer httpArg = new StringBuffer();
        httpArg.append("u=").append(testUsername).append("&");
        httpArg.append("p=").append(Sendo.md5(testPassword)).append("&");
        httpArg.append("m=").append(testPhone).append("&");
        httpArg.append("c=").append(Sendo.encodeUrlString(testContent, "UTF-8"));

        String result = Sendo.request(httpUrl, httpArg.toString());
        System.out.println(result);
        return code;
    }
}
