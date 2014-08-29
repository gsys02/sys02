package net.exacode.bootstrap.web.controller;



import net.exacode.bootstrap.web.model.Shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {

	@RequestMapping("demo")
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		
		Shop shop = new Shop();
		shop.setName("SHOP");
		shop.setStaffName(new String[] { "mkyong1", "mkyong2"});
		
		
		
		model.addAttribute("shop",shop);
		
		return "hello";

	}

	@RequestMapping(value="{name}/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Shop getShopInJSON(@PathVariable String name,@PathVariable int id) {

		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] { "mkyong1", "juan2",""+id });

		return shop;

	}
	
	
	@RequestMapping(value="{name}",method=RequestMethod.GET)
	@ResponseBody
	public Shop getShopInJSONn(@PathVariable String name) {

		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] { name });

		return shop;

	}

}