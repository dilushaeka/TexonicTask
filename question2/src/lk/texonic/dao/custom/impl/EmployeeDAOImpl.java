package lk.texonic.dao.custom.impl;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 12:44 AM

 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.texonic.dao.CrudUtil;
import lk.texonic.dao.custom.EmployeeDAO;
import lk.texonic.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public boolean add(Employee ID) throws ClassNotFoundException, SQLException {
        String sql = "insert into employee values(?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql, ID.getEmpID(), ID.getFullName(), ID.getDateOfJoining(), ID.isManager(), ID.getDesignation());

    }

    @Override
    public boolean delete(String ID) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM employee WHERE empID= ?";
        return CrudUtil.executeUpdate(sql, ID);
    }

    @Override
    public boolean update(Employee ID) throws ClassNotFoundException, SQLException {
        String sql = "update cashier set empFullName =?,empDateOfJoin=?,isManager=?,empDesignation=?";
        return CrudUtil.executeUpdate(sql, ID.getEmpID(), ID.getFullName(), ID.getDateOfJoining(), ID.isManager(), ID.getDesignation());
    }

    @Override
    public Employee search(String ID) throws ClassNotFoundException, SQLException {
        String sql = "select * from employee where empID=?";
        ResultSet rst = CrudUtil.executeQuery(sql, ID);
        if (rst.next()) {
            return new Employee(rst.getInt(1),rst.getString(2),rst.getDate(3),rst.getBoolean(4),rst.getString(5));
        }
        return null;
    }

    @Override
    public ObservableList<Employee> getAll() throws ClassNotFoundException, SQLException {
        String sql = "select * from employee";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ObservableList<Employee> allEmployee = FXCollections.observableArrayList();
        while (rst.next()) {
            allEmployee.add(new Employee(rst.getInt(1),rst.getString(2),rst.getDate(3),rst.getBoolean(4),rst.getString(5)));
        }
        return null;
    }

    @Override
    public String getEmployeeLastId() throws Exception {
        return null;
    }

    @Override
    public int getRawCount() throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public Employee validate(String userName) throws SQLException, ClassNotFoundException {
        return null;
    }
}
