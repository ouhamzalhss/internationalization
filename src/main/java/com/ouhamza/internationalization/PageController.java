package com.ouhamza.internationalization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lhouceine OUHAMZA
 */
@Controller
public class PageController {

@GetMapping("/international")
public String getInternationalPage() {
    return "international";
}

}

