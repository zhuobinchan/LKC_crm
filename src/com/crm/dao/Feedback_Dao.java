package com.crm.dao;

import java.util.List;

import com.crm.domain.Feedback;

public interface Feedback_Dao {
public List<Feedback> allFeedbacks();//��ȡ���з�����¼��
public void addFeedbacks(Feedback feedback);//��ȡ���з�����¼��
public boolean deleteFeedback(String fbId);
}
