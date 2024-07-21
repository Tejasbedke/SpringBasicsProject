package com.tej.DOA;

import javax.sql.DataSource;

import com.tej.comps.CustomerBO;

public interface IDOADatabaseInteraction {
	
	public int insert(CustomerBO datasource)throws Exception;
}
