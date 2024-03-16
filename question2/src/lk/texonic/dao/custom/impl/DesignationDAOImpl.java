package lk.texonic.dao.custom.impl;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 12:44 AM

 */

import javafx.collections.ObservableList;
import lk.texonic.dao.CrudUtil;
import lk.texonic.dao.custom.DesignationDAO;
import lk.texonic.entity.Designation;

import java.sql.SQLException;

public class DesignationDAOImpl implements DesignationDAO {

    @Override
    public boolean add(Designation ID) throws ClassNotFoundException, SQLException {
        String sql = "insert into designation values(?,?,?)";
        return CrudUtil.executeUpdate(sql, ID.getDesID(),ID.getName(),ID.getRemark());

    }

    @Override
    public boolean delete(String ID) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public boolean update(Designation ID) throws ClassNotFoundException, SQLException {
        return false;
    }

    @Override
    public Designation search(String ID) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public ObservableList<Designation> getAll() throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public String getDesignationLastId() throws Exception {
        return null;
    }

    @Override
    public int getRowCount() throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public Cashier validate(String userName) throws SQLException, ClassNotFoundException {
        return null;
    }
}
