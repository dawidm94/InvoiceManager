package pl.invoicemanager.InvoiceManager.controller;

import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	ResourceLoader resourceLoader;

	@RequestMapping("/add")
	public String addInvoice(){
		return "addInvoiceForm";
	}

	@RequestMapping("/list")
	public String showInvoices(){
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
