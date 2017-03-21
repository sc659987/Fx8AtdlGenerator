//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:55:05 AM CST 
//


package com.three360.fx8.fixatdl.layout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoubleSpinner_t complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DoubleSpinner_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixprotocol.org/FIXatdl-1-1/Layout}Control_t">
 *       &lt;attribute name="initValue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="innerIncrement" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="innerIncrementPolicy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Tick"/>
 *             &lt;enumeration value="LotSize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="outerIncrement" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="outerIncrementPolicy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Tick"/>
 *             &lt;enumeration value="LotSize"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleSpinner_t")
public class DoubleSpinnerT
        extends ControlT {

    @XmlAttribute
    protected Double initValue;
    @XmlAttribute
    protected Double innerIncrement;
    @XmlAttribute
    protected String innerIncrementPolicy;
    @XmlAttribute
    protected Double outerIncrement;
    @XmlAttribute
    protected String outerIncrementPolicy;

    /**
     * Gets the value of the initValue property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getInitValue() {
        return initValue;
    }

    /**
     * Sets the value of the initValue property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setInitValue(Double value) {
        this.initValue = value;
    }

    /**
     * Gets the value of the innerIncrement property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getInnerIncrement() {
        return innerIncrement;
    }

    /**
     * Sets the value of the innerIncrement property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setInnerIncrement(Double value) {
        this.innerIncrement = value;
    }

    /**
     * Gets the value of the innerIncrementPolicy property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInnerIncrementPolicy() {
        return innerIncrementPolicy;
    }

    /**
     * Sets the value of the innerIncrementPolicy property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInnerIncrementPolicy(String value) {
        this.innerIncrementPolicy = value;
    }

    /**
     * Gets the value of the outerIncrement property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getOuterIncrement() {
        return outerIncrement;
    }

    /**
     * Sets the value of the outerIncrement property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setOuterIncrement(Double value) {
        this.outerIncrement = value;
    }

    /**
     * Gets the value of the outerIncrementPolicy property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOuterIncrementPolicy() {
        return outerIncrementPolicy;
    }

    /**
     * Sets the value of the outerIncrementPolicy property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOuterIncrementPolicy(String value) {
        this.outerIncrementPolicy = value;
    }

}
