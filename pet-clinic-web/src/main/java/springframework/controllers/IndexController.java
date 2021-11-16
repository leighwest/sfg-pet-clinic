package springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // any request that comes into the root context then match to this request mapping and return the index page
    @RequestMapping({"","/","index","index.html"})
    public String index() {

        return "index";
    }

    @RequestMapping("/oops")
    public String oopsHandler() {
        return "notimplemented";
    }
}
