/**
 * 
 */
package br.fwk;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Paths;

import br.fwk.db.connector.sgdb.AUTDBConMySql;
import br.fwk.db.connector.sgdb.AUTDBConSqlServer;

/**
 * 
 * @author marcos.oliveira
 *
 */
public class AUTFramework {

	/**
	 * 
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IOException {
		// TODO Auto-generated method stub
		System.out.println("AUT INIT : PROCESS EXECUTION");
		java.lang.reflect.Method[] methods = AUTDBConMySql.class.newInstance().getClass().getMethods();
		for(java.lang.reflect.Method method : methods) {
			
			if(method.getName().matches("init")) {
				System.out.println(method.getName());
				System.out.println(method.getParameterCount());
				for(java.lang.annotation.Annotation anot : method.getDeclaredAnnotations()) {
					System.out.println(anot.toString());
				}
			}
		}
		
		System.out.println("AUT INFO: INICIAR CARREGAMENTO DE CLASSE DINAMICAMENTE");
		//java.nio.file.Files.delete(Paths.get("C:\\Java - Projetos\\PJT00001\\autfwk\\bin\\Test.class"));
		java.lang.Runtime.getRuntime().exec("\"C:\\Program Files\\Java\\jdk1.8.0_211\\bin\\javac.exe\" -d \"C:\\Java - Projetos\\PJT00001\\autfwk\\bin\" \"C:\\Java\\External Libraries - Dynamic - Testes\\Teste.java\"");
		
		AUTFramework.class.getClassLoader().setClassAssertionStatus("br.fwk.Teste", true);		
		AUTFramework.class.getClassLoader().getResource("C:\\Java - Projetos\\PJT00001\\autfwk\\bin\\Test.class");
		
		java.lang.invoke.MethodHandles cal = null;
		java.lang.invoke.MethodType type = null;
		
		
		AUTFramework.class.getClassLoader().loadClass("br.fwk.Teste").newInstance().getClass().getMethod("start", null);
		System.out.println();
		
		br.fwk.db.connector.sgdb.AUTDBConMySql con = new br.fwk.db.connector.sgdb.AUTDBConMySql();
				
	}

}
