package vo;

public class LikesVO {
    private int postNo;
    private String nName;

    public LikesVO(int postNo, String nName, int likes) {
        this.postNo = postNo;
        this.nName = nName;
    }

    public LikesVO() {}

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

}
