package junit.test;


import java.util.List;

import org.junit.Test;

import com.crm.domain.Client_Admin;
import com.crm.domain.Goods_Admin;
import com.crm.factory.Factory;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class AdminTest {
	@Test 
	public void test(){
		BussinessService bService =new BussinessService_Impl();
		System.out.println(bService.getAllFeedbacks().get(0).getClientId());
		}
}
