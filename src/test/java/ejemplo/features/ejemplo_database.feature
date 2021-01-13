@petstore_user
Feature: DB Example
 


  @ejemplo_database_01
  Scenario: Database Example
  	* print 'INICIO'
    * def database_class = Java.type('ejemplo.utils.PRKRT1Util')
	* def database = new database_class()
   	* def resultado = database.ObtenerArticulo('aa','bb','ccs')
   	* print resultado.sucursal
   	* print resultado.nroCaja
   	* print resultado.nroTransaccion