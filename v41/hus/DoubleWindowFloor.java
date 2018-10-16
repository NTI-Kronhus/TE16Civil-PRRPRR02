package hus;

public class DoubleWindowFloor extends Floor{

	public DoubleWindowFloor(double w, double h, int level) {
		super(w, h, level);
		
		Window window = new Window(h);
		
		window.setTranslateX(w/6);
		window.setTranslateY(h/4);
		
		Window window2 = new Window(h);
		
		window2.setTranslateX(3.5*w/6);
		window2.setTranslateY(h/4);
		this.getChildren().addAll(window,window2);
		
	
	}
	
	

}
