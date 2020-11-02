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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

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
        Button clearButton = new Button("Clear");
        clearButton.setStyle("-fx-background-color: #FF0000");

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
        gridPane.add(enterButton, 1, 2);
        gridPane.add(clearButton, 0, 2);

        //Styling nodes  
        enterButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));
        //enterButton.setStyle("-fx-text-fill: black");

        //Changing text
        clearButton.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));

        //Changing text
        userText.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));
        passText.setFont(Font.font("Zapfino", FontWeight.BOLD, 25));

        //Changing border and background colors ----- border not working right now
        gridPane.setStyle("-fx-border-color: blue");
        gridPane.setStyle("-fx-background-color: GRAY;");

        //Creating a scene object 
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage 
        loginStage.setTitle("Andrew Hallett Login Screen");

        //Adding scene to the stage 
        loginStage.setScene(scene);

        //Displaying the contents of the stage 
        loginStage.show();

    }

    //--MAIN METHOD--//
    public static void main(String args[]) {
        launch(args);
    }

}