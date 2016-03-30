package com.crm.dao;

import java.util.List;
import com.crm.domain.Files;

public interface Files_Dao {
	public List<Files> allFiles();
	public boolean updateFiles(String upusername,String upfilename,String updata);
}
