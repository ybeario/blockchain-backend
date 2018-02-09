package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.RealNameApply;
import com.ybear.blockchain.dao.model.RealNameApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RealNameApplyMapper {
    @SelectProvider(type=RealNameApplySqlProvider.class, method="countByExample")
    long countByExample(RealNameApplyExample example);

    @DeleteProvider(type=RealNameApplySqlProvider.class, method="deleteByExample")
    int deleteByExample(RealNameApplyExample example);

    @Delete({
        "delete from real_name_apply",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into real_name_apply (id, apply_time, ",
        "audit_result, audit_time, ",
        "idcard_imgs, idcard_no, ",
        "name, operator_id, ",
        "reject_reason, user_id)",
        "values (#{id,jdbcType=BIGINT}, #{applyTime,jdbcType=TIMESTAMP}, ",
        "#{auditResult,jdbcType=BIT}, #{auditTime,jdbcType=TIMESTAMP}, ",
        "#{idcardImgs,jdbcType=VARCHAR}, #{idcardNo,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{operatorId,jdbcType=VARCHAR}, ",
        "#{rejectReason,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR})"
    })
    int insert(RealNameApply record);

    @InsertProvider(type=RealNameApplySqlProvider.class, method="insertSelective")
    int insertSelective(RealNameApply record);

    @SelectProvider(type=RealNameApplySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="apply_time", property="applyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="audit_result", property="auditResult", jdbcType=JdbcType.BIT),
        @Result(column="audit_time", property="auditTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="idcard_imgs", property="idcardImgs", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard_no", property="idcardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="reject_reason", property="rejectReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR)
    })
    List<RealNameApply> selectByExample(RealNameApplyExample example);

    @Select({
        "select",
        "id, apply_time, audit_result, audit_time, idcard_imgs, idcard_no, name, operator_id, ",
        "reject_reason, user_id",
        "from real_name_apply",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="apply_time", property="applyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="audit_result", property="auditResult", jdbcType=JdbcType.BIT),
        @Result(column="audit_time", property="auditTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="idcard_imgs", property="idcardImgs", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard_no", property="idcardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="reject_reason", property="rejectReason", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR)
    })
    RealNameApply selectByPrimaryKey(Long id);

    @UpdateProvider(type=RealNameApplySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RealNameApply record, @Param("example") RealNameApplyExample example);

    @UpdateProvider(type=RealNameApplySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RealNameApply record, @Param("example") RealNameApplyExample example);

    @UpdateProvider(type=RealNameApplySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RealNameApply record);

    @Update({
        "update real_name_apply",
        "set apply_time = #{applyTime,jdbcType=TIMESTAMP},",
          "audit_result = #{auditResult,jdbcType=BIT},",
          "audit_time = #{auditTime,jdbcType=TIMESTAMP},",
          "idcard_imgs = #{idcardImgs,jdbcType=VARCHAR},",
          "idcard_no = #{idcardNo,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "operator_id = #{operatorId,jdbcType=VARCHAR},",
          "reject_reason = #{rejectReason,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(RealNameApply record);
}