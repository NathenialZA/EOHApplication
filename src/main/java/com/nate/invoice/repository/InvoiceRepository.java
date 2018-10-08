
package com.nate.invoice.repository;

import com.nate.invoice.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Nate
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    
}
