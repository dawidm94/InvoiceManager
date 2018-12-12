package pl.invoicemanager.InvoiceManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.invoicemanager.InvoiceManager.dao.CompanyDao;
import pl.invoicemanager.InvoiceManager.models.Company;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CompanyDao companyDao;

	@GetMapping("/add")
	public String addCustomerForm(Model model) {
		Company company = new Company();
		model.addAttribute(company);
		return "addCustomerForm";
	}

	@PostMapping("/add")
	public String addCustomer(@ModelAttribute("company") Company company) {
		companyDao.save(company);
		return "addCustomerForm";
	}

	@RequestMapping("/list")
	public String showCustomers(Model model) {
		List<Company> companies = companyDao.findAll();
		model.addAttribute("companies", companies);
		return "customerList";
	}

}
