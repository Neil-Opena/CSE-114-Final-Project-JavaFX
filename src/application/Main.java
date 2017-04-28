package application;

import java.util.Scanner;

import CardTypes.Card;
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
			CardDeck first = new CardDeck();
			first.reset();
			Player player = new Player();
			Player computer = new Player();

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

			GridPane top = new GridPane();
			top.setAlignment(Pos.CENTER);
			
			
			Label intro = new Label("Pick a card");
			intro.setFont(new Font(70));
			top.add(intro, 1, 0);
			top.add(new Label("Enter an integer ( 0 - 35 ): "), 1, 1);
			TextField tf = new TextField();
			top.add(tf, 1, 2);
			
			GridPane bottom = new GridPane();
			bottom.setAlignment(Pos.CENTER);
			
			
			VBox containerCenter = new VBox();
			
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
			
			HBox prompts = new HBox();
			Label userTemp = new Label("YOU DREW: ");
			Label compTemp = new Label("COMPUTER DREW: ");
			prompts.getChildren().add(userTemp);
			prompts.getChildren().add(compTemp);
			prompts.setAlignment(Pos.CENTER);
			prompts.setSpacing(200);
			
			containerCenter.getChildren().add(prompts);
			containerCenter.getChildren().add(drawCards);
			
			
			tf.setOnAction(e -> {

				int index = Integer.parseInt(tf.getText());
				first.shuffle();
				Card userHigh = first.getDeck()[index];
				player.setHighCard(userHigh);
				first.discard(index);

				// computer draws card
				int compIndex = (int) (Math.random() * first.getDeck().length);
				Card compHigh = first.getDeck()[compIndex];
				computer.setHighCard(compHigh);
				first.discard(compIndex);
				
				//compareHighCard
				
				userDraw.getChildren().add(userHigh.getImageView());
				computerDraw.getChildren().add(compHigh.getImageView());
				
				if (userHigh.getNumber() == compHigh.getNumber()) {
					bottom.getChildren().add(new Label("Players both drew same card value"));
				} else if (userHigh.getNumber() > compHigh.getNumber()) {
					bottom.getChildren().add(new Label("You go first!!"));
				} else {
					bottom.getChildren().add(new Label("Computer goes first!!"));
				}
			});

			
			start.setTop(top);
			start.setBottom(bottom);
			start.setCenter(containerCenter);
			// card will flip to reveal card

			// start.setBottom(first);
			// a label will pop up, along with a continue button
			
			
			
			
			
			
			

			/** new scene for gamestart */
			BorderPane game = new BorderPane();
			game.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Scene playGame = new Scene(game, 1200, 800);
			// primaryStage.setScene(playGame);
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
