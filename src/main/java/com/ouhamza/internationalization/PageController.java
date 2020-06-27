package com.ouhamza.internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Lhouceine OUHAMZA
 */
@Controller
public class PageController {



    @Autowired
    MessageSource messageSource;

@GetMapping("/international")
public String getInternationalPage() {

    ResourceBundle messages = setLang("en");
    System.out.println(messages.getString("greeting") + " ");
    System.out.println(messages.getString("content") + " ");
    return "international";

   /**System.out.println(messageSource.getMessage("greeting", null, LocaleContextHolder.getLocale()));
    System.out.println(messageSource.getMessage("greeting1", null, LocaleContextHolder.getLocale()));
    return "international";*/
}


    private ResourceBundle setLang(String lang) {
        String language = lang;
        Locale locale = new Locale(language, "US");
        return ResourceBundle.getBundle("messages", locale);
    }

}

