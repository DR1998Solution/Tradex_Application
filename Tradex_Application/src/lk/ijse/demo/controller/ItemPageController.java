/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *   Copyright (c) 2021. DR Corporation. All rights reserved.
 *  *   Licensed under the MIT License. See License.txt in the project root for license information
 *  *  --------------------------------------------------------------------------------------------
 *
 */

package lk.ijse.demo.controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import lk.ijse.demo.dao.SaveCustomer;
import lk.ijse.demo.dao.SaveItem;

import java.io.IOException;

/**
 * @author Dilshan Rajika Withanachchi <dilshanrajitha1998@gmail.com>
 * @Time :8:58 AM
 * @Date :2021-10-09/Oct
 * @Project Name :Tradex_Application
 */
public class ItemPageController {
    public AnchorPane root;
    public TextField txtid;
    public TextField txtname;

    public void btnsaveOnAction(ActionEvent actionEvent) {
        SaveItem.saveItem(txtid.getText(),txtname.getText());
    }

    public void btnBackOnAction(ActionEvent actionEvent) {
        Parent root=null;
        try {
            root = FXMLLoader.load(this.getClass().getResource("/lk/ijse/demo/view/Main.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(root!=null){
            Scene scene=new Scene(root);
            Stage primaryStage = (Stage) this.root.getScene().getWindow();
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            TranslateTransition tt = new TranslateTransition(Duration.millis(500), scene.getRoot());
            tt.setFromX(-scene.getWidth());
            tt.setToX(0);
            tt.play();



        }
    }
}
