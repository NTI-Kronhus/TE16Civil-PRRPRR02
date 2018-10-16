package hus;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Floor extends Group {
	
	private Rectangle floor;
	
	public Floor(double w, double h, int level) {
		floor = new Rectangle(w, h);
		floor.setFill(Color.SANDYBROWN);
		floor.setStroke(Color.BLACK);
		this.getChildren().add(floor);
		this.setTranslateY(level * h);
	}
	
	public void setFill(Paint p){
		floor.setFill(p);
	}

}
