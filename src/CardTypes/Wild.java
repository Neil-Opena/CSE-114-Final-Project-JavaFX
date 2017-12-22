package CardTypes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wild extends Card{
	private final int NUMBER = 400;
	private String color = null;
	private Image img;
	private ImageView cardView;
	private Image back = new Image("file:back.jpg");
	private ImageView backView = new ImageView(back);
	
	public Wild() {
		img = new Image("file:wild.jpg");
		cardView = new ImageView(img);
		cardView.setFitHeight(847.0/3);
		cardView.setFitWidth(583.0/3);
		backView.setFitHeight(847.0/3);
		backView.setFitWidth(583.0/3);
	}
	
	
	@Override
	public ImageView getImageView() {
		// TODO Auto-generated method stub
		return cardView;
	}
	@Override
	public ImageView getBackView() {
		// TODO Auto-generated method stub
		return backView;
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
