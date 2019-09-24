package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.baseresult.DesignPojo;
import xyz.hpwyx.baseresult.IndexPojo;
import xyz.hpwyx.pojo.XIndex;
import xyz.hpwyx.pojo.XIndexExample;

@Mapper
public interface XIndexMapper {
    int countByExample(XIndexExample example);

    int deleteByExample(XIndexExample example);

    int deleteByPrimaryKey(Integer iId);

    int insert(XIndex record);

    int insertSelective(XIndex record);

    List<XIndex> selectByExample(XIndexExample example);

    XIndex selectByPrimaryKey(Integer iId);

    int updateByExampleSelective(@Param("record") XIndex record, @Param("example") XIndexExample example);

    int updateByExample(@Param("record") XIndex record, @Param("example") XIndexExample example);

    int updateByPrimaryKeySelective(XIndex record);

    int updateByPrimaryKey(XIndex record);

    List<IndexPojo> findShare();

    List<DesignPojo> findDesigner();
}