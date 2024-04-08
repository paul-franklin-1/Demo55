import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import static javafx.scene.layout.TilePane.setAlignment;

public class LemonadeStand extends Application {
    //colorIntGrn is integer representing green hue level in RGB color:
    int colorIntGrn;
    //colorStop is used for a while loop via incrementation:
    int colorStop = 0;
    public void start(Stage lemonStage){
        //setting the fundamentals: Stage, Scene, Layout Manager
        BorderPane lemonRoot = new BorderPane();
        Scene lemonScene = new Scene(lemonRoot, 1200,800);
        lemonStage.setScene(lemonScene);
        lemonStage.setTitle("Chicago Lemonade Stand");

        //create buttons and set their text size and text font
        Button dateBttn = new Button("View Today's Date");
        dateBttn.setFont(new Font("Arial", 30));
        Button dwnldBttn = new Button("Download as Text File");
        dwnldBttn.setFont(new Font("Arial", 30));
        Button randColorBttn = new Button("Set Random Color");
        randColorBttn.setFont(new Font("Arial", 30));
        Button quitBttn = new Button("Quit Program");
        quitBttn.setFont(new Font("Arial", 30));

        //create and position a label, set text size and text font
        Label lemonLabel = new Label(null);
        setAlignment(lemonLabel, Pos.CENTER);
        lemonRoot.setCenter(lemonLabel);
        lemonLabel.setFont(new Font("Impact", 40));

        //group and position all buttons
        HBox lemonHBox = new HBox();
        lemonHBox.getChildren().addAll(dateBttn, dwnldBttn, randColorBttn, quitBttn);
        lemonRoot.setTop(lemonHBox);
        lemonHBox.setAlignment(Pos. CENTER);

        //create and position text field, set text size and text font
        TextField lemonTextField = new TextField("Enter text here for download file:");
        setAlignment(lemonTextField, Pos.CENTER);
        lemonRoot.setBottom(lemonTextField);
        lemonTextField.setFont(new Font("Georgia", 40));

        //display date and time in borderpane
        dateBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Date lemonDateTime = new Date();
                lemonLabel.setText(String.format("The current date and time is %s.",lemonDateTime));}});

        //download file containing contents of text field
        dwnldBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String content = lemonTextField.getText();
                try {
                    FileWriter writer = new FileWriter("log.txt");
                    writer.write(content);
                    writer.close();
                    JOptionPane.showMessageDialog(null, "File downloaded successfully!");
                }catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Error downloading file");}}});

        //set random green hue to borderpane
        randColorBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                while (colorStop==0){
                Random lemonRand = new Random();
                colorIntGrn = lemonRand.nextInt(256);
                lemonRoot.setBackground(new Background(new BackgroundFill(Color.rgb(0, colorIntGrn, 0), CornerRadii.EMPTY, Insets.EMPTY)));
                colorStop++;};}};

        //quit program
        quitBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit();}});

        //display and actuate borderpane
        lemonStage.show();}
    public static void main(final String[] args) {
        launch(args); }

}
