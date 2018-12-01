/*
Class to start the program loop
Compile:        javac -d . source/*.java
Run:            java code.Main
JAR-compile:    jar -cvfm ModelOrganism.jar source/Main.txt *
JAR-run:        java -jar ModelOrganism.jar
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