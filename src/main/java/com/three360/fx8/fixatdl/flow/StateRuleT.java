//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:55:05 AM CST 
//


package com.three360.fx8.fixatdl.flow;

import com.three360.fx8.fixatdl.validation.EditRefT;
import com.three360.fx8.fixatdl.validation.EditT;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for StateRule_t complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StateRule_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fixprotocol.org/FIXatdl-1-1/Core}Description" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.fixprotocol.org/FIXatdl-1-1/Validation}Edit"/>
 *           &lt;element ref="{http://www.fixprotocol.org/FIXatdl-1-1/Validation}EditRef"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateRule_t", propOrder = {
        "description",
        "edit",
        "editRef"
})
public class StateRuleT {

    @XmlElement(name = "Description", namespace = "http://www.fixprotocol.org/FIXatdl-1-1/Core")
    protected String description;
    @XmlElement(name = "Edit", namespace = "http://www.fixprotocol.org/FIXatdl-1-1/Validation")
    protected EditT edit;
    @XmlElement(name = "EditRef", namespace = "http://www.fixprotocol.org/FIXatdl-1-1/Validation")
    protected EditRefT editRef;
    @XmlAttribute
    protected Boolean enabled;
    @XmlAttribute
    protected Boolean visible;
    @XmlAttribute
    protected String value;

    /**
     * Description of the State Rule.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the edit property.
     *
     * @return possible object is
     * {@link EditT }
     */
    public EditT getEdit() {
        return edit;
    }

    /**
     * Sets the value of the edit property.
     *
     * @param value allowed object is
     *              {@link EditT }
     */
    public void setEdit(EditT value) {
        this.edit = value;
    }

    /**
     * Gets the value of the editRef property.
     *
     * @return possible object is
     * {@link EditRefT }
     */
    public EditRefT getEditRef() {
        return editRef;
    }

    /**
     * Sets the value of the editRef property.
     *
     * @param value allowed object is
     *              {@link EditRefT }
     */
    public void setEditRef(EditRefT value) {
        this.editRef = value;
    }

    /**
     * Gets the value of the enabled property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the visible property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

}
