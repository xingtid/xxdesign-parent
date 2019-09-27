package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XWardrobe;
import xyz.hpwyx.pojo.XWardrobeExample;

@Mapper
public interface XWardrobeMapper {
    int countByExample(XWardrobeExample example);

    int deleteByExample(XWardrobeExample example);

    int deleteByPrimaryKey(Integer wId);

    int insert(XWardrobe record);

    int insertSelective(XWardrobe record);

    List<XWardrobe> selectByExample(XWardrobeExample example);

    XWardrobe selectByPrimaryKey(Integer wId);

    int updateByExampleSelective(@Param("record") XWardrobe record, @Param("example") XWardrobeExample example);

    int updateByExample(@Param("record") XWardrobe record, @Param("example") XWardrobeExample example);

    int updateByPrimaryKeySelective(XWardrobe record);

    int updateByPrimaryKey(XWardrobe record);
}