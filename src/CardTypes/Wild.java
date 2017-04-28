package CardTypes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wild extends Card{
	private final int NUMBER = 400;
	private String color = null;
	private Image img;
	private ImageView cardView;
	
	public Wild() {
		img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\wild.jpg");		
		cardView = new ImageView(img);
		cardView.setFitHeight(847.0/3);
		cardView.setFitWidth(583.0/3);
	}
	
	
	@Override
	public ImageView getImageView() {
		// TODO Auto-generated method stub
		return cardView;
	}

	public String toString() {
		return "WILD CARD";
	}
	
	public int getNumber(){
		return NUMBER;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
}
