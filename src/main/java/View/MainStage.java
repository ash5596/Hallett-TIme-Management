/*
Author: Andrew Hallett
Project: Hallett_Time_Management
Prof: Dr.Yeh
Class: IST 261 App Dev Studio
Description: This class is the home screen of the application
allows users to choose which screen they want to visit. 
 */
package View;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.SystemColor.window;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainStage extends Application {

    //Global Variables
    Stage window;
    Scene notesScene, weekScene, monthScene, loginScene, mainScene, scheduleScene;
    //Variables that are going to be used for week and month view scenes 
    //DOUBLE CHECK LATER IF THEY SHOULD BE PRIVATE VARIABLES OR FINAL OR NEITHER 
    private Locale locale = Locale.US;
    private Calendar userCal = new GregorianCalendar(locale);
    private DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);

    @Override
    public void start(Stage primaryStage) throws Exception {

        //
        window = primaryStage;
        //Setting layout 
        FlowPane newFlow = new FlowPane();
        //Position of the buttons
        newFlow.setAlignment(Pos.CENTER);

        Scene startScene = new Scene(newFlow, 400, 200);
        //Setting title to main stage
        primaryStage.setTitle("Andrew Hallett IST 261 Time Managment Application");

        //Adding buttons to main stage
        Button notesButton = new Button("NOTES");
        Button weekButton = new Button("WEEK");
        Button monthButton = new Button("MONTH");
        Button loginButton = new Button("LOGIN");
        Button exitButton = new Button("EXIT");
        Button scheduleButton = new Button("Schedule Event");

        //notesButton.setOnAction(eve -> new notesStage());
        //Adding the buttons
        newFlow.getChildren().add(notesButton);
        newFlow.getChildren().add(weekButton);
        newFlow.getChildren().add(monthButton);
        newFlow.getChildren().add(loginButton);
        newFlow.getChildren().add(exitButton);
        newFlow.getChildren().add(scheduleButton);
        
        //Changing the spacing of the buttons on the main screne 
        newFlow.setHgap(20);
        newFlow.setVgap(20);
        //Adding borders around the window for the main scene using css
        //NEED TO MAKE THE OUTLINE BORDER LARGER
        newFlow.setStyle("-fx-padding: 10;" + "-fx-border-style: solid;"
        + "-fx-border-width: 20;" + "-fx-border-insets: 5;"
        + "-fx-border-radius: 50;" + "-fx-border-color: blue;");
        //Making the scene be visible when the program is ran
        primaryStage.setScene(startScene);
        primaryStage.show();

        //Adding action to the exitButton button -- To close program
        exitButton.setOnAction(e -> Platform.exit());

        //Adding action to the notes buttonon main scene -- will open aux scene when clicked
        notesButton.setOnAction(e -> window.setScene(notesScene));

        //Creating a new layout for the notesScene when opened
        VBox notesBox = new VBox();
        notesBox.setPadding(new Insets(15));
        notesBox.setSpacing(10);

        Text notesTitle = new Text("Welcome To The Notes Section -- Type Imporant Notes Here!");
        notesBox.getChildren().add(notesTitle);
        notesTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        //PROJECT FAILS TO RUN WHEN THIS LINE OF CODE IS ADDED -- (UNSURE WHY)
        //notesBox.getChildren().add(notesTitle);
        //Setting the layout and size for notesScene 
        notesScene = new Scene(notesBox, 600, 400);

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button notesReturnButton = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        notesReturnButton.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        notesBox.getChildren().add(notesReturnButton);

        //Setting the auxilliary scenes to show
        window.show();

        //Adding action to the weekButton on main scene -- will open aux scene when clicked 
        //This scene will allow the user to see their data on a week to week view 
        //Adding action to the week buttonon main scene -- will open aux scene when clicked
        weekButton.setOnAction(e -> window.setScene(weekScene));

        //Creating a new layout for the notesScene when opened
        VBox weekBox = new VBox();
        weekBox.setPadding(new Insets(15));
        weekBox.setSpacing(10);

        Text weekTitle = new Text("Welcome To The Week by Week View!");
        weekBox.getChildren().add(weekTitle);
        weekTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        //PROJECT FAILS TO RUN WHEN THIS LINE OF CODE IS ADDED -- (UNSURE WHY)
        //weekBox.getChildren().add(notesTitle);
        //Setting the layout and size for notesScene 
        weekScene = new Scene(weekBox, 600, 400);

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button weekReturningButton = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        weekReturningButton.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        weekBox.getChildren().add(weekReturningButton);

        //Setting the auxilliary scenes to show
        window.show();

        //Adding action to the monthButton on main scene -- will open aux scene when clicked
        //This scene will allow the user to see their data on a month to month view 
        //Adding action to the notes buttonon main scene -- will open aux scene when clicked
        monthButton.setOnAction(e -> window.setScene(monthScene));

        //Creating a new layout for the month when opened
        VBox monthBox = new VBox();
        monthBox.setPadding(new Insets(15));
        monthBox.setSpacing(10);

        Text monthTitle = new Text("Welcome To The Monthly View -- Your Month At A Glance!");
        monthBox.getChildren().add(monthTitle);
        monthTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        //PROJECT FAILS TO RUN WHEN THIS LINE OF CODE IS ADDED -- (UNSURE WHY)
        //notesBox.getChildren().add(notesTitle);
        //Setting the layout and size for notesScene 
        monthScene = new Scene(monthBox, 600, 400);

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button monthReturningButton = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        monthReturningButton.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        monthBox.getChildren().add(monthReturningButton);

        //Setting the auxilliary scenes to show
        window.show();

        //Adding action to the loginButton on main scene -- will open aux scene when clicked
        //This scene will allow the user to create their account -- will show correct data after
        //They login based on what account they log into 
        //Adding action to the notes buttonon main scene -- will open aux scene when clicked
        loginButton.setOnAction(e -> window.setScene(loginScene));

        //Creating a new layout for the notesScene when opened
        VBox loginBox = new VBox();
        loginBox.setPadding(new Insets(15));
        loginBox.setSpacing(10);

        Text loginTitle = new Text("Welcome To The Login Screne -- Please Login!");
        loginBox.getChildren().add(loginTitle);
        loginTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        //PROJECT FAILS TO RUN WHEN THIS LINE OF CODE IS ADDED -- (UNSURE WHY)
        //notesBox.getChildren().add(notesTitle);
        //Setting the layout and size for notesScene 
        loginScene = new Scene(loginBox, 600, 400);

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button loginReturnButton = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        loginReturnButton.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        loginBox.getChildren().add(loginReturnButton);

        //Setting the auxilliary scenes to show
        window.show();
        
        
        //Adding action to the loginButton on main scene -- will open aux scene when clicked
        //This scene will allow the user to create their account -- will show correct data after
        //They login based on what account they log into 
        //Adding action to the notes buttonon main scene -- will open aux scene when clicked
        scheduleButton.setOnAction(e -> window.setScene(scheduleScene));

        //Creating a new layout for the scheduleScene when opened
        VBox scheduleBox = new VBox();
        scheduleBox.setPadding(new Insets(15));
        scheduleBox.setSpacing(10);

        Text scheduleTitle = new Text("Please schedule your next event here!");
        scheduleBox.getChildren().add(scheduleTitle);
        scheduleTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        //PROJECT FAILS TO RUN WHEN THIS LINE OF CODE IS ADDED -- (UNSURE WHY)
        //scheduleBox.getChildren().add(scheduleTitle);
        //Setting the layout and size for schedule scene 
        scheduleScene = new Scene(scheduleBox, 600, 400);

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button scheduleButtonReturn = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        scheduleButtonReturn.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        scheduleBox.getChildren().add(scheduleButtonReturn);

        //Setting the auxilliary scenes to show
        window.show();
        
        

    }

//    //Method that will get the days of this week based on real time  
//    public void getDaysOfThisWeek() {
//        //Setting the calendar to the current date -- in real time
//        userCal.setTime(new Date());
//        userCal.setFirstDayOfWeek(Calendar.MONDAY);
//        //Setting the first day of the week -- MONDAY
//        userCal.set(Calendar.DAY_OF_WEEK, userCal.getFirstDayOfWeek());
//
//        for (int i = 0; i < 7; i++) {
//            //Reurning information now as prints to make sure works
//            //Will be added as visuals later 
//            String nameOfMonth = userCal.getDisplayName(Calendar.MONTH, Calendar.LONG, locale);
//            String nameOfDay = userCal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
//            int dayOfMonth = userCal.get(Calendar.DAY_OF_MONTH);
//
//            //Testing
//            System.out.println(dayOfMonth + ":" + dateFormat.format(userCal.getTime()));
//
//            //Adjusting the field for day with add -- can adjust month later
//            userCal.add(Calendar.DAY_OF_WEEK, 1);
//
//        }
//    }
    public static void main(String[] args) {
        launch(args);
    }
}
