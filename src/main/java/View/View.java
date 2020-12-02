/*
Author: Andrew Hallett
Class:
Prof: Dr.Yeh
Class: IST 261 App Dev Studio
Description: 
 */
package View;

import javafx.stage.Stage;

/**
 *
 * @author Andrew
 */
public class View {
    Stage MainStage;
    Stage Login;
    Stage ChooseDate;
    Stage CreateAccount;
            
    
    public View() {
        MainStage = new Stage();
        Login = MainStage.Login();
        ChooseDate = MainStage.Login();
        CreateAccount = MainStage.Login();
        
        
                
        
    }

    public Stage getMainStage() {
        return MainStage;
    }

    public Stage getLogin() {
        return Login;
    }

    public Stage getChooseDate() {
        return ChooseDate;
    }

    public Stage getCreateAccount() {
        return CreateAccount;
    }
 
   
    
    
    
    
}
