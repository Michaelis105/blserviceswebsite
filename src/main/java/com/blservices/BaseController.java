package com.blservices;

import org.springframework.web.bind.annotation.RequestMapping;

public class BaseController {

    String homePageFileName = "index.html";

    /**
     * @return Home console page or usage statement.
     */
    @RequestMapping
    public String home() {
        return homePageFileName;
    }

}
