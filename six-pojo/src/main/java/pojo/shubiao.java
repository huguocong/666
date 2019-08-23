package pojo;

public class shubiao {

    private  Integer id;
    private   Integer yuan;
    private  Integer xian;

    public shubiao(){
        super();
    }

    public shubiao(Integer id, Integer yuan, Integer xian) {
        this.id = id;
        this.yuan = yuan;
        this.xian = xian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYuan() {
        return yuan;
    }

    public void setYuan(Integer yuan) {
        this.yuan = yuan;
    }

    public Integer getXian() {
        return xian;
    }

    public void setXian(Integer xian) {
        this.xian = xian;
    }


}
