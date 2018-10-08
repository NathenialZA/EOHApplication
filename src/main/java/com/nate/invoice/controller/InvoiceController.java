/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nate.invoice.controller;

import com.nate.invoice.Invoice;
import com.nate.invoice.exception.InvoiceNotFoundException;
import com.nate.invoice.repository.InvoiceRepository;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nate
 */
@RestController
@RequestMapping("/api")
public class InvoiceController{
    
    @Autowired
    InvoiceRepository invoiceRepository;

@PostMapping("/addInvoice")
    public Invoice addInvoice(@Valid @RequestBody Invoice invoice) {
        return  invoiceRepository.save(invoice);
    }

  @GetMapping("/invoices")
    public List<Invoice> viewAllInvoices() {
        return invoiceRepository.findAll();
          }

@GetMapping("/invoice/{id}")
    public Optional<Invoice> viewInvoice(long id) {
        return invoiceRepository.findById(id);
        
         }
    
}
