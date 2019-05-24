/**
 * 
 */
package br.fwk.types.reflection.interfaces;

/**
 * @author marcos.oliveira
 *
 */
public interface IAUTBaseDataExtractor {
	public static class AUTClassDefinition{
		/**
		 * 
		 * Define o nomo padr�o da classe, capturado em tempo de execu��o
		 * 
		 */
		private String className=null;
		
		/**
		 * 
		 * Define a express�o regular para extra��o de dados em tempo de execu��o 
		 * 
		 * - Nome da classe
		 * 
		 */
		private String regExpClassName = null;
		
		/**
		 * 
		 * Define a lista de vari�veis locais carregadas din�micamente:
		 *  
		 * - Declaradas no escopo local da classe atual
		 * 
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> variables = null;
		
		/**
		 * 
		 * Define a express�o regular utilizada como filtro durante o carregamento dos objetos em 
		 * tempo de execu��o.
		 * 
		 */
		private String regExpVariableName = null;
		
		
		/**
		 * 
		 * Define uma lista de vari�veis est�ticas declaradas no escopo da classe em tempo de execu��o 
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> staticVariableName = null;
		
		
		/**
		 * 
		 * Define a express�o regular utilizada como filtro para carregar as vari�veis est�ticas 
		 * em tempo de execu��o.
		 * 
		 */
		private String regExpStaticVariableName = null;
		
		
		/**
		 * 
		 * Define uma lista de m�todos declarados no escopo da classes atual
		 * 
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListExecution = null;
		
		
		/**
		 * 
		 * Define a express�o regular que ser� utilizada como filtro
		 * para carregar os m�todos declarados no escopo da classe atual
		 * 
		 */
		private String regExpMethodList = null;
		
		
		/**
		 * 
		 * Define uma lista com os met�dos que foram chamados na pilha de execu��o
		 * 
		 * - Relacionados a execu��o atual
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> listMethodStackTrace = null;
		
		
		/**
		 * 
		 * Define a express�o regular utilizada como filtro durante o carregamento de m�todos espec�ficos em tempo de execu��o
		 * 
		 * 
		 */
		private String regExpListMethodsStackTrace = null;
		
		
		/**
		 * 
		 * Define uma lista das classes superiores na hierarquia de objetos
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> listClassesParents = null;
	}
	
}
