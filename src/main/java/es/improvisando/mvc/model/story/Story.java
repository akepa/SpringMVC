package es.improvisando.mvc.model.story;

import java.util.ArrayList;
import java.util.List;

public class Story {

	private String id;
	private List<StoryTrunk> storyTrunks;
	private String name;

	public Story() {

	}

	public Story(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<StoryTrunk> getStoryTrunks() {
		return storyTrunks;
	}

	public void addStoryTrunk(StoryTrunk newTrunk) {
		if (storyTrunks == null) {
			storyTrunks = new ArrayList<StoryTrunk>();
		}
		storyTrunks.add(newTrunk);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setStoryTrunks(List<StoryTrunk> storyTrunks) {
		this.storyTrunks = storyTrunks;
	}

	public void setName(String name) {
		this.name = name;
	}

}
