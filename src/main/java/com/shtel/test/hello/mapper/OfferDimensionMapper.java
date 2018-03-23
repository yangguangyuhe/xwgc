package com.shtel.test.hello.mapper;

import com.shtel.test.hello.entity.OfferDimension;
import com.shtel.test.hello.entity.OfferDimensionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfferDimensionMapper {
    int countByExample(OfferDimensionExample example);

    int deleteByExample(OfferDimensionExample example);

    int deleteByPrimaryKey(Integer dimensionid);

    int insert(OfferDimension record);

    int insertSelective(OfferDimension record);

    List<OfferDimension> selectByExample(OfferDimensionExample example);

    OfferDimension selectByPrimaryKey(Integer dimensionid);

    int updateByExampleSelective(@Param("record") OfferDimension record, @Param("example") OfferDimensionExample example);

    int updateByExample(@Param("record") OfferDimension record, @Param("example") OfferDimensionExample example);

    int updateByPrimaryKeySelective(OfferDimension record);

    int updateByPrimaryKey(OfferDimension record);
}