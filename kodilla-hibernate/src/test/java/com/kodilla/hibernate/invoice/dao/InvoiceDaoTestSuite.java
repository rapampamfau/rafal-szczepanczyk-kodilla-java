package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("KEYBOARD");
        Product product2 = new Product("MOUSE");
        Product product3 = new Product("MONITOR");
        Product product4 = new Product("PRINTER");

        Item item1 = new Item(new BigDecimal(99), 10, new BigDecimal(70));
        Item item2 = new Item(new BigDecimal(59), 15, new BigDecimal(40));
        Item item3 = new Item(new BigDecimal(279), 5, new BigDecimal(250));
        Item item4 = new Item(new BigDecimal(89), 50, new BigDecimal(79));

        Invoice invoice1 = new Invoice("11245583");
        Invoice invoice2 = new Invoice("54334234");

        item1.setInvoice(invoice1);
        item1.setProduct(product1);
        item2.setInvoice(invoice1);
        item2.setProduct(product2);
        item3.setInvoice(invoice1);
        item3.setProduct(product3);
        item4.setInvoice(invoice2);
        item4.setProduct(product4);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        invoiceDao.save(invoice2);
        int invoice2Id = invoice1.getId();

        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);

        //CleanUp
        invoiceDao.deleteById(invoice1Id);
        invoiceDao.deleteById(invoice1Id);
    }
}
