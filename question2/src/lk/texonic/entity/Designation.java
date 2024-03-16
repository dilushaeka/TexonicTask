package lk.texonic.entity;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 10:27 PM

 */

public class Designation {
    private int desID;
    private String name;
    private String remark;



    public Designation() {
    }

    public Designation(String name, String remark) {
        this.desID = desID;
        this.name = name;
        this.remark = remark;
    }

    public int getDesID() {
        return desID;
    }

    public void setDesID(int desID) {
        this.desID = desID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Designation{" +
                "desID=" + desID +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
