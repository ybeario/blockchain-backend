package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.LoginLog;
import com.ybear.blockchain.dao.model.LoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

public interface LoginLogMapper {
    @SelectProvider(type=LoginLogSqlProvider.class, method="countByExample")
    long countByExample(LoginLogExample example);

    @Insert({
        "insert into b_login_log (id, user_id, ",
        "login_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=VARCHAR}, ",
        "#{loginTime,jdbcType=TIMESTAMP})"
    })
    int insert(LoginLog record);

    @InsertProvider(type=LoginLogSqlProvider.class, method="insertSelective")
    int insertSelective(LoginLog record);

    @SelectProvider(type=LoginLogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LoginLog> selectByExample(LoginLogExample example);

    @Select({
        "select",
        "id, user_id, login_time",
        "from b_login_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_time", property="loginTime", jdbcType=JdbcType.TIMESTAMP)
    })
    LoginLog selectByPrimaryKey(Integer id);
}