package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.RealNameApply;
import com.ybear.blockchain.dao.model.RealNameApplyExample.Criteria;
import com.ybear.blockchain.dao.model.RealNameApplyExample.Criterion;
import com.ybear.blockchain.dao.model.RealNameApplyExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RealNameApplySqlProvider {

    public String countByExample(RealNameApplyExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("real_name_apply");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RealNameApplyExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("real_name_apply");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RealNameApply record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("real_name_apply");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getApplyTime() != null) {
            sql.VALUES("apply_time", "#{applyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuditResult() != null) {
            sql.VALUES("audit_result", "#{auditResult,jdbcType=BIT}");
        }
        
        if (record.getAuditTime() != null) {
            sql.VALUES("audit_time", "#{auditTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIdcardImgs() != null) {
            sql.VALUES("idcard_imgs", "#{idcardImgs,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardNo() != null) {
            sql.VALUES("idcard_no", "#{idcardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRejectReason() != null) {
            sql.VALUES("reject_reason", "#{rejectReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RealNameApplyExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("apply_time");
        sql.SELECT("audit_result");
        sql.SELECT("audit_time");
        sql.SELECT("idcard_imgs");
        sql.SELECT("idcard_no");
        sql.SELECT("name");
        sql.SELECT("operator_id");
        sql.SELECT("reject_reason");
        sql.SELECT("user_id");
        sql.FROM("real_name_apply");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RealNameApply record = (RealNameApply) parameter.get("record");
        RealNameApplyExample example = (RealNameApplyExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("real_name_apply");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getApplyTime() != null) {
            sql.SET("apply_time = #{record.applyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuditResult() != null) {
            sql.SET("audit_result = #{record.auditResult,jdbcType=BIT}");
        }
        
        if (record.getAuditTime() != null) {
            sql.SET("audit_time = #{record.auditTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIdcardImgs() != null) {
            sql.SET("idcard_imgs = #{record.idcardImgs,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardNo() != null) {
            sql.SET("idcard_no = #{record.idcardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{record.operatorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRejectReason() != null) {
            sql.SET("reject_reason = #{record.rejectReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("real_name_apply");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("apply_time = #{record.applyTime,jdbcType=TIMESTAMP}");
        sql.SET("audit_result = #{record.auditResult,jdbcType=BIT}");
        sql.SET("audit_time = #{record.auditTime,jdbcType=TIMESTAMP}");
        sql.SET("idcard_imgs = #{record.idcardImgs,jdbcType=VARCHAR}");
        sql.SET("idcard_no = #{record.idcardNo,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("operator_id = #{record.operatorId,jdbcType=VARCHAR}");
        sql.SET("reject_reason = #{record.rejectReason,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        
        RealNameApplyExample example = (RealNameApplyExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(RealNameApply record) {
        SQL sql = new SQL();
        sql.UPDATE("real_name_apply");
        
        if (record.getApplyTime() != null) {
            sql.SET("apply_time = #{applyTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAuditResult() != null) {
            sql.SET("audit_result = #{auditResult,jdbcType=BIT}");
        }
        
        if (record.getAuditTime() != null) {
            sql.SET("audit_time = #{auditTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIdcardImgs() != null) {
            sql.SET("idcard_imgs = #{idcardImgs,jdbcType=VARCHAR}");
        }
        
        if (record.getIdcardNo() != null) {
            sql.SET("idcard_no = #{idcardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=VARCHAR}");
        }
        
        if (record.getRejectReason() != null) {
            sql.SET("reject_reason = #{rejectReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RealNameApplyExample example, boolean includeExamplePhrase) {
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