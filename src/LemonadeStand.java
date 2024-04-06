
import com.sun.prism.Graphics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.Random;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
public static class LemonadeStand extends Application {
    int colorIntA;
    int colorIntB;
    int colorIntC;
    public void start(Stage lemonStage){
        BorderPane lemonRoot = new BorderPane();
        Scene lemonScene = new Scene(lemonRoot, 850,500);
        lemonStage.setScene(lemonScene);
        lemonStage.show();}}

        /*GridPane lemonGrid = new GridPane();
        lemonGrid.setPrefSize(1200, 850);
        Stage lemonStage = new Stage();
        lemonStage.setWidth(1200);
        lemonStage.setHeight(850);
        lemonStage.setTitle("Suburban Lemonade Stand");
        Button dateBttn = new Button("Show Current Date");
        Button dwnldBttn = new Button("Download as text file");
        Button randColorBttn = new Button("Random Color");
        Button quitBttn = new Button("Quit Program");
        lemonGrid.setHgap(14);
        lemonGrid.setVgap(18);
        Random rand = new Random();
        Pane lemonPane = new Pane();
        lemonPane.setPrefSize(500,400);
        lemonPane.getChildren().add(dateBttn);
        lemonPane.getChildren().add(dwnldBttn);
        lemonPane.getChildren().add(randColorBttn);
        lemonPane.getChildren().add(quitBttn);
        Scene lemonScene = new Scene(lemonPane, 700, 400);
        colorIntA = rand.nextInt(256);
        colorIntB = rand.nextInt(256);
        colorIntC = rand.nextInt(256);
        Color randoColor = Color.rgb(colorIntA, colorIntB, colorIntC);
        lemonScene.setFill(randoColor);
        lemonStage.setScene(lemonScene);
        lemonStage.show(); }*/
    public static void main(final String[] args) {
        launch(args); }

}
