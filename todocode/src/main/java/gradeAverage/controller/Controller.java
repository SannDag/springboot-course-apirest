package gradeAverage.controller;

import gradeAverage.entity.Grade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/grades")
    public Double getGradesAverage(@RequestParam Double n1,@RequestParam Double n2, @RequestParam Double n3){

        Double total = 0.0;
        
        List<Double> average = new ArrayList<>();
        average.add(n1);
        average.add(n2);
        average.add(n3);
        
        for(Double num : average){
            total += num;
        }

        Double ave = total / average.size();

        return ave;
    }
}
