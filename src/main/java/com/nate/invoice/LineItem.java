/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nate.invoice;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;



/**
 *
 * @author Nate
 */
@Entity
@Table(name="LineItem")
public class LineItem implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="lineItemID",nullable = false)
     @javax.persistence.Id
    private long lineItemID;
     @Column(name="quantity", nullable= false)
    private long quantity;
     @Column(name="description", nullable= false)
    private String description;
     @Column(name="unitPrice", nullable= false)
    private BigDecimal unitPrice;

    public long getLineItemID() {
        return lineItemID;
    }

    public void setLineItemID(long lineItemID) {
        this.lineItemID = lineItemID;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public BigDecimal getLineTotal(){

        Long qty = quantity;
        BigDecimal qtty = new BigDecimal(qty);

        return unitPrice.multiply(qtty);
    }
    
}
