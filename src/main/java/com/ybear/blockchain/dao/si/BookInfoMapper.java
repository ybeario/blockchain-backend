package com.ybear.blockchain.dao.si;

import com.ybear.blockchain.dao.model.BookInfo;
import com.ybear.blockchain.dao.model.BookInfoExample;
import com.ybear.blockchain.dao.model.BookInfoWithBLOBs;
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

public interface BookInfoMapper {
    @SelectProvider(type=BookInfoSqlProvider.class, method="countByExample")
    long countByExample(BookInfoExample example);

    @DeleteProvider(type=BookInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(BookInfoExample example);

    @Delete({
        "delete from b_books",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into b_books (id, related_user_id, ",
        "book_name, book_author, ",
        "original_author, book_translator, ",
        "book_price, vol, ",
        "word_num, pack_style, ",
        "book_isbn, buy_address, ",
        "book_brief, on_shelf, ",
        "published_time, updated_time, ",
        "created_time, page_num, ",
        "version, book_cover, ",
        "publishing_house, book_detail, ",
        "imgs)",
        "values (#{id,jdbcType=BIGINT}, #{relatedUserId,jdbcType=VARCHAR}, ",
        "#{bookName,jdbcType=VARCHAR}, #{bookAuthor,jdbcType=VARCHAR}, ",
        "#{originalAuthor,jdbcType=BIT}, #{bookTranslator,jdbcType=VARCHAR}, ",
        "#{bookPrice,jdbcType=VARCHAR}, #{vol,jdbcType=VARCHAR}, ",
        "#{wordNum,jdbcType=VARCHAR}, #{packStyle,jdbcType=VARCHAR}, ",
        "#{bookIsbn,jdbcType=VARCHAR}, #{buyAddress,jdbcType=VARCHAR}, ",
        "#{bookBrief,jdbcType=VARCHAR}, #{onShelf,jdbcType=BIT}, ",
        "#{publishedTime,jdbcType=TIMESTAMP}, #{updatedTime,jdbcType=TIMESTAMP}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{pageNum,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=BIGINT}, #{bookCover,jdbcType=VARCHAR}, ",
        "#{publishingHouse,jdbcType=VARCHAR}, #{bookDetail,jdbcType=LONGVARCHAR}, ",
        "#{imgs,jdbcType=LONGVARCHAR})"
    })
    int insert(BookInfoWithBLOBs record);

    @InsertProvider(type=BookInfoSqlProvider.class, method="insertSelective")
    int insertSelective(BookInfoWithBLOBs record);

    @SelectProvider(type=BookInfoSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="related_user_id", property="relatedUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_name", property="bookName", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_author", property="bookAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_author", property="originalAuthor", jdbcType=JdbcType.BIT),
        @Result(column="book_translator", property="bookTranslator", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_price", property="bookPrice", jdbcType=JdbcType.VARCHAR),
        @Result(column="vol", property="vol", jdbcType=JdbcType.VARCHAR),
        @Result(column="word_num", property="wordNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="pack_style", property="packStyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_isbn", property="bookIsbn", jdbcType=JdbcType.VARCHAR),
        @Result(column="buy_address", property="buyAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_brief", property="bookBrief", jdbcType=JdbcType.VARCHAR),
        @Result(column="on_shelf", property="onShelf", jdbcType=JdbcType.BIT),
        @Result(column="published_time", property="publishedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="page_num", property="pageNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="book_cover", property="bookCover", jdbcType=JdbcType.VARCHAR),
        @Result(column="publishing_house", property="publishingHouse", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_detail", property="bookDetail", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="imgs", property="imgs", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BookInfoWithBLOBs> selectByExampleWithBLOBs(BookInfoExample example);

    @SelectProvider(type=BookInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="related_user_id", property="relatedUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_name", property="bookName", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_author", property="bookAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_author", property="originalAuthor", jdbcType=JdbcType.BIT),
        @Result(column="book_translator", property="bookTranslator", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_price", property="bookPrice", jdbcType=JdbcType.VARCHAR),
        @Result(column="vol", property="vol", jdbcType=JdbcType.VARCHAR),
        @Result(column="word_num", property="wordNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="pack_style", property="packStyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_isbn", property="bookIsbn", jdbcType=JdbcType.VARCHAR),
        @Result(column="buy_address", property="buyAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_brief", property="bookBrief", jdbcType=JdbcType.VARCHAR),
        @Result(column="on_shelf", property="onShelf", jdbcType=JdbcType.BIT),
        @Result(column="published_time", property="publishedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="page_num", property="pageNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="book_cover", property="bookCover", jdbcType=JdbcType.VARCHAR),
        @Result(column="publishing_house", property="publishingHouse", jdbcType=JdbcType.VARCHAR)
    })
    List<BookInfo> selectByExample(BookInfoExample example);

    @Select({
        "select",
        "id, related_user_id, book_name, book_author, original_author, book_translator, ",
        "book_price, vol, word_num, pack_style, book_isbn, buy_address, book_brief, on_shelf, ",
        "published_time, updated_time, created_time, page_num, version, book_cover, publishing_house, ",
        "book_detail, imgs",
        "from b_books",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="related_user_id", property="relatedUserId", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_name", property="bookName", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_author", property="bookAuthor", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_author", property="originalAuthor", jdbcType=JdbcType.BIT),
        @Result(column="book_translator", property="bookTranslator", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_price", property="bookPrice", jdbcType=JdbcType.VARCHAR),
        @Result(column="vol", property="vol", jdbcType=JdbcType.VARCHAR),
        @Result(column="word_num", property="wordNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="pack_style", property="packStyle", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_isbn", property="bookIsbn", jdbcType=JdbcType.VARCHAR),
        @Result(column="buy_address", property="buyAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_brief", property="bookBrief", jdbcType=JdbcType.VARCHAR),
        @Result(column="on_shelf", property="onShelf", jdbcType=JdbcType.BIT),
        @Result(column="published_time", property="publishedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_time", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="page_num", property="pageNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.BIGINT),
        @Result(column="book_cover", property="bookCover", jdbcType=JdbcType.VARCHAR),
        @Result(column="publishing_house", property="publishingHouse", jdbcType=JdbcType.VARCHAR),
        @Result(column="book_detail", property="bookDetail", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="imgs", property="imgs", jdbcType=JdbcType.LONGVARCHAR)
    })
    BookInfoWithBLOBs selectByPrimaryKey(Long id);

    @UpdateProvider(type=BookInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BookInfoWithBLOBs record, @Param("example") BookInfoExample example);

    @UpdateProvider(type=BookInfoSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") BookInfoWithBLOBs record, @Param("example") BookInfoExample example);

    @UpdateProvider(type=BookInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BookInfo record, @Param("example") BookInfoExample example);

    @UpdateProvider(type=BookInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BookInfoWithBLOBs record);

    @Update({
        "update b_books",
        "set related_user_id = #{relatedUserId,jdbcType=VARCHAR},",
          "book_name = #{bookName,jdbcType=VARCHAR},",
          "book_author = #{bookAuthor,jdbcType=VARCHAR},",
          "original_author = #{originalAuthor,jdbcType=BIT},",
          "book_translator = #{bookTranslator,jdbcType=VARCHAR},",
          "book_price = #{bookPrice,jdbcType=VARCHAR},",
          "vol = #{vol,jdbcType=VARCHAR},",
          "word_num = #{wordNum,jdbcType=VARCHAR},",
          "pack_style = #{packStyle,jdbcType=VARCHAR},",
          "book_isbn = #{bookIsbn,jdbcType=VARCHAR},",
          "buy_address = #{buyAddress,jdbcType=VARCHAR},",
          "book_brief = #{bookBrief,jdbcType=VARCHAR},",
          "on_shelf = #{onShelf,jdbcType=BIT},",
          "published_time = #{publishedTime,jdbcType=TIMESTAMP},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "page_num = #{pageNum,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=BIGINT},",
          "book_cover = #{bookCover,jdbcType=VARCHAR},",
          "publishing_house = #{publishingHouse,jdbcType=VARCHAR},",
          "book_detail = #{bookDetail,jdbcType=LONGVARCHAR},",
          "imgs = #{imgs,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(BookInfoWithBLOBs record);

    @Update({
        "update b_books",
        "set related_user_id = #{relatedUserId,jdbcType=VARCHAR},",
          "book_name = #{bookName,jdbcType=VARCHAR},",
          "book_author = #{bookAuthor,jdbcType=VARCHAR},",
          "original_author = #{originalAuthor,jdbcType=BIT},",
          "book_translator = #{bookTranslator,jdbcType=VARCHAR},",
          "book_price = #{bookPrice,jdbcType=VARCHAR},",
          "vol = #{vol,jdbcType=VARCHAR},",
          "word_num = #{wordNum,jdbcType=VARCHAR},",
          "pack_style = #{packStyle,jdbcType=VARCHAR},",
          "book_isbn = #{bookIsbn,jdbcType=VARCHAR},",
          "buy_address = #{buyAddress,jdbcType=VARCHAR},",
          "book_brief = #{bookBrief,jdbcType=VARCHAR},",
          "on_shelf = #{onShelf,jdbcType=BIT},",
          "published_time = #{publishedTime,jdbcType=TIMESTAMP},",
          "updated_time = #{updatedTime,jdbcType=TIMESTAMP},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "page_num = #{pageNum,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=BIGINT},",
          "book_cover = #{bookCover,jdbcType=VARCHAR},",
          "publishing_house = #{publishingHouse,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(BookInfo record);
}