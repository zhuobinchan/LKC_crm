package com.crm.dao;

import java.util.List;

import com.crm.domain.Feedback;

public interface Feedback_Dao {
public List<Feedback> allFeedbacks();//获取所有反馈记录本
public void addFeedbacks(Feedback feedback);//获取所有反馈记录本
public boolean deleteFeedback(String fbId);
}
