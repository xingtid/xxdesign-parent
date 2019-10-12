package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XCertified;
import xyz.hpwyx.pojo.XCertifiedExample;
@Mapper
public interface XCertifiedMapper {
    int countByExample(XCertifiedExample example);

    int deleteByExample(XCertifiedExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(XCertified record);

    int insertSelective(XCertified record);

    List<XCertified> selectByExample(XCertifiedExample example);

    XCertified selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") XCertified record, @Param("example") XCertifiedExample example);

    int updateByExample(@Param("record") XCertified record, @Param("example") XCertifiedExample example);

    int updateByPrimaryKeySelective(XCertified record);

    int updateByPrimaryKey(XCertified record);
}