package com.shtel.test.hello.mapper;

import com.shtel.test.hello.entity.OfferLabble;
import com.shtel.test.hello.entity.OfferLabbleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfferLabbleMapper {
    int countByExample(OfferLabbleExample example);

    int deleteByExample(OfferLabbleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OfferLabble record);

    int insertSelective(OfferLabble record);

    List<OfferLabble> selectByExample(OfferLabbleExample example);

    OfferLabble selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OfferLabble record, @Param("example") OfferLabbleExample example);

    int updateByExample(@Param("record") OfferLabble record, @Param("example") OfferLabbleExample example);

    int updateByPrimaryKeySelective(OfferLabble record);

    int updateByPrimaryKey(OfferLabble record);
}