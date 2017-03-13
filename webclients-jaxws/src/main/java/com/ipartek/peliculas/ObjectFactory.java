
package com.ipartek.peliculas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ipartek.peliculas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenertodosResponse_QNAME = new QName("http://com.ipartek.formacion/types", "obtenertodosResponse");
    private final static QName _ObtenerporidResponse_QNAME = new QName("http://com.ipartek.formacion/types", "obtenerporidResponse");
    private final static QName _Obtenertodos_QNAME = new QName("http://com.ipartek.formacion/types", "obtenertodos");
    private final static QName _Obtenerporid_QNAME = new QName("http://com.ipartek.formacion/types", "obtenerporid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ipartek.peliculas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeliculaMensaje }
     * 
     */
    public PeliculaMensaje createPeliculaMensaje() {
        return new PeliculaMensaje();
    }

    /**
     * Create an instance of {@link ObtenertodosResponse }
     * 
     */
    public ObtenertodosResponse createObtenertodosResponse() {
        return new ObtenertodosResponse();
    }

    /**
     * Create an instance of {@link Pelicula }
     * 
     */
    public Pelicula createPelicula() {
        return new Pelicula();
    }

    /**
     * Create an instance of {@link ObtenerporidResponse }
     * 
     */
    public ObtenerporidResponse createObtenerporidResponse() {
        return new ObtenerporidResponse();
    }

    /**
     * Create an instance of {@link PeliculaColeccion }
     * 
     */
    public PeliculaColeccion createPeliculaColeccion() {
        return new PeliculaColeccion();
    }

    /**
     * Create an instance of {@link Obtenerporid }
     * 
     */
    public Obtenerporid createObtenerporid() {
        return new Obtenerporid();
    }

    /**
     * Create an instance of {@link PeliculaColeccionMensaje }
     * 
     */
    public PeliculaColeccionMensaje createPeliculaColeccionMensaje() {
        return new PeliculaColeccionMensaje();
    }

    /**
     * Create an instance of {@link Genero }
     * 
     */
    public Genero createGenero() {
        return new Genero();
    }

    /**
     * Create an instance of {@link Obtenertodos }
     * 
     */
    public Obtenertodos createObtenertodos() {
        return new Obtenertodos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenertodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.ipartek.formacion/types", name = "obtenertodosResponse")
    public JAXBElement<ObtenertodosResponse> createObtenertodosResponse(ObtenertodosResponse value) {
        return new JAXBElement<ObtenertodosResponse>(_ObtenertodosResponse_QNAME, ObtenertodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerporidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.ipartek.formacion/types", name = "obtenerporidResponse")
    public JAXBElement<ObtenerporidResponse> createObtenerporidResponse(ObtenerporidResponse value) {
        return new JAXBElement<ObtenerporidResponse>(_ObtenerporidResponse_QNAME, ObtenerporidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenertodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.ipartek.formacion/types", name = "obtenertodos")
    public JAXBElement<Obtenertodos> createObtenertodos(Obtenertodos value) {
        return new JAXBElement<Obtenertodos>(_Obtenertodos_QNAME, Obtenertodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtenerporid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.ipartek.formacion/types", name = "obtenerporid")
    public JAXBElement<Obtenerporid> createObtenerporid(Obtenerporid value) {
        return new JAXBElement<Obtenerporid>(_Obtenerporid_QNAME, Obtenerporid.class, null, value);
    }

}
