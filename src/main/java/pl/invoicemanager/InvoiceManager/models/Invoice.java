package pl.invoicemanager.InvoiceManager.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "INVOICE_ID")
	private long id;

	@Column(name = "INVOICE_NO", nullable = false, unique = true)
	private String invoiceNumber;

	@Column(name = "INVOICE_SOLD_DATE")
	private Date soldDate;

	@Column(name = "INVOICE_CREATE_DATE")
	private Date createDate;

	@Column(name = "INVOICE_PAID_DATE")
	private Date paidDate;

	@Column(name = "INVOICE_PAYMENT_TYPE")
	private String paymentType;

	@ManyToOne
	@JoinColumn(name = "COMPANY_ID", nullable = false)
	private Company company;

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"id=" + id +
				", invoiceNumber='" + invoiceNumber + '\'' +
				'}';
	}
}
