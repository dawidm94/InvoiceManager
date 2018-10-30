package pl.invoicemanager.InvoiceManager.models;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "address")
public class Address {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ADDRESS_ID")
	private long id;

	@Column(name = "ADDRESS_STREETNAME")
	private String streetName;

	@Column(name = "ADDRESS_POSTALCODE")
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	private String postalCode;

	@Column(name = "ADDRESS_HOUSENUMBER")
	@Pattern(regexp = "\\d[a-zA-Z]*")
	private String houseNumber;

	@Column(name = "ADDRESS_APARTMENTNUMBER")
	private String apartmentNumber;

	@Column(name = "ADDRESS_CITY")
	private String city;

}
