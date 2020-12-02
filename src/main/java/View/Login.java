/*
File name: 
Short description: 
IST 261 Assignment: 
@author: Andrew Hallett
date: 
 */
package View;

import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Login extends Application {

    Stage loginWindow;
    Scene loginScene, sucessScene;

    @Override
    public void start(Stage loginStage) throws FileNotFoundException {
        //Adding image
        //Image loginImage = new Image(new FileInputStream("C:\\Users\\Andrew\\Pictures\\use_login_image.png")) {}; 
        //Setting the view of the image
        //ImageView ImageView = new ImageView(loginImage);

        //Creating email text
        Text userText = new Text("Enter UserName");

        //Creating password text
        Text passText = new Text("Enter Password");

        //Creating text field for the user to enter their email
        TextField emailField = new TextField();

        //Creating password field for the user to enter their password
        PasswordField passField = new PasswordField();

        //Creating Buttons
        Button enterButton = new Button("Enter");
        enterButton.setStyle("-fx-background-color: #008000");
        Button clearUserButton = new Button("Clear Username");
        clearUserButton.setStyle("-fx-background-color: #FF0000");
        Button clearPassButton = new Button("Clear Password");
        clearPassButton.setStyle("-fx-background-color: #FF0000");

        //Creating a pane iwht a grid layout
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(500, 500);

        //Setting the pading
        //gridPane.setPadding(new Insets(10, 10, 10, 10)); 
        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(50);
        gridPane.setHgap(20);

        //Setting the Grid alignment 
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid 
        gridPane.add(userText, 0, 0);
        gridPane.add(emailField, 1, 0);
        gridPane.add(passText, 0, 1);
        gridPane.add(passField, 1, 1);
        gridPane.add(enterButton,0, 2, 2, 4);
        gridPane.add(clearUserButton, 1, 0, 2, 2);
        gridPane.add(clearPassButton, 1, 1, 3, 3);

        //Styling nodes  
        enterButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));
        //enterButton.setStyle("-fx-text-fill: black");

        //Changing text for the clear username button
        clearUserButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        //Changing text for the clear password button
        clearPassButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 12));
        //Adding event listener to the clear button to clear email field
        clearUserButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emailField.setText("");
            }
        });
        //Adding event listener to the clear button to clear password field
        clearPassButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                passField.setText("");
            }
        });

        //Enter button does not work -- also need to add not bringing user to 
        //the login scene when credentials are wrong
        enterButton.setOnAction(e -> loginWindow.setScene(sucessScene));
        //Creating layout for window that opens when enter is pressed
        //Enter does not check for correct login values yet
        VBox sucessBox = new VBox();
        sucessBox.setPadding(new Insets(15));
        sucessBox.setSpacing(10);
        //sucessBox.setStyle("-fx-border-color: red;")
        //
        gridPane.setHalignment(userText, HPos.CENTER);

        Text sucessText = new Text("Login Sucessful!");
        sucessBox.getChildren().add(sucessText);
        sucessText.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        //Setting the layout and size for sucess scene login
        sucessScene = new Scene(sucessBox, 600, 400);
        
        //Setting border outline for the gridpane login scene
        gridPane.setStyle("-fx-padding: 10;" + 
                      "-fx-border-style: solid inside;" + 
                      "-fx-border-width: 2;" +
                      "-fx-border-insets: 5;" + 
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: blue;");
        

        //Changing the size of buttons
        enterButton.setPrefWidth(200);
        //Setting enter button to be in middle of scene
        enterButton.setAlignment(Pos.CENTER);
        //Changing size of both clear buttons
        clearPassButton.setPrefWidth(110);
        clearUserButton.setPrefWidth(110);

        //Changing text
        userText.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));
        passText.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));

        //Changing border and background colors ----- border not working right now
        gridPane.setStyle("-fx-border-color: blue");
        gridPane.setStyle("-fx-background-color: GRAY;");

        //Aligning everything in the middle of the screen 
        
        
        
        
        
        
        
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage 
        loginStage.setTitle("Andrew Hallett Login Screen");

        //Adding scene to the stage 
        loginStage.setScene(scene);

        //Displaying the contents of the stage 
        loginStage.show();

    }

    public void setLoginWindow(Stage loginWindow) {
        this.loginWindow = loginWindow;
    }

    public void setLoginScene(Scene loginScene) {
        this.loginScene = loginScene;
    }

    public void setSucessScene(Scene sucessScene) {
        this.sucessScene = sucessScene;
    }

    public Stage getLoginWindow() {
        return loginWindow;
    }

    public Scene getLoginScene() {
        return loginScene;
    }

    public Scene getSucessScene() {
        return sucessScene;
    }

    public static String getSTYLESHEET_CASPIAN() {
        return STYLESHEET_CASPIAN;
    }

    public static String getSTYLESHEET_MODENA() {
        return STYLESHEET_MODENA;
    }

    
    
    
    public static void main(String[] args) {
        launch(args);

    }
}
