package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarService();

    @GetMapping("/cars")
    String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if ((count != null)&&(count < 5)) {
            model.addAttribute("cars",carService.listCars().subList(0,count));
        } else model.addAttribute("cars", carService.listCars());
        return "cars";
    }
}
