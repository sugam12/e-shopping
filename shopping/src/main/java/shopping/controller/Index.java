package shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayIndexPage() {
		return "indexes";
	}

	@RequestMapping(value = "/product.htm", method = RequestMethod.GET)
	public String displayProductPage() {
		return "products";
	}

	@RequestMapping(value = "/contact.htm", method = RequestMethod.GET)
	public String displayContactPage() {
		return "contact";
	}
}
