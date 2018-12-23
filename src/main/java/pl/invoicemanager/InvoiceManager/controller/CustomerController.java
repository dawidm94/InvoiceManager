package pl.invoicemanager.InvoiceManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.invoicemanager.InvoiceManager.dao.CompanyDao;
import pl.invoicemanager.InvoiceManager.models.Company;

import javax.validation.Valid;
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
	public String addCustomer(@Valid @ModelAttribute("company") Company company, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			return "addCustomerForm";
		}
		companyDao.save(company);
		return "addCustomerForm";
	}

	@GetMapping("/get/{id}")
	@ResponseBody
	public Company getCompany(@PathVariable("id") Long id){
		return companyDao.findById(id).get();
	}

	@GetMapping("/list")
	public String showCustomers(Model model) {
		List<Company> companies = companyDao.findAll();
		model.addAttribute("companies", companies);
		return "customerList";
	}

	@ResponseBody
	@GetMapping("list/{customerId}")
	public List<Company> getAllCustomerCompanies(@PathVariable("customerId") Long customerId){
		if(customerId == null){
			return null;
		}else if(customerId == 0){
			List<Company> companies = companyDao.findAll();
			return companies;
		}else{
//			List<Company> companies = companyDao.findByCustomerId;
			return null;
		}
	}

}
