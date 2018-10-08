
package com.nate.invoice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author Nate
 */
@Entity
@Table(name="Invoice")
public class Invoice implements Serializable {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="invoiceID")
    long invoiceID;
     @Column(name="client")
    String client;
     @Column(name="vateRate")
    long vateRate;
     @Temporal(TemporalType.DATE)
     @Column(name="invoiceDate")
    Date invoiceDate;

    public long getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public long getVateRate() {
        return vateRate;
    }

    public void setVateRate(long vateRate) {
        this.vateRate = vateRate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
public BigDecimal getSubTotal(){
    LineItem lineItem = new LineItem();
    return lineItem.getLineTotal();
}

public BigDecimal getVAT(){
    return getVAT();
}

public BigDecimal getTotal(){
    return getSubTotal().add(getVAT());
}


}
