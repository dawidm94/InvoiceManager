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

	@Column(name = "COMPANY_NAME", nullable = false)
	private String name;

	@Column(name = "COMPANY_ADDRESS_STREET")
	private String streetAddress;

	@Column(name = "COMPANY_ADDRESS_POSTALCODE")
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	private String postalCode;

	@Column(name = "COMPANY_ADDRESS_CITY")
	private String city;

	@NIP
	@Column(name = "COMPANY_NIP", unique = true, nullable = false)
	private String nip;

	@REGON
	@Column(name = "COMPANY_REGON")
	private String regon;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getRegon() {
		return regon;
	}

	public void setRegon(String regon) {
		this.regon = regon;
	}
}
