package com.crm.dao;

import java.util.List;
import com.crm.domain.Goods;

public interface Goods_Dao {
	//��ȡ������Ʒ������Ϣ
	List<Goods> getAllGoods();
	
	//�����Ʒ
	void addGoods(Goods goods);
	
	//ɾ����Ʒ
	void deleteGoods(String goods_id);
	
	//���¿ͻ���Ϣ
	void updataGoods(Goods goods);
	
	//���ҵ�����Ʒ�Ļ�����Ϣ
	Goods getGoods(String goods_id);
}
