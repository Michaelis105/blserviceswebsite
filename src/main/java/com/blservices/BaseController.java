package com.blservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    String homePageFileName = "index.html";
    String aboutPageFileName = "about.html";
    String servicesPageFileName = "services.html";
    String contactPageFileName = "contact.html";

    /**
     * @return Home page.
     */
    @GetMapping("/")
    public String home() {
        return homePageFileName;
    }

    /**
     * @return About Us page.
     */
    @GetMapping ("/about")
    public String about() { return aboutPageFileName; }

    /**
     * @return Services page.
     */
    @GetMapping ("/services")
    public String services() { return servicesPageFileName; }

    /**
     * @return Contact information page.
     */
    @GetMapping ("/contact")
    public String contact() {
        return contactPageFileName;
    }

}
