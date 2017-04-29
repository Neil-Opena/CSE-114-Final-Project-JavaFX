package CardTypes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BigBird extends Card{
	private final String COLOR;
	private final int NUMBER = 1;
	private Image img;
	private ImageView cardView;
	private Image back = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\back.jpg");
	private ImageView backView = new ImageView(back);
	
	public BigBird(String color){
		COLOR = color;
		if(color.equals("red")){
			img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\1_red.jpg");
		}else if(color.equals("yellow")){
			img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\1_yellow.jpg");
		}else if(color.equals("blue")){
			img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\1_blue.jpg");
		}else{
			img = new Image("file:C:\\Users\\neil1\\Stony Brook University\\OneDrive - Stony Brook University\\Freshman Year 2016-17\\Spring 2017\\CSE 114\\CSE-114-Final-Project-JavaFX\\FinalProjectAssets\\1_green.jpg");
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
