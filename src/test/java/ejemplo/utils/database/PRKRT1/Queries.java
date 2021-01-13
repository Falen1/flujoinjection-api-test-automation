package ejemplo.utils.database.PRKRT1;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ejemplo.utils.PropertyLoader;
import ejemplo.utils.database.DbConnection;


public class Queries {
	private String dbUrl;
	private String dbUsuario;
	private String dbPassword;
	private DbConnection conexionBD;

	
	public Queries() throws IOException, SQLException{
		PropertyLoader propertyLoader= new PropertyLoader();
		dbUrl= propertyLoader.GetProperty("DbUrl");
		dbUsuario= propertyLoader.GetProperty("DbUsuario");
		dbPassword= propertyLoader.GetProperty("DbPassword");
		conexionBD=new DbConnection();
	}
	
	public TRX_ARTICULOS ObtenerCompraPorOC(String oc) throws SQLException {
		Connection con=null;
		
		TRX_ARTICULOS oEntidad=new TRX_ARTICULOS();
		
		try
		{
			con = conexionBD.OpenConnection(dbUrl,dbUsuario,dbPassword);;
			Statement stmt = con.createStatement();
			
			String SQL = "SELECT SUCURSAL, NRO_CAJA, NRO_TRANSACCION FROM TRX_ARTICULOS A WHERE A.FECHA_TRX = TO_DATE('09/06/2020','DD/MM/YYYY') AND A.SUCURSAL=60 AND A.NRO_CAJA=300 AND A.NRO_TRANSACCION in (6);";
			ResultSet rs = stmt.executeQuery(SQL);
					
		    while (rs.next()) {
		    	oEntidad.sucursal = rs.getString("SUCURSAL");
		    	oEntidad.nroCaja = rs.getString("NRO_CAJA");
		    	oEntidad.nroTransaccion = rs.getString("NRO_TRANSACCION");
		    }	  
	    }     
	    catch(Exception ex){
	    	System.out.println("Error ORACLE: "+ex.getMessage());
	    }
		conexionBD.CloseConnection(con);	
		
	    return oEntidad;		
	}	
	
}