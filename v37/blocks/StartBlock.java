package blocks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class StartBlock extends Block {

	public StartBlock() {
		Rectangle r = new Rectangle(Block.SIZE, Block.SIZE);
		r.setFill(Color.GREEN);
		this.getChildren().add(r);
	}
}
