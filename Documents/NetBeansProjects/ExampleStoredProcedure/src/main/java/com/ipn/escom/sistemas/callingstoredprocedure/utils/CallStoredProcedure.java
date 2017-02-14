package com.ipn.escom.sistemas.callingstoredprocedure.utils;

import com.ipn.escom.sistemas.callingstoredprocedure.conexion.Conexion;
import com.ipn.escom.sistemas.callingstoredprocedure.modelo.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class CallStoredProcedure {

    public Connection dbConnection = null;
    public CallableStatement cs = null;

    public void callStoredProcINParameter(Producto producto) throws SQLException {

        Conexion conexion = new Conexion();
        String insertStoreProc = "{CALL insertarProductos(?, ?)}";
        dbConnection = conexion.getDBConnection();

        cs = dbConnection.prepareCall(insertStoreProc);
        cs.setString(1, producto.getNombreProducto());
        cs.setDouble(2, producto.getPrecioProducto());
        cs.executeUpdate();

        System.out.println("Record was inserted!");
    }
}
