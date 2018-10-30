package pl.invoicemanager.InvoiceManager.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "USER_ID")
	private long id;

	@ManyToOne
	@JoinColumn(name = "COMPANY_ID", nullable = false)
	private Company company;

	@Column(name = "USER_LOGIN", unique = true, nullable = false)
	private String login;

	@Column(name = "USER_PASSWORD", nullable = false)
	private String password;

	@Column(name = "USER_FIRSTNAME")
	private String firstName;

	@Column(name = "USER_LASTNAME")
	private String lastName;
}
