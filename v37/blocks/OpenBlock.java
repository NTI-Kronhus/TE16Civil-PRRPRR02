package blocks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class OpenBlock extends Block {

	public OpenBlock() {
		Rectangle r = new Rectangle(Block.SIZE, Block.SIZE);
		r.setFill(Color.TRANSPARENT);
		this.getChildren().add(r);
	}

}
