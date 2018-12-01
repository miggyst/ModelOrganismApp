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
public class ModelOrganismMain extends Stage{
    Pane modelOrganismPane = new Pane();

    Label modelOrganismLabel = new Label();

    Label fruitFlyLabel = new Label();
    Label zebraFishLabel = new Label();
    Label mouseLabel = new Label();
    Label chickenLabel = new Label();

    
    Button playButton = new Button("Find out your Model Organism!");
    


    // Need to take a look at node placements, may need to hard code the coordinate placements
    ModelOrganismMain(){
        // Placing the nodes onto the pane in a grid(x,y)
        modelOrganismLabel.relocate(115, 150);
        playButton.relocate(215, 300);

        fruitFlyLabel.relocate(120, 500);
        zebraFishLabel.relocate(350, 500);
        mouseLabel.relocate(120, 700);
        chickenLabel.relocate(350, 700);

        // Modifying the nodes
        modelOrganismLabel.setText("Welcome to the Model Organism Application (Press the button to play)");
        fruitFlyLabel.setText("Drosophila Melanogaster (Fruit Fly): " + GlobalUtilities.getFruitFlyCount());
        zebraFishLabel.setText("Danjo Rerio (Zebra Fish): " + GlobalUtilities.getZebraFishCount());
        mouseLabel.setText("Mus Musculus (Mouse): " + GlobalUtilities.getMouseCount());
        chickenLabel.setText("Gallus Domesticus (Chicken): " + GlobalUtilities.getChickenCount());

        // Adding nodes to scene
        modelOrganismPane.getChildren().addAll(modelOrganismLabel, playButton, fruitFlyLabel, zebraFishLabel, mouseLabel, chickenLabel);
        this.setScene(new Scene(modelOrganismPane, 600, 900));
        this.setResizable(false);
        this.setTitle("Model Organism");
        this.show();
    
        // Action events due to button click
        playButton.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                Stage stage = (Stage) playButton.getScene().getWindow();
                stage.close();
                new StudyType();
            }
        });
    }
}
