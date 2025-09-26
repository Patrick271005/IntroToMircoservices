package ie.atu.lab1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello";
    }

    @GetMapping("/helloAlso")
    public String helloAlso()
    {
        return "Hello";
    }
}
