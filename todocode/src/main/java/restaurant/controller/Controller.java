package restaurant.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import restaurant.entity.Plate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/menu")
    @ResponseBody
    public ResponseEntity<String> menuList(@RequestParam int id) {

        List<Plate> menu = new ArrayList<Plate>();
        menu.add(new Plate(1, "Menu 1", 1150, "Steak with chips or potatoes"));
        menu.add(new Plate(2, "Menu 2", 950.0, "Fish and chips"));
        menu.add(new Plate(3, "Menu 3", 750.0, "Vegetable curry"));
        menu.add(new Plate(4, "Menu 4", 1200.0, "Salmon fillet with green beans"));
        menu.add(new Plate(5, "Menu 5", 1100.0, "Burger with chips and mushrooms"));

        for (Plate plate : menu) {
            if (plate.getId() == id) {
                return new ResponseEntity<>(plate.toString(), HttpStatus.OK);
            }
        }

        return new ResponseEntity<>("Plate not found", HttpStatus.NOT_FOUND);

    }
}
