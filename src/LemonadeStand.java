import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class LemonadeStand extends Application {
    int colorIntA;
    int colorIntB;
    int colorIntC;
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
        HBox lemonHBox = new HBox();
        lemonHBox.getChildren().addAll(dateBttn, dwnldBttn, randColorBttn, quitBttn);
        lemonRoot.setTop(lemonHBox);
        lemonHBox.setAlignment(Pos. CENTER);
        dateBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("the date is 3/22/1888");
            }});

        dwnldBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               System.out.println("download complete ya jackass");
            }});
        randColorBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("a color a color colr!");}});

        quitBttn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Program is not quitting, be patient...");
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
