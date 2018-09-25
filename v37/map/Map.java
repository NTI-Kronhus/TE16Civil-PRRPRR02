package map;

import java.util.ArrayList;

import blocks.Block;
import javafx.scene.Group;

public class Map extends Group {

	private ArrayList<ArrayList<Block>> map = new ArrayList<ArrayList<Block>>();
	private int startX, startY;

	public void add(Block b, int row) {
		ArrayList<Block> mapRow;
		try {
			mapRow = map.get(row);
		} catch (IndexOutOfBoundsException e) {
			mapRow = new ArrayList<Block>();
			map.add(mapRow);
		}
		mapRow.add(b);

		this.getChildren().add(b);

	}

	/**
	 * Returns a double array of the blocks in the Map
	 * 
	 * @return A double array of all blocks
	 */
	public ArrayList<ArrayList<Block>> getBlocks() {
		return this.map;
	}

	/**
	 * Returns the starting x-coordinate of the Map
	 * 
	 * @return Starting x-coordinate
	 */
	public int getStartX() {
		return this.startX;
	}

	/**
	 * Returns the starting y-coordinate of the Map
	 * 
	 * @return Starting y-coordinate
	 */
	public int getStartY() {
		return this.startY;
	}

	public Block getBlock(int x, int y) {
		if (y >= map.size() || y < 0) {
			return null;
		}
		if (x >= map.get(y).size() || y < 0) {
			return null;
		}

		return this.map.get(y).get(x);
	}

	/**
	 * Returns the width of the Map in pixels
	 * 
	 * @return Width in pixels
	 */
	public double getWidth() {
		return map.get(0).size() * Block.SIZE;
	}

	/**
	 * Returns the height of the Map in pixels
	 * 
	 * @return Height in pixels
	 */
	public double getHeight() {
		return map.size() * Block.SIZE;
	}

	/**
	 * Sets the starting x-coordinate of the Map
	 * 
	 * @param x coordinate
	 */
	public void setStartX(int x) {
		this.startX = x;
	}

	/**
	 * Sets the starting y-coordinate of the Map
	 * 
	 * @param y coordinate
	 */
	public void setStartY(int y) {
		this.startY = y;
	}

}
