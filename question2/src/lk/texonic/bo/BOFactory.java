package lk.texonic.bo;

import lk.texonic.bo.custom.EmployeeBO;
import lk.texonic.bo.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }
    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();

        }
        return boFactory;
    }
    public enum BOTypes {
        EMPLOYEE, DESIGNATION;
    }
    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case EMPLOYEE:
                return new EmployeeBOImpl();
//            case DESIGNATION:
//                return new DesignationBOImpl();

                }
        return null;
    }

    }