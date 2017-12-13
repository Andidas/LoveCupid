package dao;

import entity.MemberScreen;
import entity.MemberScreenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberScreenMapper {
    int countByExample(MemberScreenExample example);

    int deleteByExample(MemberScreenExample example);

    int deleteByPrimaryKey(Integer msid);

    int insert(MemberScreen record);

    int insertSelective(MemberScreen record);

    List<MemberScreen> selectByExample(MemberScreenExample example);

    MemberScreen selectByPrimaryKey(Integer msid);

    int updateByExampleSelective(@Param("record") MemberScreen record, @Param("example") MemberScreenExample example);

    int updateByExample(@Param("record") MemberScreen record, @Param("example") MemberScreenExample example);

    int updateByPrimaryKeySelective(MemberScreen record);

    int updateByPrimaryKey(MemberScreen record);
}