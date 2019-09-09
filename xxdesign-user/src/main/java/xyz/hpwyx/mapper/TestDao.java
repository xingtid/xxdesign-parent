package xyz.hpwyx.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.hpwyx.pojo.XUser;

/**
 * @author tid
 * @create 2019-09-06 1:09 下午
 **/
@Mapper
public interface TestDao {
    @Select("select  u_id,u_password,u_phone,u_name,u_openid,u_ip,u_create_at,u_login_at,u_isdesign,u_ex1 from mb_user where id =#{userId}")
    XUser findByID(@Param ("userId") Long userId);
}
