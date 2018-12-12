package pl.invoicemanager.InvoiceManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.invoicemanager.InvoiceManager.models.Company;

public interface CompanyDao extends JpaRepository<Company, Long> {
}
