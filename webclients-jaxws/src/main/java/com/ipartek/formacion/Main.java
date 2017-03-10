package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.peliculas.Pelicula;
import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculasServiceWSImp;
import com.ipartek.peliculas.Peliculasservice;

public class Main {

	public static void main(String[] args) {
		
		Peliculasservice cliente = new Peliculasservice();
		PeliculasServiceWSImp clienteSoap = cliente.getPeliculasServiceWSImpPort();
		// Engancharemos los datos de validacion.
		
		// capturo el contexto de la aplicacion
		Map<String,Object> requestContext = ((BindingProvider)clienteSoap).getRequestContext();
		
		// Me genero la estructura necesaria para enviar los datos
		Map<String,List<String>> requestHeaders = new HashMap<String,List<String>>();
		
		// Introduzco los datos en el encabezado de la peticion
			// si la lista es de un elemento podemos utilizar singletonList
		requestHeaders.put("sessionId", Collections.singletonList("ipsession"));
		/* si tiene mas de un elemento utilizamos arraylist
		List<String> lista = new ArrayList<String>();
		lista.add("ipsession");
		requestHeaders.put("sessionId", lista );
		*/
		
		//pasamos los parametros para el header del contexto de la aplicacion
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
		
		PeliculaMensaje respuesta = clienteSoap.obtenerporid(2);
		Pelicula pelicula = respuesta.getPelicula();
		String mensaje =  respuesta.getMensaje();
		if (pelicula != null){
			System.out.println(pelicula.getTitulo());
		}
		else {
			System.out.println(mensaje);
		}
		
		

	}

}
