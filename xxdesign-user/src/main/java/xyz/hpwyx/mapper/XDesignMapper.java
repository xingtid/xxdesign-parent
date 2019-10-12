package xyz.hpwyx.mapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.hpwyx.pojo.XDesign;
@Mapper
public interface XDesignMapper {

    int deleteByPrimaryKey(Integer dId);

    int insert(XDesign record);

    int insertSelective(XDesign record);


    XDesign selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(XDesign record);

    int updateByPrimaryKey(XDesign record);
}