import javafx.application.Application;
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
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import static javafx.scene.layout.TilePane.setAlignment;

public class LemonadeStand extends Application {
    int colorIntA;
    int colorIntB;
    int colorIntC;
    int colorStop = 0;
    public void start(Stage lemonStage){
        BorderPane lemonRoot = new BorderPane();
        Scene lemonScene = new Scene(lemonRoot, 1200,800);
        lemonStage.setScene(lemonScene);
        lemonStage.setTitle("Chicago Lemonade Stand");
        Button dateBttn = new Button("View Today's Date");
        dateBttn.setFont(new Font("Arial", 30));
        Button dwnldBttn = new Button("Download as Text File");
        dwnldBttn.setFont(new Font("Arial", 30));
        Button randColorBttn = new Button("Set Random Color");
        randColorBttn.setFont(new Font("Arial", 30));
        Button quitBttn = new Button("Quit Program");
        quitBttn.setFont(new Font("Arial", 30));
        Label lemonLabel = new Label(null);
        setAlignment(lemonLabel, javafx.geometry.Pos.CENTER);
        lemonRoot.setCenter(lemonLabel);
        lemonLabel.setFont(new Font("Impact", 40));
        HBox lemonHBox = new HBox();
        lemonHBox.getChildren().addAll(dateBttn, dwnldBttn, randColorBttn, quitBttn);
        lemonRoot.setTop(lemonHBox);
        lemonHBox.setAlignment(Pos. CENTER);
        TextField lemonTextField = new TextField("Enter text here for download file:");
        setAlignment(lemonTextField, javafx.geometry.Pos.CENTER);
        lemonRoot.setBottom(lemonTextField);
        lemonTextField.setFont(new Font("Georgia", 40));
        dateBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Date lemonDateTime = new Date();
                lemonLabel.setText(String.format("The current date and time is %s.",lemonDateTime));

            }});

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
                    JOptionPane.showMessageDialog(null,"Error downloading file");

                }
            }});
        randColorBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                while (colorStop==0){
                Random lemonRand = new Random();
                colorIntA = lemonRand.nextInt(256);
                colorIntB = lemonRand.nextInt(256);
                colorIntC = lemonRand.nextInt(256);
                lemonRoot.setBackground(new Background(new BackgroundFill(Color.rgb(colorIntA, colorIntB, colorIntC), CornerRadii.EMPTY, Insets.EMPTY)));
                colorStop++;
};}});

        quitBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                javafx.application.Platform.exit();
            }});
        lemonStage.show();}

        /*GridPane lemonGrid = new GridPane();
        lemonGrid.setPrefSize(1200, 850);


        ///// Random rand = new Random();
        /////Scene lemonScene = new Scene(lemonPane, 700, 400);
        /////colorIntA = rand.nextInt(256);
        /////colorIntB = rand.nextInt(256);
       ///// colorIntC = rand.nextInt(256);
       ///// Color randoColor = Color.rgb(colorIntA, colorIntB, colorIntC);
       ///// lemonScene.setFill(randoColor);
*/
    public static void main(final String[] args) {
        launch(args); }

}
