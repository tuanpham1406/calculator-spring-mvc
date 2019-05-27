package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping("/home")
    public String home() {
        return "save";
    }
@RequestMapping("/result")
    public String result(@RequestParam double first, @RequestParam double second,@RequestParam String xxx, Model model) {
    double result = 0;
    String add = "Addition(+)";
    String sub = "Subtraction(-)";
    String multi = "Multiplication(X)";
    String div = "Division(/)";
    if (xxx.equals(add)) {
        result = first + second;
    } else if (xxx.equals(sub)) {
        result = first - second;
    } else if (xxx.equals(multi)) {
        result = first*second;
    } else if (xxx.equals(div)) {
        result = first/second;
    }
    model.addAttribute("result", result);
    return "save";
}
}