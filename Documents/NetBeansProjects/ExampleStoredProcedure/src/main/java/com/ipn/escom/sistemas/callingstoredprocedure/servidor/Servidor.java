package com.ipn.escom.sistemas.callingstoredprocedure.servidor;

import com.ipn.escom.sistemas.callingstoredprocedure.utils.ConexionSocket;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Erick
 */
public class Servidor extends ConexionSocket {

    public Servidor() throws IOException {
        super("servidor");
    }

    public void startServer() {
        try {
            System.out.println("Esperando...");
            cs = ss.accept();
            System.out.println("Cliente en línea");

            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.writeUTF("Petición recibida y aceptada");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));

            while ((mensajeServidor = entrada.readLine()) != null) {
                System.out.println(mensajeServidor);
            }

            System.out.println("Fin de la conexión");

            ss.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
