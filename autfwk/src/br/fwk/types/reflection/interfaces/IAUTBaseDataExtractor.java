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
		 * Define a lista de métodos herdados da estrutura de classes referenciadas por herança
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListInherit = null;
		
		/**
		 * 
		 * Define a expressão regular utilizada para filtrar métodos específicos que serão carregados na lista de objetos herdados
		 * 
		 */
		private String regExpMethodListInherit = null;
		
		
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
		 * Define uma lista das classes superiores na hierarquia de objetos - Estrutura de herança entre objetos
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> listClassesParents = null;
		
		/**
		 * 
		 * Expressão regular utilizada para filtrar os objetos que serão carregados na lista de classes - Relacionadas a atual através de herança entre objetos
		 * 
		 * 
		 * 
		 */
		private String regExpListClassesParents = null;
		
		
		
		/**
		 * 
		 * Retorna o nome da classes atual
		 * 
		 * @return the className
		 */
		public String getClassName() {
			return className;
		}

		/**
		 * 
		 * Altera o nome da classe atual
		 * 
		 * @param className the className to set
		 */
		public void setClassName(String className) {
			this.className = className;
		}

		/**
		 * Retorna a expressão regular que define o nome da classe atual
		 * 
		 * @return the regExpClassName
		 */
		public String getRegExpClassName() {
			return regExpClassName;
		}

		/**
		 * 
		 * Altera a expressão regular que define o nome da classe atual
		 * 
		 * @param regExpClassName the regExpClassName to set
		 */
		public void setRegExpClassName(String regExpClassName) {
			this.regExpClassName = regExpClassName;
		}

		/**
		 * 
		 * Retorna a lista de variáveis declaradas na classe atual
		 * 
		 * @return the variables
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> getVariables() {
			return variables;
		}

		/**
		 * 
		 * Altera a lista de variáveis declaradas na classe atual
		 * 
		 * @param variables the variables to set
		 */
		public void setVariables(java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> variables) {
			this.variables = variables;
		}

		/**
		 * Retorna a expressão regular que define a lista de variáveis declaradas no escopo da classe atual
		 * 
		 * @return the regExpVariableName
		 */
		public String getRegExpVariableName() {
			return regExpVariableName;
		}

		/**
		 * 
		 * Altera a expressão regular que define  a lista de variáveis do escopo da classe atual 
		 * 
		 * @param regExpVariableName the regExpVariableName to set
		 */
		public void setRegExpVariableName(String regExpVariableName) {
			this.regExpVariableName = regExpVariableName;
		}

		/**
		 * 
		 * Retorna a lista de variáveis estáticas declaradas no escopo da classe atual
		 * 
		 * 
		 * - Inclui variáveis herdadas por herança
		 * 
		 * @return the staticVariableName
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> getStaticVariableName() {
			return staticVariableName;
		}

		/**
		 * Altera a lista de variáveis estáticas declaradas no escopo da classe atual
		 * 
		 * @param staticVariableName the staticVariableName to set
		 */
		public void setStaticVariableName(
				java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> staticVariableName) {
			this.staticVariableName = staticVariableName;
		}

		/**
		 * Retorna a expressão regular que define quais variáveis estáticas do escopo atual serão carregadas na lista de objetos
		 * 
		 * @return the regExpStaticVariableName
		 */
		public String getRegExpStaticVariableName() {
			return regExpStaticVariableName;
		}

		/**
		 * 
		 * Altera a expressão regular que define quais variáveis estáticas serão carregadas na lista d
		 * 
		 * 
		 * @param regExpStaticVariableName the regExpStaticVariableName to set
		 */
		public void setRegExpStaticVariableName(String regExpStaticVariableName) {
			this.regExpStaticVariableName = regExpStaticVariableName;
		}

		/**
		 * 
		 * Retorna a lista de métodos definidos para uma execução
		 * 
		 * - Em ordem previamente determinada
		 * 
		 * @return the methodListExecution
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> getMethodListExecution() {
			return methodListExecution;
		}

		/**
		 * 
		 * Altera a lista de metódos para execução direcionada e ordenada
		 * 
		 * @param methodListExecution the methodListExecution to set
		 */
		public void setMethodListExecution(
				java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListExecution) {
			this.methodListExecution = methodListExecution;
		}

		/**
		 * Retorna a expressão regular que define quais métodos serão executados - Lista ordenada - Pré definida
		 * 
		 * @return the regExpMethodList
		 */
		public String getRegExpMethodList() {
			return regExpMethodList;
		}

		/**
		 * 
		 * Altera a expressão regular que define  a lista de métodos ordenados para execução
		 * 
		 * @param regExpMethodList the regExpMethodList to set
		 */
		public void setRegExpMethodList(String regExpMethodList) {
			this.regExpMethodList = regExpMethodList;
		}

		/**
		 * 
		 * Retorna a lista de métodos herdados por herança
		 * 
		 * @return the methodListInherit
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> getMethodListInherit() {
			return methodListInherit;
		}

		/**
		 * 
		 * Altera a lista de métodos retornados por herança
		 * 
		 * @param methodListInherit the methodListInherit to set
		 */
		public void setMethodListInherit(java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListInherit) {
			this.methodListInherit = methodListInherit;
		}

		/**
		 * Retorna a expressão regular que define a lista de métodos retornados por herança
		 * 
		 * @return the regExpMethodListInherit
		 */
		public String getRegExpMethodListInherit() {
			return regExpMethodListInherit;
		}

		/**
		 * 
		 * Altera a expressão regular que define a lista de métodos retornados por herança
		 * 
		 * @param regExpMethodListInherit the regExpMethodListInherit to set
		 */
		public void setRegExpMethodListInherit(String regExpMethodListInherit) {
			this.regExpMethodListInherit = regExpMethodListInherit;
		}

		/**
		 * 
		 * Retorna a lista de métodos chamados na pilha de execução até o momento
		 * 
		 * @return the listMethodStackTrace
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> getListMethodStackTrace() {
			return listMethodStackTrace;
		}

		/**
		 * 
		 * Altera a lista de métodos chamados em tempo de execução
		 * 
		 * @param listMethodStackTrace the listMethodStackTrace to set
		 */
		public void setListMethodStackTrace(
				java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> listMethodStackTrace) {
			this.listMethodStackTrace = listMethodStackTrace;
		}

		/**
		 * 
		 * Retorna a expressão regular que define quais metódos da pilha de execução serão carregados na lista:
		 * 
		 * - Em tempo de execução
		 * 
		 * @return the regExpListMethodsStackTrace
		 */
		public String getRegExpListMethodsStackTrace() {
			return regExpListMethodsStackTrace;
		}

		/**
		 * 
		 * Altera a expressão regular que define os métodos específicos da pilha de execução que serão carregados
		 * 
		 * @param regExpListMethodsStackTrace the regExpListMethodsStackTrace to set
		 */
		public void setRegExpListMethodsStackTrace(String regExpListMethodsStackTrace) {
			this.regExpListMethodsStackTrace = regExpListMethodsStackTrace;
		}

		/**
		 * 
		 * Retorna a lista de classes relacionadas a herança do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @return the listClassesParents
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> getListClassesParents() {
			return listClassesParents;
		}

		/**
		 * 
		 * Altera a lista de classes relacionadas a herança do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @param listClassesParents the listClassesParents to set
		 */
		public void setListClassesParents(
				java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> listClassesParents) {
			this.listClassesParents = listClassesParents;
		}

		/**
		 * Retorna a expressão regular utilizada para definir a lista de classes relacionadas a herança do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @return the regExpListClassesParents
		 */
		public String getRegExpListClassesParents() {
			return regExpListClassesParents;
		}

		/**
		 * 
		 * Altera a expressão regular que define a lista de classes relacionadas a herança do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @param regExpListClassesParents the regExpListClassesParents to set
		 */
		public void setRegExpListClassesParents(String regExpListClassesParents) {
			this.regExpListClassesParents = regExpListClassesParents;
		}

	}
	
}
