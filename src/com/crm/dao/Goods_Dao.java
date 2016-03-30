package com.crm.dao;

import java.util.List;
import com.crm.domain.Goods;

public interface Goods_Dao {
	//获取所有商品基本信息
	List<Goods> getAllGoods();
	
	//添加商品
	void addGoods(Goods goods);
	
	//删除商品
	void deleteGoods(String goods_id);
	
	//更新客户信息
	void updataGoods(Goods goods);
	
	//查找单个商品的基本信息
	Goods getGoods(String goods_id);
}
