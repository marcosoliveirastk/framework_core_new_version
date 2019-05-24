/**
 * 
 */
package br.fwk.db.connector;

import java.sql.Connection;
import java.util.List;

/**
 * @author marcos.oliveira
 *
 */
public class AUTSGDBConnections implements br.fwk.db.connector.sgdb.interfaces.IAUTSGDBConnections{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean writeLog(Object logObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object> readLog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean startProcess() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean endProcess() {
		// TODO Auto-generated method stub
		return false;
	}

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
