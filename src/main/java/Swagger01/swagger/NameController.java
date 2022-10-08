package Swagger01.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/myName")
    public String getMyName(){
        return "Samuele";
    }
}
