package com.crm.myjctl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.enterprise.inject.New;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import com.crm.domain.Client_Basic;
import com.crm.domain.Client_Linkman;
import com.crm.domain.My_Linkman;
import com.crm.service.BussinessService;
import com.crm.service.impl.BussinessService_Impl;

public class FindNameTag extends TagSupport {
	private String id;
	private String type;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int doEndTag() throws JspException {
		return super.doEndTag();
		
	}

	@Override
	public int doStartTag() throws JspException {
		BussinessService bs=new BussinessService_Impl();
//		System.out.println(getId());
		String eqid=getId();
		String eqtype=getType();
		
		if (eqtype.equals("Client")) {
			System.out.println(eqid);
			List<Client_Basic> allClient_Basics=bs.findAllClient();
			for(int i=0;i<allClient_Basics.size();i++){
				int RealCID=allClient_Basics.get(i).getClient_id();
				
				if (eqid.equals(new Integer(RealCID).toString())) {
					try {
						pageContext.getOut().write(allClient_Basics.get(i).getClient_name());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		if (eqtype.equals("Client_Linkman")) {
			List<Client_Linkman> allClient_Linkmans=bs.findAllClientLinkmans();
			for(int i=0;i<allClient_Linkmans.size();i++){
				int RealCID=allClient_Linkmans.get(i).getcLMid();
				
				if (eqid.equals(new Integer(RealCID).toString())) {
					try {
						pageContext.getOut().write(allClient_Linkmans.get(i).getcLMname());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		if (eqtype.equals("MyLinkman")) {
			List<My_Linkman> allMy_Linkmans=bs.findAllMy_Linkman();
			for(int i=0;i<allMy_Linkmans.size();i++){
				int RealCID=allMy_Linkmans.get(i).getMyLMid();
				
				if (eqid.equals(new Integer(RealCID).toString())) {
					try {
//						System.out.println(2);
						pageContext.getOut().write(allMy_Linkmans.get(i).getMyLMname());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
//		System.out.println(getType());
		return super.doStartTag();
	}

}
