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
public class StudyType extends Stage{
    Pane studyTypePane = new Pane();

    Label studyTypeQuestionLabel = new Label();

    Button geneticStudiesButton = new Button("Genetic Studies");
    Button developmentalStudiesButton = new Button("Developmental Studies");


    // Need to take a look at node placements, may need to hard code the coordinate placements
    StudyType(){
        // Placing the nodes onto the pane in a grid(x,y)
        studyTypeQuestionLabel.relocate(215, 150);
        geneticStudiesButton.relocate(120, 600);
        developmentalStudiesButton.relocate(350, 600);

        // Modifying the nodes
        studyTypeQuestionLabel.setText("What is the nature of your study?");

        // Adding nodes to scene
        studyTypePane.getChildren().addAll(studyTypeQuestionLabel, geneticStudiesButton, developmentalStudiesButton);
        this.setScene(new Scene(studyTypePane, 600, 900));
        this.setResizable(false);
        this.setTitle("Model Organism");
        this.show();
    
        // Action events due to button click
        geneticStudiesButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) geneticStudiesButton.getScene().getWindow();
                stage.close();
                new Genetic();
            }
        });

        developmentalStudiesButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) developmentalStudiesButton.getScene().getWindow();
                stage.close();
                new Developmental();
            }
        });
    }
}
