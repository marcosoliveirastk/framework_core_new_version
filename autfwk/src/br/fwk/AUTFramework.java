/**
 * 
 */
package br.fwk;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Paths;

import br.fwk.annotation.AUTAnnotations;
import br.fwk.db.connector.sgdb.AUTDBConMySql;
import br.fwk.db.connector.sgdb.AUTDBConSqlServer;
import br.fwk.types.reflection.interfaces.IAUTBaseReflectionTypes.AUTClassDefinition;

/**
 * 
 * @author marcos.oliveira
 *
 */
public class AUTFramework {

	@AUTAnnotations
	public void init() {
		
	}
	
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
		AUTClassDefinition.getCurrentListMethods();				
	}

}
