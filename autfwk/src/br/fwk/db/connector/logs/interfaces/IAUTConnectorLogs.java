package br.fwk.db.connector.logs.interfaces;

/**
 * 
 * Interface para os coletores de logs - Utilizados pelos conectores para extra��o de dados
 * 
 * @author marcos.oliveira
 *
 */
public interface IAUTConnectorLogs {
	/**
	 * 
	 *Registra o log do objeto no arquivo especificado
	 *
	 * @param logObject
	 * @return boolean - True caso o processo seja finalizado com sucesso, false caso contr�rio.
	 * 
	 */
	boolean writeLog(Object logObject);
	
	/**
	 * L� os registros gravados no log padr�o do sistema
	 * 
	 * @return java.util.List - Lista de registros gravados no log de dados do sistema
	 */
	java.util.List<Object> readLog();
	
	
	/**
	 * 
	 * Procedimento de inicializa��o do log 
	 * 
	 * 
	 */
	boolean startProcess();
	
	/**
	 * 
	 * Procedimento de finaliza��o do log
	 * 
	 */
	boolean endProcess();
}
