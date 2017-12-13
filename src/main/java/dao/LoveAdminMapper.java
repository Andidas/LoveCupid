package dao;

import entity.LoveAdmin;
import entity.LoveAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoveAdminMapper {
    int countByExample(LoveAdminExample example);

    int deleteByExample(LoveAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(LoveAdmin record);

    int insertSelective(LoveAdmin record);

    List<LoveAdmin> selectByExample(LoveAdminExample example);

    LoveAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") LoveAdmin record, @Param("example") LoveAdminExample example);

    int updateByExample(@Param("record") LoveAdmin record, @Param("example") LoveAdminExample example);

    int updateByPrimaryKeySelective(LoveAdmin record);

    int updateByPrimaryKey(LoveAdmin record);
}