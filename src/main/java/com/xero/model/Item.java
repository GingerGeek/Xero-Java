//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ValidationErrors" type="{}ArrayOfValidationError" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}ArrayOfWarning" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryAssetAccountCode" type="{}accountCode" minOccurs="0"/>
 *         &lt;element name="Name" type="{}itemNameType" minOccurs="0"/>
 *         &lt;element name="IsSold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPurchased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseDetails" type="{}ItemPriceDetails"/>
 *         &lt;element name="SalesDetails" type="{}ItemPriceDetails"/>
 *         &lt;element name="IsTrackedAsInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalCostPool" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuantityOnHand" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{}uniqueIdentifier" minOccurs="0"/>
 *         &lt;element name="UpdatedDateUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="status" type="{}entityValidationStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {

})
public class Item {

    @XmlElement(name = "ValidationErrors")
    protected ArrayOfValidationError validationErrors;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "InventoryAssetAccountCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String inventoryAssetAccountCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IsSold")
    protected Boolean isSold;
    @XmlElement(name = "IsPurchased")
    protected Boolean isPurchased;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PurchaseDescription")
    protected String purchaseDescription;
    @XmlElement(name = "PurchaseDetails", required = true)
    protected ItemPriceDetails purchaseDetails;
    @XmlElement(name = "SalesDetails", required = true)
    protected ItemPriceDetails salesDetails;
    @XmlElement(name = "IsTrackedAsInventory")
    protected Boolean isTrackedAsInventory;
    @XmlElement(name = "TotalCostPool")
    protected BigDecimal totalCostPool;
    @XmlElement(name = "QuantityOnHand")
    protected BigDecimal quantityOnHand;
    @XmlElement(name = "ItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemID;
    @XmlElement(name = "UpdatedDateUTC", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updatedDateUTC;
    @XmlAttribute(name = "status")
    protected EntityValidationStatus status;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfValidationError value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the inventoryAssetAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryAssetAccountCode() {
        return inventoryAssetAccountCode;
    }

    /**
     * Sets the value of the inventoryAssetAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryAssetAccountCode(String value) {
        this.inventoryAssetAccountCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isSold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSold() {
        return isSold;
    }

    /**
     * Sets the value of the isSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSold(Boolean value) {
        this.isSold = value;
    }

    /**
     * Gets the value of the isPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPurchased() {
        return isPurchased;
    }

    /**
     * Sets the value of the isPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPurchased(Boolean value) {
        this.isPurchased = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDescription(String value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the purchaseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPriceDetails }
     *     
     */
    public ItemPriceDetails getPurchaseDetails() {
        return purchaseDetails;
    }

    /**
     * Sets the value of the purchaseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPriceDetails }
     *     
     */
    public void setPurchaseDetails(ItemPriceDetails value) {
        this.purchaseDetails = value;
    }

    /**
     * Gets the value of the salesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPriceDetails }
     *     
     */
    public ItemPriceDetails getSalesDetails() {
        return salesDetails;
    }

    /**
     * Sets the value of the salesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPriceDetails }
     *     
     */
    public void setSalesDetails(ItemPriceDetails value) {
        this.salesDetails = value;
    }

    /**
     * Gets the value of the isTrackedAsInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrackedAsInventory() {
        return isTrackedAsInventory;
    }

    /**
     * Sets the value of the isTrackedAsInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrackedAsInventory(Boolean value) {
        this.isTrackedAsInventory = value;
    }

    /**
     * Gets the value of the totalCostPool property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCostPool() {
        return totalCostPool;
    }

    /**
     * Sets the value of the totalCostPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCostPool(BigDecimal value) {
        this.totalCostPool = value;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityOnHand() {
        return quantityOnHand;
    }

    /**
     * Sets the value of the quantityOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityOnHand(BigDecimal value) {
        this.quantityOnHand = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the updatedDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdatedDateUTC() {
        return updatedDateUTC;
    }

    /**
     * Sets the value of the updatedDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDateUTC(Calendar value) {
        this.updatedDateUTC = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityValidationStatus }
     *     
     */
    public EntityValidationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityValidationStatus }
     *     
     */
    public void setStatus(EntityValidationStatus value) {
        this.status = value;
    }

}
