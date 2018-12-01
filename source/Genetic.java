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
public class Genetic extends Stage{
    Pane geneticPane = new Pane();

    Label geneticQuestionLabel = new Label();

    Button saturationMutagenesisButton = new Button("Saturation Mutagenesis");
    Button largeScaleRandomMutagenesisButton = new Button("Large-Scale Random Mutagenesis");
    Button homologusRecombinationButton = new Button("Homologus Recombination");
    Button transposableElementExcisionButton = new Button("Transposable Element Excision");
    Button rnaInterfaceButton = new Button("RNA Interface");
    Button genomeEditingButton = new Button("Genome Editing");
    Button noneOfTheAboveButton = new Button("None of the Above");
    


    // Need to take a look at node placements, may need to hard code the coordinate placements
    Genetic(){
        // Placing the nodes onto the pane in a grid(x,y)
        geneticQuestionLabel.relocate(175, 150);

        saturationMutagenesisButton.relocate(100, 300);
        largeScaleRandomMutagenesisButton.relocate(350, 300);

        homologusRecombinationButton.relocate(100, 450);
        transposableElementExcisionButton.relocate(350, 450);

        rnaInterfaceButton.relocate(100, 600);
        genomeEditingButton.relocate(350, 600);

        noneOfTheAboveButton.relocate(240, 750);

        // Modifying the nodes
        geneticQuestionLabel.setText("What type of Genetic Study will you perform?");

        // Adding nodes to scene
        geneticPane.getChildren().addAll(geneticQuestionLabel, saturationMutagenesisButton, largeScaleRandomMutagenesisButton, homologusRecombinationButton, transposableElementExcisionButton, rnaInterfaceButton, genomeEditingButton, noneOfTheAboveButton);
        this.setScene(new Scene(geneticPane, 600, 900));
        this.setResizable(false);
        this.setTitle("Model Organism");
        this.show();
    
        // Action events due to button click
        // Fruit Fly
        saturationMutagenesisButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) saturationMutagenesisButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setFruitFlyCount(GlobalUtilities.getFruitFlyCount() + 1);
                new ModelOrganismMain();
            }
        });

        // Fruit Fly
        largeScaleRandomMutagenesisButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) largeScaleRandomMutagenesisButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setFruitFlyCount(GlobalUtilities.getFruitFlyCount() + 1);
                new ModelOrganismMain();
            }
        });

        // Mouse
        homologusRecombinationButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) homologusRecombinationButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setMouseCount(GlobalUtilities.getMouseCount() + 1);
                new ModelOrganismMain();
            }
        });

        // Fruit Fly
        transposableElementExcisionButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) transposableElementExcisionButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setFruitFlyCount(GlobalUtilities.getFruitFlyCount() + 1);
                new ModelOrganismMain();
            }
        });


        // Mouse
        rnaInterfaceButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) rnaInterfaceButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setMouseCount(GlobalUtilities.getMouseCount() + 1);
                new ModelOrganismMain();
            }
        });

        // Zebrafish
        genomeEditingButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) genomeEditingButton.getScene().getWindow();
                stage.close();
                GlobalUtilities.setZebraFishCount(GlobalUtilities.getZebraFishCount() + 1);
                new ModelOrganismMain();
            }
        });

        // None
        noneOfTheAboveButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) noneOfTheAboveButton.getScene().getWindow();
                stage.close();
                new ModelOrganismMain();
            }
        });
        
    }
}
