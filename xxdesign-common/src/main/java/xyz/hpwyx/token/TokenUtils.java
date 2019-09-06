package xyz.hpwyx.token;

import xyz.hpwyx.baseresult.Constants;

import java.util.UUID;

/**
 * @author tid
 * @create 2019-07-14 18:40
 **/

public class TokenUtils {
    /**
     * token生成
     * @return
     */
    public static String getUserToken(){
        return Constants.TOKEN_MEMBER+"_"+ UUID.randomUUID ();
    }
}
