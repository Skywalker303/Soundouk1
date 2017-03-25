package com.ticketBuyer.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.ticketBuyer.validators.EmailValidator;
import com.ticketBuyer.validators.BuyerValidator;
import com.ticketBuyer.model.Buyer;


@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    private BuyerValidator buyerValidator;
    @Autowired
    private EmailValidator emailValidator;


    /*First method on start application*/

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("buyerJSP", new Buyer());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /*как только на index.jsp подтвердится форма,
    то переходим сюда
     */
    @RequestMapping(value = "/check-buyer")
    public ModelAndView checkBuyer(@ModelAttribute("buyerJSP") Buyer buyer) {
        ModelAndView modelAndView = new ModelAndView();

        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("confirmPage");

        //записываем в атрибут userJSP (используется на странице *.jsp объект buyer)
        modelAndView.addObject("buyerJSP", buyer);

        return modelAndView;
    }
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

}
