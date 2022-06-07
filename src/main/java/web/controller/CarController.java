package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "X", 6));
        list.add(new Car("AUDI", "Y", 3));
        list.add(new Car("MERCEDES", "Z", 1));
        list.add(new Car("HONDA", "A", 2));
        list.add(new Car("LADA", "B", 11));
        if (count != null) {
            if (count == 1) {
                model.addAttribute("cars", list.subList(0, 1));
            }
            if (count == 2) {
                model.addAttribute("cars", list.subList(0, 2));
            }
            if (count == 3) {
                model.addAttribute("cars", list.subList(0, 3));
            }
            if (count == 4) {
                model.addAttribute("cars", list.subList(0, 4));
            }
            if (count >= 5) {
                model.addAttribute("cars", list);
            }
        } else model.addAttribute("cars", list);
        return "cars";
    }
}
