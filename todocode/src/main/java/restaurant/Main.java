/*
* Exercise 2:
* A restaurant has a total of 5 dishes on the menu. Each dish has a dish number, name, price, and a brief description.
A: The restaurant wants an app that allows customers to retrieve dish information from the menu by providing
* the dish number. For this purpose, the development of an API is needed that, upon receiving
* the dish number in a GET request, returns the corresponding dish with all its details.
NOTE: Store the dishes in a List
* */

package restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(restaurant.Main.class, args);
    }

}
