package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XVip;
import xyz.hpwyx.pojo.XVipExample;

@Mapper
public interface XVipMapper {
    int countByExample(XVipExample example);

    int deleteByExample(XVipExample example);

    int deleteByPrimaryKey(String vId);

    int insert(XVip record);

    int insertSelective(XVip record);

    List<XVip> selectByExample(XVipExample example);

    XVip selectByPrimaryKey(String vId);

    int updateByExampleSelective(@Param("record") XVip record, @Param("example") XVipExample example);

    int updateByExample(@Param("record") XVip record, @Param("example") XVipExample example);

    int updateByPrimaryKeySelective(XVip record);

    int updateByPrimaryKey(XVip record);
}