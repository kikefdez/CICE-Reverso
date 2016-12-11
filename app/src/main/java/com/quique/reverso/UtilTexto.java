package com.quique.reverso;

/**
 * Created by Usuario on 11/12/2016.
 */

public class UtilTexto {
    public static String invertirCadena(String valor)
    {
        String respuesta="";
        if(!valor.equals("")){
            int posicion = valor.length() - 1;
            do{
                respuesta += valor.charAt(posicion);
                posicion--;
            }while(posicion > -1);
        } else {
            respuesta = "No se ha detectado ninguna cadena de texto";
        }
        return respuesta;
    }
}
