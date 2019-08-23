package pojo;

import java.util.Date;

public class TbTema {
    private Integer id;

    private Integer tema;

    private String xiao;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTema() {
        return tema;
    }

    public void setTema(Integer tema) {
        this.tema = tema;
    }

    public String getXiao() {
        return xiao;
    }

    public void setXiao(String xiao) {
        this.xiao = xiao == null ? null : xiao.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TbTema{" +
                "id=" + id +
                ", tema=" + tema +
                ", xiao='" + xiao + '\'' +
                ", date=" + date +
                '}';
    }
}