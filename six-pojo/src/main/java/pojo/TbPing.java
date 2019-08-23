package pojo;

import java.util.Date;

public class TbPing {
    private Integer id;

    private String ping;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping == null ? null : ping.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}