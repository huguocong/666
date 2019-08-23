package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbYonghu;
import pojo.TbYonghuExample;

public interface TbYonghuMapper {
    int countByExample(TbYonghuExample example);

    int deleteByExample(TbYonghuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbYonghu record);

    int insertSelective(TbYonghu record);

    List<TbYonghu> selectByExample(TbYonghuExample example);

    TbYonghu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbYonghu record, @Param("example") TbYonghuExample example);

    int updateByExample(@Param("record") TbYonghu record, @Param("example") TbYonghuExample example);

    int updateByPrimaryKeySelective(TbYonghu record);

    int updateByPrimaryKey(TbYonghu record);
}