package com.crm.factory;


import com.crm.dao.Client_Admin_Dao;
import com.crm.dao.Client_Basic_Dao;
import com.crm.dao.Client_Detail_Dao;
import com.crm.dao.Client_Linkman_Dao;
import com.crm.dao.Contract_Dao;
import com.crm.dao.Feedback_Dao;
import com.crm.dao.Files_Dao;
import com.crm.dao.Goods_Admin_Dao;
import com.crm.dao.Goods_Dao;
import com.crm.dao.My_Linkman_Dao;
import com.crm.dao.Relationship_Record_Dao;
import com.crm.dao.System_Admin_Dao;
import com.crm.dao.impl.Client_Admin_Impl;
import com.crm.dao.impl.Client_Basic_Impl;
import com.crm.dao.impl.Client_Detail_Impl;
import com.crm.dao.impl.Client_Linkman_Impl;
import com.crm.dao.impl.Contract_Impl;
import com.crm.dao.impl.Feedback_Impl;
import com.crm.dao.impl.Files_Impl;
import com.crm.dao.impl.Goods_Admin_Impl;
import com.crm.dao.impl.Goods_Impl;
import com.crm.dao.impl.My_Linkman_Impl;
import com.crm.dao.impl.Relationship_Record_Impl;
import com.crm.dao.impl.System_Admin_Impl;
import com.crm.domain.Contract;

public class Factory {
    public static Client_Admin_Dao getClient_Admin_Impl(){
    	return new Client_Admin_Impl();
    }
    public static Client_Basic_Dao getClient_Basic_Impl(){
    	return new Client_Basic_Impl();
    }
    public static Client_Detail_Dao getClient_Detail_Impl(){
    	return new Client_Detail_Impl();
    }
    public static Client_Linkman_Dao getClient_Linkman_Impl(){
    	return new Client_Linkman_Impl();
    }
    public static Feedback_Dao getFeedback_Dao_Impl(){
    	return new Feedback_Impl();
    }
    
    public static Goods_Admin_Dao getGoods_Admin_Impl(){
    	return new Goods_Admin_Impl();
    }
    public static Goods_Dao getGoods_Impl(){
    	return new Goods_Impl();
    }
    public static My_Linkman_Dao getMy_Linkman_Impl(){
    	return new My_Linkman_Impl();
    }
    public static Relationship_Record_Dao  getRelationship_Record_Impl(){
    	return new Relationship_Record_Impl();
    }
    public static System_Admin_Dao getSystem_Admin_Impl(){
    	return new System_Admin_Impl();
    }
    public static Files_Dao getFiles_Impl(){
    	return new Files_Impl();
    }
    public static Contract_Dao getContracts_Impl(){
    	return new 	Contract_Impl();
    }
}
