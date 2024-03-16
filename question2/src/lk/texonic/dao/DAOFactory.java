package lk.texonic.dao;

import lk.texonic.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() { }
    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory(); }
        return daoFactory; }
    public SuperDAO getDAO(DAOTypes Types) {
        switch (Types) {
            case EMPLOYEE:
                return new EmployeeDAOImpl();
            case DESIGNATION:
                return new DesignationDAOImpl();

            default:
                return null; } }
    public enum DAOTypes {
        EMPLOYEE, DESIGNATION,
    }
}