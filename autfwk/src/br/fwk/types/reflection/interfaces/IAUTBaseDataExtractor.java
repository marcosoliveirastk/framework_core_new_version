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
		 * Define a lista de m�todos herdados da estrutura de classes referenciadas por heran�a
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListInherit = null;
		
		/**
		 * 
		 * Define a express�o regular utilizada para filtrar m�todos espec�ficos que ser�o carregados na lista de objetos herdados
		 * 
		 */
		private String regExpMethodListInherit = null;
		
		
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
		 * Define uma lista das classes superiores na hierarquia de objetos - Estrutura de heran�a entre objetos
		 * 
		 */
		private java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> listClassesParents = null;
		
		/**
		 * 
		 * Express�o regular utilizada para filtrar os objetos que ser�o carregados na lista de classes - Relacionadas a atual atrav�s de heran�a entre objetos
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
		 * Retorna a express�o regular que define o nome da classe atual
		 * 
		 * @return the regExpClassName
		 */
		public String getRegExpClassName() {
			return regExpClassName;
		}

		/**
		 * 
		 * Altera a express�o regular que define o nome da classe atual
		 * 
		 * @param regExpClassName the regExpClassName to set
		 */
		public void setRegExpClassName(String regExpClassName) {
			this.regExpClassName = regExpClassName;
		}

		/**
		 * 
		 * Retorna a lista de vari�veis declaradas na classe atual
		 * 
		 * @return the variables
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> getVariables() {
			return variables;
		}

		/**
		 * 
		 * Altera a lista de vari�veis declaradas na classe atual
		 * 
		 * @param variables the variables to set
		 */
		public void setVariables(java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> variables) {
			this.variables = variables;
		}

		/**
		 * Retorna a express�o regular que define a lista de vari�veis declaradas no escopo da classe atual
		 * 
		 * @return the regExpVariableName
		 */
		public String getRegExpVariableName() {
			return regExpVariableName;
		}

		/**
		 * 
		 * Altera a express�o regular que define  a lista de vari�veis do escopo da classe atual 
		 * 
		 * @param regExpVariableName the regExpVariableName to set
		 */
		public void setRegExpVariableName(String regExpVariableName) {
			this.regExpVariableName = regExpVariableName;
		}

		/**
		 * 
		 * Retorna a lista de vari�veis est�ticas declaradas no escopo da classe atual
		 * 
		 * 
		 * - Inclui vari�veis herdadas por heran�a
		 * 
		 * @return the staticVariableName
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> getStaticVariableName() {
			return staticVariableName;
		}

		/**
		 * Altera a lista de vari�veis est�ticas declaradas no escopo da classe atual
		 * 
		 * @param staticVariableName the staticVariableName to set
		 */
		public void setStaticVariableName(
				java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> staticVariableName) {
			this.staticVariableName = staticVariableName;
		}

		/**
		 * Retorna a express�o regular que define quais vari�veis est�ticas do escopo atual ser�o carregadas na lista de objetos
		 * 
		 * @return the regExpStaticVariableName
		 */
		public String getRegExpStaticVariableName() {
			return regExpStaticVariableName;
		}

		/**
		 * 
		 * Altera a express�o regular que define quais vari�veis est�ticas ser�o carregadas na lista d
		 * 
		 * 
		 * @param regExpStaticVariableName the regExpStaticVariableName to set
		 */
		public void setRegExpStaticVariableName(String regExpStaticVariableName) {
			this.regExpStaticVariableName = regExpStaticVariableName;
		}

		/**
		 * 
		 * Retorna a lista de m�todos definidos para uma execu��o
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
		 * Altera a lista de met�dos para execu��o direcionada e ordenada
		 * 
		 * @param methodListExecution the methodListExecution to set
		 */
		public void setMethodListExecution(
				java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListExecution) {
			this.methodListExecution = methodListExecution;
		}

		/**
		 * Retorna a express�o regular que define quais m�todos ser�o executados - Lista ordenada - Pr� definida
		 * 
		 * @return the regExpMethodList
		 */
		public String getRegExpMethodList() {
			return regExpMethodList;
		}

		/**
		 * 
		 * Altera a express�o regular que define  a lista de m�todos ordenados para execu��o
		 * 
		 * @param regExpMethodList the regExpMethodList to set
		 */
		public void setRegExpMethodList(String regExpMethodList) {
			this.regExpMethodList = regExpMethodList;
		}

		/**
		 * 
		 * Retorna a lista de m�todos herdados por heran�a
		 * 
		 * @return the methodListInherit
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> getMethodListInherit() {
			return methodListInherit;
		}

		/**
		 * 
		 * Altera a lista de m�todos retornados por heran�a
		 * 
		 * @param methodListInherit the methodListInherit to set
		 */
		public void setMethodListInherit(java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> methodListInherit) {
			this.methodListInherit = methodListInherit;
		}

		/**
		 * Retorna a express�o regular que define a lista de m�todos retornados por heran�a
		 * 
		 * @return the regExpMethodListInherit
		 */
		public String getRegExpMethodListInherit() {
			return regExpMethodListInherit;
		}

		/**
		 * 
		 * Altera a express�o regular que define a lista de m�todos retornados por heran�a
		 * 
		 * @param regExpMethodListInherit the regExpMethodListInherit to set
		 */
		public void setRegExpMethodListInherit(String regExpMethodListInherit) {
			this.regExpMethodListInherit = regExpMethodListInherit;
		}

		/**
		 * 
		 * Retorna a lista de m�todos chamados na pilha de execu��o at� o momento
		 * 
		 * @return the listMethodStackTrace
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> getListMethodStackTrace() {
			return listMethodStackTrace;
		}

		/**
		 * 
		 * Altera a lista de m�todos chamados em tempo de execu��o
		 * 
		 * @param listMethodStackTrace the listMethodStackTrace to set
		 */
		public void setListMethodStackTrace(
				java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> listMethodStackTrace) {
			this.listMethodStackTrace = listMethodStackTrace;
		}

		/**
		 * 
		 * Retorna a express�o regular que define quais met�dos da pilha de execu��o ser�o carregados na lista:
		 * 
		 * - Em tempo de execu��o
		 * 
		 * @return the regExpListMethodsStackTrace
		 */
		public String getRegExpListMethodsStackTrace() {
			return regExpListMethodsStackTrace;
		}

		/**
		 * 
		 * Altera a express�o regular que define os m�todos espec�ficos da pilha de execu��o que ser�o carregados
		 * 
		 * @param regExpListMethodsStackTrace the regExpListMethodsStackTrace to set
		 */
		public void setRegExpListMethodsStackTrace(String regExpListMethodsStackTrace) {
			this.regExpListMethodsStackTrace = regExpListMethodsStackTrace;
		}

		/**
		 * 
		 * Retorna a lista de classes relacionadas a heran�a do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @return the listClassesParents
		 */
		public java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> getListClassesParents() {
			return listClassesParents;
		}

		/**
		 * 
		 * Altera a lista de classes relacionadas a heran�a do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @param listClassesParents the listClassesParents to set
		 */
		public void setListClassesParents(
				java.util.List<java.util.AbstractMap.SimpleEntry<Object, Object>> listClassesParents) {
			this.listClassesParents = listClassesParents;
		}

		/**
		 * Retorna a express�o regular utilizada para definir a lista de classes relacionadas a heran�a do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @return the regExpListClassesParents
		 */
		public String getRegExpListClassesParents() {
			return regExpListClassesParents;
		}

		/**
		 * 
		 * Altera a express�o regular que define a lista de classes relacionadas a heran�a do objeto atual - Classes superiores - Classes Pai
		 * 
		 * @param regExpListClassesParents the regExpListClassesParents to set
		 */
		public void setRegExpListClassesParents(String regExpListClassesParents) {
			this.regExpListClassesParents = regExpListClassesParents;
		}

	}
	
}
