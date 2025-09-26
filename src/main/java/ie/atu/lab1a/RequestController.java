package ie.atu.lab1a;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable("name") String name)
    {
        return "Hello " + name + "!";
    }

    @GetMapping("/details")
    public  String details(@RequestParam String name, @RequestParam int age)
    {
        return "Name : " + name + " Age : " + age;
    }
}
//request parametr 1 have to return json to do create a cal class then contains operation and total. string=operation double=total