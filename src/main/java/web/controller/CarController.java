package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String showCarsByCount(Integer count, Model model) {
        CarService carService = new CarServiceImpl();

        if (count == null) {
            model.addAttribute("carList", carService.getCarsbyCount(5));
        } else {
            model.addAttribute("carList", carService.getCarsbyCount(count));
        }
        return "cars";
    }
}
