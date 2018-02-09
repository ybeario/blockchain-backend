package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.LoginUser;
import com.ybear.blockchain.dao.model.LoginUserExample;
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

public interface LoginUserMapper {
    @SelectProvider(type=LoginUserSqlProvider.class, method="countByExample")
    long countByExample(LoginUserExample example);

    @DeleteProvider(type=LoginUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(LoginUserExample example);

    @Delete({
        "delete from login_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into login_user (id, cellphone, ",
        "cellhone_verified, code, ",
        "created_time, disabled, ",
        "email, email_verified, ",
        "gender, birthday, ",
        "locked, name, profile_image, ",
        "updated_time, version, ",
        "city_id, district_id, ",
        "province_id, street, ",
        "last_user_lock_record_id, real_name_identification_status, ",
        "nick_name, encode_password, ",
        "recommend_id, REGISTERFROM, ",
        "register_from, register_by, ",
        "is_test, additional_info)",
        "values (#{id,jdbcType=VARCHAR}, #{cellphone,jdbcType=VARCHAR}, ",
        "#{cellhoneVerified,jdbcType=BIT}, #{code,jdbcType=VARCHAR}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{disabled,jdbcType=BIT}, ",
        "#{email,jdbcType=VARCHAR}, #{emailVerified,jdbcType=BIT}, ",
        "#{gender,jdbcType=VARCHAR}, #{birthday,jdbcType=INTEGER}, ",
        "#{locked,jdbcType=BIT}, #{name,jdbcType=VARCHAR}, #{profileImage,jdbcType=VARCHAR}, ",
        "#{updatedTime,jdbcType=TIMESTAMP}, #{version,jdbcType=BIGINT}, ",
        "#{cityId,jdbcType=INTEGER}, #{districtId,jdbcType=INTEGER}, ",
        "#{provinceId,jdbcType=INTEGER}, #{street,jdbcType=VARCHAR}, ",
        "#{lastUserLockRecordId,jdbcType=BIGINT}, #{realNameIdentificationStatus,jdbcType=INTEGER}, ",
        "#{nickName,jdbcType=VARCHAR}, #{encodePassword,jdbcType=VARCHAR}, ",
        "#{recommendId,jdbcType=VARCHAR}, #{registerfrom,jdbcType=VARCHAR}, ",
        "#{registerFrom,jdbcType=VARCHAR}, #{registerBy,jdbcType=VARCHAR}, ",
        "#{isTest,jdbcType=TINYINT}, #{additionalInfo,jdbcType=LONGVARBINARY})"
    })
    int insert(LoginUser record);

    @InsertProvider(type=LoginUserSqlProvider.class, method="insertSelective")
    int insertSelective(LoginUser record);

    @SelectProvider(type=LoginUserSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cellphone", property="cellphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cellhone_verified", property="cellhoneVerified", jdbcType=JdbcType.BIT),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="disabled", property="disabled", jdbcType=JdbcType.BIT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_verified", property="emailVerified", jdbcType=JdbcType.BIT),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.INTEGER),
        @Result(column="locked", property="locked", jdbcType=JdbcType.BIT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="profile_image", property="profileImage", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="district_id", property="districtId", jdbcType=JdbcType.INTEGER),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_user_lock_record_id", property="lastUserLockRecordId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name_identification_status", property="realNameIdentificationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="encode_password", property="encodePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_id", property="recommendId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REGISTERFROM", property="registerfrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_from", property="registerFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_by", property="registerBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_test", property="isTest", jdbcType=JdbcType.TINYINT),
        @Result(column="additional_info", property="additionalInfo", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<LoginUser> selectByExampleWithBLOBs(LoginUserExample example);

    @SelectProvider(type=LoginUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cellphone", property="cellphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cellhone_verified", property="cellhoneVerified", jdbcType=JdbcType.BIT),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="disabled", property="disabled", jdbcType=JdbcType.BIT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_verified", property="emailVerified", jdbcType=JdbcType.BIT),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.INTEGER),
        @Result(column="locked", property="locked", jdbcType=JdbcType.BIT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="profile_image", property="profileImage", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="district_id", property="districtId", jdbcType=JdbcType.INTEGER),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_user_lock_record_id", property="lastUserLockRecordId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name_identification_status", property="realNameIdentificationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="encode_password", property="encodePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_id", property="recommendId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REGISTERFROM", property="registerfrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_from", property="registerFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_by", property="registerBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_test", property="isTest", jdbcType=JdbcType.TINYINT)
    })
    List<LoginUser> selectByExample(LoginUserExample example);

    @Select({
        "select",
        "id, cellphone, cellhone_verified, code, created_time, disabled, email, email_verified, ",
        "gender, birthday, locked, name, profile_image, updated_time, version, city_id, ",
        "district_id, province_id, street, last_user_lock_record_id, real_name_identification_status, ",
        "nick_name, encode_password, recommend_id, REGISTERFROM, register_from, register_by, ",
        "is_test, additional_info",
        "from login_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="cellphone", property="cellphone", jdbcType=JdbcType.VARCHAR),
        @Result(column="cellhone_verified", property="cellhoneVerified", jdbcType=JdbcType.BIT),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="disabled", property="disabled", jdbcType=JdbcType.BIT),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_verified", property="emailVerified", jdbcType=JdbcType.BIT),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.INTEGER),
        @Result(column="locked", property="locked", jdbcType=JdbcType.BIT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="profile_image", property="profileImage", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="district_id", property="districtId", jdbcType=JdbcType.INTEGER),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_user_lock_record_id", property="lastUserLockRecordId", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name_identification_status", property="realNameIdentificationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="encode_password", property="encodePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="recommend_id", property="recommendId", jdbcType=JdbcType.VARCHAR),
        @Result(column="REGISTERFROM", property="registerfrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_from", property="registerFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_by", property="registerBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_test", property="isTest", jdbcType=JdbcType.TINYINT),
        @Result(column="additional_info", property="additionalInfo", jdbcType=JdbcType.LONGVARBINARY)
    })
    LoginUser selectByPrimaryKey(String id);

    @UpdateProvider(type=LoginUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    @UpdateProvider(type=LoginUserSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    @UpdateProvider(type=LoginUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LoginUser record, @Param("example") LoginUserExample example);

    @UpdateProvider(type=LoginUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(LoginUser record);

    @Update({
        "update login_user",
        "set cellphone = #{cellphone,jdbcType=VARCHAR},",
          "cellhone_verified = #{cellhoneVerified,jdbcType=BIT},",
          "code = #{code,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "disabled = #{disabled,jdbcType=BIT},",
          "email = #{email,jdbcType=VARCHAR},",
          "email_verified = #{emailVerified,jdbcType=BIT},",
          "gender = #{gender,jdbcType=VARCHAR},",
          "birthday = #{birthday,jdbcType=INTEGER},",
          "locked = #{locked,jdbcType=BIT},",
          "name = #{name,jdbcType=VARCHAR},",
          "profile_image = #{profileImage,jdbcType=VARCHAR},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP},",
          "version = #{version,jdbcType=BIGINT},",
          "city_id = #{cityId,jdbcType=INTEGER},",
          "district_id = #{districtId,jdbcType=INTEGER},",
          "province_id = #{provinceId,jdbcType=INTEGER},",
          "street = #{street,jdbcType=VARCHAR},",
          "last_user_lock_record_id = #{lastUserLockRecordId,jdbcType=BIGINT},",
          "real_name_identification_status = #{realNameIdentificationStatus,jdbcType=INTEGER},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "encode_password = #{encodePassword,jdbcType=VARCHAR},",
          "recommend_id = #{recommendId,jdbcType=VARCHAR},",
          "REGISTERFROM = #{registerfrom,jdbcType=VARCHAR},",
          "register_from = #{registerFrom,jdbcType=VARCHAR},",
          "register_by = #{registerBy,jdbcType=VARCHAR},",
          "is_test = #{isTest,jdbcType=TINYINT},",
          "additional_info = #{additionalInfo,jdbcType=LONGVARBINARY}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(LoginUser record);

    @Update({
        "update login_user",
        "set cellphone = #{cellphone,jdbcType=VARCHAR},",
          "cellhone_verified = #{cellhoneVerified,jdbcType=BIT},",
          "code = #{code,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "disabled = #{disabled,jdbcType=BIT},",
          "email = #{email,jdbcType=VARCHAR},",
          "email_verified = #{emailVerified,jdbcType=BIT},",
          "gender = #{gender,jdbcType=VARCHAR},",
          "birthday = #{birthday,jdbcType=INTEGER},",
          "locked = #{locked,jdbcType=BIT},",
          "name = #{name,jdbcType=VARCHAR},",
          "profile_image = #{profileImage,jdbcType=VARCHAR},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP},",
          "version = #{version,jdbcType=BIGINT},",
          "city_id = #{cityId,jdbcType=INTEGER},",
          "district_id = #{districtId,jdbcType=INTEGER},",
          "province_id = #{provinceId,jdbcType=INTEGER},",
          "street = #{street,jdbcType=VARCHAR},",
          "last_user_lock_record_id = #{lastUserLockRecordId,jdbcType=BIGINT},",
          "real_name_identification_status = #{realNameIdentificationStatus,jdbcType=INTEGER},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "encode_password = #{encodePassword,jdbcType=VARCHAR},",
          "recommend_id = #{recommendId,jdbcType=VARCHAR},",
          "REGISTERFROM = #{registerfrom,jdbcType=VARCHAR},",
          "register_from = #{registerFrom,jdbcType=VARCHAR},",
          "register_by = #{registerBy,jdbcType=VARCHAR},",
          "is_test = #{isTest,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(LoginUser record);
}