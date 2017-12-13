package dao;

import entity.PrivateLetter;
import entity.PrivateLetterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivateLetterMapper {
    int countByExample(PrivateLetterExample example);

    int deleteByExample(PrivateLetterExample example);

    int deleteByPrimaryKey(Integer plid);

    int insert(PrivateLetter record);

    int insertSelective(PrivateLetter record);

    List<PrivateLetter> selectByExample(PrivateLetterExample example);

    PrivateLetter selectByPrimaryKey(Integer plid);

    int updateByExampleSelective(@Param("record") PrivateLetter record, @Param("example") PrivateLetterExample example);

    int updateByExample(@Param("record") PrivateLetter record, @Param("example") PrivateLetterExample example);

    int updateByPrimaryKeySelective(PrivateLetter record);

    int updateByPrimaryKey(PrivateLetter record);
}