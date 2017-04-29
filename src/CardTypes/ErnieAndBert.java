package CardTypes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ErnieAndBert extends Card implements Special{
	private final String COLOR;
	private final String SPECIAL = "Draw 1";
	private final int NUMBER = 100;
	private Image img;
	private ImageView cardView;
	private Image back = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\back.jpg");
	private ImageView backView = new ImageView(back);
	
	public ErnieAndBert(String color){
		COLOR = color;
		if(color.equals("red")){
			img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\1_plus_red.jpg");
		}else{
			img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\1_plus_blue.jpg");
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
		return 1;
	}
}
