package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.peliculas.Pelicula;
import com.ipartek.peliculas.PeliculaColeccion;
import com.ipartek.peliculas.PeliculaColeccionMensaje;
import com.ipartek.peliculas.PeliculaMensaje;
import com.ipartek.peliculas.PeliculasServiceWSImp;
import com.ipartek.peliculas.Peliculasservice;

public class Main {
	
	private static Map<String,Object> requestContext = null;
	private static Map<String,List<String>> requestHeaders = null;
	private static Peliculasservice cliente = null;
	private static PeliculasServiceWSImp clienteSoap = null;


	public static void main(String[] args) {
		
		cliente = new Peliculasservice();
		clienteSoap = cliente.getPeliculasServiceWSImpPort();
		// Engancharemos los datos de validacion.
		
		// capturo el contexto de la aplicacion
		requestContext = ((BindingProvider)clienteSoap).getRequestContext();
		
		// Me genero la estructura necesaria para enviar los datos
		requestHeaders = new HashMap<String,List<String>>();
		
		System.out.println("Llamada por codigo");
		getById(2);
		System.out.println("Llamada toda la lista");
		getAll();
		
		
		

	}
	private static void getById(int codigo )
	{
		// Introduzco los datos en el encabezado de la peticion
				// si la lista es de un elemento podemos utilizar singletonList
		requestHeaders.put("sessionId", Collections.singletonList("ipsession"));
								
		//pasamos los parametros para el header del contexto de la aplicacion
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
				
		PeliculaMensaje respuesta = clienteSoap.obtenerporid(codigo);
		Pelicula pelicula = respuesta.getPelicula();
		String mensaje =  respuesta.getMensaje();
		if (pelicula != null){
			System.out.println(pelicula.getTitulo());
		}
		else {
			System.out.println(mensaje);
		}
	
	}
	private static void getAll()
	{
		
		requestHeaders.put("user", Collections.singletonList("root"));
		requestHeaders.put("pass", Collections.singletonList("saparicio"));
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
		
		PeliculaColeccionMensaje respuesta = clienteSoap.obtenertodos();
		PeliculaColeccion peliculas = respuesta.getPeliculas();
		String mensaje =  respuesta.getMensaje();
		
		if (peliculas != null){
			for(Pelicula pelicula : peliculas.getPeliculas()){
				System.out.println(pelicula.getTitulo());
			}
		}
		else {
			System.out.println(mensaje);
		}
	}

}
