package observer_pattern.facebook.view;

import observer_pattern.facebook.model.FacebookUser;

public class FollowerView implements Observer {

	private FacebookUser obj;

	public FollowerView(FacebookUser user) {
		obj = user;
		user.addObserver(this);
	}

	@Override
	public void update() {
		updateView();
	}

	public void updateView() {
		System.out.println("\n\n---- FEED ----");
		String name = obj.getName();
		for (String post : obj.getPosts()) {
			System.out.println(name + ": " + post);
		}
	}

}
