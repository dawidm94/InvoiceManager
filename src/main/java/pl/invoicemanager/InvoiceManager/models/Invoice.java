package pl.invoicemanager.InvoiceManager.models;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
public class Invoice {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "INVOICE_ID")
	private long id;

	@Column(name = "INVOICE_NO", nullable = false, unique = true)
	private String invoiceNumber;

	@ManyToOne
	@JoinColumn(name = "COMPANY_ID", nullable = false)
	private Company company;

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"id=" + id +
				", invoiceNumber='" + invoiceNumber + '\'' +
				'}';
	}
}
