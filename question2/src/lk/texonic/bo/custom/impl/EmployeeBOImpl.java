package lk.texonic.bo.custom.impl;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 1:03 AM

 */

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.texonic.bo.custom.EmployeeBO;
import lk.texonic.dao.DAOFactory;
import lk.texonic.dao.custom.EmployeeDAO;
import lk.texonic.dto.EmployeeDTO;
import lk.texonic.entity.Employee;

import java.sql.Date;
import java.sql.SQLException;

public class EmployeeBOImpl implements EmployeeBO {
    EmployeeDAO employeeDAO=(EmployeeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    @Override
    public boolean addEmployee(EmployeeDTO employee) throws ClassNotFoundException, SQLException {
        return employeeDAO.add(new Employee(employee.getEmpID(),employee.getFullName(),employee.getDateOfJoining(),employee.isManager(),employee.getDesignation()));

    }

    @Override
    public boolean deleteEmployee(String id) throws ClassNotFoundException, SQLException {
        return employeeDAO.delete(id);
    }

    @Override
    public boolean updateCashier(EmployeeDTO employee) throws ClassNotFoundException, SQLException {
        return employeeDAO.update(new Employee(employee.getEmpID(),employee.getFullName(),employee.getDateOfJoining(),employee.isManager(),employee.getDesignation()));
    }

    @Override
    public EmployeeDTO searchCashier(String id) throws ClassNotFoundException, SQLException {
        Employee search=employeeDAO.search(id);
        return new EmployeeDTO(search.getEmpID(),search.getFullName(), (Date) search.getDateOfJoining(),search.isManager(),search.getDesignation());
    }

    @Override
    public ObservableList<EmployeeDTO> getAllEmployee() throws ClassNotFoundException, SQLException {
        ObservableList<Employee> all=employeeDAO.getAll();
        ObservableList<EmployeeDTO> allEmployee= FXCollections.observableArrayList();
        for (Employee ID: all){
            EmployeeDTO dto=new EmployeeDTO(ID.getEmpID(),ID.getFullName(),ID.getDateOfJoining(),ID.isManager(),ID.getDesignation());
            allEmployee.add(dto);
        }
        return allEmployee;
    }

    @Override
    public int getRowCount() throws ClassNotFoundException, SQLException {
        return employeeDAO.getRawCount();
    }
}
