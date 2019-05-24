/**
 * 
 */
package br.fwk.db;

/**
 * @author marcos.oliveira
 *
 */
public class AUTDBManagement {
	br.fwk.db.connector.AUTConnections connections = null; 					//Conector para fonte de dados
	br.fwk.db.connector.AUTFilesConnections connectionsFiles = null; 		//Conector para fonte de dados baseada em arquivos
	br.fwk.db.connector.AUTSGDBConnections connectionsSGDB = null; 			//Conector para fonte de dados baseada em sistemas sistema - SGDB
	
	
	/**
	 * 
	 * Retorna o gerenciador de conex�es gen�ricas - Implementam JDBC
	 * 
	 * @return objeto - Gerenciador de conex�es
	 * 
	 */
	public br.fwk.db.connector.AUTConnections getConnections() {
		return connections;
	}

	/**
	 * Altera o gerenciador de conex�es que implementa��o JDBC
	 * 
	 * @param connections - Novo gerenciado de conex�es
	 */
	public void setConnections(br.fwk.db.connector.AUTConnections connections) {
		this.connections = connections;
	}

	/**
	 * 
	 * Retorna o gerenciador de conex�es com arquivos
	 * 
	 * @return objeto - Gerenciador de conex�es com arquivos
	 * 
	 */
	public br.fwk.db.connector.AUTFilesConnections getConnectionsFiles() {
		return connectionsFiles;
	}

	/**
	 * 
	 * Altera o gerenciador de conex�es com arquivos
	 * 
	 * @param connectionsFiles - gerenciador de conex�es com arquivos
	 * 
	 */
	public void setConnectionsFiles(br.fwk.db.connector.AUTFilesConnections connectionsFiles) {
		this.connectionsFiles = connectionsFiles;
	}

	/**
	 * 
	 * Gerenciador de conex�es com o banco de dados - Sistemas Gerenciamento de Banco de Dados
	 * 
	 * 
	 * @return objeto - retorna o gerenciador SGBD
	 * 
	 */
	public br.fwk.db.connector.AUTSGDBConnections getConnectionsSGDB() {
		return connectionsSGDB;
	}

	
	/**
	 * 
	 * Altera o sistema gerenciador de banco de dados - Sistema Gerenciador de Banco de Dados
	 * 
	 * @param connectionsSGDB - Objeto gerenciador de banco de dados
	 * 
	 */
	public void setConnectionsSGDB(br.fwk.db.connector.AUTSGDBConnections connectionsSGDB) {
		this.connectionsSGDB = connectionsSGDB;
	}

	
	/**
	 * 
	 * Inicializa��o de parametros locais
	 * 
	 */
	private void initParams() {
		connections = new br.fwk.db.connector.AUTConnections();
		connectionsFiles = new br.fwk.db.connector.AUTFilesConnections();
		connectionsSGDB = new br.fwk.db.connector.AUTSGDBConnections();
	}
	
	
	/**
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
