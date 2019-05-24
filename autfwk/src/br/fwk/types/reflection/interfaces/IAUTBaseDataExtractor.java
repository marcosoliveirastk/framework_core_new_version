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
		 * Define o nomo padrão da classe, capturado em tempo de execução
		 * 
		 */
		private String className=null;
		
		/**
		 * 
		 * Define a expressão regular para extração de dados em tempo de execução 
		 * 
		 * - Nome da classe
		 * 
		 */
		private String regExpClassName = null;
		
		/**
		 * 
		 * Define a lista de variáveis locais carregadas dinâmicamente:
		 *  
		 * - Declaradas no escopo local da classe atual
		 * 
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> variables = null;
		
		/**
		 * 
		 * Define a expressão regular utilizada como filtro durante o carregamento dos objetos em 
		 * tempo de execução.
		 * 
		 */
		private String regExpVariableName = null;
		
		
		/**
		 * 
		 * Define uma lista de variáveis estáticas declaradas no escopo da classe em tempo de execução 
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> staticVariableName = null;
		
		
		/**
		 * 
		 * Define a expressão regular utilizada como filtro para carregar as variáveis estáticas 
		 * em tempo de execução.
		 * 
		 */
		private String regExpStaticVariableName = null;
		
		
		/**
		 * 
		 * Define uma lista de métodos declarados no escopo da classes atual
		 * 
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListExecution = null;
		
		
		/**
		 * 
		 * Define a expressão regular que será utilizada como filtro
		 * para carregar os métodos declarados no escopo da classe atual
		 * 
		 */
		private String regExpMethodList = null;
		
		
		/**
		 * 
		 * Define uma lista com os metódos que foram chamados na pilha de execução
		 * 
		 * - Relacionados a execução atual
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> listMethodStackTrace = null;
		
		
		/**
		 * 
		 * Define a expressão regular utilizada como filtro durante o carregamento de métodos específicos em tempo de execução
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
