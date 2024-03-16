package lk.texonic.dao.custom;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 12:37 AM

 */

import lk.texonic.dao.CrudDAO;
import lk.texonic.entity.Employee;

import java.sql.SQLException;

public interface EmployeeDAO extends CrudDAO<Employee,String> {
    String getEmployeeLastId()throws Exception;

    int getRawCount()throws ClassNotFoundException, SQLException;

    Employee validate(String userName)throws SQLException,ClassNotFoundException;
}
