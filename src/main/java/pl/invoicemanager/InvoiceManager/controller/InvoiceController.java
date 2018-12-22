package pl.invoicemanager.InvoiceManager.controller;

import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.invoicemanager.InvoiceManager.dao.CompanyDao;
import pl.invoicemanager.InvoiceManager.dao.InvoiceDao;
import pl.invoicemanager.InvoiceManager.models.Company;
import pl.invoicemanager.InvoiceManager.models.Invoice;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	ResourceLoader resourceLoader;

	@Autowired
	InvoiceDao invoiceDao;

	@Autowired
	CompanyDao companyDao;

	@RequestMapping("/add")
	public String addInvoice(){
//		Invoice invoice = new Invoice();
//		Random random = new Random();
//		int randomNumber = random.nextInt(50)+1;
//		int randomMonth = random.nextInt(12)+1;
//		invoice.setInvoiceNumber(randomNumber+"/"+randomMonth+"/2001");
//		invoiceDao.save(invoice);
		return "addInvoiceForm";
	}

	@RequestMapping("/list")
	public String showInvoices(Model model){
		List<Invoice> invoices = invoiceDao.findAll();
		model.addAttribute("invoices", invoices);
		return "invoiceList";
	}

	@RequestMapping("/generate")
	public void generateInvoice(HttpServletResponse response) throws IOException, JRException {
//		String path = resourceLoader.getResource("classpath:/reports/invoice.jrxml").getURI().getPath();
		String path = resourceLoader.getResource("classpath:/reports/PaidInvoice.jrxml").getURI().getPath();
		JasperReport jasperReport = JasperCompileManager.compileReport(path);
		JRDataSource jrDataSource = new JREmptyDataSource();
/////////////////////////////
		Invoice invoice = new Invoice();
		invoice.setInvoiceNumber("1/01/2019");
		invoice.setCreateDate(new Date());
		invoice.setSoldDate(new Date());
		invoice.setPaidDate(new Date());
		invoice.setPaymentType("gotówka");
		List<Company> companies = companyDao.findAll();
		Company company = companies.get(0);
		Company company2 = companies.get(1);

		////////////////////////////
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("invoice",invoice);
		parameters.put("seller", company);
		parameters.put("buyer", company2);
		JasperPrint print = JasperFillManager.fillReport(jasperReport,parameters, jrDataSource);
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition",String.format("attachment; filename=\"faktura.pdf\""));
		ServletOutputStream servletOutputStream = response.getOutputStream();

		JasperExportManager.exportReportToPdfStream(print,servletOutputStream);
	}

}
