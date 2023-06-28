package dependencyInjection.service;

import dependencyInjection.model.Person;

import java.util.List;

public interface IPersonaService {

    public void createPerson(Person per);
    public List<Person> getPerson();
}
