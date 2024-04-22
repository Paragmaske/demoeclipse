package LRU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Twitter {
	int timestamp = 0;

	Map<Integer, User> userMap;

	class User {
		int userId;
		HashSet<Integer> followerList;
		Tweet tweethead;

		User(int id) {
			this.userId = id;
			followerList = new HashSet<Integer>();
			tweethead = null;
		}
	}

	class Tweet {
		int tweetId;
		int time;
		Tweet next;

		Tweet(int id) {
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
			if (userMap.get(userId).tweethead == null) {
				userMap.get(userId).tweethead = new Tweet(tweetId);
			} else {
				Tweet newTweet = new Tweet(tweetId);
				Tweet previousHead = userMap.get(userId).tweethead;
				userMap.get(userId).tweethead = newTweet;
				newTweet.next = previousHead;

			}

		} else {
			User user = new User(userId);
			Tweet t = new Tweet(tweetId);
			user.tweethead = t;
			userMap.put(userId, user);
		}

	}

	public List<Integer> getNewsFeed(int userId) {
		List<Integer> topTenFeeds=new ArrayList<Integer>();
		PriorityQueue<Tweet> latestTweeetsFeed = new PriorityQueue<Twitter.Tweet>(
				(Tweet t1, Tweet t2) -> t2.time - t1.time);
		if (userMap.containsKey(userId)) {
			Tweet tweethead = userMap.get(userId).tweethead;

			while (tweethead != null) {
				latestTweeetsFeed.add(tweethead);
				tweethead = tweethead.next;
			}
			int count=0;
			while(!latestTweeetsFeed.isEmpty())
			{
				if(count==10)
				{
					break;
				}
				topTenFeeds.add(latestTweeetsFeed.poll().tweetId);
				count++;
			}
		}

		return topTenFeeds;

	}
}