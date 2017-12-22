package CardTypes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BigBird extends Card{
	private final String COLOR;
	private final int NUMBER = 1;
	private Image img;
	private ImageView cardView;
	private Image back = new Image("file:back.jpg");
	private ImageView backView = new ImageView(back);
	
	public BigBird(String color){
		COLOR = color;
		if(color.equals("red")){
			img = new Image("file:1_red.jpg");
		}else if(color.equals("yellow")){
			img = new Image("file:1_yellow.jpg");
		}else if(color.equals("blue")){
			img = new Image("file:1_blue.jpg");
		}else{
			img = new Image("file:1_green.jpg");
		}
		
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
	
	public String toString(){
		return  NUMBER + " - " + COLOR;
	}
	
	public String getColor(){
		return COLOR;
	}
	
	public int getNumber(){
		return NUMBER;
	}

	@Override
	public ImageView getBackView() {
		// TODO Auto-generated method stub
		return backView;
	}

}
