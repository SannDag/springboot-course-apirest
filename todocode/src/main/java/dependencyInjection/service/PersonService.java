package dependencyInjection.service;

import org.springframework.stereotype.Service;
import dependencyInjection.model.Person;

import java.util.List;

@Service
public class PersonService implements IPersonaService {


    @Override
    public void createPerson(Person per) {
        //logic
    }

    @Override
    public List<Person> getPerson() {
        //logic
        return null;
    }
}
