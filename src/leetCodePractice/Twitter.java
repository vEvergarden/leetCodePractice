package leetCodePractice;

import java.util.List;

public class Twitter {
	
	//推文类
	private class Tweet{
		//推文id
		private int id;
		//推文时间戳
		private int timestamp;
		private Tweet next;
		
		public Tweet(int id, int timestamp) {
			this.id = id;
			this.timestamp = timestamp;
		}
		
	}
	
	//推文表
    private Map<Integer, Tweet> twitter;
	
	/** Initialize your data structure here. */
    public Twitter() {
    	
    	tweet = new 

    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {



    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {

    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {

    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {

    }

}
