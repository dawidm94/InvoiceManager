package pl.invoicemanager.InvoiceManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String loginRegister(HttpSession session, Model model) {
		return "index";
	}

}
