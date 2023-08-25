package com.example.lab20206442;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principal {

    @GetMapping("/principal")
    public String principal(){
        return "paginaPrincipal";
    }

}
