/**
 * 
 */
package br.fwk.db.connector.sgdb;

import java.lang.annotation.AUTAnnotations;
import java.lang.annotation.AUTAnnotations.MODULE_DEFINITION;
import java.lang.annotation.AUTAnnotations.PRIORITY_EXECUTION_FROM_TESTS;
import java.lang.annotation.AUTAnnotations.PROJECT_DEFINITION;
import java.lang.annotation.AUTAnnotations.TYPE_MEMBER_FROM_CODE;
import java.sql.Connection;
import java.util.List;

@AUTAnnotations.BUSINESS_PROJECT(PROJECT = PROJECT_DEFINITION.PROJECT_SYSTEM_1)
@AUTAnnotations.BUSINESS_MODULE(MODULE = MODULE_DEFINITION.MODULE_34)
/**
 * @author marcos.oliveira
 *
 */
public abstract class AUTDBConMySql extends br.fwk.db.connector.AUTSGDBConnections{

	public AUTDBConMySql() {
		
	}	
}


