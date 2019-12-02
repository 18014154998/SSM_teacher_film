package film.mapper;

import film.pojo.Ut;
import film.pojo.UtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtMapper {
    int countByExample(UtExample example);

    int deleteByExample(UtExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Ut record);

    int insertSelective(Ut record);

    List<Ut> selectByExample(UtExample example);

    Ut selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Ut record, @Param("example") UtExample example);

    int updateByExample(@Param("record") Ut record, @Param("example") UtExample example);

    int updateByPrimaryKeySelective(Ut record);

    int updateByPrimaryKey(Ut record);
}