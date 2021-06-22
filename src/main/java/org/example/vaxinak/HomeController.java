package org.example.vaxinak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // <context:component-scan/> otherwise <bean ... /> in the XML
@RequestMapping("/") // <mvc:annotation-driven/> otherwise <bean id="urlMapping" ... /> in the XML
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listItems", DataProvider.getData());
        return modelAndView;
    }

}
