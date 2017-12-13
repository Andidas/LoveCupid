package dao;

import entity.SelfNomination;
import entity.SelfNominationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelfNominationMapper {
    int countByExample(SelfNominationExample example);

    int deleteByExample(SelfNominationExample example);

    int deleteByPrimaryKey(Integer snid);

    int insert(SelfNomination record);

    int insertSelective(SelfNomination record);

    List<SelfNomination> selectByExample(SelfNominationExample example);

    SelfNomination selectByPrimaryKey(Integer snid);

    int updateByExampleSelective(@Param("record") SelfNomination record, @Param("example") SelfNominationExample example);

    int updateByExample(@Param("record") SelfNomination record, @Param("example") SelfNominationExample example);

    int updateByPrimaryKeySelective(SelfNomination record);

    int updateByPrimaryKey(SelfNomination record);
}