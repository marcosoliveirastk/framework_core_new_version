/**
 * 
 */
package br.fwk.utils;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileAttribute;
import java.util.regex.Matcher;

/**
 * 
 * Define uma interface de programação reutilizável
 * 
 * 
 * @author marcos.oliveira
 *
 */
public class AUTAPI{
	
	/**
	 * 
	 * Path associada ao arquivo de log local
	 * 
	 */
	private java.nio.file.Path pathLogFile = null;
	
	
	/**
	 * 
	 * Define as opções de configuração de padrão para o projeto
	 * 
	 * @author marcos.oliveira
	 *
	 */
	public static enum OPTIONS_MACHINE_CONFIGURATION{		
		
		/**
		 * Caminho do arquivo local para direcionamento das mensagens de log
		 * do sistema.
		 * 
		 */
		DIRECTORY_LOG_LOCAL;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			switch(this) {
			case DIRECTORY_LOG_LOCAL:{				
				return "OUTPUT_LOG_LOCAL.txt";
			}
			}
			return super.toString();
		}
	}
	
	
	/**
	 *
	 * Diretório onde será armazenado o log da execução
	 * 
	 */
	private static String directoryLogLocal = null;
	
	/**
	 * 
	 * Diretório compartilhado na rede onde será armazenado o log da execução
	 * 
	 */
	private static String directoryLogSharedNetwork = null;

	/**
	 *
	 * Usuário utilizado para mapeamento da pasta de rede compartilhada - Registro de Log
	 * 
	 */
	private static String userNameForLogSharedNetwork = null;
	
	/**
	 * 
	 * Senha utilizada para autenticação do usuário de rede para pasta de rede compartilhada - Registro de Log
	 * 
	 */
	private static String passwordForUserNameLogSharedNetwork = null;
		
	/**
	 * 
	 *Endereço para direcionamento de log da execução - Via rede TCP/IPV4
	 * 
	 */
	private static String addressLogInNetworkTCPIP = null;
	
	
	/**
	 *
	 * Porta de serviço aberta para conexão - Servidor de Log
	 * 
	 */
	private static String portLogInNetworkTCPIP = null;
	
	
	/**
	 * 
	 * Define os tipos de objetos alvo para processamento:
	 * 
	 * - Expressões regulares
	 * 
	 * @author marcos.oliveira
	 *
	 */
	public static enum TYPE_REG_EXPRESSION_TARGET_OBJECT{
		/**
		 * 
		 * O parametro para processamento - Reg Exp é :
		 * 
		 * - Dicionário de dados
		 * - Chave - Classe definida pelo usuário
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_CUSTOM_VALUE_CUSTOM,
		
		/**
		 * 
		 * O parametro para processamento - Reg Exp é :
		 * 
		 * - Dicionário de dados
		 * - Chave - Classe definida pelo usuário
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_CUSTOM_VALUE_OBJECT,
		
		/**
		 * 
		 * O parametro para processamento - Reg Exp é :
		 * 
		 * - Dicionário de dados
		 * - Chave - Objeto
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_OBJECT_VALUE_OBJECT,
		
		/**
		 * 
		 * O parametro para processamento - Reg Exp é :
		 * 
		 * - Dicionário de dados
		 * - Chave - String
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_STRING_VALUE_OBJECT,
		/**
		 * 
		 * O parametro para processamento - Reg Exp é :
		 * 
		 * - Dicionário de dados
		 * - Chave - String
		 * - Valor - String
		 * 
		 */
		DICTIONARY_KEY_STRING_VALUE_STRING,
		/**
		 * 
		 * O parametro para processamento - Reg Exp é do tipo Númerico
		 * 
		 */
		NUMERICO,
		/**
		 * 
		 * O parametro para processamento - Reg Exp é do tipo String
		 * 
		 */
		STRING,
		/**
		 * 
		 * O parametro para processamento - Reg Exp é do tipo Objeto
		 * 
		 */
		OBJECT,
		/**
		 * 
		 * O parametro para processamento - Reg Exp é do tipo Customizado - Definido pelo usuário
		 * 
		 */
		CUSTOMIZADO
	}
	
	
	/**
	 * 
	 * Verifica a correspondência de uma uma expressão regular em um conteúdo específico
	 * 
	 * @param regExpVerify - Expressão regular para avaliação
	 * @param inputValue - Conteúdo para processamento com expressão regular
	 * 
	 * @return java.util.List - Lista com os resultados do processamento
	 * 
	 */
	private java.util.List<String> getListResultByExpression(String regExpVerify,Object inputValue){
		/**
		 * Declaração de variáveis
		 * 
		 */
		java.util.regex.Pattern regExp = java.util.regex.Pattern.compile(regExpVerify);
		java.util.regex.Matcher verify = regExp.matcher(inputValue.toString());
		java.util.List<String> result = null;		
		
		/**
		 * 
		 * Verificação de expressão regular
		 * 
		 */
		verify.find();
		String out = verify.group();
		
		/**
		 * 
		 * Inicialização do objeto lista para armazenar os resultados
		 * 
		 */
		if(out!=null) result = new java.util.ArrayList<String>();
		if(result!=null) result.add(out);
		
		/**
		 * 
		 * Concluí o processamento do conteúdo informado com parametro
		 * 
		 */
		while(verify.find()) {
			out = verify.group();
			result.add(out);
		}
		
		return result;
	}
		
	/**
	 * 
	 * Processa a expressão regular
	 * 
	 * @param regExp 			- Expressão regular para processamento
	 * @param valueInput 		- Valor para processamento
	 * @return java.util.List - -Lista de items encontrados pela expressão regular
	 *
	 */
	public static java.util.List<Object> processRegExp(String regExpVarify,Object valueInput) {	
		java.util.regex.Pattern regExp = java.util.regex.Pattern.compile(regExpVarify);
		java.util.regex.Matcher verif = null;
		if(valueInput instanceof Integer) {
			
		}
		else if(valueInput instanceof String) {
			
		}
		else if(valueInput instanceof java.util.List) {
			
		}
		else if(valueInput instanceof Boolean) {
			
		}
		else if(valueInput instanceof java.util.AbstractMap.SimpleEntry) {
			
		}
		else if(valueInput instanceof java.util.HashMap) {
			
		}
		
		return null;
	}
	
	/**
	 * @return the directoryLogLocal
	 */
	public static String getDirectoryLogLocal() {
		return directoryLogLocal;
	}

	/**
	 * @param directoryLogLocal the directoryLogLocal to set
	 */
	public static void setDirectoryLogLocal(String directoryLogLocal) {
		AUTAPI.directoryLogLocal = directoryLogLocal;
	}

	/**
	 * @return the directoryLogSharedNetwork
	 */
	public static String getDirectoryLogSharedNetwork() {
		return directoryLogSharedNetwork;
	}

	/**
	 * @param directoryLogSharedNetwork the directoryLogSharedNetwork to set
	 */
	public static void setDirectoryLogSharedNetwork(String directoryLogSharedNetwork) {
		AUTAPI.directoryLogSharedNetwork = directoryLogSharedNetwork;
	}

	/**
	 * @return the userNameForLogSharedNetwork
	 */
	public static String getUserNameForLogSharedNetwork() {
		return userNameForLogSharedNetwork;
	}

	/**
	 * @param userNameForLogSharedNetwork the userNameForLogSharedNetwork to set
	 */
	public static void setUserNameForLogSharedNetwork(String userNameForLogSharedNetwork) {
		AUTAPI.userNameForLogSharedNetwork = userNameForLogSharedNetwork;
	}

	/**
	 * 
	 * Inicializa o serviço de log local com as configurações padrão
	 * 
	 * @return String - Caminho do arquivo de log
	 * @throws IOException 
	 * 
	 */
	public static String startLogLocalWithDefaultConfiguration() throws IOException {
		java.nio.file.Path pth = java.nio.file.Paths.get(OPTIONS_MACHINE_CONFIGURATION.DIRECTORY_LOG_LOCAL.toString());
	
		if(java.nio.file.Files.exists(pth, java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
			
		}
		
		java.nio.file.Path pathLogFile = java.nio.file.Files.createFile(java.nio.file.Paths.get(OPTIONS_MACHINE_CONFIGURATION.DIRECTORY_LOG_LOCAL.toString()));
		
		
		
		return "";
	}
	
	
	/**
	 * @return the passwordForUserNameLogSharedNetwork
	 */
	public static String getPasswordForUserNameLogSharedNetwork() {
		return passwordForUserNameLogSharedNetwork;
	}

	/**
	 * @param passwordForUserNameLogSharedNetwork the passwordForUserNameLogSharedNetwork to set
	 */
	public static void setPasswordForUserNameLogSharedNetwork(String passwordForUserNameLogSharedNetwork) {
		AUTAPI.passwordForUserNameLogSharedNetwork = passwordForUserNameLogSharedNetwork;
	}

	/**
	 * @return the addressLogInNetworkTCPIP
	 */
	public static String getAddressLogInNetworkTCPIP() {
		return addressLogInNetworkTCPIP;
	}

	/**
	 * @param addressLogInNetworkTCPIP the addressLogInNetworkTCPIP to set
	 */
	public static void setAddressLogInNetworkTCPIP(String addressLogInNetworkTCPIP) {
		AUTAPI.addressLogInNetworkTCPIP = addressLogInNetworkTCPIP;
	}

	/**
	 * @return the portLogInNetworkTCPIP
	 */
	public static String getPortLogInNetworkTCPIP() {
		return portLogInNetworkTCPIP;
	}

	/**
	 * @param portLogInNetworkTCPIP the portLogInNetworkTCPIP to set
	 */
	public static void setPortLogInNetworkTCPIP(String portLogInNetworkTCPIP) {
		AUTAPI.portLogInNetworkTCPIP = portLogInNetworkTCPIP;
	}

	/**
	 * 
	 * Método main de inicialização para testes locais
	 * 
	 * @param args - Argumentos
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
