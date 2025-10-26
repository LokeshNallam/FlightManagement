package com.cg.training.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod()
    {
        return "user Service is taking longer than expected"+
                "plz try later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod()
    {
        return "Deaprtment Service is taking longer than expected"+
                "plz try later";
    }

}



