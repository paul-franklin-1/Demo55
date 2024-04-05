
import com.sun.prism.Graphics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import java.util.Random;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class LemonadeStand extends Application {
    int colorIntA;
    int colorIntB;
    int colorIntC;
    public void start(Stage firstStage){
        GridPane lemonGrid = new GridPane();
        Stage lemonStage = new Stage();
        Scene lemonScene = new Scene(lemonGrid, 500, 250);
        lemonStage.setScene(lemonScene);
        lemonStage.setTitle("Suburban Lemonade Stand");
        Button dateBttn = new Button("Show Current Date");
        Button dwnldBttn = new Button("Download as text file");
        Button randColorBttn = new Button("Random Color");
        Button quitBttn = new Button("Quit Program");
        lemonGrid.add(dateBttn, 0, 0);
        lemonGrid.add(dwnldBttn, 1, 0);
        lemonGrid.add(randColorBttn, 2, 0);
        lemonGrid.add(quitBttn, 3, 0);
        lemonGrid.setHgap(14);
        lemonGrid.setVgap(18);

        Random rand = new Random();

        colorIntA = rand.nextInt(256);
        colorIntB = rand.nextInt(256);
        colorIntC = rand.nextInt(256);
        Color randoColor = Color.rgb(colorIntA, colorIntB, colorIntC);
        lemonScene.setFill(randoColor);

        lemonStage.show(); }
    public static void main(final String[] args) {
        launch(args); }

}
