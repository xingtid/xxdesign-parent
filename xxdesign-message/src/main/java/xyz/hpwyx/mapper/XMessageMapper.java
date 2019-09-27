package xyz.hpwyx.mapper;

import xyz.hpwyx.pojo.XMessage;

public interface XMessageMapper {


    int deleteByPrimaryKey(Integer mId);

    int insert(XMessage record);

    int insertSelective(XMessage record);


    XMessage selectByPrimaryKey(Integer mId);


    int updateByPrimaryKey(XMessage record);
}