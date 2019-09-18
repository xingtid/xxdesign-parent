package xyz.hpwyx.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.service.impl.UserServiceImpl;

/**
 * @author tid
 * @create 2019-03-17 18:49
 **/
public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserServiceImpl userService;

    /**
     * 执行授权逻辑
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println ("授权逻辑");
        return null;
    }

    /**
     * 执行认证逻辑
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        XResult xResult = userService.findUserByPhone (token.getUsername ().trim ());
        XUser user = (XUser) xResult.getData ();
        System.out.println (token.getUsername ());
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo (user, user.getUPassword (), "");
    }
}
