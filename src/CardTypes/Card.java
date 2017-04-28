package CardTypes;

import javafx.scene.Node;
import javafx.scene.image.ImageView;

public abstract class Card {

	public abstract String getColor();

	public abstract int getNumber();

	public boolean equals(Object o){
		if(o instanceof Card){
			if((getNumber() == ((Card) o).getNumber()) || (getColor().equals(((Card) o).getColor()))){
				return true;
			}
		}
		return false;
	}

	public abstract ImageView getImageView();
}
