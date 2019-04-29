package observer_pattern.facebook.model;

import java.util.ArrayList;

public class FacebookUser extends Observable {

	private ArrayList<String> posts = new ArrayList<String>();

	private String name;

	public FacebookUser(String name) {
		this.name = name;
	}

	public void newPost(String text) {
		posts.add(text);
		notifyObservers();
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getPosts() {
		return posts;
	}

}
