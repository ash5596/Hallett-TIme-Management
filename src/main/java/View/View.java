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
    Stage mainStage;
    Stage loginStage;
    Stage chooseDateStage;
    Stage createAccountStage;
            
    
    public View() {
        mainStage = new Stage();
        loginStage = mainStage.getloginStage();
        chooseDateStage = mainStage.getchooseDateStage();
        createAccountStage = mainStage.getcreateAccountStage();

        
    }
    

    public Stage getMainStage() {
        return mainStage;
    }

    public Stage getLoginStage() {
        return loginStage;
    }

    public Stage getChooseDateStage() {
        return chooseDateStage;
    }

    public Stage getCreateAccountStage() {
        return createAccountStage;
    }
 
   
    
    
    
    
}
