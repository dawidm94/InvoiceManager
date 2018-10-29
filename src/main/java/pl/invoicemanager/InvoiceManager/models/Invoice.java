package pl.invoicemanager.InvoiceManager.models;

import javax.persistence.*;

@Entity
public class Invoice {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String invoiceNumber;

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
