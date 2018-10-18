package bilder;


import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Group{
	
	public Pawn(){

        Image image = new Image("bilder/white_pawn.png");

        ImageView iw = new ImageView(image);
        iw.setFitWidth(100);
        iw.setFitHeight(100);
		
		this.getChildren().add(iw);
		
	}

}
