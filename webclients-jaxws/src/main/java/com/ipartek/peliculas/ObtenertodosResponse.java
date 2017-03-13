
package com.ipartek.peliculas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenertodosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenertodosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://com.ipartek.formacion/types}peliculaColeccionMensaje" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenertodosResponse", propOrder = {
    "_return"
})
public class ObtenertodosResponse {

    @XmlElement(name = "return")
    protected PeliculaColeccionMensaje _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link PeliculaColeccionMensaje }
     *     
     */
    public PeliculaColeccionMensaje getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeliculaColeccionMensaje }
     *     
     */
    public void setReturn(PeliculaColeccionMensaje value) {
        this._return = value;
    }

}
