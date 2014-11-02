package es.improvisando.mvc.model.story;

import es.improvisando.mvc.model.authentication.User;

public class StoryTrunk {

	private String text;
	private User author;

	public StoryTrunk() {

	}

	public StoryTrunk(String text, User author) {
		super();
		this.text = text;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

}
