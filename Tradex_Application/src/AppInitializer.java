/*
 *
 *  * ---------------------------------------------------------------------------------------------
 *  *   Copyright (c) 2021. DR Corporation. All rights reserved.
 *  *   Licensed under the MIT License. See License.txt in the project root for license information
 *  *  --------------------------------------------------------------------------------------------
 *
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Dilshan Rajika Withanachchi <dilshanrajitha1998@gmail.com>
 * @Time :9:19 AM
 * @Date :2021-10-09/Oct
 * @Project Name :Tradex_Application
 */
public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("lk/ijse/demo/view/Main.fxml"))));
        /*  primaryStage.initStyle(StageStyle.UNDECORATED);*/
        primaryStage.setTitle("Tradex International Pvt(Ltd)");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();

        primaryStage.show();
    }
}
