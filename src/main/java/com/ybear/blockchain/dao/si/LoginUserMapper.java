package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.LoginUser;
import com.ybear.blockchain.dao.model.LoginUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginUserMapper {
    long countByExample(LoginUserExample example);

    int deleteByExample(LoginUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(LoginUser record);

    int insertSelective(LoginUser record);

    List<LoginUser> selectByExampleWithBLOBs(LoginUserExample example);

    List<LoginUser> selectByExample(LoginUserExample example);

    LoginUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    int updateByExampleWithBLOBs(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    int updateByExample(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    int updateByPrimaryKeySelective(LoginUser record);

    int updateByPrimaryKeyWithBLOBs(LoginUser record);

    int updateByPrimaryKey(LoginUser record);
}