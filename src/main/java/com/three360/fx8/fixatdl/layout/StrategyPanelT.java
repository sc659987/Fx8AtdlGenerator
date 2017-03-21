//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 10:55:05 AM CST 
//


package com.three360.fx8.fixatdl.layout;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for StrategyPanel_t complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="StrategyPanel_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StrategyPanel" type="{http://www.fixprotocol.org/FIXatdl-1-1/Layout}StrategyPanel_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Control" type="{http://www.fixprotocol.org/FIXatdl-1-1/Layout}Control_t" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collapsed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="collapsible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="color" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orientation" type="{http://www.fixprotocol.org/FIXatdl-1-1/Layout}PanelOrientation_t" />
 *       &lt;attribute name="border" type="{http://www.fixprotocol.org/FIXatdl-1-1/Layout}Border_t" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyPanel_t", propOrder = {
        "strategyPanel",
        "control"
})
public class StrategyPanelT {

    @XmlElement(name = "StrategyPanel")
    protected List<StrategyPanelT> strategyPanel;
    @XmlElement(name = "Control")
    protected List<ControlT> control;
    @XmlAttribute
    protected String title;
    @XmlAttribute
    protected Boolean collapsed;
    @XmlAttribute
    protected Boolean collapsible;
    @XmlAttribute
    protected String color;
    @XmlAttribute
    protected PanelOrientationT orientation;
    @XmlAttribute
    protected BorderT border;

    /**
     * Gets the value of the strategyPanel property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyPanel property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyPanel().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyPanelT }
     */
    public List<StrategyPanelT> getStrategyPanel() {
        if (strategyPanel == null) {
            strategyPanel = new ArrayList<StrategyPanelT>();
        }
        return this.strategyPanel;
    }

    /**
     * Gets the value of the control property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlT }
     */
    public List<ControlT> getControl() {
        if (control == null) {
            control = new ArrayList<ControlT>();
        }
        return this.control;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the collapsed property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isCollapsed() {
        if (collapsed == null) {
            return false;
        } else {
            return collapsed;
        }
    }

    /**
     * Sets the value of the collapsed property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCollapsed(Boolean value) {
        this.collapsed = value;
    }

    /**
     * Gets the value of the collapsible property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isCollapsible() {
        if (collapsible == null) {
            return true;
        } else {
            return collapsible;
        }
    }

    /**
     * Sets the value of the collapsible property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setCollapsible(Boolean value) {
        this.collapsible = value;
    }

    /**
     * Gets the value of the color property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the orientation property.
     *
     * @return possible object is
     * {@link PanelOrientationT }
     */
    public PanelOrientationT getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     *
     * @param value allowed object is
     *              {@link PanelOrientationT }
     */
    public void setOrientation(PanelOrientationT value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the border property.
     *
     * @return possible object is
     * {@link BorderT }
     */
    public BorderT getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     *
     * @param value allowed object is
     *              {@link BorderT }
     */
    public void setBorder(BorderT value) {
        this.border = value;
    }

}
