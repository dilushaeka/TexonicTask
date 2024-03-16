package lk.texonic.bo.custom.impl;/*
 * @Author  dilus
 * @Project question2
 * @Created 16/03/2024 - 9:36 AM

 */

import lk.texonic.bo.custom.DesignationBO;
import lk.texonic.dao.DAOFactory;
import lk.texonic.dao.custom.DesignationDAO;
import lk.texonic.dto.DesignationDTO;
import lk.texonic.entity.Designation;
import lk.texonic.entity.Employee;

import java.sql.SQLException;

public class DesignationBOImpl implements DesignationBO {

    DesignationDAO designationDAO=(DesignationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DESIGNATION);

    @Override
    public boolean addDesignation(DesignationDTO designation) throws ClassNotFoundException, SQLException {
        String gettinId= String.valueOf(designation.getDesID());
        return designationDAO.add(new Designation(gettinId, designation.getName()),designation.getRemark());
    }
}
