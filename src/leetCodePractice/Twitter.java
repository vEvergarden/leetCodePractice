package leetCodePractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Twitter {
	
	//推文类
	private class Tweet{
		//推文id
		private int id;
		//推文时间戳
		private int timestamp;
		private Tweet next;
		
		public Tweet() {}
		
		public Tweet(int id, int timestamp) {
			this.id = id;
			this.timestamp = timestamp;
		}
		
	}
	
	//推文表
    private Map<Integer, Tweet> twitter;
    
    //追星表
    private Map<Integer, Set<Integer>> followings;
    
    //时间戳
    private static int timestamp = 0;
    
    //k路合并
    private static PriorityQueue<Tweet> maxHeap;
    
    
	
	/** Initialize your data structure here. */
    public Twitter() {
    	
    	followings = new HashMap<>();
    	twitter = new HashMap<>();
    	maxHeap = new PriorityQueue<>((o1,o2)->o1.timestamp+o2.timestamp);
    	

    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
    	
    	timestamp++;
    	if(twitter.containsKey(userId)) {
    		
    	}



    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
    	
    	
    	return null;

    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {

    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {

    }

}
