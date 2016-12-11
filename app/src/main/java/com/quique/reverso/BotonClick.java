package com.quique.reverso;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.quique.reverso.UtilTexto;

/**
 * Created by Usuario on 11/12/2016.
 */

public class BotonClick implements OnClickListener {
    private Context contexto;

    public Context getContexto() { return this.contexto; }
    public void setContexto (Context valor) { this.contexto = valor; }
    public BotonClick(Context valor) { setContexto(valor); }

    @Override
    public void onClick(View v) {
        Log.d(getClass().getCanonicalName(), "Detectado click en el botón");
        Activity actividad = (Activity)contexto;
        EditText cajaTextoView = (EditText)actividad.findViewById(R.id.cajaTextoView);
        String cajaTexto = cajaTextoView.getText().toString();
        Log.d(getClass().getCanonicalName(), "Recuperado contenido de cajaTextoView: " + cajaTexto);

        ViewGroup vistaRespuesta = (ViewGroup)actividad.findViewById(R.id.RespuestaLL);
        TextView cajaRespuestaView;
        if(vistaRespuesta.getChildCount() > 0){
            cajaRespuestaView = (TextView)vistaRespuesta.findViewById(R.id.cajaRespuestaView);
        } else {
            LayoutInflater respuestaLayout = actividad.getLayoutInflater();
            View vistaInflada = respuestaLayout.inflate(R.layout.respuesta, vistaRespuesta);
            cajaRespuestaView = (TextView)vistaInflada.findViewById(R.id.cajaRespuestaView);
        }
        cajaRespuestaView.setText(UtilTexto.invertirCadena(cajaTexto));
    }
}
