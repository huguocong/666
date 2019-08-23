package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbPing;
import pojo.TbPingExample;

public interface TbPingMapper {
    int countByExample(TbPingExample example);

    int deleteByExample(TbPingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPing record);

    int insertSelective(TbPing record);

    List<TbPing> selectByExample(TbPingExample example);

    TbPing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPing record, @Param("example") TbPingExample example);

    int updateByExample(@Param("record") TbPing record, @Param("example") TbPingExample example);

    int updateByPrimaryKeySelective(TbPing record);

    int updateByPrimaryKey(TbPing record);
}