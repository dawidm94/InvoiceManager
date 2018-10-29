package pl.invoicemanager.InvoiceManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InvoiceManagerApplication{

	public static void main(String[] args) {
		SpringApplication.run(InvoiceManagerApplication.class, args);
	}
}
