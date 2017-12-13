package dao;

import entity.DynamicTage;
import entity.DynamicTageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicTageMapper {
    int countByExample(DynamicTageExample example);

    int deleteByExample(DynamicTageExample example);

    int deleteByPrimaryKey(Integer dtid);

    int insert(DynamicTage record);

    int insertSelective(DynamicTage record);

    List<DynamicTage> selectByExample(DynamicTageExample example);

    DynamicTage selectByPrimaryKey(Integer dtid);

    int updateByExampleSelective(@Param("record") DynamicTage record, @Param("example") DynamicTageExample example);

    int updateByExample(@Param("record") DynamicTage record, @Param("example") DynamicTageExample example);

    int updateByPrimaryKeySelective(DynamicTage record);

    int updateByPrimaryKey(DynamicTage record);
}