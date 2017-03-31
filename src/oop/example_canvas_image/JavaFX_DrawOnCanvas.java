package oop.example_canvas_image;

/**
 * Created by Роман on 24.03.2017.
 */
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFX_DrawOnCanvas extends Application {

    final static int CANVAS_WIDTH = 400;
    final static int CANVAS_HEIGHT = 400;

    double x0, y0, x1, y1;
    Image image1;
    Image image2;

    @Override
    public void start(final Stage primaryStage) {

        final Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        final GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        initDraw(graphicsContext);

        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>(){

                    @Override
                    public void handle(MouseEvent event) {

                        x0 = event.getX();
                        y0 = event.getY();

                    }
                });

/*        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED,
                new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                    }
                });*/

        canvas.addEventHandler(MouseEvent.MOUSE_RELEASED,
                new EventHandler<MouseEvent>(){

                    @Override
                    public void handle(MouseEvent event) {

                        x1 = event.getX();
                        y1 = event.getY();

                        double x = (x0 > x1) ? x1 : x0;
                        double y = (y0 > y1) ? y1 : y0;
                        double w = (x0 > x1) ? x0-x1 : x1-x0;
                        double h = (y0 > y1) ? y0-y1 : y1-y0;

                        if (event.isControlDown()) {
                            graphicsContext.drawImage(image2, x, y, w, h);
                        } else {
                            graphicsContext.drawImage(image1, x, y, w, h);
                        }
                    }
                });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(canvas);
        Group root = new Group();
        root.getChildren().add(vBox);
        Scene scene = new Scene(root, 400, 425);
        primaryStage.setTitle("java-buddy.blogspot.com");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void initDraw(GraphicsContext gc){

        double canvasWidth = gc.getCanvas().getWidth();
        double canvasHeight = gc.getCanvas().getHeight();

        gc.setFill(Color.LIGHTGRAY);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);

        gc.fill();
        gc.strokeRect(
                0,              //x of the upper left corner
                0,              //y of the upper left corner
                canvasWidth,    //width of the rectangle
                canvasHeight);  //height of the rectangle

        gc.setLineWidth(1);

        //image = new Image(getClass().getResourceAsStream("duke_44x80.png"));
        image1 = new Image(getClass().getClassLoader().getResourceAsStream("ubuntu-button.png"));
        image2 = new Image(getClass().getClassLoader().getResourceAsStream("windows-button.png"));

    }

}
