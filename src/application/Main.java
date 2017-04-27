package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.control.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("CSE-114: UNO Final Project");
			final double HEIGHT = 847.0 / 3;
			final double WIDTH = 583.0 / 3;

			// IMAGES and ImageViews
			Image cardBack = new Image(
					"file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\back.jpg");
			ImageView cardBackView = new ImageView(cardBack);
			cardBackView.setFitHeight(HEIGHT);
			cardBackView.setFitWidth(WIDTH);

			/** new scene for start of game(pick a card) */
			BorderPane start = new BorderPane();
			Scene startGame = new Scene(start, 1200, 800);
			primaryStage.setScene(startGame);

			Label intro = new Label("Pick a card");
			intro.setFont(new Font(70));
			VBox top = new VBox();
			top.getChildren().add(intro);
			top.setPadding(new Insets(50));
			top.getChildren().add(new Label("Enter an integer (0 - 35): "));
			TextField tf = new TextField();
			// TODO event handler
			//draw card

			top.getChildren().add(tf);
			top.setAlignment(Pos.CENTER);
			VBox.setMargin(tf, new Insets(0, 400, 0, 400));
			start.setTop(top);

			HBox drawCards = new HBox();
			
			StackPane userDraw = new StackPane();
			StackPane computerDraw = new StackPane();
			
			ImageView startUserBack = new ImageView(cardBack);
			ImageView startCompBack = new ImageView(cardBack);
			startUserBack.setFitHeight(HEIGHT);
			startUserBack.setFitWidth(WIDTH);
			startCompBack.setFitHeight(HEIGHT);
			startCompBack.setFitWidth(WIDTH);
			
			userDraw.getChildren().add(startUserBack);
			computerDraw.getChildren().add(startCompBack);
			
			drawCards.getChildren().add(userDraw);
			drawCards.getChildren().add(computerDraw);
			drawCards.setAlignment(Pos.CENTER);
			drawCards.setSpacing(200);
			
			start.setCenter(drawCards);
			//card will flip to reveal card
			
			
			//start.setBottom(first);
			//a label will pop up, along with a continue button
			
			

			/** new scene for gamestart */
			BorderPane game = new BorderPane();
			game.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Scene playGame = new Scene(game, 1200, 800);
			//primaryStage.setScene(playGame);
			Image temp1 = new Image(
					"file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\wild.jpg");

			Label computerDeck = new Label("Computer Deck");
			Label userDeck = new Label("User Deck");

			HBox center = new HBox();

			StackPane drawPile = new StackPane(); // for main deck
			StackPane discardPile = new StackPane();

			// TODO delete temp
			ImageView tempView = new ImageView(temp1);
			tempView.setFitHeight(HEIGHT);
			tempView.setFitWidth(WIDTH);

			drawPile.getChildren().add(cardBackView);
			discardPile.getChildren().add(tempView);

			center.setAlignment(Pos.CENTER);

			center.getChildren().add(drawPile);
			center.getChildren().add(discardPile);
			center.setSpacing(200);

			game.setTop(computerDeck);
			game.setCenter(center);
			game.setBottom(userDeck);

			primaryStage.show();
			// new scene for ending (GAMEOVER)

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
