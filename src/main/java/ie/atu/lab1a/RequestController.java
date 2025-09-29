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
    @GetMapping("/person")
    public Person getPerson(){
        return new Person("Patrick",19);
    }

    //EXCERCISE

    @GetMapping("/calculate")
    public Calculator calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation){
        double total;//holds result of calculation
        switch (operation){
            case "add":
                total = num1 + num2;
                break;
                case "subtract":
                    total = num1 - num2;
                    break;
                    case "multiply":
                        total = num1 * num2;
                        break;
                        case "divide":
                            total = num1 / num2;
                            if(num2 == 0)//handles / by 0 error
                            {
                                System.out.println("Division by zero");}
                            break;
                            default:
                                total = 0;
                                break;
        }
        return new Calculator(operation,total);
    }



}
//request parametr 1 have to return json to do create a cal class then contains operation and total. string=operation double=total