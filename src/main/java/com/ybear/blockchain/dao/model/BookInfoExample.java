package com.ybear.blockchain.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdIsNull() {
            addCriterion("related_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdIsNotNull() {
            addCriterion("related_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdEqualTo(String value) {
            addCriterion("related_user_id =", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdNotEqualTo(String value) {
            addCriterion("related_user_id <>", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdGreaterThan(String value) {
            addCriterion("related_user_id >", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("related_user_id >=", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdLessThan(String value) {
            addCriterion("related_user_id <", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdLessThanOrEqualTo(String value) {
            addCriterion("related_user_id <=", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdLike(String value) {
            addCriterion("related_user_id like", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdNotLike(String value) {
            addCriterion("related_user_id not like", value, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdIn(List<String> values) {
            addCriterion("related_user_id in", values, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdNotIn(List<String> values) {
            addCriterion("related_user_id not in", values, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdBetween(String value1, String value2) {
            addCriterion("related_user_id between", value1, value2, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andRelatedUserIdNotBetween(String value1, String value2) {
            addCriterion("related_user_id not between", value1, value2, "relatedUserId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorIsNull() {
            addCriterion("original_author is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorIsNotNull() {
            addCriterion("original_author is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorEqualTo(Boolean value) {
            addCriterion("original_author =", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotEqualTo(Boolean value) {
            addCriterion("original_author <>", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorGreaterThan(Boolean value) {
            addCriterion("original_author >", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("original_author >=", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorLessThan(Boolean value) {
            addCriterion("original_author <", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorLessThanOrEqualTo(Boolean value) {
            addCriterion("original_author <=", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorIn(List<Boolean> values) {
            addCriterion("original_author in", values, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotIn(List<Boolean> values) {
            addCriterion("original_author not in", values, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorBetween(Boolean value1, Boolean value2) {
            addCriterion("original_author between", value1, value2, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("original_author not between", value1, value2, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorIsNull() {
            addCriterion("book_translator is null");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorIsNotNull() {
            addCriterion("book_translator is not null");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorEqualTo(String value) {
            addCriterion("book_translator =", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorNotEqualTo(String value) {
            addCriterion("book_translator <>", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorGreaterThan(String value) {
            addCriterion("book_translator >", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorGreaterThanOrEqualTo(String value) {
            addCriterion("book_translator >=", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorLessThan(String value) {
            addCriterion("book_translator <", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorLessThanOrEqualTo(String value) {
            addCriterion("book_translator <=", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorLike(String value) {
            addCriterion("book_translator like", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorNotLike(String value) {
            addCriterion("book_translator not like", value, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorIn(List<String> values) {
            addCriterion("book_translator in", values, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorNotIn(List<String> values) {
            addCriterion("book_translator not in", values, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorBetween(String value1, String value2) {
            addCriterion("book_translator between", value1, value2, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookTranslatorNotBetween(String value1, String value2) {
            addCriterion("book_translator not between", value1, value2, "bookTranslator");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(String value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(String value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(String value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(String value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(String value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(String value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLike(String value) {
            addCriterion("book_price like", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotLike(String value) {
            addCriterion("book_price not like", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<String> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<String> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(String value1, String value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(String value1, String value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andVolIsNull() {
            addCriterion("vol is null");
            return (Criteria) this;
        }

        public Criteria andVolIsNotNull() {
            addCriterion("vol is not null");
            return (Criteria) this;
        }

        public Criteria andVolEqualTo(String value) {
            addCriterion("vol =", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotEqualTo(String value) {
            addCriterion("vol <>", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolGreaterThan(String value) {
            addCriterion("vol >", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolGreaterThanOrEqualTo(String value) {
            addCriterion("vol >=", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLessThan(String value) {
            addCriterion("vol <", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLessThanOrEqualTo(String value) {
            addCriterion("vol <=", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolLike(String value) {
            addCriterion("vol like", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotLike(String value) {
            addCriterion("vol not like", value, "vol");
            return (Criteria) this;
        }

        public Criteria andVolIn(List<String> values) {
            addCriterion("vol in", values, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotIn(List<String> values) {
            addCriterion("vol not in", values, "vol");
            return (Criteria) this;
        }

        public Criteria andVolBetween(String value1, String value2) {
            addCriterion("vol between", value1, value2, "vol");
            return (Criteria) this;
        }

        public Criteria andVolNotBetween(String value1, String value2) {
            addCriterion("vol not between", value1, value2, "vol");
            return (Criteria) this;
        }

        public Criteria andWordNumIsNull() {
            addCriterion("word_num is null");
            return (Criteria) this;
        }

        public Criteria andWordNumIsNotNull() {
            addCriterion("word_num is not null");
            return (Criteria) this;
        }

        public Criteria andWordNumEqualTo(String value) {
            addCriterion("word_num =", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumNotEqualTo(String value) {
            addCriterion("word_num <>", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumGreaterThan(String value) {
            addCriterion("word_num >", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumGreaterThanOrEqualTo(String value) {
            addCriterion("word_num >=", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumLessThan(String value) {
            addCriterion("word_num <", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumLessThanOrEqualTo(String value) {
            addCriterion("word_num <=", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumLike(String value) {
            addCriterion("word_num like", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumNotLike(String value) {
            addCriterion("word_num not like", value, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumIn(List<String> values) {
            addCriterion("word_num in", values, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumNotIn(List<String> values) {
            addCriterion("word_num not in", values, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumBetween(String value1, String value2) {
            addCriterion("word_num between", value1, value2, "wordNum");
            return (Criteria) this;
        }

        public Criteria andWordNumNotBetween(String value1, String value2) {
            addCriterion("word_num not between", value1, value2, "wordNum");
            return (Criteria) this;
        }

        public Criteria andPackStyleIsNull() {
            addCriterion("pack_style is null");
            return (Criteria) this;
        }

        public Criteria andPackStyleIsNotNull() {
            addCriterion("pack_style is not null");
            return (Criteria) this;
        }

        public Criteria andPackStyleEqualTo(String value) {
            addCriterion("pack_style =", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleNotEqualTo(String value) {
            addCriterion("pack_style <>", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleGreaterThan(String value) {
            addCriterion("pack_style >", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleGreaterThanOrEqualTo(String value) {
            addCriterion("pack_style >=", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleLessThan(String value) {
            addCriterion("pack_style <", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleLessThanOrEqualTo(String value) {
            addCriterion("pack_style <=", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleLike(String value) {
            addCriterion("pack_style like", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleNotLike(String value) {
            addCriterion("pack_style not like", value, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleIn(List<String> values) {
            addCriterion("pack_style in", values, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleNotIn(List<String> values) {
            addCriterion("pack_style not in", values, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleBetween(String value1, String value2) {
            addCriterion("pack_style between", value1, value2, "packStyle");
            return (Criteria) this;
        }

        public Criteria andPackStyleNotBetween(String value1, String value2) {
            addCriterion("pack_style not between", value1, value2, "packStyle");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNull() {
            addCriterion("book_isbn is null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIsNotNull() {
            addCriterion("book_isbn is not null");
            return (Criteria) this;
        }

        public Criteria andBookIsbnEqualTo(String value) {
            addCriterion("book_isbn =", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotEqualTo(String value) {
            addCriterion("book_isbn <>", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThan(String value) {
            addCriterion("book_isbn >", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("book_isbn >=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThan(String value) {
            addCriterion("book_isbn <", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLessThanOrEqualTo(String value) {
            addCriterion("book_isbn <=", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnLike(String value) {
            addCriterion("book_isbn like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotLike(String value) {
            addCriterion("book_isbn not like", value, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnIn(List<String> values) {
            addCriterion("book_isbn in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotIn(List<String> values) {
            addCriterion("book_isbn not in", values, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnBetween(String value1, String value2) {
            addCriterion("book_isbn between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBookIsbnNotBetween(String value1, String value2) {
            addCriterion("book_isbn not between", value1, value2, "bookIsbn");
            return (Criteria) this;
        }

        public Criteria andBuyAddressIsNull() {
            addCriterion("buy_address is null");
            return (Criteria) this;
        }

        public Criteria andBuyAddressIsNotNull() {
            addCriterion("buy_address is not null");
            return (Criteria) this;
        }

        public Criteria andBuyAddressEqualTo(String value) {
            addCriterion("buy_address =", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressNotEqualTo(String value) {
            addCriterion("buy_address <>", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressGreaterThan(String value) {
            addCriterion("buy_address >", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("buy_address >=", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressLessThan(String value) {
            addCriterion("buy_address <", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressLessThanOrEqualTo(String value) {
            addCriterion("buy_address <=", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressLike(String value) {
            addCriterion("buy_address like", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressNotLike(String value) {
            addCriterion("buy_address not like", value, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressIn(List<String> values) {
            addCriterion("buy_address in", values, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressNotIn(List<String> values) {
            addCriterion("buy_address not in", values, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressBetween(String value1, String value2) {
            addCriterion("buy_address between", value1, value2, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBuyAddressNotBetween(String value1, String value2) {
            addCriterion("buy_address not between", value1, value2, "buyAddress");
            return (Criteria) this;
        }

        public Criteria andBookBriefIsNull() {
            addCriterion("book_brief is null");
            return (Criteria) this;
        }

        public Criteria andBookBriefIsNotNull() {
            addCriterion("book_brief is not null");
            return (Criteria) this;
        }

        public Criteria andBookBriefEqualTo(String value) {
            addCriterion("book_brief =", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotEqualTo(String value) {
            addCriterion("book_brief <>", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefGreaterThan(String value) {
            addCriterion("book_brief >", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefGreaterThanOrEqualTo(String value) {
            addCriterion("book_brief >=", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefLessThan(String value) {
            addCriterion("book_brief <", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefLessThanOrEqualTo(String value) {
            addCriterion("book_brief <=", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefLike(String value) {
            addCriterion("book_brief like", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotLike(String value) {
            addCriterion("book_brief not like", value, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefIn(List<String> values) {
            addCriterion("book_brief in", values, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotIn(List<String> values) {
            addCriterion("book_brief not in", values, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefBetween(String value1, String value2) {
            addCriterion("book_brief between", value1, value2, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andBookBriefNotBetween(String value1, String value2) {
            addCriterion("book_brief not between", value1, value2, "bookBrief");
            return (Criteria) this;
        }

        public Criteria andOnShelfIsNull() {
            addCriterion("on_shelf is null");
            return (Criteria) this;
        }

        public Criteria andOnShelfIsNotNull() {
            addCriterion("on_shelf is not null");
            return (Criteria) this;
        }

        public Criteria andOnShelfEqualTo(Boolean value) {
            addCriterion("on_shelf =", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfNotEqualTo(Boolean value) {
            addCriterion("on_shelf <>", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfGreaterThan(Boolean value) {
            addCriterion("on_shelf >", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfGreaterThanOrEqualTo(Boolean value) {
            addCriterion("on_shelf >=", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfLessThan(Boolean value) {
            addCriterion("on_shelf <", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfLessThanOrEqualTo(Boolean value) {
            addCriterion("on_shelf <=", value, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfIn(List<Boolean> values) {
            addCriterion("on_shelf in", values, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfNotIn(List<Boolean> values) {
            addCriterion("on_shelf not in", values, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfBetween(Boolean value1, Boolean value2) {
            addCriterion("on_shelf between", value1, value2, "onShelf");
            return (Criteria) this;
        }

        public Criteria andOnShelfNotBetween(Boolean value1, Boolean value2) {
            addCriterion("on_shelf not between", value1, value2, "onShelf");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIsNull() {
            addCriterion("published_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIsNotNull() {
            addCriterion("published_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeEqualTo(Date value) {
            addCriterion("published_time =", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotEqualTo(Date value) {
            addCriterion("published_time <>", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeGreaterThan(Date value) {
            addCriterion("published_time >", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("published_time >=", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLessThan(Date value) {
            addCriterion("published_time <", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeLessThanOrEqualTo(Date value) {
            addCriterion("published_time <=", value, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeIn(List<Date> values) {
            addCriterion("published_time in", values, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotIn(List<Date> values) {
            addCriterion("published_time not in", values, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeBetween(Date value1, Date value2) {
            addCriterion("published_time between", value1, value2, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andPublishedTimeNotBetween(Date value1, Date value2) {
            addCriterion("published_time not between", value1, value2, "publishedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andPageNumIsNull() {
            addCriterion("page_num is null");
            return (Criteria) this;
        }

        public Criteria andPageNumIsNotNull() {
            addCriterion("page_num is not null");
            return (Criteria) this;
        }

        public Criteria andPageNumEqualTo(String value) {
            addCriterion("page_num =", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotEqualTo(String value) {
            addCriterion("page_num <>", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThan(String value) {
            addCriterion("page_num >", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumGreaterThanOrEqualTo(String value) {
            addCriterion("page_num >=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThan(String value) {
            addCriterion("page_num <", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLessThanOrEqualTo(String value) {
            addCriterion("page_num <=", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumLike(String value) {
            addCriterion("page_num like", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotLike(String value) {
            addCriterion("page_num not like", value, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumIn(List<String> values) {
            addCriterion("page_num in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotIn(List<String> values) {
            addCriterion("page_num not in", values, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumBetween(String value1, String value2) {
            addCriterion("page_num between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andPageNumNotBetween(String value1, String value2) {
            addCriterion("page_num not between", value1, value2, "pageNum");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andBookCoverIsNull() {
            addCriterion("book_cover is null");
            return (Criteria) this;
        }

        public Criteria andBookCoverIsNotNull() {
            addCriterion("book_cover is not null");
            return (Criteria) this;
        }

        public Criteria andBookCoverEqualTo(String value) {
            addCriterion("book_cover =", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverNotEqualTo(String value) {
            addCriterion("book_cover <>", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverGreaterThan(String value) {
            addCriterion("book_cover >", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverGreaterThanOrEqualTo(String value) {
            addCriterion("book_cover >=", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverLessThan(String value) {
            addCriterion("book_cover <", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverLessThanOrEqualTo(String value) {
            addCriterion("book_cover <=", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverLike(String value) {
            addCriterion("book_cover like", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverNotLike(String value) {
            addCriterion("book_cover not like", value, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverIn(List<String> values) {
            addCriterion("book_cover in", values, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverNotIn(List<String> values) {
            addCriterion("book_cover not in", values, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverBetween(String value1, String value2) {
            addCriterion("book_cover between", value1, value2, "bookCover");
            return (Criteria) this;
        }

        public Criteria andBookCoverNotBetween(String value1, String value2) {
            addCriterion("book_cover not between", value1, value2, "bookCover");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIsNull() {
            addCriterion("publishing_house is null");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIsNotNull() {
            addCriterion("publishing_house is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseEqualTo(String value) {
            addCriterion("publishing_house =", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotEqualTo(String value) {
            addCriterion("publishing_house <>", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseGreaterThan(String value) {
            addCriterion("publishing_house >", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseGreaterThanOrEqualTo(String value) {
            addCriterion("publishing_house >=", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLessThan(String value) {
            addCriterion("publishing_house <", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLessThanOrEqualTo(String value) {
            addCriterion("publishing_house <=", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseLike(String value) {
            addCriterion("publishing_house like", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotLike(String value) {
            addCriterion("publishing_house not like", value, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseIn(List<String> values) {
            addCriterion("publishing_house in", values, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotIn(List<String> values) {
            addCriterion("publishing_house not in", values, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseBetween(String value1, String value2) {
            addCriterion("publishing_house between", value1, value2, "publishingHouse");
            return (Criteria) this;
        }

        public Criteria andPublishingHouseNotBetween(String value1, String value2) {
            addCriterion("publishing_house not between", value1, value2, "publishingHouse");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}