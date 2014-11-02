package es.improvisando.mvc.business.stories;

import java.util.Map;

import es.improvisando.mvc.model.story.Story;

public class StoryManager {
	private static Map<String, Story> myStoryList;
 
    // Private constructor suppresses 
    private StoryManager(){}
 
//    private synchronized static void createInstance() {
//        if (INSTANCE == null) { 
//            INSTANCE = new StoryManager();
//        	myStoryList = new HashMap<String, Story>();
//        	UUID id1 = UUID.randomUUID();
//        	Story story1 = new Story(id1, "Name1");
//        	story1.addStoryTrunk(new StoryTrunk("some text"));
//        	story1.addStoryTrunk(new StoryTrunk("some more text"));
//        	UUID id2 = UUID.randomUUID();
//        	Story story2 = new Story(id2, "Name2");
//        	story2.addStoryTrunk(new StoryTrunk("some text2"));
//        	story2.addStoryTrunk(new StoryTrunk("some more text2"));
//        	myStoryList.put(id1.toString(), story1);
//        	myStoryList.put(id2.toString(), story2);
//        }
//    }
// 
//    public static StoryManager getInstance() {
//        if (INSTANCE == null) createInstance();
//        return INSTANCE;
//    }
    
    public Story getStory(String id){
    	return myStoryList.get(id);
    }
    
    public int getNumberStories(){
    	return 0;
    	// TODO
    }
    
    public Map<String, Story> getUserStories(String userID){

    	return myStoryList;
    }

	public static Map<String, Story> getMyStoryList() {
		return myStoryList;
	}

	public static void setMyStoryList(Map<String, Story> myStoryList) {
		StoryManager.myStoryList = myStoryList;
	}
    
    
    
}
