package hus;

public class SingleWindowFloor extends Floor{

	public SingleWindowFloor(double w, double h, int level) {
		super(w, h, level);
		
		Window window = new Window(h);
		
		window.setTranslateX(w/2-h/4-h/24);
		window.setTranslateY(h/4);
		
		this.getChildren().add(window);
		
	
	}
	
	

}
