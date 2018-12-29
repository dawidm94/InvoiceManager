package pl.invoicemanager.InvoiceManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.invoicemanager.InvoiceManager.models.Invoice;

import java.util.List;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {
	List<Invoice> findAllByOrderBySoldDateDesc();
}
