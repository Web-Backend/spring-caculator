package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/add")
    public ModelAndView addition(@RequestParam("firstNum") double firstNum, @RequestParam("secondNum") double secondNum) {
        double result = firstNum + secondNum;
        return new ModelAndView("result", "result", result);
    }

    @PostMapping("/sub")
    public ModelAndView subtraction(@RequestParam("firstNum") double firstNum, @RequestParam("secondNum") double secondNum) {
        double result = firstNum - secondNum;
        return new ModelAndView("result", "result", result);
    }

    @PostMapping("/multi")
    public ModelAndView multilication(@RequestParam("firstNum") double firstNum, @RequestParam("secondNum") double secondNum) {
        double result = firstNum * secondNum;
        return new ModelAndView("result", "result", result);
    }

    @PostMapping("/devi")
    public ModelAndView division(@RequestParam("firstNum") double firstNum, @RequestParam("secondNum") double secondNum) {
        if (secondNum == 0) {
            try {
                throw new IllegalArgumentException("What the f...Can't divide by 0");
            } catch (IllegalArgumentException e) {
                return new ModelAndView("result", "message", e.getMessage());
            }
        } else {
            double result = firstNum / secondNum;
            return new ModelAndView("result", "result", result);
        }
    }
}
