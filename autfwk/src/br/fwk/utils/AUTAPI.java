/**
 * 
 */
package br.fwk.utils;

/**
 * 
 * Define uma interface de programação reutilizável
 * 
 * 
 * @author marcos.oliveira
 *
 */
public class AUTAPI {
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
	 * Método main de inicialização para testes locais
	 * 
	 * @param args - Argumentos
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
