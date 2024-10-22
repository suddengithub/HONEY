package vo;

import java.sql.Date;

public class CommentsVO {
    private int postNo;
    private String nName;
    private String content;
    private Date cDate;

    public CommentsVO(int postNo, String nName, String content) {
        this.postNo = postNo;
        this.nName = nName;
        this.content = content;
    }

    public CommentsVO() {}

    public int getPostNo() {
        return postNo;
    }

    public void setPostNo(int postNo) {
        this.postNo = postNo;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }
}
