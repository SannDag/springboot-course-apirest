package dentist.controller;

import dentist.entity.Patient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    List<Patient> patientsList = new ArrayList<Patient>();

    @GetMapping("/patients")
    public List<Patient> getPatientsList(){

        patientsList.add(new Patient(1, 456789, "Carlos", "Rodriguez", LocalDate.of(1980, 2, 9)));
        patientsList.add(new Patient(2, 123456, "Maria", "Piron", LocalDate.of(2007, 10, 1)));
        patientsList.add(new Patient(3, 789456, "Luciano", "Robiun", LocalDate.of(2010, 8, 19)));
        patientsList.add(new Patient(4, 147852, "Damian", "Tirti", LocalDate.of(1997, 11, 7)));


        return patientsList;

    }

    @GetMapping("/patients/minors")
    @ResponseBody
    public ResponseEntity<String> getMinorsPatients(){
        List<Patient> minorsList = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();

        patientsList.add(new Patient(1, 456789, "Carlos", "Rodriguez", LocalDate.of(1980, 2, 9)));
        patientsList.add(new Patient(2, 123456, "Maria", "Piron", LocalDate.of(2007, 10, 1)));
        patientsList.add(new Patient(3, 789456, "Luciano", "Robiun", LocalDate.of(2010, 8, 19)));
        patientsList.add(new Patient(4, 147852, "Damian", "Tirti", LocalDate.of(1997, 11, 7)));


        for(Patient patient : patientsList) {
            Period agePeriod = Period.between(currentDate, patient.getDate());
            int ageYears = agePeriod.getYears();

            if (ageYears < 18){
                return new ResponseEntity<>(patientsList.toString(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("The patients in the list are adults.", HttpStatus.NOT_FOUND);
    }
}
