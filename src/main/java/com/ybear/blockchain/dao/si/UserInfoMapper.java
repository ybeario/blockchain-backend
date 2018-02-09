package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.UserInfo;
import com.ybear.blockchain.dao.model.UserInfoExample;
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

public interface UserInfoMapper {
    @SelectProvider(type=UserInfoSqlProvider.class, method="countByExample")
    long countByExample(UserInfoExample example);

    @DeleteProvider(type=UserInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserInfoExample example);

    @Delete({
        "delete from b_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into b_user (id, name, ",
        "phone_no, head_img, ",
        "sex, id_card_no, role, ",
        "register_time, area, ",
        "city_code, created_by, ",
        "district_code, hospital_id, ",
        "province_code, updated_by, ",
        "updated_time, version, ",
        "real_name_identification_status, user_id, ",
        "is_identify, status, ",
        "modify_time, is_test, ",
        "is_virtual, features)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{phoneNo,jdbcType=VARCHAR}, #{headImg,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=INTEGER}, #{idCardNo,jdbcType=VARCHAR}, #{role,jdbcType=INTEGER}, ",
        "#{registerTime,jdbcType=TIMESTAMP}, #{area,jdbcType=VARCHAR}, ",
        "#{cityCode,jdbcType=INTEGER}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{districtCode,jdbcType=INTEGER}, #{hospitalId,jdbcType=VARCHAR}, ",
        "#{provinceCode,jdbcType=INTEGER}, #{updatedBy,jdbcType=VARCHAR}, ",
        "#{updatedTime,jdbcType=TIMESTAMP}, #{version,jdbcType=BIGINT}, ",
        "#{realNameIdentificationStatus,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{isIdentify,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{isTest,jdbcType=BIT}, ",
        "#{isVirtual,jdbcType=BIT}, #{features,jdbcType=LONGVARBINARY})"
    })
    int insert(UserInfo record);

    @InsertProvider(type=UserInfoSqlProvider.class, method="insertSelective")
    int insertSelective(UserInfo record);

    @SelectProvider(type=UserInfoSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_no", property="phoneNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_img", property="headImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="id_card_no", property="idCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.INTEGER),
        @Result(column="register_time", property="registerTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="district_code", property="districtCode", jdbcType=JdbcType.INTEGER),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name_identification_status", property="realNameIdentificationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_identify", property="isIdentify", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_test", property="isTest", jdbcType=JdbcType.BIT),
        @Result(column="is_virtual", property="isVirtual", jdbcType=JdbcType.BIT),
        @Result(column="features", property="features", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<UserInfo> selectByExampleWithBLOBs(UserInfoExample example);

    @SelectProvider(type=UserInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_no", property="phoneNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_img", property="headImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="id_card_no", property="idCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.INTEGER),
        @Result(column="register_time", property="registerTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="district_code", property="districtCode", jdbcType=JdbcType.INTEGER),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name_identification_status", property="realNameIdentificationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_identify", property="isIdentify", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_test", property="isTest", jdbcType=JdbcType.BIT),
        @Result(column="is_virtual", property="isVirtual", jdbcType=JdbcType.BIT)
    })
    List<UserInfo> selectByExample(UserInfoExample example);

    @Select({
        "select",
        "id, name, phone_no, head_img, sex, id_card_no, role, register_time, area, city_code, ",
        "created_by, district_code, hospital_id, province_code, updated_by, updated_time, ",
        "version, real_name_identification_status, user_id, is_identify, status, modify_time, ",
        "is_test, is_virtual, features",
        "from b_user",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_no", property="phoneNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_img", property="headImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="id_card_no", property="idCardNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="role", property="role", jdbcType=JdbcType.INTEGER),
        @Result(column="register_time", property="registerTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.INTEGER),
        @Result(column="created_by", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="district_code", property="districtCode", jdbcType=JdbcType.INTEGER),
        @Result(column="hospital_id", property="hospitalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_by", property="updatedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="real_name_identification_status", property="realNameIdentificationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_identify", property="isIdentify", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="modify_time", property="modifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_test", property="isTest", jdbcType=JdbcType.BIT),
        @Result(column="is_virtual", property="isVirtual", jdbcType=JdbcType.BIT),
        @Result(column="features", property="features", jdbcType=JdbcType.LONGVARBINARY)
    })
    UserInfo selectByPrimaryKey(String id);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
        "update b_user",
        "set name = #{name,jdbcType=VARCHAR},",
          "phone_no = #{phoneNo,jdbcType=VARCHAR},",
          "head_img = #{headImg,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER},",
          "id_card_no = #{idCardNo,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=INTEGER},",
          "register_time = #{registerTime,jdbcType=TIMESTAMP},",
          "area = #{area,jdbcType=VARCHAR},",
          "city_code = #{cityCode,jdbcType=INTEGER},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "district_code = #{districtCode,jdbcType=INTEGER},",
          "hospital_id = #{hospitalId,jdbcType=VARCHAR},",
          "province_code = #{provinceCode,jdbcType=INTEGER},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP},",
          "version = #{version,jdbcType=BIGINT},",
          "real_name_identification_status = #{realNameIdentificationStatus,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "is_identify = #{isIdentify,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "is_test = #{isTest,jdbcType=BIT},",
          "is_virtual = #{isVirtual,jdbcType=BIT},",
          "features = #{features,jdbcType=LONGVARBINARY}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(UserInfo record);

    @Update({
        "update b_user",
        "set name = #{name,jdbcType=VARCHAR},",
          "phone_no = #{phoneNo,jdbcType=VARCHAR},",
          "head_img = #{headImg,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=INTEGER},",
          "id_card_no = #{idCardNo,jdbcType=VARCHAR},",
          "role = #{role,jdbcType=INTEGER},",
          "register_time = #{registerTime,jdbcType=TIMESTAMP},",
          "area = #{area,jdbcType=VARCHAR},",
          "city_code = #{cityCode,jdbcType=INTEGER},",
          "created_by = #{createdBy,jdbcType=VARCHAR},",
          "district_code = #{districtCode,jdbcType=INTEGER},",
          "hospital_id = #{hospitalId,jdbcType=VARCHAR},",
          "province_code = #{provinceCode,jdbcType=INTEGER},",
          "updated_by = #{updatedBy,jdbcType=VARCHAR},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP},",
          "version = #{version,jdbcType=BIGINT},",
          "real_name_identification_status = #{realNameIdentificationStatus,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "is_identify = #{isIdentify,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "is_test = #{isTest,jdbcType=BIT},",
          "is_virtual = #{isVirtual,jdbcType=BIT}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UserInfo record);
}