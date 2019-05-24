/**
 * 
 */
package br.fwk.db.connector.sgdb.interfaces;

import br.fwk.db.connector.logs.interfaces.IAUTConnectorLogs;

/**
 * Interface de conexão para sistemas de gerenciamento de banco de dados
 * 
 * @author marcos.oliveira
 *
 */
public interface IAUTSGDBConnections extends IAUTConnectorLogs{
	
	/**
	 * 
	 * Cria uma nova conexão a partir da URL de recursos - String de conexão
	 * 
	 * @param url - URL de configuração da conexão - Connection String
	 * 
	 * @return java.sql.Connection - Objeto de conexão
	 * 
	 */
	java.sql.Connection getNewConnection(String url);
	/**
	 * 
	 * Cria uma nova conexão com o banco de dados
	 * 
	 * @param host - Host que hospeda o banco de dados
	 * @param database - Nome do banco de dados
	 * @param userName - Nome do usuário com acesso ao banco de dados
	 * @param password - Senha do banco de dados
	 * @return java.sql.Connection - Objeto de conexão com o banco de dados
	 * 
	 */
	java.sql.Connection getNewConnection(String host,String database,String userName,String password);


	/**
	 * Cria uma nova conexão com o banco de dados usando configurações - Padrão
	 * 
	 * @return java.sql.Connection - Objeto de conexão com o banco de dados
	 */
	java.sql.Connection getNewConnection();
	
	/**
	 * 
	 * Altera a conexão atualmente ativa com o banco de dados
	 * 
	 * @param host - Host que hospeda o banco de dados
	 * @param database - Nome do banco de dados
	 * @param userName - Nome do usuário com acesso ao banco de dados
	 * @param password - Senha do banco de dados
	 * @return java.sql.Connection - Objeto de conexão com o banco de dados
	 * 
	 */
	java.sql.Connection setConnection(String host,String database,String userName,String password);
	
	/**
	 * 
	 * Retorna a conexão ativa com o banco de dados
	 * 
	 * @return
	 */
	java.sql.Connection getActiveConnection();
}
