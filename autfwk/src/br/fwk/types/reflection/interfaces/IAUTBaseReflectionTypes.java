/**
 * 
 */
package br.fwk.types.reflection.interfaces;


/**
 * 
 * Interface e classes relacionadas ao processo de reflex�o da estrutura de dados:
 * 
 * - Define um conjunto de classes e m�todos para reflex�o em tempo de execu��o
 * - Define subtipos relacionados a defini��o da estrutura de dados
 * 
 * 
 * @author marcos.oliveira
 *
 */
public interface IAUTBaseReflectionTypes {
	public static class AUTClassDefinition{
		/**
		 * 
		 * Lista de m�todos da classe atual:
		 * 
		 * - Sem filtros por express�o regular
		 * 
		 */
		private static java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> currentListMethods = null;
		
		
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
		 * Op��es de servi�o disponibilizados pela classe local
		 * 
		 */
		public static enum TYPE_SERVICE_OPERATION{
			/**
			 * Carrega lista de m�todos utilizando o paramentro express�o regular
			 */
			LOADER_LIST_METHODS_WITH_REGEXP,
			LOADER_LIST_METHODS,
			LOADER_LOCAL_VARIABLES_WITH_REGEXP,
			LOADER_LOCAL_VARIABLES,
			LOADER_EXTERN_VARIABLES_WITH_REGEXP			
		}
		
		/**
		 * 
		 * Define a classe para reflex�o de vari�veis
		 * 
		 * @author marcos.oliveira
		 *
		 */
		public static class AUTVariables{
			
			/**
			 * 
			 * Express�o regular associada ao valor da vari�vel
			 * 
			 */
			String regExpToValue = null;
			
			/**
			 * 
			 * Express�o regular associada ao nome da vari�vel
			 * 
			 */
			String regExpToName = null;
			
			/**
			 *
			 *T�m express�o regular associada ao nome da vari�vel
			 * 
			 */
			Boolean haveRegExpToName = false;
			
			/**
			 * 
			 * T�m express�o regular associada ao valor da vari�vel
			 * 
			 */
			Boolean haveRegExpToValue = false;
			
			/**
			 * 
			 * Nome amig�vel da vari�vel
			 * 
			 */
			String name = null;
			
			/**
			 * 
			 * Nome da classe container
			 * 
			 */
			String classParent = null;
			
			/**
			 * 
			 * � vari�vel est�tica?
			 * 
			 */
			Boolean isStatic = false;
			
			/**
			 * 
			 * � uma vari�vel de inst�ncia local?
			 * 
			 */
			Boolean isInstance = true;
			
			/**
			 * 
			 * Valor padr�o da vari�vel
			 * 
			 */
			Object valueDefault = null;
			
			/**
			 * @return the regExpToValue
			 */
			public String getRegExpToValue() {
				return regExpToValue;
			}

			/**
			 * @param regExpToValue the regExpToValue to set
			 */
			public void setRegExpToValue(String regExpToValue) {
				this.regExpToValue = regExpToValue;
			}

			/**
			 * @return the regExpToName
			 */
			public String getRegExpToName() {
				return regExpToName;
			}

			/**
			 * @param regExpToName the regExpToName to set
			 */
			public void setRegExpToName(String regExpToName) {
				this.regExpToName = regExpToName;
			}

			/**
			 * @return the haveRegExpToName
			 */
			public Boolean getHaveRegExpToName() {
				return haveRegExpToName;
			}

			/**
			 * @param haveRegExpToName the haveRegExpToName to set
			 */
			public void setHaveRegExpToName(Boolean haveRegExpToName) {
				this.haveRegExpToName = haveRegExpToName;
			}

			/**
			 * @return the haveRegExpToValue
			 */
			public Boolean getHaveRegExpToValue() {
				return haveRegExpToValue;
			}

			/**
			 * @param haveRegExpToValue the haveRegExpToValue to set
			 */
			public void setHaveRegExpToValue(Boolean haveRegExpToValue) {
				this.haveRegExpToValue = haveRegExpToValue;
			}

			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}

			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/**
			 * @return the classParent
			 */
			public String getClassParent() {
				return classParent;
			}

			/**
			 * @param classParent the classParent to set
			 */
			public void setClassParent(String classParent) {
				this.classParent = classParent;
			}

			/**
			 * @return the isStatic
			 */
			public Boolean getIsStatic() {
				return isStatic;
			}

			/**
			 * @param isStatic the isStatic to set
			 */
			public void setIsStatic(Boolean isStatic) {
				this.isStatic = isStatic;
			}

			/**
			 * @return the isInstance
			 */
			public Boolean getIsInstance() {
				return isInstance;
			}

			/**
			 * @param isInstance the isInstance to set
			 */
			public void setIsInstance(Boolean isInstance) {
				this.isInstance = isInstance;
			}

			/**
			 * @return the valueDefault
			 */
			public Object getValueDefault() {
				return valueDefault;
			}

			/**
			 * @param valueDefault the valueDefault to set
			 */
			public void setValueDefault(Object valueDefault) {
				this.valueDefault = valueDefault;
			}

			/**
			 * @return the valueCurrent
			 */
			public Object getValueCurrent() {
				return valueCurrent;
			}

			/**
			 * @param valueCurrent the valueCurrent to set
			 */
			public void setValueCurrent(Object valueCurrent) {
				this.valueCurrent = valueCurrent;
			}

			/**
			 * Valor corrente  - Da inst�ncia atual
			 * 
			 */
			Object valueCurrent = null;			
		}
		
		
		
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

		
		/**
		 * 
		 * Retorna a lista de m�todos da classe atual:
		 * 
		 * - Sem filtros por express�o regular
		 * 
		 * @return the currentListMethods
		 */
		public static java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> getCurrentListMethods() {
			return currentListMethods;
		}

		
		/**
		 * 
		 * Altera a lista de m�todos da classe atual:
		 * 
		 * - Os m�todos carregados n�o foram filtrados por nenhuma express�o regular
		 * 
		 * 
		 * @param currentListMethods the currentListMethods to set
		 */
		public static void setCurrentListMethods(
				java.util.List<java.util.AbstractMap.SimpleEntry<String, String>> currentListMethods) {
			AUTClassDefinition.currentListMethods = currentListMethods;
		}
		
		
		/**
		 * 
		 * Carrega a lista de vari�veis da classe espef�ca
		 * 
		 * @param classeTarget - Classe que defini��o o escopo da declara��o de vari�veis
		 * 
		 * @return java.util.List<Object> - Lista de objetos
		 * 
		 */
		protected static java.util.List<Object> getListVariables(Class<?> classeTarget){
			java.util.List<Object> list = new java.util.ArrayList<Object>();
			
			return null;
		}
		/**
		 * 
		 * Carrega uma lista espec�fica de acordo com os parametros espec�ficados na chamada do m�todo de configura��o:
		 * 
		 * - Durante o execu��o do processo
		 * 
		 * 
		 * 
		 * 
		 * 
		 * @param <TList> - Tipos de listas gen�ricas para carregamento
		 * @param <TOptionService> - Tipos de servi�os gen�ricos para carregamento
		 * @param listToLoad - Lista para carregamento
		 * @param optionService - Tipo de servi�o para carregamento da lista
		 * 
		 * 
		 * @return boolean - Caso o processo seja finalizado com sucesso, false caso contr�rio.
		 */
		public <TList extends java.util.List,TOptionService extends TYPE_SERVICE_OPERATION> boolean loaderListObject(TList listToLoad,TOptionService optionService) {
			switch((TYPE_SERVICE_OPERATION)optionService) {
			case LOADER_EXTERN_VARIABLES_WITH_REGEXP:{				
				break;
			}
			case LOADER_LIST_METHODS:{				
				break;
			}
			case LOADER_LIST_METHODS_WITH_REGEXP:{				
				break;
			}
			case LOADER_LOCAL_VARIABLES:{				
				break;
			}
			case LOADER_LOCAL_VARIABLES_WITH_REGEXP:{				
				break;
			}
			}
			return true;
		}
	}	
}
