package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XUserInfo;
import xyz.hpwyx.pojo.XUserInfoExample;
@Mapper
public interface XUserInfoMapper {
    int countByExample(XUserInfoExample example);

    int deleteByExample(XUserInfoExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(XUserInfo record);

    int insertSelective(XUserInfo record);

    List<XUserInfo> selectByExample(XUserInfoExample example);

    XUserInfo selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") XUserInfo record, @Param("example") XUserInfoExample example);

    int updateByExample(@Param("record") XUserInfo record, @Param("example") XUserInfoExample example);

    int updateByPrimaryKeySelective(XUserInfo record);

    int updateByPrimaryKey(XUserInfo record);
}