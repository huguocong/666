package pojo;

import java.util.Date;

public class TbYonghu {
    private Integer id;

    private String name;

    private String tema;

    private String pin;

    private String lianxiao;

    private Integer yingfu;

    private Integer shifu;

    private Integer beishu;

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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema == null ? null : tema.trim();
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin == null ? null : pin.trim();
    }

    public String getLianxiao() {
        return lianxiao;
    }

    public void setLianxiao(String lianxiao) {
        this.lianxiao = lianxiao == null ? null : lianxiao.trim();
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

    public Integer getBeishu() {
        return beishu;
    }

    public void setBeishu(Integer beishu) {
        this.beishu = beishu;
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
}