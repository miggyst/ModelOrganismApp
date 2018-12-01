/*
Class to start the program loop
Compile:    javac -d . source/*.java
Run:        java code.Main
*/
package code;

import javafx.application.Application;

import javafx.stage.Stage;

// Main class to initialize JAVAFX and create the stage to manage scenes within the application
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        new ModelOrganismMain();
    }
}