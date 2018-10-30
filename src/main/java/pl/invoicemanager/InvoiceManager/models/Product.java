package pl.invoicemanager.InvoiceManager.models;

import org.hibernate.validator.constraints.pl.NIP;
import org.hibernate.validator.constraints.pl.REGON;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "PRODUCT_ID")
	private long id;

	//TODO: Stworzyć tablicę pośrednią dla MANY TO MANY product i invoice, ktora bedzie miala dodatkowo quantity
	@Column(name = "PRODUCT_QUANTITY", nullable = false)
	private int quantity;

	@Column(name = "PRODUCT_NAME", nullable = false)
	private String name;

	@Column(name = "PRODUCT_UNIT", nullable = false)
	private String unit;

	@Column(name = "PRODUCT_VAT", nullable = false)
	private int vat;

	@Column(name = "PRODUCT_NET_AMOUNT", nullable = false)
	private BigDecimal netAmount;

}
