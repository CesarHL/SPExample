package com.ipn.escom.sistemas.callingstoredprocedure.utils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Erick
 */
public class ConexionSocket {

    private final int PUERTO = 1234;
    private final String HOST = "localhost"; 
    protected String mensajeServidor; 
    protected ServerSocket ss; 
    protected Socket cs; 
    protected DataOutputStream salidaServidor, salidaCliente; 

    public ConexionSocket(String tipo) throws IOException {
        if (tipo.equalsIgnoreCase("servidor")) {
            ss = new ServerSocket(PUERTO);
            cs = new Socket(); 
        } else {
            cs = new Socket(HOST, PUERTO); 
        }
    }
}
