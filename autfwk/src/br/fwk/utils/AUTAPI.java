/**
 * 
 */
package br.fwk.utils;

/**
 * 
 * Define uma interface de programa��o reutiliz�vel
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
	 * - Express�es regulares
	 * 
	 * @author marcos.oliveira
	 *
	 */
	public static enum TYPE_REG_EXPRESSION_TARGET_OBJECT{
		/**
		 * 
		 * O parametro para processamento - Reg Exp � :
		 * 
		 * - Dicion�rio de dados
		 * - Chave - Classe definida pelo usu�rio
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_CUSTOM_VALUE_CUSTOM,
		
		/**
		 * 
		 * O parametro para processamento - Reg Exp � :
		 * 
		 * - Dicion�rio de dados
		 * - Chave - Classe definida pelo usu�rio
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_CUSTOM_VALUE_OBJECT,
		
		/**
		 * 
		 * O parametro para processamento - Reg Exp � :
		 * 
		 * - Dicion�rio de dados
		 * - Chave - Objeto
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_OBJECT_VALUE_OBJECT,
		
		/**
		 * 
		 * O parametro para processamento - Reg Exp � :
		 * 
		 * - Dicion�rio de dados
		 * - Chave - String
		 * - Valor - Objeto
		 * 
		 */
		DICTIONARY_KEY_STRING_VALUE_OBJECT,
		/**
		 * 
		 * O parametro para processamento - Reg Exp � :
		 * 
		 * - Dicion�rio de dados
		 * - Chave - String
		 * - Valor - String
		 * 
		 */
		DICTIONARY_KEY_STRING_VALUE_STRING,
		/**
		 * 
		 * O parametro para processamento - Reg Exp � do tipo N�merico
		 * 
		 */
		NUMERICO,
		/**
		 * 
		 * O parametro para processamento - Reg Exp � do tipo String
		 * 
		 */
		STRING,
		/**
		 * 
		 * O parametro para processamento - Reg Exp � do tipo Objeto
		 * 
		 */
		OBJECT,
		/**
		 * 
		 * O parametro para processamento - Reg Exp � do tipo Customizado - Definido pelo usu�rio
		 * 
		 */
		CUSTOMIZADO
	}
	
	/**
	 * 
	 * M�todo main de inicializa��o para testes locais
	 * 
	 * @param args - Argumentos
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
