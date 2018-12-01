/*
Class that handles all transaction data manipulation
*/
package code;

// Window creation modules
import javafx.stage.Stage;
import javafx.scene.Scene;

// Layout, node placement modues
import javafx.scene.layout.*;
import javafx.geometry.Insets;

// Node modules
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// On action event listener modules
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// Intializes the start of the program questionaire
public class Genetic extends Stage{
    /*
    Pane geneticPane = new Pane();

    Label saturationMutagenesisQuestionLabel = new Label();

    Button yesButton = new Button("Genetic Studies");
    Button noButton = new Button("Developmental Studies");
    */

    // Need to take a look at node placements, may need to hard code the coordinate placements
    Genetic(){
        /*
        // Placing the nodes onto the pane in a grid(x,y)
        modelOrganismQuestionLabel.relocate(215, 300);
        geneticStudiesButton.relocate(150, 600);
        developmentalStudiesButton.relocate(350, 600);

        // Modifying the nodes
        modelOrganismQuestionLabel.setText("What is the nature of your study?");

        // Adding nodes to scene
        modelOrganismPane.getChildren().addAll(modelOrganismQuestionLabel, geneticStudiesButton, developmentalStudiesButton);
        this.setScene(new Scene(modelOrganismPane, 600, 900));
        this.setResizable(false);
        this.setTitle("Model Organism");
        this.show();
        */
        // Action events due to button click
        /*
        geneticStudiesButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) inventoryButton.getScene().getWindow();
                stage.close();
                //new PaymentTypeStage();
            }
        });

        geneticStudiesButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) inventoryButton.getScene().getWindow();
                stage.close();
                //new PaymentTypeStage();
            }
        });
        */
    }
}
