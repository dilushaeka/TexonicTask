package lk.texonic.bo.custom;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 10:33 AM

 */

import lk.texonic.bo.SuperBO;
import lk.texonic.dto.DesignationDTO;
import lk.texonic.dto.EmployeeDTO;

import java.sql.SQLException;

public interface DesignationBO extends SuperBO {
    boolean addDesignation(DesignationDTO employee)throws ClassNotFoundException, SQLException;
}
