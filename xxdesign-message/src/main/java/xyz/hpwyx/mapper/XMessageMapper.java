package xyz.hpwyx.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XMessage;
import xyz.hpwyx.pojo.XMessageExample;

import java.util.List;

@Mapper
public interface XMessageMapper {
    int countByExample(XMessageExample example);

    int deleteByExample(XMessageExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(XMessage record);

    int insertSelective(XMessage record);

    List<XMessage> selectByExample(XMessageExample example);

    XMessage selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") XMessage record, @Param("example") XMessageExample example);

    int updateByExample(@Param("record") XMessage record, @Param("example") XMessageExample example);

    int updateByPrimaryKeySelective(XMessage record);

    int updateByPrimaryKey(XMessage record);
    List<XMessage> selectAll(Integer uId);

}