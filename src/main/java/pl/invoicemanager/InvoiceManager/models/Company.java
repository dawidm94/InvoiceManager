package pl.invoicemanager.InvoiceManager.models;

import org.hibernate.validator.constraints.pl.NIP;
import org.hibernate.validator.constraints.pl.REGON;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "company")
public class Company {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "COMPANY_ID")
	private long id;

	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@Column(name = "COMPANY_NAME", nullable = false)
	private String name;

	@NIP
	@Column(name = "COMPANY_NIP", unique = true, nullable = false)
	private String NIP;

	@REGON
	@Column(name = "COMPANY_REGON")
	private String regon;
}
