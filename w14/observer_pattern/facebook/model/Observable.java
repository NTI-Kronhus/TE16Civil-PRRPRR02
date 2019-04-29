package observer_pattern.facebook.model;

import java.util.ArrayList;

import observer_pattern.facebook.view.Observer;

public abstract class Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObbserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
