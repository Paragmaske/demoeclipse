package Design;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

class Twitter {
	int timestamp = 0;

	Map<Integer, User> userMap;

	class User {
		int userId;
		HashSet<Integer> followerList;
		Twit tweethead;

		User(int id) {
			this.userId = id;
			followerList = new HashSet<Integer>();
			tweethead = null;
		}
	}

	class Twit {
		int tweetId;
		int time;
		Twit next;

		Twit(int id) {
			this.tweetId = id;
			time = timestamp++;
			this.next = null;
		}
	}

	Twitter() {
		userMap = new HashMap<Integer, Twitter.User>();
	}

	public void follow(int followerId, int followeeId) {
		if (userMap.containsKey(followerId)) {
			if (userMap.get(followerId).followerList.contains(followeeId)) {
				System.out.println("Already following");
			} else {
				userMap.get(followerId).followerList.add(followeeId);

			}

		}
	}

	public void unfollow(int followerId, int followeeId) {
		if (userMap.containsKey(followerId)) {
			if (userMap.get(followerId).followerList.contains(followeeId)) {
				userMap.get(followerId).followerList.remove(followeeId);
				System.out.println("unfollowed ");
			} else {
				System.out.println("you were already not following");
			}

		}
	}

	public void postTweet(int userId, int tweetId) {
		if (userMap.containsKey(userId)) {

			Twit tweets = userMap.get(userId).tweethead;

		}

	}

	public void getNewsFeed(int userid) {
		User user = userMap.get(userid);
		HashSet<Integer> followerList = user.followerList;
		PriorityQueue<Twit> p = new PriorityQueue<Twitter.Twit>();

		for (Integer follower : followerList) {
			Twit currentNode = userMap.get(follower).tweethead;
			while (currentNode != null) {
				 p.add(currentNode);
				 currentNode=currentNode.next;
			}
		}
	}
}