package funjfx;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.image.*;
import javafx.event.*;

public class FunJFX extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage stage) {
    // Change to start1, start2, etc. to obtain various examples.
    start6(stage);
  }

  // I. Almost minimal example.

  private void start1(Stage stage) {
    Scene scene = new Scene(new Label("Hello World"));
    stage.setScene(scene);
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }

  // II. A button AND a label (wow).

  private void start2(Stage stage) {
    Button b = new Button("Try me!");
    Label helloWorld = new Label("Hello World");
    Group root = new Group(b, helloWorld);
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Fun JavaFX");
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }

  // III. Fixing a button AND a label.

  private void start3(Stage stage) {
    Button b = new Button("Try me!");
    Label helloWorld = new Label("Hello World");
    helloWorld.setTranslateX(100);
    Group root = new Group(b, helloWorld);
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Fun JavaFX");
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }

  // IV. A first taste of layout

  private void start4(Stage stage) {
    Button b = new Button("Try me!");
    Label helloWorld = new Label("Hello World");
    HBox root = new HBox(b, helloWorld);
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Fun JavaFX");
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }

  // V. Nesting Layout

  public void start5(Stage stage) {
    Button b = new Button("Try me!");
    Label helloWorld = new Label("Hello World");
    VBox vbox = new VBox(b, helloWorld);
    ImageView rPlace = new ImageView(
      "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Place_2022.svg/1920px-Place_2022.svg.png");
    rPlace.setPreserveRatio(true);
    rPlace.setFitWidth(100);
    HBox root = new HBox(vbox, rPlace);
    Scene hello = new Scene(root);
    stage.setScene(hello);
    stage.setTitle("Fun JavaFX");
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }

  // VI. Clicking on a button

  public void start6(Stage stage) {
    Image rPlaceLogo = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Place_2022.svg/1920px-Place_2022.svg.png");
    Image rPlaceImg = new Image("https://upload.wikimedia.org/wikipedia/en/0/01/RPlace2022.png");
    ImageView canvas = new ImageView(rPlaceLogo);
    canvas.setPreserveRatio(true);
    canvas.setFitWidth(550);
    Button b = new Button("Reveal r/place");
    b.setOnAction(ev -> {
      if(canvas.getImage() == rPlaceLogo) {
        canvas.setImage(rPlaceImg);
        b.setText("Hide r/place");
      }
      else {
        canvas.setImage(rPlaceLogo);
        b.setText("Reveal r/place");
      }
    });
    stage.setScene(new Scene(new VBox(b, canvas)));
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }

  // VII. Typing text

  public void start7(Stage stage) {
    Label label = new Label("Type something: ");
    Scene scene = new Scene(label);
    scene.setOnKeyTyped(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent event) {
        label.setText(label.getText() + event.getCharacter());
      }
    });
    stage.setScene(scene);
    stage.setWidth(640);
    stage.setHeight(640);
    stage.show();
  }
}
