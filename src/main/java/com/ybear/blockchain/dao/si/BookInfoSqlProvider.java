package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.BookInfoExample.Criteria;
import com.ybear.blockchain.dao.model.BookInfoExample.Criterion;
import com.ybear.blockchain.dao.model.BookInfoExample;
import com.ybear.blockchain.dao.model.BookInfoWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BookInfoSqlProvider {

    public String countByExample(BookInfoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("b_books");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(BookInfoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("b_books");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(BookInfoWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("b_books");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getRelatedUserId() != null) {
            sql.VALUES("related_user_id", "#{relatedUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getBookName() != null) {
            sql.VALUES("book_name", "#{bookName,jdbcType=VARCHAR}");
        }
        
        if (record.getBookAuthor() != null) {
            sql.VALUES("book_author", "#{bookAuthor,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalAuthor() != null) {
            sql.VALUES("original_author", "#{originalAuthor,jdbcType=BIT}");
        }
        
        if (record.getBookTranslator() != null) {
            sql.VALUES("book_translator", "#{bookTranslator,jdbcType=VARCHAR}");
        }
        
        if (record.getBookPrice() != null) {
            sql.VALUES("book_price", "#{bookPrice,jdbcType=VARCHAR}");
        }
        
        if (record.getVol() != null) {
            sql.VALUES("vol", "#{vol,jdbcType=VARCHAR}");
        }
        
        if (record.getWordNum() != null) {
            sql.VALUES("word_num", "#{wordNum,jdbcType=VARCHAR}");
        }
        
        if (record.getPackStyle() != null) {
            sql.VALUES("pack_style", "#{packStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getBookIsbn() != null) {
            sql.VALUES("book_isbn", "#{bookIsbn,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyAddress() != null) {
            sql.VALUES("buy_address", "#{buyAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getBookBrief() != null) {
            sql.VALUES("book_brief", "#{bookBrief,jdbcType=VARCHAR}");
        }
        
        if (record.getOnShelf() != null) {
            sql.VALUES("on_shelf", "#{onShelf,jdbcType=BIT}");
        }
        
        if (record.getPublishedTime() != null) {
            sql.VALUES("published_time", "#{publishedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.VALUES("updated_time", "#{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.VALUES("created_time", "#{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPageNum() != null) {
            sql.VALUES("page_num", "#{pageNum,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=BIGINT}");
        }
        
        if (record.getBookCover() != null) {
            sql.VALUES("book_cover", "#{bookCover,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishingHouse() != null) {
            sql.VALUES("publishing_house", "#{publishingHouse,jdbcType=VARCHAR}");
        }
        
        if (record.getBookDetail() != null) {
            sql.VALUES("book_detail", "#{bookDetail,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getImgs() != null) {
            sql.VALUES("imgs", "#{imgs,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(BookInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("related_user_id");
        sql.SELECT("book_name");
        sql.SELECT("book_author");
        sql.SELECT("original_author");
        sql.SELECT("book_translator");
        sql.SELECT("book_price");
        sql.SELECT("vol");
        sql.SELECT("word_num");
        sql.SELECT("pack_style");
        sql.SELECT("book_isbn");
        sql.SELECT("buy_address");
        sql.SELECT("book_brief");
        sql.SELECT("on_shelf");
        sql.SELECT("published_time");
        sql.SELECT("updated_time");
        sql.SELECT("created_time");
        sql.SELECT("page_num");
        sql.SELECT("version");
        sql.SELECT("book_cover");
        sql.SELECT("publishing_house");
        sql.SELECT("book_detail");
        sql.SELECT("imgs");
        sql.FROM("b_books");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(BookInfoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("related_user_id");
        sql.SELECT("book_name");
        sql.SELECT("book_author");
        sql.SELECT("original_author");
        sql.SELECT("book_translator");
        sql.SELECT("book_price");
        sql.SELECT("vol");
        sql.SELECT("word_num");
        sql.SELECT("pack_style");
        sql.SELECT("book_isbn");
        sql.SELECT("buy_address");
        sql.SELECT("book_brief");
        sql.SELECT("on_shelf");
        sql.SELECT("published_time");
        sql.SELECT("updated_time");
        sql.SELECT("created_time");
        sql.SELECT("page_num");
        sql.SELECT("version");
        sql.SELECT("book_cover");
        sql.SELECT("publishing_house");
        sql.FROM("b_books");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        BookInfoWithBLOBs record = (BookInfoWithBLOBs) parameter.get("record");
        BookInfoExample example = (BookInfoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("b_books");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getRelatedUserId() != null) {
            sql.SET("related_user_id = #{record.relatedUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getBookName() != null) {
            sql.SET("book_name = #{record.bookName,jdbcType=VARCHAR}");
        }
        
        if (record.getBookAuthor() != null) {
            sql.SET("book_author = #{record.bookAuthor,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalAuthor() != null) {
            sql.SET("original_author = #{record.originalAuthor,jdbcType=BIT}");
        }
        
        if (record.getBookTranslator() != null) {
            sql.SET("book_translator = #{record.bookTranslator,jdbcType=VARCHAR}");
        }
        
        if (record.getBookPrice() != null) {
            sql.SET("book_price = #{record.bookPrice,jdbcType=VARCHAR}");
        }
        
        if (record.getVol() != null) {
            sql.SET("vol = #{record.vol,jdbcType=VARCHAR}");
        }
        
        if (record.getWordNum() != null) {
            sql.SET("word_num = #{record.wordNum,jdbcType=VARCHAR}");
        }
        
        if (record.getPackStyle() != null) {
            sql.SET("pack_style = #{record.packStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getBookIsbn() != null) {
            sql.SET("book_isbn = #{record.bookIsbn,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyAddress() != null) {
            sql.SET("buy_address = #{record.buyAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getBookBrief() != null) {
            sql.SET("book_brief = #{record.bookBrief,jdbcType=VARCHAR}");
        }
        
        if (record.getOnShelf() != null) {
            sql.SET("on_shelf = #{record.onShelf,jdbcType=BIT}");
        }
        
        if (record.getPublishedTime() != null) {
            sql.SET("published_time = #{record.publishedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPageNum() != null) {
            sql.SET("page_num = #{record.pageNum,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{record.version,jdbcType=BIGINT}");
        }
        
        if (record.getBookCover() != null) {
            sql.SET("book_cover = #{record.bookCover,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishingHouse() != null) {
            sql.SET("publishing_house = #{record.publishingHouse,jdbcType=VARCHAR}");
        }
        
        if (record.getBookDetail() != null) {
            sql.SET("book_detail = #{record.bookDetail,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getImgs() != null) {
            sql.SET("imgs = #{record.imgs,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("b_books");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("related_user_id = #{record.relatedUserId,jdbcType=VARCHAR}");
        sql.SET("book_name = #{record.bookName,jdbcType=VARCHAR}");
        sql.SET("book_author = #{record.bookAuthor,jdbcType=VARCHAR}");
        sql.SET("original_author = #{record.originalAuthor,jdbcType=BIT}");
        sql.SET("book_translator = #{record.bookTranslator,jdbcType=VARCHAR}");
        sql.SET("book_price = #{record.bookPrice,jdbcType=VARCHAR}");
        sql.SET("vol = #{record.vol,jdbcType=VARCHAR}");
        sql.SET("word_num = #{record.wordNum,jdbcType=VARCHAR}");
        sql.SET("pack_style = #{record.packStyle,jdbcType=VARCHAR}");
        sql.SET("book_isbn = #{record.bookIsbn,jdbcType=VARCHAR}");
        sql.SET("buy_address = #{record.buyAddress,jdbcType=VARCHAR}");
        sql.SET("book_brief = #{record.bookBrief,jdbcType=VARCHAR}");
        sql.SET("on_shelf = #{record.onShelf,jdbcType=BIT}");
        sql.SET("published_time = #{record.publishedTime,jdbcType=TIMESTAMP}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        sql.SET("page_num = #{record.pageNum,jdbcType=VARCHAR}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("book_cover = #{record.bookCover,jdbcType=VARCHAR}");
        sql.SET("publishing_house = #{record.publishingHouse,jdbcType=VARCHAR}");
        sql.SET("book_detail = #{record.bookDetail,jdbcType=LONGVARCHAR}");
        sql.SET("imgs = #{record.imgs,jdbcType=LONGVARCHAR}");
        
        BookInfoExample example = (BookInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("b_books");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("related_user_id = #{record.relatedUserId,jdbcType=VARCHAR}");
        sql.SET("book_name = #{record.bookName,jdbcType=VARCHAR}");
        sql.SET("book_author = #{record.bookAuthor,jdbcType=VARCHAR}");
        sql.SET("original_author = #{record.originalAuthor,jdbcType=BIT}");
        sql.SET("book_translator = #{record.bookTranslator,jdbcType=VARCHAR}");
        sql.SET("book_price = #{record.bookPrice,jdbcType=VARCHAR}");
        sql.SET("vol = #{record.vol,jdbcType=VARCHAR}");
        sql.SET("word_num = #{record.wordNum,jdbcType=VARCHAR}");
        sql.SET("pack_style = #{record.packStyle,jdbcType=VARCHAR}");
        sql.SET("book_isbn = #{record.bookIsbn,jdbcType=VARCHAR}");
        sql.SET("buy_address = #{record.buyAddress,jdbcType=VARCHAR}");
        sql.SET("book_brief = #{record.bookBrief,jdbcType=VARCHAR}");
        sql.SET("on_shelf = #{record.onShelf,jdbcType=BIT}");
        sql.SET("published_time = #{record.publishedTime,jdbcType=TIMESTAMP}");
        sql.SET("updated_time = #{record.updatedTime,jdbcType=TIMESTAMP}");
        sql.SET("created_time = #{record.createdTime,jdbcType=TIMESTAMP}");
        sql.SET("page_num = #{record.pageNum,jdbcType=VARCHAR}");
        sql.SET("version = #{record.version,jdbcType=BIGINT}");
        sql.SET("book_cover = #{record.bookCover,jdbcType=VARCHAR}");
        sql.SET("publishing_house = #{record.publishingHouse,jdbcType=VARCHAR}");
        
        BookInfoExample example = (BookInfoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(BookInfoWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("b_books");
        
        if (record.getRelatedUserId() != null) {
            sql.SET("related_user_id = #{relatedUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getBookName() != null) {
            sql.SET("book_name = #{bookName,jdbcType=VARCHAR}");
        }
        
        if (record.getBookAuthor() != null) {
            sql.SET("book_author = #{bookAuthor,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalAuthor() != null) {
            sql.SET("original_author = #{originalAuthor,jdbcType=BIT}");
        }
        
        if (record.getBookTranslator() != null) {
            sql.SET("book_translator = #{bookTranslator,jdbcType=VARCHAR}");
        }
        
        if (record.getBookPrice() != null) {
            sql.SET("book_price = #{bookPrice,jdbcType=VARCHAR}");
        }
        
        if (record.getVol() != null) {
            sql.SET("vol = #{vol,jdbcType=VARCHAR}");
        }
        
        if (record.getWordNum() != null) {
            sql.SET("word_num = #{wordNum,jdbcType=VARCHAR}");
        }
        
        if (record.getPackStyle() != null) {
            sql.SET("pack_style = #{packStyle,jdbcType=VARCHAR}");
        }
        
        if (record.getBookIsbn() != null) {
            sql.SET("book_isbn = #{bookIsbn,jdbcType=VARCHAR}");
        }
        
        if (record.getBuyAddress() != null) {
            sql.SET("buy_address = #{buyAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getBookBrief() != null) {
            sql.SET("book_brief = #{bookBrief,jdbcType=VARCHAR}");
        }
        
        if (record.getOnShelf() != null) {
            sql.SET("on_shelf = #{onShelf,jdbcType=BIT}");
        }
        
        if (record.getPublishedTime() != null) {
            sql.SET("published_time = #{publishedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            sql.SET("updated_time = #{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedTime() != null) {
            sql.SET("created_time = #{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPageNum() != null) {
            sql.SET("page_num = #{pageNum,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{version,jdbcType=BIGINT}");
        }
        
        if (record.getBookCover() != null) {
            sql.SET("book_cover = #{bookCover,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishingHouse() != null) {
            sql.SET("publishing_house = #{publishingHouse,jdbcType=VARCHAR}");
        }
        
        if (record.getBookDetail() != null) {
            sql.SET("book_detail = #{bookDetail,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getImgs() != null) {
            sql.SET("imgs = #{imgs,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, BookInfoExample example, boolean includeExamplePhrase) {
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