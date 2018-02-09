package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.UserInfo;
import com.ybear.blockchain.dao.model.UserInfoExample.Criteria;
import com.ybear.blockchain.dao.model.UserInfoExample.Criterion;
import com.ybear.blockchain.dao.model.UserInfoExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserInfoSqlProvider {

    public String countByExample(UserInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("b_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("b_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("b_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneNo() != null) {
            sql.VALUES("phone_no", "#{phoneNo,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadImg() != null) {
            sql.VALUES("head_img", "#{headImg,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=INTEGER}");
        }
        
        if (record.getIdCardNo() != null) {
            sql.VALUES("id_card_no", "#{idCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            sql.VALUES("role", "#{role,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterTime() != null) {
            sql.VALUES("register_time", "#{registerTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getArea() != null) {
            sql.VALUES("area", "#{area,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.VALUES("city_code", "#{cityCode,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.VALUES("created_by", "#{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrictCode() != null) {
            sql.VALUES("district_code", "#{districtCode,jdbcType=INTEGER}");
        }
        
        if (record.getHospitalId() != null) {
            sql.VALUES("hospital_id", "#{hospitalId,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceCode() != null) {
            sql.VALUES("province_code", "#{provinceCode,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.VALUES("updated_by", "#{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.VALUES("updated_time", "#{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=BIGINT}");
        }
        
        if (record.getRealNameIdentificationStatus() != null) {
            sql.VALUES("real_name_identification_status", "#{realNameIdentificationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getIsIdentify() != null) {
            sql.VALUES("is_identify", "#{isIdentify,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getModifyTime() != null) {
            sql.VALUES("modify_time", "#{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsTest() != null) {
            sql.VALUES("is_test", "#{isTest,jdbcType=BIT}");
        }
        
        if (record.getIsVirtual() != null) {
            sql.VALUES("is_virtual", "#{isVirtual,jdbcType=BIT}");
        }
        
        if (record.getFeatures() != null) {
            sql.VALUES("features", "#{features,jdbcType=LONGVARBINARY}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(UserInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("phone_no");
        sql.SELECT("head_img");
        sql.SELECT("sex");
        sql.SELECT("id_card_no");
        sql.SELECT("role");
        sql.SELECT("register_time");
        sql.SELECT("area");
        sql.SELECT("city_code");
        sql.SELECT("created_by");
        sql.SELECT("district_code");
        sql.SELECT("hospital_id");
        sql.SELECT("province_code");
        sql.SELECT("updated_by");
        sql.SELECT("updated_time");
        sql.SELECT("version");
        sql.SELECT("real_name_identification_status");
        sql.SELECT("user_id");
        sql.SELECT("is_identify");
        sql.SELECT("status");
        sql.SELECT("modify_time");
        sql.SELECT("is_test");
        sql.SELECT("is_virtual");
        sql.SELECT("features");
        sql.FROM("b_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(UserInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("phone_no");
        sql.SELECT("head_img");
        sql.SELECT("sex");
        sql.SELECT("id_card_no");
        sql.SELECT("role");
        sql.SELECT("register_time");
        sql.SELECT("area");
        sql.SELECT("city_code");
        sql.SELECT("created_by");
        sql.SELECT("district_code");
        sql.SELECT("hospital_id");
        sql.SELECT("province_code");
        sql.SELECT("updated_by");
        sql.SELECT("updated_time");
        sql.SELECT("version");
        sql.SELECT("real_name_identification_status");
        sql.SELECT("user_id");
        sql.SELECT("is_identify");
        sql.SELECT("status");
        sql.SELECT("modify_time");
        sql.SELECT("is_test");
        sql.SELECT("is_virtual");
        sql.FROM("b_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserInfo record = (UserInfo) parameter.get("record");
        UserInfoExample example = (UserInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("b_user");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneNo() != null) {
            sql.SET("phone_no = #{record.phoneNo,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadImg() != null) {
            sql.SET("head_img = #{record.headImg,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=INTEGER}");
        }
        
        if (record.getIdCardNo() != null) {
            sql.SET("id_card_no = #{record.idCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            sql.SET("role = #{record.role,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterTime() != null) {
            sql.SET("register_time = #{record.registerTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getArea() != null) {
            sql.SET("area = #{record.area,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.SET("city_code = #{record.cityCode,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrictCode() != null) {
            sql.SET("district_code = #{record.districtCode,jdbcType=INTEGER}");
        }
        
        if (record.getHospitalId() != null) {
            sql.SET("hospital_id = #{record.hospitalId,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceCode() != null) {
            sql.SET("province_code = #{record.provinceCode,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{record.version,jdbcType=BIGINT}");
        }
        
        if (record.getRealNameIdentificationStatus() != null) {
            sql.SET("real_name_identification_status = #{record.realNameIdentificationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getIsIdentify() != null) {
            sql.SET("is_identify = #{record.isIdentify,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getModifyTime() != null) {
            sql.SET("modify_time = #{record.modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsTest() != null) {
            sql.SET("is_test = #{record.isTest,jdbcType=BIT}");
        }
        
        if (record.getIsVirtual() != null) {
            sql.SET("is_virtual = #{record.isVirtual,jdbcType=BIT}");
        }
        
        if (record.getFeatures() != null) {
            sql.SET("features = #{record.features,jdbcType=LONGVARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("b_user");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("phone_no = #{record.phoneNo,jdbcType=VARCHAR}");
        sql.SET("head_img = #{record.headImg,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=INTEGER}");
        sql.SET("id_card_no = #{record.idCardNo,jdbcType=VARCHAR}");
        sql.SET("role = #{record.role,jdbcType=INTEGER}");
        sql.SET("register_time = #{record.registerTime,jdbcType=TIMESTAMP}");
        sql.SET("area = #{record.area,jdbcType=VARCHAR}");
        sql.SET("city_code = #{record.cityCode,jdbcType=INTEGER}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("district_code = #{record.districtCode,jdbcType=INTEGER}");
        sql.SET("hospital_id = #{record.hospitalId,jdbcType=VARCHAR}");
        sql.SET("province_code = #{record.provinceCode,jdbcType=INTEGER}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("real_name_identification_status = #{record.realNameIdentificationStatus,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("is_identify = #{record.isIdentify,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("modify_time = #{record.modifyTime,jdbcType=TIMESTAMP}");
        sql.SET("is_test = #{record.isTest,jdbcType=BIT}");
        sql.SET("is_virtual = #{record.isVirtual,jdbcType=BIT}");
        sql.SET("features = #{record.features,jdbcType=LONGVARBINARY}");
        
        UserInfoExample example = (UserInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("b_user");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("phone_no = #{record.phoneNo,jdbcType=VARCHAR}");
        sql.SET("head_img = #{record.headImg,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=INTEGER}");
        sql.SET("id_card_no = #{record.idCardNo,jdbcType=VARCHAR}");
        sql.SET("role = #{record.role,jdbcType=INTEGER}");
        sql.SET("register_time = #{record.registerTime,jdbcType=TIMESTAMP}");
        sql.SET("area = #{record.area,jdbcType=VARCHAR}");
        sql.SET("city_code = #{record.cityCode,jdbcType=INTEGER}");
        sql.SET("created_by = #{record.createdBy,jdbcType=VARCHAR}");
        sql.SET("district_code = #{record.districtCode,jdbcType=INTEGER}");
        sql.SET("hospital_id = #{record.hospitalId,jdbcType=VARCHAR}");
        sql.SET("province_code = #{record.provinceCode,jdbcType=INTEGER}");
        sql.SET("updated_by = #{record.updatedBy,jdbcType=VARCHAR}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("real_name_identification_status = #{record.realNameIdentificationStatus,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("is_identify = #{record.isIdentify,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("modify_time = #{record.modifyTime,jdbcType=TIMESTAMP}");
        sql.SET("is_test = #{record.isTest,jdbcType=BIT}");
        sql.SET("is_virtual = #{record.isVirtual,jdbcType=BIT}");
        
        UserInfoExample example = (UserInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("b_user");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneNo() != null) {
            sql.SET("phone_no = #{phoneNo,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadImg() != null) {
            sql.SET("head_img = #{headImg,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=INTEGER}");
        }
        
        if (record.getIdCardNo() != null) {
            sql.SET("id_card_no = #{idCardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRole() != null) {
            sql.SET("role = #{role,jdbcType=INTEGER}");
        }
        
        if (record.getRegisterTime() != null) {
            sql.SET("register_time = #{registerTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getArea() != null) {
            sql.SET("area = #{area,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.SET("city_code = #{cityCode,jdbcType=INTEGER}");
        }
        
        if (record.getCreatedBy() != null) {
            sql.SET("created_by = #{createdBy,jdbcType=VARCHAR}");
        }
        
        if (record.getDistrictCode() != null) {
            sql.SET("district_code = #{districtCode,jdbcType=INTEGER}");
        }
        
        if (record.getHospitalId() != null) {
            sql.SET("hospital_id = #{hospitalId,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceCode() != null) {
            sql.SET("province_code = #{provinceCode,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedBy() != null) {
            sql.SET("updated_by = #{updatedBy,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{version,jdbcType=BIGINT}");
        }
        
        if (record.getRealNameIdentificationStatus() != null) {
            sql.SET("real_name_identification_status = #{realNameIdentificationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getIsIdentify() != null) {
            sql.SET("is_identify = #{isIdentify,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getModifyTime() != null) {
            sql.SET("modify_time = #{modifyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsTest() != null) {
            sql.SET("is_test = #{isTest,jdbcType=BIT}");
        }
        
        if (record.getIsVirtual() != null) {
            sql.SET("is_virtual = #{isVirtual,jdbcType=BIT}");
        }
        
        if (record.getFeatures() != null) {
            sql.SET("features = #{features,jdbcType=LONGVARBINARY}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserInfoExample example, boolean includeExamplePhrase) {
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