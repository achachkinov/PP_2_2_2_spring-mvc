package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarServise;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

	@Autowired
	private CarServise carServise;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
	@GetMapping(value = "/cars")
	public String printCars( @RequestParam(value = "count", required = false) Integer count, ModelMap model ) {
		List<Car> cars = carServise.listOfCars( count );
		model.addAttribute( "car", cars );
		return "cars";
	}
}