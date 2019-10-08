package xyz.hpwyx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.hpwyx.pojo.XPay;
import xyz.hpwyx.pojo.XPayExample;
@Mapper
public interface XPayMapper {
    int countByExample(XPayExample example);

    int deleteByExample(XPayExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(XPay record);

    int insertSelective(XPay record);

    List<XPay> selectByExample(XPayExample example);

    XPay selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(@Param("record") XPay record, @Param("example") XPayExample example);

    int updateByExample(@Param("record") XPay record, @Param("example") XPayExample example);

    int updateByPrimaryKeySelective(XPay record);

    int updateByPrimaryKey(XPay record);
}