package com.three360.test;

import com.three360.ui.common.IFixAtdlUi;
import com.three360.ui.fx8.FxFixAtdlUi;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class FixAtdlGeneratorManualTestApp extends Application {

    public final Logger logger = Logger.getLogger(FixAtdlGeneratorManualTestApp.class);

    private FileChooser fileChooser;
    private Button selectAltdButton, buttonOK, buttonCancel;
    private Text selectedFilePath;
    private IFixAtdlUi<Pane> paneIFixAtdlUi = new FxFixAtdlUi();

    private BorderPane borderPane;

    {
        this.fileChooser = new FileChooser();
        this.fileChooser.setTitle("Select Atdl file");
        this.fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Xml file", "*.xml"));
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(getTestBaseScene(primaryStage));
        primaryStage.setTitle("FX8 Atdl Generator Test Interface");
        primaryStage.show();
    }

    private Scene getTestBaseScene(final Stage stage) {
        this.borderPane = new BorderPane();
        HBox hBoxTop = new HBox(50);
        hBoxTop.setAlignment(Pos.CENTER);
        hBoxTop.getStyleClass().add("hbox");
        hBoxTop.setId("hbox-custom");
        this.selectAltdButton = new Button();
        this.selectAltdButton.setText("Select ALDT file");
        this.selectAltdButton.setOnAction(event -> {
            File file = fileChooser.showOpenDialog(stage);
            if (file != null) {
                this.selectedFilePath.setText(file.getAbsolutePath());
                this.paneIFixAtdlUi.parseFixAtdlFile(file);
                borderPane.setCenter(this.paneIFixAtdlUi.createUi());
            }
        });
        hBoxTop.getChildren().add(selectAltdButton);

        this.selectedFilePath = new Text();
        this.selectedFilePath.setText("No file is Selected");
        hBoxTop.getChildren().add(this.selectedFilePath);
        borderPane.setTop(hBoxTop);

        HBox hBoxDown = new HBox();
        this.buttonOK = new Button("Ok");
        this.buttonOK.setOnAction(event -> {
        });
        this.buttonCancel = new Button("Cancel");
        this.buttonCancel.setOnAction(event -> {
            Platform.exit();
        });
        hBoxDown.getChildren().addAll(this.buttonOK, this.buttonCancel);
        hBoxDown.setAlignment(Pos.CENTER);
        hBoxDown.getStyleClass().add("hbox");
        hBoxDown.setId("hbox-custom");
        borderPane.setBottom(hBoxDown);
        Scene scene = new Scene(borderPane, 500, 500);
        URL url = this.getClass().getResource("/fx8atdl4jtesterapp.css");
        scene.getStylesheets().add(url.toExternalForm());
        return scene;
    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }
}
