package dao;

import entity.SuccessfulStory;
import entity.SuccessfulStoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuccessfulStoryMapper {
    int countByExample(SuccessfulStoryExample example);

    int deleteByExample(SuccessfulStoryExample example);

    int deleteByPrimaryKey(Integer ssid);

    int insert(SuccessfulStory record);

    int insertSelective(SuccessfulStory record);

    List<SuccessfulStory> selectByExample(SuccessfulStoryExample example);

    SuccessfulStory selectByPrimaryKey(Integer ssid);

    int updateByExampleSelective(@Param("record") SuccessfulStory record, @Param("example") SuccessfulStoryExample example);

    int updateByExample(@Param("record") SuccessfulStory record, @Param("example") SuccessfulStoryExample example);

    int updateByPrimaryKeySelective(SuccessfulStory record);

    int updateByPrimaryKey(SuccessfulStory record);
}