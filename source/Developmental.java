/*
Class that handles all transaction data manipulation
*/
package code;

// Window creation modules
import javafx.stage.Stage;
import javafx.scene.Scene;

// Layout, node placement modues
import javafx.scene.layout.*;

// Node modules
import javafx.scene.control.Button;
import javafx.scene.control.Label;

// On action event listener modules
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// Intializes the start of the program questionaire
public class Developmental extends Stage{

    Pane developmentalPane = new Pane();

    Label developmentalQuestionLabel = new Label();

    Button teratologyButton = new Button("Teratology");
    Button limbDevelopmentButton = new Button("Limb Development");


    // Need to take a look at node placements, may need to hard code the coordinate placements
    Developmental(){
        // Placing the nodes onto the pane in a grid(x,y)
        developmentalQuestionLabel.relocate(165, 150);
        teratologyButton.relocate(265, 350);
        limbDevelopmentButton.relocate(245, 550);

        // Modifying the nodes
        developmentalQuestionLabel.setText("What type of Developmental Study will you perform?");

        // Adding nodes to scene
        developmentalPane.getChildren().addAll(developmentalQuestionLabel, teratologyButton, limbDevelopmentButton);
        this.setScene(new Scene(developmentalPane, 600, 900));
        this.setResizable(false);
        this.setTitle("Model Organism");
        this.show();

        // Action events due to button click
        // Zebra Fish
        teratologyButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) teratologyButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setZebraFishCount(GlobalUtilities.getZebraFishCount() + 1);
                new ModelOrganismMain();
            }
        });

        // Chicken
        limbDevelopmentButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) limbDevelopmentButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setChickenCount(GlobalUtilities.getChickenCount() + 1);
                new ModelOrganismMain();
            }
        });
    }
}
