package com.three360.test;

import com.three360.ui.common.IFixAtdlUi;
import com.three360.ui.fx8.FxFixAtdlUi;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.io.File;
import java.net.URL;


// TODO log on debug mode
public class FxTestApp extends Application {

    public final Logger logger = Logger.getLogger(FixAtdlGeneratorManualTestApp.class);

    private Spinner<Double> doubleSpinner = new Spinner<>();


    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(getTestBaseScene());
        primaryStage.setTitle("FX8 Atdl Generator Test Interface");
        primaryStage.show();
    }

    private Scene getTestBaseScene() {
        HBox hBox = new HBox();
        doubleSpinner.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<>(FXCollections.observableArrayList(0.0, 0.1)));
        hBox.getChildren().add(doubleSpinner);
        Scene scene = new Scene(hBox, 500, 500);
        return scene;
    }


    public static void main(String[] args) throws Exception {
        launch(args);

    }
}
