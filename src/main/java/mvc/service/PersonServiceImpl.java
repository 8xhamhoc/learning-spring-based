package mvc.service;

import mvc.dao.PersonDAO;
import mvc.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Transactional
    public void addPerson(Person p) {
        this.personDAO.addPerson(p);
    }

    @Transactional
    public void updatePerson(Person p) {
        this.personDAO.updatePerson(p);
    }

    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }

    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }

    @Transactional
    public void removePerson(int id) {
        this.personDAO.removePerson(id);
    }

}
