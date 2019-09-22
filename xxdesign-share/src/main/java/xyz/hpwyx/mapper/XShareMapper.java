package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.baseresult.IndexPojo;
import xyz.hpwyx.pojo.XShare;
import xyz.hpwyx.pojo.XShareExample;

@Mapper
public interface XShareMapper {
    int countByExample(XShareExample example);

    int deleteByExample(XShareExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(XShare record);

    int insertSelective(XShare record);

    List<XShare> selectByExample(XShareExample example);

    XShare selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") XShare record, @Param("example") XShareExample example);

    int updateByExample(@Param("record") XShare record, @Param("example") XShareExample example);

    int updateByPrimaryKeySelective(XShare record);

    int updateByPrimaryKey(XShare record);

    XShare selectShareAndUserById(Integer sId);

    List<XShare> selectShareAndUser();
}