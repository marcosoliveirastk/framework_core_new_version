/**
 * 
 */
package br.fwk.db.connector.sgdb;

import java.lang.annotation.AUTAnnotations;
import java.lang.annotation.AUTAnnotations.MODULE_DEFINITION;
import java.lang.annotation.AUTAnnotations.PRIORITY_EXECUTION_FROM_TESTS;
import java.lang.annotation.AUTAnnotations.PROJECT_DEFINITION;
import java.lang.annotation.AUTAnnotations.TYPE_MEMBER_FROM_CODE;
import java.sql.Connection;

@AUTAnnotations.BUSINESS_PROJECT(PROJECT = PROJECT_DEFINITION.PROJECT_SYSTEM_1)
@AUTAnnotations.BUSINESS_MODULE(MODULE = MODULE_DEFINITION.MODULE_34)
/**
 * @author marcos.oliveira
 *
 */
public abstract class AUTDBConMySql implements br.fwk.db.connector.sgdb.interfaces.IAUTSGDBConnections{

	@Override
	public Connection getNewConnection(String host, String database, String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getNewConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection setConnection(String host, String database, String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getActiveConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	
}


