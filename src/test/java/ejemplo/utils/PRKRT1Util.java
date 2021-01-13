package  ejemplo.utils;

import ejemplo.utils.database.PRKRT1.TRX_ARTICULOS;

public class PRKRT1Util {

	public TRX_ARTICULOS ObtenerArticulo(String sucursal, String numeroCaja, String numeroTransaccion) {

		TRX_ARTICULOS tbArticulos = new TRX_ARTICULOS();
		tbArticulos.sucursal=sucursal;
		tbArticulos.nroCaja=numeroCaja;
		tbArticulos.nroTransaccion=numeroTransaccion;
		
		return tbArticulos;		
	}
	
}
