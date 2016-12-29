package bupt.edu.virtual.dao;

import java.util.List;

import bupt.edu.virtual.entity.FeedBack;

public interface FeedBackDao {
	public void saveFeedBack(String content);
	
	public List<FeedBack> queryAllFeedBack();

	List<FeedBack> queryAllFeedBack(FeedBack feedback);
}
