/**
 * 
 */
package br.fwk.db.connector.sgdb.interfaces;

import br.fwk.db.connector.logs.interfaces.IAUTConnectorLogs;

/**
 * Interface de conex�o para sistemas de gerenciamento de banco de dados
 * 
 * @author marcos.oliveira
 *
 */
public interface IAUTSGDBConnections extends IAUTConnectorLogs{
	/**
	 * 
	 * Cria uma nova conex�o com o banco de dados
	 * 
	 * @param host - Host que hospeda o banco de dados
	 * @param database - Nome do banco de dados
	 * @param userName - Nome do usu�rio com acesso ao banco de dados
	 * @param password - Senha do banco de dados
	 * @return java.sql.Connection - Objeto de conex�o com o banco de dados
	 * 
	 */
	java.sql.Connection getNewConnection(String host,String database,String userName,String password);


	/**
	 * Cria uma nova conex�o com o banco de dados usando configura��es - Padr�o
	 * 
	 * @return java.sql.Connection - Objeto de conex�o com o banco de dados
	 */
	java.sql.Connection getNewConnection();
	
	/**
	 * 
	 * Altera a conex�o atualmente ativa com o banco de dados
	 * 
	 * @param host - Host que hospeda o banco de dados
	 * @param database - Nome do banco de dados
	 * @param userName - Nome do usu�rio com acesso ao banco de dados
	 * @param password - Senha do banco de dados
	 * @return java.sql.Connection - Objeto de conex�o com o banco de dados
	 * 
	 */
	java.sql.Connection setConnection(String host,String database,String userName,String password);
	
	/**
	 * 
	 * Retorna a conex�o ativa com o banco de dados
	 * 
	 * @return
	 */
	java.sql.Connection getActiveConnection();
}
