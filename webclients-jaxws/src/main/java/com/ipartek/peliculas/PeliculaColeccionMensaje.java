
package com.ipartek.peliculas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for peliculaColeccionMensaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="peliculaColeccionMensaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peliculas" type="{http://com.ipartek.formacion/types}peliculaColeccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peliculaColeccionMensaje", propOrder = {
    "mensaje",
    "peliculas"
})
public class PeliculaColeccionMensaje {

    protected String mensaje;
    protected PeliculaColeccion peliculas;

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the peliculas property.
     * 
     * @return
     *     possible object is
     *     {@link PeliculaColeccion }
     *     
     */
    public PeliculaColeccion getPeliculas() {
        return peliculas;
    }

    /**
     * Sets the value of the peliculas property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeliculaColeccion }
     *     
     */
    public void setPeliculas(PeliculaColeccion value) {
        this.peliculas = value;
    }

}
