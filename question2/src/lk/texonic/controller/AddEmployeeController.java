package lk.texonic.controller;/*
 * @Author  dilus
 * @Project question2
 * @Created 15/03/2024 - 9:31 PM

 */

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import lk.texonic.bo.custom.EmployeeBO;
import lk.texonic.bo.custom.impl.EmployeeBOImpl;
import lk.texonic.dto.EmployeeDTO;
import tray.animations.AnimationType;
import tray.notification.NotificationType;
import tray.notification.TrayNotification;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import java.util.Locale;

public class AddEmployeeController {
    
    public Pane context;
    public JFXTextField txtEmpID;
    public JFXTextField txtDes;
    public JFXTextField txtEmpName;
    public JFXDatePicker txtDateOfJoin;
    public JFXCheckBox checkManager;
    public ComboBox<String> cmbDesignation;
    EmployeeBO employeeBO = new EmployeeBOImpl();
    public void addOnAction(ActionEvent actionEvent) throws IOException {

        int employeeId = Integer.parseInt(txtEmpID.getText());
        String employeeName = txtEmpName.getText();
        Date date= Date.valueOf(txtDateOfJoin.getValue());
        boolean employeeManager = checkManager.isSelected();
        String employeeDesig = cmbDesignation.getValue();


            try {
                boolean isAdded= employeeBO.addEmployee(new EmployeeDTO(
                        employeeId,employeeName,date,employeeManager,employeeDesig));
                String tilte;
                String message;
                TrayNotification tray = new TrayNotification();
                AnimationType type = AnimationType.POPUP;
                tray.setAnimationType(type);
                if (isAdded) {
                    (new Alert(Alert.AlertType.CONFIRMATION, "Employee Added Successfully", new ButtonType[]{ButtonType.OK})).show();
                    tilte = "Added Successful";
                    message = "Customer Is Added";
                    tray.setTitle(tilte);
                    tray.setMessage(message);
                    tray.setNotificationType(NotificationType.SUCCESS);


                } else {
                    (new Alert(Alert.AlertType.ERROR, "Customer Not Added ", new ButtonType[]{ButtonType.OK})).show();
                    tilte = "Added Un Successful";
                    message = "Customer Is Not Added";
                    tray.setTitle(tilte);
                    tray.setMessage(message);
                    tray.setNotificationType(NotificationType.ERROR);
                }
                tray.showAndDismiss(Duration.millis(3000));

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    public void searchOnAction(ActionEvent actionEvent) {
    }

    public void updateOnAction(ActionEvent actionEvent) {
    }

    public void deleteOnAction(ActionEvent actionEvent) {
    }
}
