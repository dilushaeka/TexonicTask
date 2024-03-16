package lk.texonic.dao.custom;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 12:38 AM

 */

import lk.texonic.dao.CrudDAO;
import lk.texonic.entity.Designation;

import java.sql.SQLException;

public interface DesignationDAO extends CrudDAO<Designation,String> {
    String getDesignationLastId()throws Exception;
    int getRowCount()throws ClassNotFoundException, SQLException;
    Cashier validate(String userName) throws SQLException, ClassNotFoundException;
}
