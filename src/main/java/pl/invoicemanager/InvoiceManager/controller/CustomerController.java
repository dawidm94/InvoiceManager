package pl.invoicemanager.InvoiceManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@RequestMapping("/add")
	public String addCustomer(){
		return "addCustomerForm";
	}

	@RequestMapping("/list")
	public String showCustomers(){
		return "customerList";
	}

}
