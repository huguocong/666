package pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String text;

    private Integer yingfu;

    private Integer shifu;

    private Integer result;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Integer getYingfu() {
        return yingfu;
    }

    public void setYingfu(Integer yingfu) {
        this.yingfu = yingfu;
    }

    public Integer getShifu() {
        return shifu;
    }

    public void setShifu(Integer shifu) {
        this.shifu = shifu;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", yingfu=" + yingfu +
                ", shifu=" + shifu +
                ", result=" + result +
                ", date=" + date +
                '}';
    }
}