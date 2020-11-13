/*
File name: App.java
Short description: App contains main method, creating mvc objects, used to run program
IST 261 Assignment: 
@author: Andrew Hallett
date: 
 */

import Controller.Controller;
import Model.Model;
import View.View;
import java.util.Locale;
import static javafx.application.Application.launch;

public class App {

    public static void main(String[] args) {
        //Creating model object
        Model model = new Model();
        //Creating view object
        View view = new View();
        //Creating controller object -- passing in model and view
        
        
        
        
        Controller controller = new Controller(model, view);
        
        
          
        //Correct formatting of the calendar based off US
        Locale.setDefault(Locale.US);
        //Allowing code to be displayed 
        launch(args);
        //
        launch(args);
    }
    }

    
    
    


