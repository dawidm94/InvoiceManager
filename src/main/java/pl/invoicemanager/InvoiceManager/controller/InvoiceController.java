package pl.invoicemanager.InvoiceManager.controller;

import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.invoicemanager.InvoiceManager.dao.InvoiceDao;
import pl.invoicemanager.InvoiceManager.models.Invoice;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	ResourceLoader resourceLoader;

	@Autowired
	InvoiceDao invoiceDao;

	@RequestMapping("/add")
	public String addInvoice(){
		Invoice invoice = new Invoice();
		Random random = new Random();
		int randomNumber = random.nextInt(50)+1;
		int randomMonth = random.nextInt(12)+1;
		invoice.setInvoiceNumber(randomNumber+"/"+randomMonth+"/2001");
		invoiceDao.save(invoice);
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
		String path = resourceLoader.getResource("classpath:/reports/invoice.jrxml").getURI().getPath();
		JasperReport jasperReport = JasperCompileManager.compileReport(path);
		JRDataSource jrDataSource = new JREmptyDataSource();
		JasperPrint print = JasperFillManager.fillReport(jasperReport,null, jrDataSource);
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition",String.format("attachment; filename=\"faktura.pdf\""));
		ServletOutputStream servletOutputStream = response.getOutputStream();

		JasperExportManager.exportReportToPdfStream(print,servletOutputStream);
	}

}
