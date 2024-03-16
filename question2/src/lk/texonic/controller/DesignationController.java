package lk.texonic.controller;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 9:31 PM

 */

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import lk.texonic.bo.custom.DesignationBO;
import lk.texonic.bo.custom.impl.DesignationBOImpl;
import lk.texonic.dto.DesignationDTO;

public class DesignationController {
    public JFXTextField txtDes;
    public JFXTextField txtEmpName;
    public TableView tblDesignation;
    public TableColumn colCashId;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colRemark;

    DesignationBO designationBO=new DesignationBOImpl();
    public void addOnAction(ActionEvent actionEvent) {
        try {
            boolean isAdded= designationBO.addDesignation(new DesignationDTO(
                    txtDes.getText(),
                    txtEmpName.getText()));
        }
    }

    public void tblCashierClick(MouseEvent mouseEvent) {
    }

    public void resetOnAction(ActionEvent actionEvent) {
    }
}
