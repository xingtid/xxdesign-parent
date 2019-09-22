package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XAdmin;
import xyz.hpwyx.pojo.XAdminExample;
@Mapper
public interface XAdminMapper {
    int countByExample(XAdminExample example);

    int deleteByExample(XAdminExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(XAdmin record);

    int insertSelective(XAdmin record);

    List<XAdmin> selectByExample(XAdminExample example);

    XAdmin selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") XAdmin record, @Param("example") XAdminExample example);

    int updateByExample(@Param("record") XAdmin record, @Param("example") XAdminExample example);

    int updateByPrimaryKeySelective(XAdmin record);

    int updateByPrimaryKey(XAdmin record);
}