package pl.invoicemanager.InvoiceManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.invoicemanager.InvoiceManager.models.Invoice;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {
}
