package br.fwk.db.connector.logs.interfaces;

/**
 * 
 * Interface para os coletores de logs - Utilizados pelos conectores para extração de dados
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
	 * @return boolean - True caso o processo seja finalizado com sucesso, false caso contrário.
	 * 
	 */
	boolean writeLog(Object logObject);
	
	/**
	 * Lê os registros gravados no log padrão do sistema
	 * 
	 * @return java.util.List - Lista de registros gravados no log de dados do sistema
	 */
	java.util.List<Object> readLog();
	
	
	/**
	 * 
	 * Procedimento de inicialização do log 
	 * 
	 * 
	 */
	boolean startProcess();
	
	/**
	 * 
	 * Procedimento de finalização do log
	 * 
	 */
	boolean endProcess();
}
