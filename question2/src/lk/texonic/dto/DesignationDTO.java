package lk.texonic.dto;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 1:09 AM

 */

public class DesignationDTO {
    private int desID;
    private String name;
    private String remark;

    @Override
    public String toString() {
        return "DestinationDTO{" +
                "desID=" + desID +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public DesignationDTO(int desID, String name, String remark) {
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
}
