package com.offcn.user.mapper;

import com.offcn.user.po.TTag;
import com.offcn.user.po.TTagExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TTagMapper {
    long countByExample(TTagExample example);

    int deleteByExample(TTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTag record);

    int insertSelective(TTag record);

    List<TTag> selectByExample(TTagExample example);

    TTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTag record, @Param("example") TTagExample example);

    int updateByExample(@Param("record") TTag record, @Param("example") TTagExample example);

    int updateByPrimaryKeySelective(TTag record);

    int updateByPrimaryKey(TTag record);
}