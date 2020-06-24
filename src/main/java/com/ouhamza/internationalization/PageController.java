package com.ouhamza.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lhouceine OUHAMZA
 */
@Controller

public class PageController {


    @Autowired
    MessageSource messageSource;

@GetMapping("/international")
public String getInternationalPage() {
    System.out.println(messageSource.getMessage("greeting", null, LocaleContextHolder.getLocale()));
    System.out.println(messageSource.getMessage("code", null, LocaleContextHolder.getLocale()));
    return "international";
}

}

