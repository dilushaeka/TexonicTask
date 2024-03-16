package lk.texonic.dto;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 1:08 AM

 */

import sun.util.calendar.LocalGregorianCalendar;

import java.time.LocalDate;
import java.sql.Date;

public class EmployeeDTO {
    private int empID;
    private String fullName;

    private Date dateOfJoining;
    private boolean isManager;
    private String designation;

    public EmployeeDTO(int empID, String fullName, Date dateOfJoining, boolean isManager, String designation) {
        this.empID = empID;
        this.fullName = fullName;
        this.dateOfJoining=dateOfJoining;
        this.isManager = isManager;
        this.designation=designation;
    }


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empID=" + empID +
                ", fullName='" + fullName + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", isManager=" + isManager +
                ", designation='" + designation + '\'' +
                '}';
    }
}
