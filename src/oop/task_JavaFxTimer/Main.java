package oop.task_JavaFxTimer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.util.Timer;

public class Main extends Application {

    private  int countdown1 = 120;
    private String eventname1 = "Заказать пиццу";


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Таймер");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        Group g = new Group();
        Button btn = new Button();
        btn.setText("Таймер 'Заказать пиццу'");



        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println(eventname1);
               // Timer timer = new Timer(1000, new TimerTick());


            }
        });

        g.getChildren().add(btn);

        root.getChildren().add(g);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class TimerTick extends ActionEvent {


        public void actionPerformed(ActionEvent e) {
            countdown1--;
            int hour = countdown1 / 3600;
            int minute = (countdown1 % 3600) / 60;
            int second = (countdown1 % 3600) % 60;
            System.out.println("tmr" + countdown1 + "s: " + "<<" + eventname1 + ">>");
        }

    }
}
