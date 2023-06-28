package heightPlayer;

/*
Exercise No. 2 - Basketball Heights
A basketball team coach wants to have an API that, when given the data of 5 players in the body of an
HTTP POST request, registers them in a logical database represented by an ArrayList, and at the same time,
after the registration is done, immediately returns the average height of all the entered players as a response.
The data entered for each player is as follows: id, dni, first name, last name, age, weight, and height.
Take into account for the completion of this exercise the manipulation/creation of JSON files, the use of Postman as a tool to generate the POST request, the annotation @RequestBody, and the handling of ArrayLists.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(heightPlayer.Main.class, args);
    }

}
