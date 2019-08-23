package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbXiao;
import pojo.TbXiaoExample;

public interface TbXiaoMapper {
    int countByExample(TbXiaoExample example);

    int deleteByExample(TbXiaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbXiao record);

    int insertSelective(TbXiao record);

    List<TbXiao> selectByExample(TbXiaoExample example);

    TbXiao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbXiao record, @Param("example") TbXiaoExample example);

    int updateByExample(@Param("record") TbXiao record, @Param("example") TbXiaoExample example);

    int updateByPrimaryKeySelective(TbXiao record);

    int updateByPrimaryKey(TbXiao record);
}