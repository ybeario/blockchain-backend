package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.PasswordChangeHistory;
import com.ybear.blockchain.dao.model.PasswordChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

public interface PasswordChangeHistoryMapper {
    @SelectProvider(type=PasswordChangeHistorySqlProvider.class, method="countByExample")
    long countByExample(PasswordChangeHistoryExample example);

    @Insert({
        "insert into password_change_history (id, changed_time, ",
        "new_password, old_password, ",
        "user_id, version)",
        "values (#{id,jdbcType=BIGINT}, #{changedTime,jdbcType=TIMESTAMP}, ",
        "#{newPassword,jdbcType=VARCHAR}, #{oldPassword,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{version,jdbcType=BIGINT})"
    })
    int insert(PasswordChangeHistory record);

    @InsertProvider(type=PasswordChangeHistorySqlProvider.class, method="insertSelective")
    int insertSelective(PasswordChangeHistory record);

    @SelectProvider(type=PasswordChangeHistorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="changed_time", property="changedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="new_password", property="newPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="old_password", property="oldPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT)
    })
    List<PasswordChangeHistory> selectByExample(PasswordChangeHistoryExample example);

    @Select({
        "select",
        "id, changed_time, new_password, old_password, user_id, version",
        "from password_change_history",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="changed_time", property="changedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="new_password", property="newPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="old_password", property="oldPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT)
    })
    PasswordChangeHistory selectByPrimaryKey(Long id);
}