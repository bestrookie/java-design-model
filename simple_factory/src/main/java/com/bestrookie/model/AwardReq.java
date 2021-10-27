package main.java.com.bestrookie.model;

/**
 * @author bestrookie
 * @date 2021/10/27 2:10 下午
 */
public class AwardReq {
    private Integer id;
    private String userName;
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public AwardReq(Integer id, String userName, Integer type) {
        this.id = id;
        this.userName = userName;
        this.type = type;
    }

    public AwardReq() {
    }
}
