/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloring;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * @author Csernay Attila
 *
 * Feladat: Create an application. The root node will be VBox or HBox. Create
 * five Rectangle objects and add them to the root node. Fill the five
 * rectangles in five different ways. Use the LinearGradient and RadialGradient
 * classes. Upload the created application.
 */
public class Coloring extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(5, 25, 5, 25));

        Rectangle r1 = new Rectangle(250, 100);
        r1.setFill(Color.BLUE);
        vbox.getChildren().add(r1);

        r1 = new Rectangle(250, 100);
        Stop[] s = new Stop[]{
            new Stop(0, Color.RED),
            new Stop(0.5, Color.GREEN),
            new Stop(1, Color.BLUE)
        };
        r1.setFill(new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, s));
        vbox.getChildren().add(r1);

        r1 = new Rectangle(250, 100);
        Random r = new Random();
        s = new Stop[]{
            new Stop(0, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble())),
            new Stop(0.33, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble())),
            new Stop(0.66, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble())),
            new Stop(1, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble()))
        };
        r1.setFill(new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, s));
        vbox.getChildren().add(r1);

        r1 = new Rectangle(250, 100);
        s = new Stop[]{
            new Stop(0, Color.RED),
            new Stop(0.5, Color.GREEN),
            new Stop(1, Color.BLUE)
        };
        r1.setFill(new RadialGradient(0, 0, 0.5, 0.5, 0.75, true, CycleMethod.NO_CYCLE, s));
        vbox.getChildren().add(r1);

        r1 = new Rectangle(250, 100);
        s = new Stop[]{
            new Stop(0, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble())),
            new Stop(0.33, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble())),
            new Stop(0.66, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble())),
            new Stop(1, new Color(r.nextDouble(), r.nextDouble(), r.nextDouble(), r.nextDouble()))
        };
        r1.setFill(new RadialGradient(0, 0, 0.5, 0.5, 0.75, true, CycleMethod.NO_CYCLE, s));
        vbox.getChildren().add(r1);

        Scene scene = new Scene(vbox, 300, 500);

        primaryStage.setTitle("Coloring");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
