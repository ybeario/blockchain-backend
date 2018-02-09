package com.ybear.blockchain.dao.model;

import java.util.Date;

public class BookInfo {
    private Long id;

    private String relatedUserId;

    private String bookName;

    private String bookAuthor;

    private Boolean originalAuthor;

    private String bookTranslator;

    private String bookPrice;

    private String vol;

    private String wordNum;

    private String packStyle;

    private String bookIsbn;

    private String buyAddress;

    private String bookBrief;

    private Boolean onShelf;

    private Date publishedTime;

    private Date updatedTime;

    private Date createdTime;

    private String pageNum;

    private Long version;

    private String bookCover;

    private String publishingHouse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRelatedUserId() {
        return relatedUserId;
    }

    public void setRelatedUserId(String relatedUserId) {
        this.relatedUserId = relatedUserId == null ? null : relatedUserId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public Boolean getOriginalAuthor() {
        return originalAuthor;
    }

    public void setOriginalAuthor(Boolean originalAuthor) {
        this.originalAuthor = originalAuthor;
    }

    public String getBookTranslator() {
        return bookTranslator;
    }

    public void setBookTranslator(String bookTranslator) {
        this.bookTranslator = bookTranslator == null ? null : bookTranslator.trim();
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice == null ? null : bookPrice.trim();
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol == null ? null : vol.trim();
    }

    public String getWordNum() {
        return wordNum;
    }

    public void setWordNum(String wordNum) {
        this.wordNum = wordNum == null ? null : wordNum.trim();
    }

    public String getPackStyle() {
        return packStyle;
    }

    public void setPackStyle(String packStyle) {
        this.packStyle = packStyle == null ? null : packStyle.trim();
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn == null ? null : bookIsbn.trim();
    }

    public String getBuyAddress() {
        return buyAddress;
    }

    public void setBuyAddress(String buyAddress) {
        this.buyAddress = buyAddress == null ? null : buyAddress.trim();
    }

    public String getBookBrief() {
        return bookBrief;
    }

    public void setBookBrief(String bookBrief) {
        this.bookBrief = bookBrief == null ? null : bookBrief.trim();
    }

    public Boolean getOnShelf() {
        return onShelf;
    }

    public void setOnShelf(Boolean onShelf) {
        this.onShelf = onShelf;
    }

    public Date getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum == null ? null : pageNum.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover == null ? null : bookCover.trim();
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse == null ? null : publishingHouse.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BookInfo other = (BookInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRelatedUserId() == null ? other.getRelatedUserId() == null : this.getRelatedUserId().equals(other.getRelatedUserId()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookAuthor() == null ? other.getBookAuthor() == null : this.getBookAuthor().equals(other.getBookAuthor()))
            && (this.getOriginalAuthor() == null ? other.getOriginalAuthor() == null : this.getOriginalAuthor().equals(other.getOriginalAuthor()))
            && (this.getBookTranslator() == null ? other.getBookTranslator() == null : this.getBookTranslator().equals(other.getBookTranslator()))
            && (this.getBookPrice() == null ? other.getBookPrice() == null : this.getBookPrice().equals(other.getBookPrice()))
            && (this.getVol() == null ? other.getVol() == null : this.getVol().equals(other.getVol()))
            && (this.getWordNum() == null ? other.getWordNum() == null : this.getWordNum().equals(other.getWordNum()))
            && (this.getPackStyle() == null ? other.getPackStyle() == null : this.getPackStyle().equals(other.getPackStyle()))
            && (this.getBookIsbn() == null ? other.getBookIsbn() == null : this.getBookIsbn().equals(other.getBookIsbn()))
            && (this.getBuyAddress() == null ? other.getBuyAddress() == null : this.getBuyAddress().equals(other.getBuyAddress()))
            && (this.getBookBrief() == null ? other.getBookBrief() == null : this.getBookBrief().equals(other.getBookBrief()))
            && (this.getOnShelf() == null ? other.getOnShelf() == null : this.getOnShelf().equals(other.getOnShelf()))
            && (this.getPublishedTime() == null ? other.getPublishedTime() == null : this.getPublishedTime().equals(other.getPublishedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getPageNum() == null ? other.getPageNum() == null : this.getPageNum().equals(other.getPageNum()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getBookCover() == null ? other.getBookCover() == null : this.getBookCover().equals(other.getBookCover()))
            && (this.getPublishingHouse() == null ? other.getPublishingHouse() == null : this.getPublishingHouse().equals(other.getPublishingHouse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRelatedUserId() == null) ? 0 : getRelatedUserId().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookAuthor() == null) ? 0 : getBookAuthor().hashCode());
        result = prime * result + ((getOriginalAuthor() == null) ? 0 : getOriginalAuthor().hashCode());
        result = prime * result + ((getBookTranslator() == null) ? 0 : getBookTranslator().hashCode());
        result = prime * result + ((getBookPrice() == null) ? 0 : getBookPrice().hashCode());
        result = prime * result + ((getVol() == null) ? 0 : getVol().hashCode());
        result = prime * result + ((getWordNum() == null) ? 0 : getWordNum().hashCode());
        result = prime * result + ((getPackStyle() == null) ? 0 : getPackStyle().hashCode());
        result = prime * result + ((getBookIsbn() == null) ? 0 : getBookIsbn().hashCode());
        result = prime * result + ((getBuyAddress() == null) ? 0 : getBuyAddress().hashCode());
        result = prime * result + ((getBookBrief() == null) ? 0 : getBookBrief().hashCode());
        result = prime * result + ((getOnShelf() == null) ? 0 : getOnShelf().hashCode());
        result = prime * result + ((getPublishedTime() == null) ? 0 : getPublishedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getPageNum() == null) ? 0 : getPageNum().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getBookCover() == null) ? 0 : getBookCover().hashCode());
        result = prime * result + ((getPublishingHouse() == null) ? 0 : getPublishingHouse().hashCode());
        return result;
    }
}