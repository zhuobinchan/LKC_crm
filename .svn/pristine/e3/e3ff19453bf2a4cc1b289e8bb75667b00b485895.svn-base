package com.crm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crm.dao.Goods_Dao;
import com.crm.domain.Goods;
import com.crm.jdbc.Database;
import com.mysql.jdbc.ResultSet;

public class Goods_Impl implements Goods_Dao {
	//查找所有商品，保存到all_goods中
	private PreparedStatement pstam;
	@Override
	public List<Goods> getAllGoods() {
		
		List<Goods> all_goods=new ArrayList<Goods>();
		Goods goods=null;
		
		String sql="select * from goods";
		ResultSet rs=(ResultSet) Database.query(sql);
		
		try {		
			while(rs.next()){
				goods=new Goods();		
				//商品资料
				goods.setGid(rs.getString("Gid"));
				goods.setGname(rs.getString("Gname"));
				goods.setGprice(rs.getDouble("Gprice"));
				all_goods.add(goods);		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		Database.Close();
		return all_goods;
	}
	//增加商品
	public void addGoods(Goods goods) {
		
		Connection conn=Database.getConnection();
		String sql="INSERT goods (Gid,Gname,Gprice) values (?,?,?)";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setString(1,goods.getGid());
			pstam.setString(2,goods.getGname());
			pstam.setDouble(3,goods.getGprice());
			pstam.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
	}
	//删除商品
	public void deleteGoods(String goods_id){
		String sql="delete from goods where Gid=?";
		Connection conn=Database.getConnection();
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setString(1,goods_id);
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
	}
	//修改商品
	public void updataGoods(Goods goods){
		Connection conn=Database.getConnection();
		String sql="update goods set Gname=?,Gprice=? where Gid=?";
		try {
			pstam=conn.prepareStatement(sql);
			pstam.setString(1,goods.getGname());
			pstam.setDouble(2,goods.getGprice());
			pstam.setString(3,goods.getGid());
			pstam.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
	}
	//查找单个商品的基本信息
	public Goods getGoods(String goods_id){
		Goods goods=null;
		String sql="select *from goods where Gid='"+goods_id+"'";
		ResultSet rs=(ResultSet) Database.query(sql);
		try {
			while(rs.next()){
				goods=new Goods();
				goods.setGid(rs.getString("Gid"));
				goods.setGname(rs.getString("Gname"));
				goods.setGprice(rs.getDouble("Gprice"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Database.Close();
		return goods;
	}
}
