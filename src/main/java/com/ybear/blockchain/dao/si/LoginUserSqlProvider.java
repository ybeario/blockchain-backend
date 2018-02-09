package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.LoginUser;
import com.ybear.blockchain.dao.model.LoginUserExample.Criteria;
import com.ybear.blockchain.dao.model.LoginUserExample.Criterion;
import com.ybear.blockchain.dao.model.LoginUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class LoginUserSqlProvider {

    public String countByExample(LoginUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("login_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LoginUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("login_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(LoginUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("login_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getCellphone() != null) {
            sql.VALUES("cellphone", "#{cellphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCellhoneVerified() != null) {
            sql.VALUES("cellhone_verified", "#{cellhoneVerified,jdbcType=BIT}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.VALUES("created_time", "#{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDisabled() != null) {
            sql.VALUES("disabled", "#{disabled,jdbcType=BIT}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEmailVerified() != null) {
            sql.VALUES("email_verified", "#{emailVerified,jdbcType=BIT}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.VALUES("birthday", "#{birthday,jdbcType=INTEGER}");
        }
        
        if (record.getLocked() != null) {
            sql.VALUES("locked", "#{locked,jdbcType=BIT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getProfileImage() != null) {
            sql.VALUES("profile_image", "#{profileImage,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.VALUES("updated_time", "#{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=BIGINT}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getDistrictId() != null) {
            sql.VALUES("district_id", "#{districtId,jdbcType=INTEGER}");
        }
        
        if (record.getProvinceId() != null) {
            sql.VALUES("province_id", "#{provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getStreet() != null) {
            sql.VALUES("street", "#{street,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUserLockRecordId() != null) {
            sql.VALUES("last_user_lock_record_id", "#{lastUserLockRecordId,jdbcType=BIGINT}");
        }
        
        if (record.getRealNameIdentificationStatus() != null) {
            sql.VALUES("real_name_identification_status", "#{realNameIdentificationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getNickName() != null) {
            sql.VALUES("nick_name", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getEncodePassword() != null) {
            sql.VALUES("encode_password", "#{encodePassword,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommendId() != null) {
            sql.VALUES("recommend_id", "#{recommendId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterfrom() != null) {
            sql.VALUES("REGISTERFROM", "#{registerfrom,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterFrom() != null) {
            sql.VALUES("register_from", "#{registerFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterBy() != null) {
            sql.VALUES("register_by", "#{registerBy,jdbcType=VARCHAR}");
        }
        
        if (record.getIsTest() != null) {
            sql.VALUES("is_test", "#{isTest,jdbcType=TINYINT}");
        }
        
        if (record.getAdditionalInfo() != null) {
            sql.VALUES("additional_info", "#{additionalInfo,jdbcType=LONGVARBINARY}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(LoginUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("cellphone");
        sql.SELECT("cellhone_verified");
        sql.SELECT("code");
        sql.SELECT("created_time");
        sql.SELECT("disabled");
        sql.SELECT("email");
        sql.SELECT("email_verified");
        sql.SELECT("gender");
        sql.SELECT("birthday");
        sql.SELECT("locked");
        sql.SELECT("name");
        sql.SELECT("profile_image");
        sql.SELECT("updated_time");
        sql.SELECT("version");
        sql.SELECT("city_id");
        sql.SELECT("district_id");
        sql.SELECT("province_id");
        sql.SELECT("street");
        sql.SELECT("last_user_lock_record_id");
        sql.SELECT("real_name_identification_status");
        sql.SELECT("nick_name");
        sql.SELECT("encode_password");
        sql.SELECT("recommend_id");
        sql.SELECT("REGISTERFROM");
        sql.SELECT("register_from");
        sql.SELECT("register_by");
        sql.SELECT("is_test");
        sql.SELECT("additional_info");
        sql.FROM("login_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(LoginUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("cellphone");
        sql.SELECT("cellhone_verified");
        sql.SELECT("code");
        sql.SELECT("created_time");
        sql.SELECT("disabled");
        sql.SELECT("email");
        sql.SELECT("email_verified");
        sql.SELECT("gender");
        sql.SELECT("birthday");
        sql.SELECT("locked");
        sql.SELECT("name");
        sql.SELECT("profile_image");
        sql.SELECT("updated_time");
        sql.SELECT("version");
        sql.SELECT("city_id");
        sql.SELECT("district_id");
        sql.SELECT("province_id");
        sql.SELECT("street");
        sql.SELECT("last_user_lock_record_id");
        sql.SELECT("real_name_identification_status");
        sql.SELECT("nick_name");
        sql.SELECT("encode_password");
        sql.SELECT("recommend_id");
        sql.SELECT("REGISTERFROM");
        sql.SELECT("register_from");
        sql.SELECT("register_by");
        sql.SELECT("is_test");
        sql.FROM("login_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        LoginUser record = (LoginUser) parameter.get("record");
        LoginUserExample example = (LoginUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("login_user");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getCellphone() != null) {
            sql.SET("cellphone = #{record.cellphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCellhoneVerified() != null) {
            sql.SET("cellhone_verified = #{record.cellhoneVerified,jdbcType=BIT}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDisabled() != null) {
            sql.SET("disabled = #{record.disabled,jdbcType=BIT}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getEmailVerified() != null) {
            sql.SET("email_verified = #{record.emailVerified,jdbcType=BIT}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{record.gender,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("birthday = #{record.birthday,jdbcType=INTEGER}");
        }
        
        if (record.getLocked() != null) {
            sql.SET("locked = #{record.locked,jdbcType=BIT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getProfileImage() != null) {
            sql.SET("profile_image = #{record.profileImage,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{record.version,jdbcType=BIGINT}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        }
        
        if (record.getDistrictId() != null) {
            sql.SET("district_id = #{record.districtId,jdbcType=INTEGER}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getStreet() != null) {
            sql.SET("street = #{record.street,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUserLockRecordId() != null) {
            sql.SET("last_user_lock_record_id = #{record.lastUserLockRecordId,jdbcType=BIGINT}");
        }
        
        if (record.getRealNameIdentificationStatus() != null) {
            sql.SET("real_name_identification_status = #{record.realNameIdentificationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getNickName() != null) {
            sql.SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getEncodePassword() != null) {
            sql.SET("encode_password = #{record.encodePassword,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommendId() != null) {
            sql.SET("recommend_id = #{record.recommendId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterfrom() != null) {
            sql.SET("REGISTERFROM = #{record.registerfrom,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterFrom() != null) {
            sql.SET("register_from = #{record.registerFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterBy() != null) {
            sql.SET("register_by = #{record.registerBy,jdbcType=VARCHAR}");
        }
        
        if (record.getIsTest() != null) {
            sql.SET("is_test = #{record.isTest,jdbcType=TINYINT}");
        }
        
        if (record.getAdditionalInfo() != null) {
            sql.SET("additional_info = #{record.additionalInfo,jdbcType=LONGVARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("login_user");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("cellphone = #{record.cellphone,jdbcType=VARCHAR}");
        sql.SET("cellhone_verified = #{record.cellhoneVerified,jdbcType=BIT}");
        sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        sql.SET("disabled = #{record.disabled,jdbcType=BIT}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("email_verified = #{record.emailVerified,jdbcType=BIT}");
        sql.SET("gender = #{record.gender,jdbcType=VARCHAR}");
        sql.SET("birthday = #{record.birthday,jdbcType=INTEGER}");
        sql.SET("locked = #{record.locked,jdbcType=BIT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("profile_image = #{record.profileImage,jdbcType=VARCHAR}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        sql.SET("district_id = #{record.districtId,jdbcType=INTEGER}");
        sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        sql.SET("street = #{record.street,jdbcType=VARCHAR}");
        sql.SET("last_user_lock_record_id = #{record.lastUserLockRecordId,jdbcType=BIGINT}");
        sql.SET("real_name_identification_status = #{record.realNameIdentificationStatus,jdbcType=INTEGER}");
        sql.SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        sql.SET("encode_password = #{record.encodePassword,jdbcType=VARCHAR}");
        sql.SET("recommend_id = #{record.recommendId,jdbcType=VARCHAR}");
        sql.SET("REGISTERFROM = #{record.registerfrom,jdbcType=VARCHAR}");
        sql.SET("register_from = #{record.registerFrom,jdbcType=VARCHAR}");
        sql.SET("register_by = #{record.registerBy,jdbcType=VARCHAR}");
        sql.SET("is_test = #{record.isTest,jdbcType=TINYINT}");
        sql.SET("additional_info = #{record.additionalInfo,jdbcType=LONGVARBINARY}");
        
        LoginUserExample example = (LoginUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("login_user");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("cellphone = #{record.cellphone,jdbcType=VARCHAR}");
        sql.SET("cellhone_verified = #{record.cellhoneVerified,jdbcType=BIT}");
        sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        sql.SET("disabled = #{record.disabled,jdbcType=BIT}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("email_verified = #{record.emailVerified,jdbcType=BIT}");
        sql.SET("gender = #{record.gender,jdbcType=VARCHAR}");
        sql.SET("birthday = #{record.birthday,jdbcType=INTEGER}");
        sql.SET("locked = #{record.locked,jdbcType=BIT}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("profile_image = #{record.profileImage,jdbcType=VARCHAR}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        sql.SET("district_id = #{record.districtId,jdbcType=INTEGER}");
        sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        sql.SET("street = #{record.street,jdbcType=VARCHAR}");
        sql.SET("last_user_lock_record_id = #{record.lastUserLockRecordId,jdbcType=BIGINT}");
        sql.SET("real_name_identification_status = #{record.realNameIdentificationStatus,jdbcType=INTEGER}");
        sql.SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        sql.SET("encode_password = #{record.encodePassword,jdbcType=VARCHAR}");
        sql.SET("recommend_id = #{record.recommendId,jdbcType=VARCHAR}");
        sql.SET("REGISTERFROM = #{record.registerfrom,jdbcType=VARCHAR}");
        sql.SET("register_from = #{record.registerFrom,jdbcType=VARCHAR}");
        sql.SET("register_by = #{record.registerBy,jdbcType=VARCHAR}");
        sql.SET("is_test = #{record.isTest,jdbcType=TINYINT}");
        
        LoginUserExample example = (LoginUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(LoginUser record) {
        SQL sql = new SQL();
        sql.UPDATE("login_user");
        
        if (record.getCellphone() != null) {
            sql.SET("cellphone = #{cellphone,jdbcType=VARCHAR}");
        }
        
        if (record.getCellhoneVerified() != null) {
            sql.SET("cellhone_verified = #{cellhoneVerified,jdbcType=BIT}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.SET("created_time = #{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDisabled() != null) {
            sql.SET("disabled = #{disabled,jdbcType=BIT}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEmailVerified() != null) {
            sql.SET("email_verified = #{emailVerified,jdbcType=BIT}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("birthday = #{birthday,jdbcType=INTEGER}");
        }
        
        if (record.getLocked() != null) {
            sql.SET("locked = #{locked,jdbcType=BIT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getProfileImage() != null) {
            sql.SET("profile_image = #{profileImage,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{version,jdbcType=BIGINT}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getDistrictId() != null) {
            sql.SET("district_id = #{districtId,jdbcType=INTEGER}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getStreet() != null) {
            sql.SET("street = #{street,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUserLockRecordId() != null) {
            sql.SET("last_user_lock_record_id = #{lastUserLockRecordId,jdbcType=BIGINT}");
        }
        
        if (record.getRealNameIdentificationStatus() != null) {
            sql.SET("real_name_identification_status = #{realNameIdentificationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getNickName() != null) {
            sql.SET("nick_name = #{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getEncodePassword() != null) {
            sql.SET("encode_password = #{encodePassword,jdbcType=VARCHAR}");
        }
        
        if (record.getRecommendId() != null) {
            sql.SET("recommend_id = #{recommendId,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterfrom() != null) {
            sql.SET("REGISTERFROM = #{registerfrom,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterFrom() != null) {
            sql.SET("register_from = #{registerFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterBy() != null) {
            sql.SET("register_by = #{registerBy,jdbcType=VARCHAR}");
        }
        
        if (record.getIsTest() != null) {
            sql.SET("is_test = #{isTest,jdbcType=TINYINT}");
        }
        
        if (record.getAdditionalInfo() != null) {
            sql.SET("additional_info = #{additionalInfo,jdbcType=LONGVARBINARY}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LoginUserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}