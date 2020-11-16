/*
Author: Andrew Hallett
Project: Masin screen for 261 App
Prof: Dr.Yeh
Class: IST 261
Description:
 */


package View;
import java.awt.event.ActionEvent;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;



public class MainStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Setting title to main stage
        primaryStage.setTitle("Andrew Hallett IST 261 Time Managment Application");

        //Setting layout 
        FlowPane newFlow = new FlowPane();
        //Position of the buttons
        newFlow.setAlignment(Pos.CENTER);

        Scene startScene = new Scene(newFlow, 200, 100);

        //Adding buttons to main stage
        Button notesButton = new Button("NOTES");
        Button weekButton = new Button("WEEK");
        Button monthButton = new Button("MONTH");
        Button loginButton = new Button("LOGIN");
        Button exitButton = new Button("EXIT");

        //notesButton.setOnAction(eve -> new notesStage());
        //Adding the buttons
        newFlow.getChildren().add(notesButton);
        newFlow.getChildren().add(weekButton);
        newFlow.getChildren().add(monthButton);
        newFlow.getChildren().add(loginButton);
        newFlow.getChildren().add(exitButton);

        primaryStage.setScene(startScene);
        primaryStage.show();
        
        //Adding action to the exitButton button -- To close program
        exitButton.setOnAction(e -> Platform.exit());
  
    }
   

    //Creating class for the notes window
    class NotesStage {

    NotesStage() {

        //Making a new stage
        Stage notesStage = new Stage();
        notesStage.setTitle("This is the notes window");

        //Creating a new pane
        FlowPane notesPane = new FlowPane();
        notesPane.setAlignment(Pos.CENTER);

        //Setting size 
        Scene notesScene = new Scene(notesPane, 500, 300);

        
        notesPane.getChildren().add(new Button("Add"));
        notesStage.setScene(notesScene);
        notesStage.show();
    }
}
    public static void main(String[] args) {
    launch(args);
}
}
