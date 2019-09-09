package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserExample;

@Mapper
public interface XUserMapper {
    int countByExample(XUserExample example);

    int deleteByExample(XUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(XUser record);

    int insertSelective(XUser record);

    List<XUser> selectByExample(XUserExample example);

   XUser selectByPhoneAndPassword(@Param("uPhone")String phone,@Param("uPassword")String password);

    XUser selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") XUser record, @Param("example") XUserExample example);

    int updateByExample(@Param("record") XUser record, @Param("example") XUserExample example);

    int updateByPrimaryKeySelective(XUser record);

    int updateByPrimaryKey(XUser record);
}