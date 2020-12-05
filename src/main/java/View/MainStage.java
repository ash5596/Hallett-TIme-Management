/*
Author: Andrew Hallett
Project: Hallett_Time_Management
Prof: Dr.Yeh
Class: IST 261 App Dev Studio
Description: This class is the home screen of the application
allows users to choose which screen they want to visit. 
 */
package View;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javafx.application.Platform;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainStage extends Application {

    //Global Variables
    Stage window;
    Scene notesScene, weekScene, monthScene, loginScene, mainScene, scheduleScene;
    //
    Stage chooseDateStage;
    Stage loginStage;
    Stage createAccountStage;
    
    
    
   
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
        Button scheduleButton = new Button("SCHEDULE");

        //notesButton.setOnAction(eve -> new notesStage());
        //Adding the buttons
        newFlow.getChildren().add(notesButton);
        newFlow.getChildren().add(weekButton);
        newFlow.getChildren().add(monthButton);
        newFlow.getChildren().add(loginButton);
        newFlow.getChildren().add(scheduleButton);
        newFlow.getChildren().add(exitButton);

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
        notesBox.setSpacing(30);

        Text notesTitle = new Text("Welcome To The Notes Section -- Type Imporant Notes Here!");
        notesBox.getChildren().add(notesTitle);
        notesTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));

        //PROJECT FAILS TO RUN WHEN THIS LINE OF CODE IS ADDED -- (UNSURE WHY)
        //notesBox.getChildren().add(notesTitle);
        //Setting the layout and size for notesScene 
        notesScene = new Scene(notesBox, 600, 400);
        //Adding first text field to the notes scene
        TextArea notesTextOne = new TextArea();
        notesTextOne.setPrefWidth(500);
        notesTextOne.setPrefHeight(85);
        notesTextOne.setWrapText(true);
        //test-----

        //Delete and save buttons for text area one
        Button deleteNotesOneButton;
        deleteNotesOneButton = new Button("Delete Text 1");
        deleteNotesOneButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        Button saveNotesOneButton;
        saveNotesOneButton = new Button("Save Text");
        saveNotesOneButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        //Moving delete and save buttons to under the text field
        deleteNotesOneButton.setTranslateX(0);
        deleteNotesOneButton.setTranslateY(-163);
        saveNotesOneButton.setTranslateX(150);
        saveNotesOneButton.setTranslateY(-328);
        //Changing color for delete and save button
        deleteNotesOneButton.setStyle("-fx-background-color: #FF0000");
        saveNotesOneButton.setStyle("-fx-background-color: #008000");
        
        //Delete and save buttons for text area two
        Button deleteNotesTwoButton;
        deleteNotesTwoButton = new Button("Delete Text 2");
        deleteNotesTwoButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        Button saveNotesTwoButton;
        saveNotesTwoButton = new Button("Save Text");
        saveNotesTwoButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        //Moving delete and save buttons to under the text field
        deleteNotesTwoButton.setTranslateX(0);
        deleteNotesTwoButton.setTranslateY(-150);
        saveNotesTwoButton.setTranslateX(150);
        saveNotesTwoButton.setTranslateY(-316);
        //Changing color for delete and save button
        deleteNotesTwoButton.setStyle("-fx-background-color: #FF0000");
        saveNotesTwoButton.setStyle("-fx-background-color: #008000");

        //Delete and save buttons for text area three
        Button deleteNotesThreeButton;
        deleteNotesThreeButton = new Button("Delete Text 3");
        deleteNotesThreeButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        Button saveNotesThreeButton;
        saveNotesThreeButton = new Button("Save Text");
        saveNotesThreeButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        //Moving delete and save buttons to under the text field
        deleteNotesThreeButton.setTranslateX(0);
        deleteNotesThreeButton.setTranslateY(-138);
        saveNotesThreeButton.setTranslateX(150);
        saveNotesThreeButton.setTranslateY(-302);
        //Changing color for delete and save button
        deleteNotesThreeButton.setStyle("-fx-background-color: #FF0000");
        saveNotesThreeButton.setStyle("-fx-background-color: #008000");

        //Adding second text field to the notes scene
        TextArea notesTextTwo = new TextArea();
        notesTextTwo.setPrefWidth(500);
        notesTextTwo.setPrefHeight(85);
        notesTextTwo.setWrapText(true);

        //Adding third  field to the notes scene
        TextArea notesTextThree = new TextArea();
        notesTextThree.setPrefWidth(500);
        notesTextThree.setPrefHeight(85);
        notesTextThree.setWrapText(true);

        //Adding all of the text field to the notes scene -- to be displayed
        notesBox.getChildren().addAll(notesTextOne, notesTextTwo, notesTextThree);
        //Adding delete and save buttons for each text area
        notesBox.getChildren().addAll(deleteNotesOneButton, deleteNotesTwoButton, deleteNotesThreeButton, saveNotesOneButton, saveNotesTwoButton, saveNotesThreeButton);

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button notesReturnButton = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        notesReturnButton.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        notesBox.getChildren().add(notesReturnButton);
        //Changing color and location of return button
        notesReturnButton.setTranslateX(170);
        notesReturnButton.setTranslateY(-300);
        notesReturnButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 64));
        notesReturnButton.setStyle("-fx-background-color: #000080;" +
                                   "-fx-linear-gradient: #7ebcea, #2f4b8f;" +
                                   "-fx-linear-gradient: #426ab7, #263e75;" +
                                   "-fx-linear-gradient: #395cab, #223768;" +
                                   "-fx-background-insets: 0,1,2,3;" +
                                   "-fx-background-radius: 3,2,2,2;" +
                                   "-fx-padding: 12 30 12 30;" +
                                   "-fx-text-fill: white;" +
                                   "-fx-font-size: 36px;");                                                  
        //Having buttons clear the text that is in the text area
        deleteNotesOneButton.setOnAction(e -> notesTextOne.clear());
        deleteNotesTwoButton.setOnAction(e -> notesTextTwo.clear());
        deleteNotesThreeButton.setOnAction(e -> notesTextThree.clear());
        
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
        weekScene = new Scene(new Group());
        
        //Adding a table that can be edited by the user -- week view table 
        TableView weekTable = new TableView();
        Label weekLabel = new Label("Week View");
        weekLabel.setFont(new Font("Arial", 14));
        weekLabel.setTranslateY(-8);
        weekTable.setEditable(true);
        //Creating the column
        TableColumn monday = new TableColumn("Monday");
        monday.setMinWidth(150);
        TableColumn tuesday = new TableColumn("Tuesday");
        tuesday.setMinWidth(150);
        TableColumn wednesday = new TableColumn("Wednesday");
        wednesday.setMinWidth(150);
        TableColumn thursday = new TableColumn("Thursday");
        thursday.setMinWidth(150);
        TableColumn friday = new TableColumn("friday");
        friday.setMinWidth(150);
        TableColumn saturday = new TableColumn("Saturday");
        saturday.setMinWidth(150);
        TableColumn sunday = new TableColumn("Sunday");
        sunday.setMinWidth(150);
        //Adding column to table
        weekTable.getColumns().addAll(monday, tuesday, wednesday, thursday, friday, saturday, sunday);
        //Creating VBox to add Table to 
        VBox weekViewBox = new VBox();
        weekViewBox.setSpacing(5);
        weekViewBox.setPadding(new Insets(10, 0, 0, 10));
        weekViewBox.getChildren().addAll(weekLabel, weekTable);
        //Adding the table and the label to the week view scene
        ((Group) weekScene.getRoot()).getChildren().addAll(weekViewBox, weekLabel);
        //Creating button to go back to the main stage
        Button returnMainStageButton = new Button("Return");
        returnMainStageButton.setOnAction(e -> window.setScene(startScene));
        //Adding return button to VBox
        weekViewBox.getChildren().add(returnMainStageButton);
        //Styling for the return button
        returnMainStageButton.setStyle("-fx-background-color: #000080;" +
                                   "-fx-linear-gradient: #7ebcea, #2f4b8f;" +
                                   "-fx-linear-gradient: #426ab7, #263e75;" +
                                   "-fx-linear-gradient: #395cab, #223768;" +
                                   "-fx-background-insets: 0,1,2,3;" +
                                   "-fx-background-radius: 3,2,2,2;" +
                                   "-fx-padding: 12 30 12 30;" +
                                   "-fx-text-fill: white;" +
                                   "-fx-font-size: 12px;");
        //Showing the window with the table
        window.show();

        //Adding a button that will return the user to the main scene which they came from
        //Will be able to reutn to the main scene 
        Button weekReturningButton = new Button("Main Menu");
        //NOTE FOR SELF -- (startScene is the mainstage // homepage screne
        weekReturningButton.setOnAction(e -> window.setScene(startScene));
        //Adding the button
        weekBox.getChildren().add(weekReturningButton);
        //     
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
    
    public Stage getloginStage() {
        return loginStage;
    }

    public Stage getchooseDateStage() {
        return chooseDateStage;
    }

    public Stage getcreateAccountStage() {
        return createAccountStage;
    }

    public void setWindow(Stage window) {
        this.window = window;
    }

    public void setNotesScene(Scene notesScene) {
        this.notesScene = notesScene;
    }

    public void setWeekScene(Scene weekScene) {
        this.weekScene = weekScene;
    }

    public void setMonthScene(Scene monthScene) {
        this.monthScene = monthScene;
    }

    public void setLoginScene(Scene loginScene) {
        this.loginScene = loginScene;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    public void setScheduleScene(Scene scheduleScene) {
        this.scheduleScene = scheduleScene;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setUserCal(Calendar userCal) {
        this.userCal = userCal;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
