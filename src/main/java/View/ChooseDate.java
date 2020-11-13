/*
File name: 
Short description: 
IST 261 Assignment: 
@author: Andrew Hallett
date: 
 */


package View;
import java.util.Locale;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ChooseDate extends Application {

    //Creating stage variable
    private Stage dateStage;
    //Creating DatePicker variable
    private DatePicker chooseDate;

    @Override
    public void start(Stage dateStage) {
        this.dateStage = dateStage;
        //Creating title on top of window 
        dateStage.setTitle("This will help you choose your date");
        dateInterface();
        //Showing the window
        dateStage.show();
    }

    private void dateInterface() {
        //Creating Vbox -- places nodes on top of one another in the scene
        VBox dateVbox = new VBox(500);
        dateVbox.setStyle("-fx-padding: 50");
        //Setting size of scene
        Scene dateScene = new Scene(dateVbox, 650, 275);
        dateStage.setScene(dateScene);

        chooseDate = new DatePicker();

        //Creating new gridpane
        GridPane datePane = new GridPane();
        //Setting horizontal gap
        datePane.setHgap(10);
        //Setting vertical gap
        datePane.setVgap(10);

        //Label in the window -- telling user to select date
        Label dateLabel = new Label("Select the date that you would like to schedule an event.");
        datePane.add(dateLabel, 0, 0);
        dateLabel.setFont(new Font("Impact", 15));

        //Positoning 
        GridPane.setHalignment(dateLabel, HPos.CENTER);
        datePane.add(chooseDate, 0, 1);
        dateVbox.getChildren().add(datePane);

        //Creaing label for asking about event
        Label confirmLabel = new Label("Confirm that this is the correct date please.");
        datePane.add(confirmLabel, 0, 4);
        confirmLabel.setFont(new Font("Impact", 15));

        //Creating new label for asking about event
        Label correctDateLabel = new Label("Is this the date you want to schedule an event for?");
        datePane.add(correctDateLabel, 0, 5);
        correctDateLabel.setFont(new Font("Impact", 15));

        //Creating button that will be used for yes (confirming date)
        Button yesButton = new Button("Yes");
        //Changing the piositioning of the Yes Button
        datePane.add(yesButton, 6, 6);
        //Changing font of button
        yesButton.setFont(new Font("Imapct", 15));
        yesButton.setStyle("-fx-font-weight: bold;");
        //Changing the color of the Yes Button
        yesButton.setStyle("-fx-background-color: #008000");

        //Creaing button that will be used for no (will ask user to choose the correct date -- later on)
        Button noButton = new Button("No");
        //Changing the piositioning of the No button 
        datePane.add(noButton, 8, 6);
        //Changing font of button 
        noButton.setFont(new Font("Imapct", 15));
        noButton.setStyle("-fx-font-weight: bold;");
        //Changing the color of the No Button
        noButton.setStyle("-fx-background-color: #FF0000");

    }
    
    public DatePicker getChooseDate() {
        return chooseDate;
    }
 
    
    public static void main(String[] args) {
    launch(args);
    }
}