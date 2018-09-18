package blocks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GoalBlock extends Block {

	public GoalBlock() {
		Rectangle r = new Rectangle(Block.SIZE, Block.SIZE);
		r.setFill(Color.RED);
		this.getChildren().add(r);
	}
	
}
