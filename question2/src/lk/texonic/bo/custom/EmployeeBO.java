package lk.texonic.bo.custom;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 12:59 AM

 */

import javafx.collections.ObservableList;
import lk.texonic.bo.SuperBO;
import lk.texonic.dto.EmployeeDTO;

import java.sql.SQLException;

public interface EmployeeBO extends SuperBO {
    static EmployeeDTO getValidated(String text){return null;}

    boolean addEmployee(EmployeeDTO employee)throws ClassNotFoundException, SQLException;

    boolean deleteEmployee(String id)throws  ClassNotFoundException,SQLException;

    boolean updateCashier(EmployeeDTO employee) throws ClassNotFoundException, SQLException;

    EmployeeDTO searchCashier(String id) throws ClassNotFoundException, SQLException;

    ObservableList<EmployeeDTO> getAllEmployee() throws ClassNotFoundException, SQLException;

    int getRowCount()throws ClassNotFoundException,SQLException;
}
