package CardTypes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Oscar extends Card implements Special{
	private final String COLOR;
	private final int NUMBER = 200;
	private final String SPECIAL = "Choose who to draw 2";
	private Image img;
	private ImageView cardView;
	private Image back = new Image("file:back.jpg");
	private ImageView backView = new ImageView(back);
	
	public Oscar(String color){
		COLOR = color;
		if(color.equals("yellow")){
			img = new Image("file:2_plus_yellow.jpg");
		}else{
			img = new Image("file:2_plus_green.jpg");
		}
		
		cardView = new ImageView(img);
		cardView.setFitHeight(847.0/3);
		cardView.setFitWidth(583.0/3);
		backView.setFitHeight(847.0/3);
		backView.setFitWidth(583.0/3);
	}
	@Override
	public ImageView getBackView() {
		// TODO Auto-generated method stub
		return backView;
	}
	
	@Override
	public ImageView getImageView() {
		// TODO Auto-generated method stub
		return cardView;
	}
	
	public String toString(){
		return SPECIAL  + " - " + COLOR;
	}
	
	public String getColor(){
		return COLOR;
	}
	
	public int getNumber(){
		return NUMBER;
	}
	
	public int special(){
		return 2;
	}
}
