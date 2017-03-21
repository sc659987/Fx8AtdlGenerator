//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:55:05 AM CST 
//


package com.three360.fx8.fixatdl.core;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * Abstract parameter from which other parameters are derived.
 * <p>
 * <p>Java class for Numeric_t complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Numeric_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXatdl-1-1/Core}Parameter_t">
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numeric_t")
@XmlSeeAlso({
        FloatT.class,
        PriceT.class,
        AmtT.class,
        PercentageT.class,
        QtyT.class,
        PriceOffsetT.class
})
public class NumericT
        extends ParameterT {

    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger precision;

    /**
     * Gets the value of the precision property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

}
