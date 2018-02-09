package com.ybear.blockchain.dao.model;

public class BookInfoWithBLOBs extends BookInfo {
    private String bookDetail;

    private String imgs;

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail == null ? null : bookDetail.trim();
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
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
        BookInfoWithBLOBs other = (BookInfoWithBLOBs) that;
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
            && (this.getPublishingHouse() == null ? other.getPublishingHouse() == null : this.getPublishingHouse().equals(other.getPublishingHouse()))
            && (this.getBookDetail() == null ? other.getBookDetail() == null : this.getBookDetail().equals(other.getBookDetail()))
            && (this.getImgs() == null ? other.getImgs() == null : this.getImgs().equals(other.getImgs()));
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
        result = prime * result + ((getBookDetail() == null) ? 0 : getBookDetail().hashCode());
        result = prime * result + ((getImgs() == null) ? 0 : getImgs().hashCode());
        return result;
    }
}