package mvc.dao;

import mvc.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addPerson(Person p) {
        Session session = this.sessionFactory.openSession();
        session.persist(p);
        session.close();
        logger.info("Person saved successfully, Person Details=" + p);
    }

    @Override
    public void updatePerson(Person p) {
        Session session = this.sessionFactory.openSession();
        session.update(p);
        session.close();
        logger.info("Person updated successfully, Person Details=" + p);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPersons() {
        Session session = this.sessionFactory.openSession();
        List<Person> personsList = session.createQuery("from Person").list();
        for (Person p : personsList) {
            logger.info("Person List::" + p);
        }
        session.close();
        return personsList;
    }

    @Override
    public Person getPersonById(int id) {
        Session session = this.sessionFactory.openSession();
        Person p = (Person) session.get(Person.class, id);
        logger.info("Person loaded successfully, Person details=" + p);
        session.close();
        return p;
    }

    @Override
    public void removePerson(int id) {
        Session session = this.sessionFactory.openSession();
        Person p = (Person) session.load(Person.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
        session.close();
        logger.info("Person deleted successfully, person details=" + p);
    }

}
