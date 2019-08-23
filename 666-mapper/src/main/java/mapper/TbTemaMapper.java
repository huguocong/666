package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbTema;
import pojo.TbTemaExample;

public interface TbTemaMapper {
    int countByExample(TbTemaExample example);

    int deleteByExample(TbTemaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTema record);

    int insertSelective(TbTema record);

    List<TbTema> selectByExample(TbTemaExample example);

    TbTema selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTema record, @Param("example") TbTemaExample example);

    int updateByExample(@Param("record") TbTema record, @Param("example") TbTemaExample example);

    int updateByPrimaryKeySelective(TbTema record);

    int updateByPrimaryKey(TbTema record);
}