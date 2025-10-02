package cz.czechitas.java2webapps.lekce3.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CustomerController {
  //index => main page
  @GetMapping("/")
  public ModelAndView index() {
    Address address = new Address();
    address.setStreet("Queenstreet");
    address.setHouseNumber(55);
    address.setPostalCode("WC02 3RI");
    address.setCity("London");
    address.setCountry("United Kingdom");

    Customer customer = new Customer(); //new instance of the class Customer
    customer.setFirstName("Kim");
    customer.setLastName("Cattrall");
    customer.setBirthDate(LocalDate.of(1956, 8, 21));
    customer.setPicturePath("/6/69/Kim_Cattrall_2012_%28cropped%29.jpg");
    customer.setAddress(address);

    ModelAndView modelAndView= new ModelAndView("index");
    modelAndView.addObject("person", customer);
    return modelAndView;
  }
}
